/*
 * Created on 2006-9-25
 *
 */
package com.livedoor.sysguard.logmonitor.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import com.livedoor.sysguard.logmonitor.LogInfoWrapper;
import com.livedoor.sysguard.logmonitor.MonitorConsts;
import com.livedoor.sysguard.logmonitor.ResourceUtils;

/**
 * <p>Title: LogMonitor</p>
 * <p>Description: AbstractXmlRpcLogger.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public class XmlRpcLogger implements ILogger{
    
    private final Log logger = LogFactory.getLog(XmlRpcLogger.class);
    protected static XmlRpcClient client;
    
    static {
        // config client
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();

        try {
            config.setServerURL(new URL(ResourceUtils.getString( MonitorConsts.XML_RPC_URL )));
            // create a new XmlRpcClient object and bind above config object with it
            client = new XmlRpcClient();

            client.setConfig(config);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // should be modified according to your configuration of jsp
            // container
    }
    
    public void write(LogInfoWrapper loginfo) {
        try {
            // execute XML-RPC call
            Vector<Map> params = new Vector<Map>();            
            params.add(loginfo.toMap());           
            client.execute(MonitorConsts.HANDLER +"."+ MonitorConsts.METHOD,params);
            
      } catch (XmlRpcException e) {
            System.out.println(e.toString());
            logger.error(e);
      } 
    }
}
