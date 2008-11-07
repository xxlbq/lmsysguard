/*
 * Created on 2006-10-19
 *
 */
package com.livedoor.sysguard.logmonitor.client;

import com.livedoor.sysguard.logmonitor.LogInfoWrapper;

/**
 * <p>Title: LogMonitor</p>
 * <p>Description: ILogParser.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: pÉîJá˘iĺAjLŔöi</p>
 * @author yuzs
 * @version 1.0
 */
public interface ILogMsgParser {
    
    public LogInfoWrapper handleMessage(String message);
    
}

