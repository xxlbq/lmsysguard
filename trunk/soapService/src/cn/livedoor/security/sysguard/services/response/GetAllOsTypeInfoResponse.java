package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.OsTypeInfo;

public class GetAllOsTypeInfoResponse extends Response {
	private OsTypeInfo[] allOsType;

	/**
	 * @return the allOsType
	 */
	public OsTypeInfo[] getAllOsType() {
		return allOsType;
	}

	/**
	 * @param allOsType the allOsType to set
	 */
	public void setAllOsType(OsTypeInfo[] allOsType) {
		this.allOsType = allOsType;
	}
	
}
