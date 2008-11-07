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
 * <p>Company: �p�ɓ�Jᢁi��A�j�L�����i</p>
 * @author yuzs
 * @version 1.0
 */  
public interface ILogMonitorServer {
 
    public int write(Map<String,String> logInfoMap);
    
}

