/*
 * Created on 2006-9-25
 *
 */
package com.livedoor.sysguard.logmonitor.client;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>Title: LogMonitor</p>
 * <p>Description: ProcessWrapper.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public class ProcessWrapper {
    private final Log logger = LogFactory.getLog(ProcessWrapper.class);
    private Process process;
    
    public ProcessWrapper(String command) {
        try {
            process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            logger.error(e);
            throw new RuntimeException(e);
        }
    }
    
    public Process getProcess() throws IOException
    {
        return process;
    }
    
    public void destroy() {
        try {
            if (process != null) {
                process.getOutputStream().close();
                process.getInputStream().close();
                process.getErrorStream().close();
                process.waitFor();
                process.destroy();
                process = null;
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            // logger.error(e);
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            // logger.error(e);
            e.printStackTrace();
        }
    }

}

