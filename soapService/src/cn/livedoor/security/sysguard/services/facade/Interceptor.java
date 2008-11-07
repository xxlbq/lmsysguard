package cn.livedoor.security.sysguard.services.facade;


public interface Interceptor {
	public void before(InvokeInfo invInfo);
    public void after(InvokeInfo invInfo);
    public void exceptionThrow(InvokeInfo invInfo);
}
