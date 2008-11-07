/*
 * Created on 2006-9-25
 *
 */
package com.livedoor.sysguard.logmonitor.client;


/**
 * <p>Title: LogMonitor</p>
 * <p>Description: IProcess.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: pÉîJá˘iĺAjLŔöi</p>
 * @author yuzs
 * @version 1.0
 */
public interface IProcessor {    
    void process() throws Exception ;
    void destroy() throws Exception ;
    
}

