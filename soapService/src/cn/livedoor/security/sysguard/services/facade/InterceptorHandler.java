package cn.livedoor.security.sysguard.services.facade;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.livedoor.security.sysguard.services.response.Response;

public class InterceptorHandler implements InvocationHandler {
	private static Log log = LogFactory.getLog(InterceptorHandler.class);

	private List interceptors = null;

	private Object orginalObject;

	public Object bind(Object obj) {
		this.orginalObject = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		Throwable ex = null;
		InvokeInfo invInfo = new InvokeInfo(proxy, method, args, result, ex);
		log.debug("Invoking Before Intercepors!" + method.getName() + method.getName());
		try {
			System.out.println("*****************" + "Invoking '" + method.getName() + "' Method!" + "************");
			invokeInterceptorBefor(invInfo);
			log.debug("Invoking '" + method.getName() + "' Method!");
			result = method.invoke(orginalObject, args);

			invInfo.setResult(result);
			log.debug("Invoking After '" + method.getName() + "'");
			invokeInterceptorAfter(invInfo);

		} catch (Throwable tr) {
			invInfo.setException(tr);
			if (log.isErrorEnabled()) {
				log.error("Invoking exceptionThrow " + method.getName());
				log.error(tr.getMessage());
			}
			if (result == null) {
				Class clazz = method.getReturnType();
				try {
					result = (Response) clazz.newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				invInfo.setResult(result);
			}

			invokeInterceptorExceptionThrow(invInfo);
			// if (log.isErrorEnabled()) {
			// log.error("Invoking exceptionThrow " + method.getName());
			// log.error(tr.getMessage());
			// tr.printStackTrace();
			// }
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private synchronized List getIntercetors() {
		if (null == interceptors) {
			interceptors = new ArrayList();
			interceptors.add(new DealExceptionInterceptor());
			interceptors.add(new CheckUserIsNullInterceptor());
		}
		return interceptors;
	}

	private void invokeInterceptorBefor(InvokeInfo invInfo) {
		List interceptors = getIntercetors();
		int len = interceptors.size();
		for (int i = 0; i < len; i++) {
			((Interceptor) interceptors.get(i)).before(invInfo);
		}
	}

	private void invokeInterceptorAfter(InvokeInfo invInfo) {
		List interceptors = getIntercetors();
		int len = interceptors.size();
		for (int i = len - 1; i >= 0; i--) {
			((Interceptor) interceptors.get(i)).after(invInfo);
		}
	}

	private void invokeInterceptorExceptionThrow(InvokeInfo invInfo) {
		List interceptors = getIntercetors();
		int len = interceptors.size();
		for (int i = len - 1; i >= 0; i--) {
			((Interceptor) interceptors.get(i)).exceptionThrow(invInfo);
		}
	}
}
