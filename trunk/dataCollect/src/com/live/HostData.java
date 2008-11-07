package com.live;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

public class HostData implements Cloneable {

	private String hostid = null;

	private String groupid = null;

	private String hostip = null;

	private String username = null;

	private String password = null;

	private String diskpartition = null;
	
	public final Semaphore semaphore = new Semaphore(0,true);

	public final ConcurrentMap<String, String> unfmtCmdRets = new ConcurrentHashMap<String, String>();

	public final ConcurrentMap<String, String[]> fmtCmdRets = new ConcurrentHashMap<String, String[]>();

	public HostData(String hostid, String groupid, String hostip,
			String username, String password, String diskpartition) {
		super();
		this.hostid = hostid;
		this.groupid = groupid;
		this.hostip = hostip;
		this.username = username;
		this.password = password;
		this.diskpartition = diskpartition;
	}

	public final String getDiskpartition() {
		return diskpartition;
	}

	public final String getGroupid() {
		return groupid;
	}

	public final String getHostid() {
		return hostid;
	}

	public final String getHostip() {
		return hostip;
	}

	public final String getPassword() {
		return password;
	}

	public final String getUsername() {
		return username;
	}

}