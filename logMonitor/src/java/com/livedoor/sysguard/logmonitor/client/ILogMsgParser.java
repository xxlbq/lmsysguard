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
 * <p>Company: �p�ɓ�Jᢁi��A�j�L�����i</p>
 * @author yuzs
 * @version 1.0
 */
public interface ILogMsgParser {
    
    public LogInfoWrapper handleMessage(String message);
    
}

