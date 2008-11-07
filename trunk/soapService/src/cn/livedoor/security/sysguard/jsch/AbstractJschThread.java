package cn.livedoor.security.sysguard.jsch;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class AbstractJschThread {
	String result;

	String hostIp;

	private String loginName;

	private String loginPassward;

	/**
	 * 
	 */
	protected void addResult() {
		StringBuffer sb = new StringBuffer();
		sb.append("=================================================");
		sb.append("\r\n");
		sb.append("==============" + hostIp + "===================");
		sb.append("\r\n");
		sb.append("=================================================");
		sb.append("\r\n");
		sb.append(result);
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		result = sb.toString();
	}

	/**
	 * @return Returns the hostIp.
	 */
	public String getHostIp() {
		return hostIp;
	}

	/**
	 * @return Returns the loginName.
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @return Returns the loginPassward.
	 */
	public String getLoginPassward() {
		return loginPassward;
	}

	/**
	 * @return Returns the result.
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param hostIp
	 *            The hostIp to set.
	 */
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	/**
	 * @param loginName
	 *            The loginName to set.
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @param loginPassward
	 *            The loginPassward to set.
	 */
	public void setLoginPassward(String loginPassward) {
		this.loginPassward = loginPassward;
	}

	/**
	 * @param result
	 *            The result to set.
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @param jschUtil
	 * @return
	 * @throws JSchException
	 */
	protected Session getSession(JschUtil jschUtil) throws JSchException {
		Session session;
		session = jschUtil.getSession(getHostIp(), getLoginName(), getLoginPassward());
		return session;
	}

}
