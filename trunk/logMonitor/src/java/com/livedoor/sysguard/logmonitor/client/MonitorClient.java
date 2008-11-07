/*
 * Created on 2006-9-21
 *
 */
package com.livedoor.sysguard.logmonitor.client;

import com.livedoor.sysguard.logmonitor.MonitorConsts;
import com.livedoor.sysguard.logmonitor.ResourceUtils;
import com.livedoor.sysguard.logmonitor.client.impl.LogFileMonitorProcessor;
import com.livedoor.sysguard.logmonitor.client.impl.LogFileParser;

/**
 * <p>Title:LogMoniter Livedoor</p>
 * <p>Description:XmlRpcLogMonitorImpl.java</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public class MonitorClient  {
    
    public static void main(String[] args) 
    {
        //=== command . eg: "tail -Fn0 file".
        String command = MonitorConsts.COMMAND + ResourceUtils.getString(MonitorConsts.LOGFILE_URL);
        //=== main monitor instance
        LogMonitor monitor = new LogMonitor();
        
        //=== LoggerImpl
        ILogger xmlRpcLogger = new XmlRpcLogger();    
        //=== parse log infomation.
        ILogMsgParser logParser = new LogFileParser();
        //=== Process Wrapper
        ProcessWrapper process = new ProcessWrapper(command);  
        //=== LogFile Process's Processor
        LogFileMonitorProcessor processor = new LogFileMonitorProcessor();
        
        processor.setProcess(process);
        processor.setClientLogger(xmlRpcLogger);
        processor.setLogMsgParser(logParser);
        // set proecss's processor
        monitor.setProcessor(processor);
        
    //-------- START MONITOR...  --------//
        monitor.startMonitor();
    }

}

