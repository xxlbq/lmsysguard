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
 * <p>Company: pÉîJá˘iĺAjLŔöi</p>
 * @author yuzs
 * @version 1.0
 */
public interface ParameterProcessor {
    void fillStatement(PreparedStatement stmt) throws SQLException;
}

