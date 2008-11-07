package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.HostInfo;

public class GetAllHostInfoResponse extends Response {
	private HostInfo[] allHostInfo;

	/**
	 * @return the allHostInfo
	 */
	public HostInfo[] getAllHostInfo() {
		return allHostInfo;
	}

	/**
	 * @param allHostInfo the allHostInfo to set
	 */
	public void setAllHostInfo(HostInfo[] allHostInfo) {
		this.allHostInfo = allHostInfo;
	}
	
}
