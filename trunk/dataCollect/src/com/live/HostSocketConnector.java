package com.live;

import org.apache.log4j.Logger;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.UserInfo;

public class HostSocketConnector {

	private static Logger logger = Logger.getLogger(HostSocketConnector.class);

	public static boolean hostAvailability(HostData hostData) {
		logger.debug("creating --------------------------------------------");

		com.jcraft.jsch.Session jschSession = create(hostData);
		if (jschSession == null) {
			return false;
		}

		try {
			jschSession.connect();
			jschSession.disconnect();
		} catch (JSchException e) {
			jschSession = null;
			logger.error("conneting error ----------------" + e.getMessage());
			return false;
		}

		logger.debug("created ---------------------------------------------");
		return true;

	}

	public static com.jcraft.jsch.Session create(HostData hostData) {
		final String username = hostData.getUsername();
		final String hostname = hostData.getHostip();
		final String password = hostData.getPassword();

		JSch jsch = new JSch();
		com.jcraft.jsch.Session jschSession = null;
		try {
			jschSession = jsch.getSession(username, hostname, 22);
		} catch (JSchException e) {
			jschSession = null;
			logger.error("HostData error -------------------" + e.getMessage());
		}

		jschSession.setUserInfo(new UserInfo() {
			public String getPassphrase() {
				return null;
			}

			public String getPassword() {
				return password;
			}

			public boolean promptPassphrase(String message) {
				return true;
			}

			public boolean promptPassword(String message) {
				return true;
			}

			public boolean promptYesNo(String message) {
				return true;
			}

			public void showMessage(String message) {
			}
		});
		return jschSession;
	}
}
