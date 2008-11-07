package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.OperationInfo;

public class GetAllOperationInfoResponse extends Response {
	private OperationInfo[] allOperations;

	/**
	 * @return the allOperations
	 */
	public OperationInfo[] getAllOperations() {
		return allOperations;
	}

	/**
	 * @param allOperations the allOperations to set
	 */
	public void setAllOperations(OperationInfo[] allOperations) {
		this.allOperations = allOperations;
	}
	
}
