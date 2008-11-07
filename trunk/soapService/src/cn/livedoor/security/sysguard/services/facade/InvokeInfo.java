package cn.livedoor.security.sysguard.services.facade;

import java.lang.reflect.Method;

import cn.livedoor.security.sysguard.services.exceptions.SuperException;

public class InvokeInfo {
	Object proxy;
    Method method;
    Object[] args;
    Object result;
    Throwable exception;
    
    public InvokeInfo(Object proxy,
            			Method method,
            			Object[] args,
            			Object result,
            			Throwable exception){
        this.proxy = proxy;
        this.method = method;
        this.args = args;
        this.result = result;
        this.exception = exception;
    }

	/**
	 * @return Returns the args.
	 */
	public Object[] getArgs() {
		return args;
	}

	/**
	 * @return Returns the exception.
	 */
	public Throwable getException() {
		return exception;
	}

	/**
	 * @return Returns the method.
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * @return Returns the proxy.
	 */
	public Object getProxy() {
		return proxy;
	}

	/**
	 * @return Returns the result.
	 */
	public Object getResult() {
		return result;
	}

	/**
	 * @param args The args to set.
	 */
	public void setArgs(Object[] args) {
		this.args = args;
	}

	/**
	 * @param exception The exception to set.
	 */
	public void setException(Throwable exception) {
		this.exception = exception;
	}

	/**
	 * @param method The method to set.
	 */
	public void setMethod(Method method) {
		this.method = method;
	}

	/**
	 * @param proxy The proxy to set.
	 */
	public void setProxy(Object proxy) {
		this.proxy = proxy;
	}

	/**
	 * @param result The result to set.
	 */
	public void setResult(Object result) {
		this.result = result;
	}
    
    
}
