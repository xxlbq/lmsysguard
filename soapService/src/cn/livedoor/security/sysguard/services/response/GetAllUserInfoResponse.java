package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.UserInfo;

public class GetAllUserInfoResponse extends Response {
	private UserInfo[] allUserInfo;

	/**
	 * @return the allUserInfo
	 */
	public UserInfo[] getAllUserInfo() {
		return allUserInfo;
	}

	/**
	 * @param allUserInfo
	 *            the allUserInfo to set
	 */
	public void setAllUserInfo(UserInfo[] allUserInfo) {
		this.allUserInfo = allUserInfo;
	}

}
