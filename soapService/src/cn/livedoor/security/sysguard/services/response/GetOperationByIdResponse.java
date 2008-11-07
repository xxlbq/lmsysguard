package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.OperationInfo;

public class GetOperationByIdResponse extends Response {
	private OperationInfo operationInfo;

	/**
	 * @return the operationInfo
	 */
	public OperationInfo getOperationInfo() {
		return operationInfo;
	}

	/**
	 * @param operationInfo
	 *            the operationInfo to set
	 */
	public void setOperationInfo(OperationInfo operationInfo) {
		this.operationInfo = operationInfo;
	}

}
