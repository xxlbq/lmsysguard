package cn.livedoor.security.sysguard.services.facade;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class InterceptorFactory {
	private static Log log = LogFactory.getLog(InterceptorFactory.class);

	public static Object getClassInstance(String clzName) {
		Class cls;
		Object obj = null;
		try {
			cls = Class.forName(clzName);
			obj = (Object) cls.newInstance();
		} catch (Exception e) {
			log.error(e.getStackTrace());
		}
		return obj;
	}

	public static Object getInterceptorProxyedObject(String clzName) {
		InterceptorHandler aopHandler = new InterceptorHandler();
		Object obj = getClassInstance(clzName);

		return aopHandler.bind(obj);
	}
	
	public static SysguardService getSysguardService(){
		return (SysguardService)getInterceptorProxyedObject(SysguardServiceImpl.class.getName());
	}
}
