/*
 * Created on 2006-9-21
 *
 */
package com.livedoor.sysguard.logmonitor.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import com.ibatis.common.jdbc.SimpleDataSource;


/**
 * <p>Title: LogMonitorServer</p>
 * <p>Description: DBUtils.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public class DBUtils {
         
    private static SimpleDataSource datasource;
    static
    {        
        Map<String,String> properties = new HashMap<String,String>();
        ResourceBundle resource = ResourceBundle.getBundle ("jdbc");
        
        for (Enumeration<String> keys = resource.getKeys(); keys.hasMoreElements();) {
            String key = keys.nextElement();
            properties.put(key, resource.getString(key));
            
        }
        datasource = new SimpleDataSource(properties);
    }
        
    public static int update(Connection conn, String sql, ParameterProcessor pp)
            throws SQLException {

        PreparedStatement stmt = null;
        int rows = 0;
        try {
            stmt = conn.prepareStatement(sql);
            pp.fillStatement(stmt);
            rows = stmt.executeUpdate();

        }
        finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return rows;
    }
    
    public static Connection getConnection() throws SQLException {
        return datasource.getConnection();
    }

    public static void close(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        try {
            Connection c1 = DBUtils.getConnection();
            System.out.println(c1);
            c1.close();
            Connection c2 = DBUtils.getConnection();
            System.out.println(c2);
            c2.close();
            Connection c3 = DBUtils.getConnection();
            System.out.println(c3);
            c3.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}


