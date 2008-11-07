package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.LogInfo;

public class GetAllLogInfoResponse extends Response {
	private LogInfo[] allLogInfo;

	/**
	 * @return the allLogInfo
	 */
	public LogInfo[] getAllLogInfo() {
		return allLogInfo;
	}

	/**
	 * @param allLogInfo the allLogInfo to set
	 */
	public void setAllLogInfo(LogInfo[] allLogInfo) {
		this.allLogInfo = allLogInfo;
	}
	
}
