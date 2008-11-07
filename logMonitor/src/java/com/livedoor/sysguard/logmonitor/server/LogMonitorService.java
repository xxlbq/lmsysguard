/*
 * Created on 2006-9-21
 *
 */
package com.livedoor.sysguard.logmonitor.server;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.XmlRpcServletServer;

import com.livedoor.sysguard.logmonitor.MonitorConsts;
import com.livedoor.sysguard.logmonitor.server.impl.LogMonitorServerDBImpl;

/**
 * <p>Title:LogMonitorServer Livedoor</p>
 * <p>Description:LogMonitorService.java</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */ 
public class LogMonitorService extends HttpServlet {
     
    private static final long serialVersionUID = -1574793810276429990L;
    private XmlRpcServletServer server;
    
    public void init(ServletConfig pConfig) throws ServletException {

        super.init(pConfig);

        try {
              // create a new XmlRpcServletServer object
              server = new XmlRpcServletServer();
              // set up handler mapping of XmlRpcServletServer object
              PropertyHandlerMapping phm = new PropertyHandlerMapping();
              
              phm.addHandler(MonitorConsts.HANDLER, LogMonitorServerDBImpl.class);  
              
              server.setHandlerMapping(phm);
 
              XmlRpcServerConfigImpl serverConfig = (XmlRpcServerConfigImpl)server.getConfig();

              serverConfig.setEnabledForExtensions(true);

              serverConfig.setContentLengthOptional(false);              
              
        } catch (XmlRpcException e) 
        {
            e.printStackTrace(); 
              throw new ServletException(e);

        }

  } 


    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */   
    public void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        // TODO Auto-generated method stub 
        doPost(arg0,arg1);
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */     
    public void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //arg1.getWriter().write("ok!!");
        server.execute(arg0, arg1);  
    }


}

