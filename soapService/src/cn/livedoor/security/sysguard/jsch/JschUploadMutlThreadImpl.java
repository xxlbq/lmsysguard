package cn.livedoor.security.sysguard.jsch;

import java.io.IOException;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class JschUploadMutlThreadImpl extends AbstractJschThread implements Runnable {
	private String remotePath;

	private String localFile;

	public void run() {
		Session session = null;
		try {
			JschUtil jschUtil = new JschUtil();
			session = getSession(jschUtil);
			result = jschUtil.uploadFile(session, remotePath, localFile);
		} catch (JSchException e) {
			result = "login host error!";
		} catch (IOException e) {
			result = "Error!";
		} finally {
			if (session != null) {
				session.disconnect();
			}
		}
		addResult();
	}

	/**
	 * @return Returns the localFile.
	 */
	public String getLocalFile() {
		return localFile;
	}

	/**
	 * @return Returns the remotePath.
	 */
	public String getRemotePath() {
		return remotePath;
	}

	/**
	 * @param localFile
	 *            The localFile to set.
	 */
	public void setLocalFile(String localFile) {
		this.localFile = localFile;
	}

	/**
	 * @param remotePath
	 *            The remotePath to set.
	 */
	public void setRemotePath(String remotePath) {
		this.remotePath = remotePath;
	}

}
