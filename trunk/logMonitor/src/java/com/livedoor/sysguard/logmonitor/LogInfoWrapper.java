/*
 * Created on 2006-9-21
 *
 */
package com.livedoor.sysguard.logmonitor;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: LogMoniter</p>
 * <p>Description: LogInfo.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public class LogInfoWrapper {
       
    private Map<String,String> loginfo;
    
    public LogInfoWrapper()
    {
        loginfo = new HashMap<String,String>();
    } 

    public LogInfoWrapper(Map<String,String> loginfo)
    {
        this.loginfo = loginfo;
    }
    
    public Map toMap()
    {
        return loginfo;
    }
    
    public final String getUserID()
    {
        return (String)loginfo.get(MonitorConsts.USER_ID);
    }
    /**
     * @param applogErrorID the applogErrorID to set
     */
    public final void setUserID(String user_id) {
        loginfo.put(MonitorConsts.USER_ID, user_id);      
    }
    /**
     * @return the applogErrorID
     */
    public final String getHostID() {
        return (String)loginfo.get(MonitorConsts.HOST_ID);
    }

    /**
     * @param applogErrorID the applogErrorID to set
     */
    public final void setHostID(String host_id) {
        loginfo.put(MonitorConsts.HOST_ID, host_id);      
    }
    
    /**
     * @return the LogLevel
     */
    public final String getLogLevel() {
        return (String)loginfo.get(MonitorConsts.LOG_LEVEL);
    }

    /**
     * @param LogLevel the LogLevel to set
     */
    public final void setLogLevel(String logLevel) {
        loginfo.put(MonitorConsts.LOG_LEVEL, logLevel);  
    }
    /**
     * @return the applogGetTime
     */
    public final String getUpTime() {
        return (String)loginfo.get(MonitorConsts.LOG_UPTIME);
    }

    /**
     * @param applogGetTime the applogGetTime to set
     */
    public final void setUpTime(String uptime) {
        loginfo.put(MonitorConsts.LOG_UPTIME, uptime);    
    }

    /**
     * @return the LogHostname
     */
    public final String getLogClassName() {
        return (String)loginfo.get(MonitorConsts.LOG_CLASSNAME);
    }

    /**
     * @param LogHostname the LogHostname to set
     */
    public final void setLogClassName(String clasname) {
        loginfo.put(MonitorConsts.LOG_CLASSNAME, clasname);  
    }

    /**
     * @return the LogIP
     */
    public final String getThreadName() {
        return (String)loginfo.get(MonitorConsts.LOG_THREAD_NAME);
    }

    /**
     * @param LogIP the LogIP to set
     */
    public final void setThreadName(String threadname) {
        loginfo.put(MonitorConsts.LOG_THREAD_NAME, threadname);  
    }

    /**
     * @return the LogReason
     */
    public final String getLogTime() {
        return (String)loginfo.get(MonitorConsts.LOG_TIME);
    }

    /**
     * @param LogReason the LogReason to set
     */
    public final void setLogTime(String logTime) {
        loginfo.put(MonitorConsts.LOG_TIME, logTime);  
    }

    /**
     * @return the LogSolu
     */
    public final String getLogLine() {
        return (String)loginfo.get(MonitorConsts.LOG_LINE);
    }

    /**
     * @param LogSolu the LogSolu to set
     */
    public final void setLogLine(String logLine) {
        loginfo.put(MonitorConsts.LOG_LINE, logLine);  
    }

    /**
     * @return the LogSource
     */
    public final String getLogContent() {
        return (String)loginfo.get(MonitorConsts.LOG_CONTENT);
    }

    /**
     * @param LogSource the LogSource to set
     */
    public final void setLogContent(String logContent) {
        loginfo.put(MonitorConsts.LOG_CONTENT, logContent); 
    }

}

