/*
 * Created on 2006-9-22
 *
 */
package com.livedoor.sysguard.logmonitor;

/**
 * <p>Title:LogMonitorClient Livedoor</p>
 * <p>Description:MonitorConsts.java</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public final class MonitorConsts {
    
    public final static String USER_ID = "USER_ID";
    public final static String HOST_ID = "HOST_ID";
    public final static String LOG_LEVEL = "LOG_LEVEL";
    public final static String LOG_UPTIME = "LOG_UPTIME";
    public final static String LOG_CLASSNAME = "LOG_CLASSNAME";
    public final static String LOG_THREAD_NAME = "LOG_THREAD_NAME";
    public final static String LOG_TIME = "LOG_TIME";
    public final static String LOG_LINE = "LOG_LINE";
    public final static String LOG_CONTENT = "LOG_CONTENT";
    //==== resource file
    public final static String XML_RPC_URL = "xmlRpc.url";
    public final static String LOGFILE_URL = "logfile.url";
    //==== xmlprc Handler name
    public final static String HANDLER = "LogMonitorServer";
    public final static String METHOD = "write";
    //
    public final static String COMMAND = "tail -Fn0 ";
}

