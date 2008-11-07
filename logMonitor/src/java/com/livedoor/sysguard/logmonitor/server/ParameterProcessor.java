/*
 * Created on 2006-9-25
 *
 */
package com.livedoor.sysguard.logmonitor.server;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * <p>Title: LogMonitor</p>
 * <p>Description: ParameterProcessor.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: 英極軟件開發（大連）有限公司</p>
 * @author yuzs
 * @version 1.0
 */
public interface ParameterProcessor {
    void fillStatement(PreparedStatement stmt) throws SQLException;
}

