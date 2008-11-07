/*
 * Created on 2006-9-21
 *
 */
package com.livedoor.sysguard.logmonitor.server;

import java.util.Map;

/**
 * <p>Title: LogMoniterServer</p>
 * <p>Description: ILogMoniterServer.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: pÉîJá˘iĺAjLŔöi</p>
 * @author yuzs
 * @version 1.0
 */  
public interface ILogMonitorServer {
 
    public int write(Map<String,String> logInfoMap);
    
}

