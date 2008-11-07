/*
 * Created on 2006-10-19
 *
 */
package com.livedoor.sysguard.logmonitor.client.impl;

import com.livedoor.sysguard.logmonitor.LogInfoWrapper;
import com.livedoor.sysguard.logmonitor.client.ILogMsgParser;

/**
 * <p>Title: LogMonitor</p>
 * <p>Description: LogFileParser.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: �p�ɓ�Jᢁi��A�j�L�����i</p>
 * @author yuzs
 * @version 1.0
 */
public class LogFileParser implements ILogMsgParser {

    public LogInfoWrapper handleMessage(String message) {      
        //======== example ========//
        LogInfoWrapper log = new LogInfoWrapper();
        log.setHostID("1");
        log.setLogClassName("setLogClassName");
        log.setLogContent("setLogContent");
        log.setLogLevel("error");
        log.setLogLine("100");
        log.setUserID("007");
        log.setThreadName("setThreadName"); 
        return log;
    }

}

