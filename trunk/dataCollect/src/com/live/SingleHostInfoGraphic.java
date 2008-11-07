package com.live;

import java.util.concurrent.Callable;

import org.apache.log4j.Logger;

public class SingleHostInfoGraphic implements Callable<Integer> {

	private HostData hostData = null;

	private Class gsclazz = null;

	private Logger logger = Logger.getLogger(SingleHostInfoGraphic.class);

	public SingleHostInfoGraphic(HostData hostData, Class cls) {
		this.hostData = hostData;
		this.gsclazz = cls;
	}

	public Integer call() throws Exception {
		logger.debug("poolGrapic call me ----------------------------------");
		return execute();
	}

	public int execute() throws InterruptedException, InstantiationException,
			IllegalAccessException {
		logger.info("wait for semaphore ----------------------------------");
		hostData.semaphore.acquire(Configurator.commands.size());
		IGraphic graphic = (IGraphic) gsclazz.newInstance();
		logger.debug("reflect invoke --------------------------------------");
		graphic.drawGraphic(hostData);
		logger.debug("drawn -----------------------------------------------");
		return 0;
	}

}
