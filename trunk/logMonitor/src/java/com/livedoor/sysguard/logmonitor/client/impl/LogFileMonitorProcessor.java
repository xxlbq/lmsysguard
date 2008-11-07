/*
 * Created on 2006-9-25
 *
 */
package com.livedoor.sysguard.logmonitor.client.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.livedoor.sysguard.logmonitor.LogInfoWrapper;
import com.livedoor.sysguard.logmonitor.client.ILogMsgParser;
import com.livedoor.sysguard.logmonitor.client.ILogger;
import com.livedoor.sysguard.logmonitor.client.IProcessor;
import com.livedoor.sysguard.logmonitor.client.ProcessWrapper;

/**
 * <p>Title: LogMonitor</p>
 * <p>Description: LogFileMonitorProcess.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public class LogFileMonitorProcessor implements IProcessor {

    private ProcessWrapper p;
    private ILogger clientLogger;
    private ILogMsgParser logMsgParser;
    
    public void process() throws Exception {
        
        InputStreamReader isr = new InputStreamReader(p.getProcess().getInputStream());
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        LogInfoWrapper loginfo;

        while (((line = br.readLine()) != null)) {
            loginfo = logMsgParser.handleMessage(line);
            if (loginfo != null)
                clientLogger.write(loginfo);
        }
    }
    
    public void destroy() throws Exception {
       p.destroy();        
    }
    /**
     * @return the p
     */
    public final ProcessWrapper getProcess() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public final void setProcess(ProcessWrapper pw) {
        this.p = pw;
    }

    /**
     * @return the clientLogger
     */
    public final ILogger getClientLogger() {
        return clientLogger;
    }

    /**
     * @param clientLogger the clientLogger to set
     */
    public final void setClientLogger(ILogger clientLogger) {
        this.clientLogger = clientLogger;
    }

    /**
     * @return the logMsgParser
     */
    public final ILogMsgParser getLogMsgParser() {
        return logMsgParser;
    }

    /**
     * @param logMsgParser the logMsgParser to set
     */
    public final void setLogMsgParser(ILogMsgParser logMsgParser) {
        this.logMsgParser = logMsgParser;
    }   

}

