package cn.livedoor.security.sysguard.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.ChannelSftp.LsEntry;

public class JschUtil {
	private static final String UPLOAD_SUCCESS = "Success";

	private static final String UPLOAD_FAIL = "Fail";

	public Session getSession(String hostname, String username, String password) throws JSchException {
		JSch jsch = new JSch();

		Properties config = new Properties();
		config.setProperty("StrictHostKeyChecking", "no");
		Session session = jsch.getSession(username, hostname, 22);
		session.setPassword(password);
		session.setConfig(config);
		session.connect();
		return session;
	}

	public String executeCommand(Session session, String command) throws JSchException, IOException {
		ChannelExec chanel = (ChannelExec) session.openChannel("exec");

		chanel.setCommand(command);
		chanel.setXForwarding(false);
		String result = getResult(chanel);

		chanel.disconnect();
		return result;
	}

	public String uploadFile(Session session, String remotePath, String localFile) throws JSchException, IOException {
		ChannelSftp channel = (ChannelSftp) session.openChannel("sftp");
		channel.connect();
		String result = null;
		try {
			int lastPathSepor = remotePath.lastIndexOf("/")+ 1;
			if(lastPathSepor == -1){
				return remotePath + " 格式不正确！";
			}
			String superPath= remotePath.substring(0,lastPathSepor );
			String path = remotePath.substring(lastPathSepor);
			Vector vv = channel.ls(superPath);
			boolean isNotDirFlag = true;
			if (vv != null) {
				for (int ii = 0; ii < vv.size(); ii++) {
					Object obj = vv.elementAt(ii);
					if (obj instanceof com.jcraft.jsch.ChannelSftp.LsEntry) {
						LsEntry lsEntry = (LsEntry)obj;
						if("/".equals(remotePath)||((lsEntry.getFilename().equals(path))&&(lsEntry.getAttrs().isDir()))){
							isNotDirFlag = false;
						}
					}

				}
			}
			if(isNotDirFlag){
				return remotePath + "不是文件夹，请确认输入！";
			}
		} catch (SftpException e1) {
			return remotePath + " 目录不存在！";
		}
		try {

			channel.put(localFile, remotePath);
			result = UPLOAD_SUCCESS;
		} catch (Exception e) {
			result = UPLOAD_FAIL;
		}

		channel.disconnect();
		return result;
	}

	/**
	 * @param chanel
	 * @return
	 * @throws IOException
	 * @throws JSchException
	 */
	private String getResult(ChannelExec chanel) throws IOException, JSchException {
		InputStream in = chanel.getInputStream();
		InputStream error = chanel.getErrStream();
//		if(in.available()<=0){
//			return "Command execute success!";
//		}
		chanel.connect();
		StringBuffer sb = readExecuteResult(chanel, in);
		if(sb.length()== 0){
				sb = readExecuteResult(chanel, error);
		}
		if(sb.length() == 0){
			return "Command execute success!";
		}
		return sb.toString();
	}

	/**
	 * @param chanel
	 * @param in
	 * @return
	 * @throws IOException
	 */
	private StringBuffer readExecuteResult(ChannelExec chanel, InputStream in) throws IOException {
		StringBuffer sb = new StringBuffer();
		byte[] tmp = new byte[1024];
		while (true) {
			try {
				Thread.sleep(10);
			} catch (Exception ee) {
			}
			while (in.available() > 0) {
				int i = in.read(tmp, 0, 1024);
				if (i < 0) {
					break;
				}
				sb.append(new String(tmp, 0, i));
			}
			if (chanel.isClosed()) {
				System.out.println("exit-status: " + chanel.getExitStatus());
				break;
			}
		}
		return sb;
	}
}
