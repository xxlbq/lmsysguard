package cn.livedoor.security.sysguard.jsch;

import java.io.IOException;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class JschExecCommandMutlThreadImpl extends AbstractJschThread implements Runnable {
	private String command;

	public void run() {
		Session session = null;
		try {
			JschUtil jschUtil = new JschUtil();
			session = getSession(jschUtil);
			result = jschUtil.executeCommand(session, command);
		} catch (JSchException e) {
			result = "login host error!";
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.disconnect();
			}
		}
		addResult();
	}

	/**
	 * @return Returns the command.
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * @param command
	 *            The command to set.
	 */
	public void setCommand(String command) {
		this.command = command;
	}
}
