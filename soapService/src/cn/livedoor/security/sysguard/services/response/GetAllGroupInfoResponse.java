package cn.livedoor.security.sysguard.services.response;

import cn.livedoor.www.sysguard.GroupInfo;

public class GetAllGroupInfoResponse extends Response {
	private GroupInfo[] allGroupInfo;

	/**
	 * @return the allGroupInfo
	 */
	public GroupInfo[] getAllGroupInfo() {
		return allGroupInfo;
	}

	/**
	 * @param allGroupInfo
	 *            the allGroupInfo to set
	 */
	public void setAllGroupInfo(GroupInfo[] allGroupInfo) {
		this.allGroupInfo = allGroupInfo;
	}

}
