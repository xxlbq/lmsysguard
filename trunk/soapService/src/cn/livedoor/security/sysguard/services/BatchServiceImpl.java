package cn.livedoor.security.sysguard.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.livedoor.security.sysguard.domain.Host;
import cn.livedoor.security.sysguard.jsch.JschExecCommandMutlThreadImpl;
import cn.livedoor.security.sysguard.jsch.JschUploadMutlThreadImpl;
import cn.livedoor.security.sysguard.jsch.JschUtil;
import cn.livedoor.security.sysguard.services.exceptions.CreateTmpFileException;
import cn.livedoor.security.sysguard.services.exceptions.HostLoginAuthFailException;
import cn.livedoor.security.sysguard.services.interfaces.BatchService;
import cn.livedoor.security.sysguard.services.interfaces.HostService;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class BatchServiceImpl extends AbstractService implements BatchService {

	public String[] BatchExecuteCommand(int[] hostIds, String command) {
		String[] results = new String[hostIds.length];
		HostService hostService = ServiceFactory.getHostService();
		hostService.setDaoManager(getDaoManager());
		JschExecCommandMutlThreadImpl[] execCommandThreads = new JschExecCommandMutlThreadImpl[hostIds.length];
		Thread[] threads = new Thread[execCommandThreads.length];
		for (int i = 0; i < hostIds.length; i++) {
			execCommandThreads[i] = new JschExecCommandMutlThreadImpl();
			Host host = hostService.getHostByHostId(hostIds[i]);
			String hostIp = host.getHostIp();
			String loginName = getSecurityString(host.getLoginName());
			String loginPassward = getSecurityString(host.getLoginPwd());
			execCommandThreads[i].setCommand(command);
			execCommandThreads[i].setHostIp(hostIp);
			execCommandThreads[i].setLoginName(loginName);
			execCommandThreads[i].setLoginPassward(loginPassward);
			threads[i] = new Thread(execCommandThreads[i]);
			threads[i].start();
		}
		threadsISStop(threads);
		for (int i = 0; i < execCommandThreads.length; i++) {
			results[i] = execCommandThreads[i].getResult();
		}
		return results;
	}

	public String[] BatchUploadFile(int[] hostIds, byte[] file, String path, String fileName) {
		String tmpFilePath = System.getProperty("java.io.tmpdir");
		String tempFileName = tmpFilePath + File.separator + fileName;
		File tmpFile = new File(tempFileName);
		try {
			tmpFile.createNewFile();
			FileOutputStream fos = new FileOutputStream(tmpFile);
			fos.write(file);
		} catch (IOException e) {
			throw new CreateTmpFileException("Create Temp File Error!");
		}
		String[] results = new String[hostIds.length];
		HostService hostService = ServiceFactory.getHostService();
		hostService.setDaoManager(getDaoManager());
		JschUploadMutlThreadImpl[] uploadThreads = new JschUploadMutlThreadImpl[hostIds.length];
		Thread[] threads = new Thread[uploadThreads.length];
		for (int i = 0; i < hostIds.length; i++) {
			uploadThreads[i] = new JschUploadMutlThreadImpl();
			Host host = hostService.getHostByHostId(hostIds[i]);
			String hostIp = host.getHostIp();
			String loginName = getSecurityString(host.getLoginName());
			String loginPassward = getSecurityString(host.getLoginPwd());
			uploadThreads[i].setHostIp(hostIp);
			uploadThreads[i].setLoginName(loginName);
			uploadThreads[i].setLoginPassward(loginPassward);
			uploadThreads[i].setRemotePath(path);
			uploadThreads[i].setLocalFile(tempFileName);
			threads[i] = new Thread(uploadThreads[i]);
			threads[i].start();
		}
		threadsISStop(threads);
		for (int i = 0; i < uploadThreads.length; i++) {
			results[i] = uploadThreads[i].getResult();
		}
		return results;
	}

	public static void main(String[] args) {
		String tmpFilePath = System.getProperty("java.io.tmpdir");
		File tmpFile = new File(tmpFilePath + "a.txt");
		System.out.println(tmpFile.getAbsoluteFile());
	}

	private String getSecurityString(String str) {
		return str;
	}

	private void threadsISStop(Thread[] threads) {
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
			}
		}
	}

}
