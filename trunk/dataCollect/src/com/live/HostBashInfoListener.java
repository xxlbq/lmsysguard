package com.live;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;

public class HostBashInfoListener implements Callable<Integer>, Runnable {
	private ConcurrentMap<String, HostData> hostBashInfoHold = null;

	private ConcurrentMap<String, HostData> hostBashInfoDS = new ConcurrentHashMap<String, HostData>();

	private Class dsclazz = null;

	private Logger logger = Logger.getLogger(HostBashInfoListener.class);

	public HostBashInfoListener(ConcurrentMap<String, HostData> hostBashInfo,
			Class ds) {
		this.hostBashInfoHold = hostBashInfo;
		this.dsclazz = ds;
	}

	public Integer call() throws Exception {
		logger.info("who will call me ?-----------------------------------");
		return execute();
	}

	public int execute() throws InstantiationException, IllegalAccessException {
		logger.info("listening the host periodically ----------------------");
		loadHostInfo();
		mergeHostInfo();
		return 0;
	}

	private void loadHostInfo() throws InstantiationException,
			IllegalAccessException {
		IDataSource dataSource = (IDataSource) dsclazz.newInstance();
		dataSource.queryHostInof(hostBashInfoDS);
	}

	private void mergeHostInfo() {
		hostBashInfoHold.clear();
		hostBashInfoHold.putAll(hostBashInfoDS);
	}

	public void run() {
		try {
			execute();
		} catch (InstantiationException e) {
			logger.error(e.getMessage());
		} catch (IllegalAccessException e) {
			logger.error(e.getMessage());
		}
	}

}
