package cn.livedoor.security.sysguard.services.exceptions;

public class SuperException extends RuntimeException {
	private String msg;
	
	public SuperException(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return this.msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}
}
