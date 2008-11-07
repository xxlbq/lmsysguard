package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.RoleInfo;

public class GetAllRoleInfoResponse extends Response {
	private RoleInfo[] allRole;

	/**
	 * @return Returns the allRole.
	 */
	public RoleInfo[] getAllRole() {
		return allRole;
	}

	/**
	 * @param allRole The allRole to set.
	 */
	public void setAllRole(RoleInfo[] allRole) {
		this.allRole = allRole;
	}
	
}
