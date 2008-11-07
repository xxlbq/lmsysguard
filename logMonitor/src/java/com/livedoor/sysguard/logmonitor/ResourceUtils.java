/*
 * Created on 2006-9-25
 *
 */
package com.livedoor.sysguard.logmonitor;

import java.util.ResourceBundle;

/**
 * <p>Title: LogMonitor</p>
 * <p>Description: ResourceUtils.java</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: �p�ɓ�Jᢁi��A�j�L�����i</p>
 * @author yuzs
 * @version 1.0
 */
public class ResourceUtils {
    
    private static ResourceBundle resource = ResourceBundle.getBundle ("monitor");
    
    public static final String getString(String key)
    {
        return resource.getString(key);
    }

}

