/*
 * Created on 2006-9-21
 *
 */
package com.livedoor.sysguard.logmonitor.server.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.livedoor.sysguard.logmonitor.LogInfoWrapper;
import com.livedoor.sysguard.logmonitor.server.DBUtils;
import com.livedoor.sysguard.logmonitor.server.ILogMonitorServer;
import com.livedoor.sysguard.logmonitor.server.ParameterProcessor;


/**
 * <p>Title:LogMonitorServer Livedoor</p>
 * <p>Description:LogMonitorServerDBImpl.java</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0  
 */  
public class LogMonitorServerDBImpl implements ILogMonitorServer {
    
    private final Log logger = LogFactory.getLog(LogMonitorServerDBImpl.class);    
    private static final String INSERT_SQL = "INSERT INTO applog(user_id,host_id,level,uptime,class_name,thread_name,log_time,log_line,log_content) "+
                                             "VALUES(?,?,?,?,?,?,?,?,?)";    
  
    public int write(Map<String,String> logInfoMap) {
      int count = 0;
      try {
          final LogInfoWrapper loginfo = new LogInfoWrapper(logInfoMap);     
          
          Connection connection = DBUtils.getConnection();          
          // log into DB...
          count = DBUtils.update(connection, INSERT_SQL, new ParameterProcessor(){              
              public void fillStatement(PreparedStatement stmt) throws SQLException {
                  stmt.setObject(1, loginfo.getUserID());
                  stmt.setObject(2, loginfo.getHostID());
                  stmt.setObject(3, loginfo.getLogLevel());
                  stmt.setObject(4, loginfo.getUpTime());
                  stmt.setObject(5, loginfo.getLogClassName());
                  stmt.setObject(6, loginfo.getThreadName());
                  stmt.setObject(7, loginfo.getLogTime());
                  stmt.setObject(8, loginfo.getLogLine());
                  stmt.setObject(9, loginfo.getLogContent());             
          }});          
          DBUtils.close(connection);
          
      } catch (SQLException e) {      
          logger.error(e) ;
          e.printStackTrace();      
      }
      return count;
    }
    
}

