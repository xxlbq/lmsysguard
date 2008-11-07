/*
 * Created on 2006-9-21
 *
 */
package com.livedoor.sysguard.logmonitor.client;

import com.livedoor.sysguard.logmonitor.LogInfoWrapper;

/**
 * <p>Title: LogMoniter</p>
 * <p>Description: ILogger.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public interface ILogger {
    //=== how and where to write...
    public void write(LogInfoWrapper loginfo);
    //=== parse message to log bean... 
    //public LogInfoWrapper handleMessage(String message);
    
}

