/*
 * Created on 2006-9-21
 *
 */
package com.livedoor.sysguard.logmonitor.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/** 
 * <p>Title: LogMoniter</p>
 * <p>Description: ILogMonitor.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public class LogMonitor {
    
    private final Log logger = LogFactory.getLog(LogMonitor.class);

    private IProcessor processor;
    
    final public void startMonitor() {
        try {

            logger.info("========== START MONITOR =============");
            processor.process();
            logger.info("========== STOP  MONITOR =============");

        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        } finally {
            try {
                // destroy processor...
                processor.destroy();
                
            } catch (Exception e) {
                logger.error(e);
                e.printStackTrace();
            }
        }
    }    
       
    /**
     * @param processor the processor to set
     */
    public final void setProcessor(IProcessor processor) {
        this.processor = processor;
    }
}

