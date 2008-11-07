package com.live;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import org.apache.log4j.Logger;


public class SingleHostInfoPersistence implements Callable<Integer> {

	private BlockingQueue<CommandRets> blockingQueueFormatedData = null;

	private Class dsclazz = null;

	private Logger logger = Logger.getLogger(SingleHostInfoPersistence.class);

	public SingleHostInfoPersistence(BlockingQueue<CommandRets> queue, Class ds) {
		this.blockingQueueFormatedData = queue;
		this.dsclazz = ds;
	}

	public Integer call() throws Exception {
		logger.debug("poolCollector call me -------------------------------");
		return execute();
	}

	public int execute() throws InterruptedException, InstantiationException, IllegalAccessException {
		logger.debug("persistent data ------------------------------------");
		
		CommandRets cmdRets = blockingQueueFormatedData.take();
		populateDS(cmdRets);
		
		logger.debug("persistent executed --------------------------------");
		return 0;
	}

	private void populateDS(CommandRets cmdRets) throws InstantiationException, IllegalAccessException {
		IDataSource dataSource = (IDataSource) dsclazz.newInstance();
		dataSource.populateDataInof(cmdRets);
	}
}
