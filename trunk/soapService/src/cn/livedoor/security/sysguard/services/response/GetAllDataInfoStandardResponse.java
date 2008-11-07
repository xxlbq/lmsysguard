package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.DataInfoStandard;

public class GetAllDataInfoStandardResponse extends Response {
	private DataInfoStandard[] allStandard;

	/**
	 * @return the allStandard
	 */
	public DataInfoStandard[] getAllStandard() {
		return allStandard;
	}

	/**
	 * @param allStandard the allStandard to set
	 */
	public void setAllStandard(DataInfoStandard[] allStandard) {
		this.allStandard = allStandard;
	}
	
}
