package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.SystemInfo;

public class GetAllSystemInfoResponse extends Response {
	private SystemInfo[] allSysInfo;

	/**
	 * @return the allSysInfo
	 */
	public SystemInfo[] getAllSysInfo() {
		return allSysInfo;
	}

	/**
	 * @param allSysInfo the allSysInfo to set
	 */
	public void setAllSysInfo(SystemInfo[] allSysInfo) {
		this.allSysInfo = allSysInfo;
	}
	
}
