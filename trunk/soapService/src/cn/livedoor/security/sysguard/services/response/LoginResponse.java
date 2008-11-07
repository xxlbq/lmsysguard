package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.UserInfo;

public class LoginResponse extends Response {
	private UserInfo userInfo;

	/**
	 * @return the userInfo
	 */
	public UserInfo getUserInfo() {
		return userInfo;
	}

	/**
	 * @param userInfo the userInfo to set
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
}
