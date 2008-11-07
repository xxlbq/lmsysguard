package com.live;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.live.adapter.GraphicAdapter;
import com.live.adapter.MySqlDBAdapter;

public class HostInfoEntry implements Callable<Integer>, Runnable {

	private Class dsclazz = null;

	private Class gsclazz = null;

	private HostBashInfoListener bashInfoListener = null;

	private ConcurrentMap<String, HostData> hostBashInfo = null;

	private ConcurrentMap<String, String> schdPropMap = null;

	private BlockingQueue<CommandRets> blockingQueueRawData = null;

	private BlockingQueue<CommandRets> blockingQueueFormatedData = null;

	private ScheduledExecutorService poolTrigger = null;

	private ScheduledExecutorService poolListener = null;

	private ExecutorService poolControler = null;

	private ExecutorService poolCollector = null;

	private ExecutorService poolFormater = null;

	private ExecutorService poolPersistences = null;

	private ExecutorService poolGrapic = null;

	private static Logger logger = Logger.getLogger(HostInfoEntry.class);

	public HostInfoEntry() {
		init();
		schedul();
	}

	private void init() {
		logger.debug("init whole------------------------------------------");
		dsclazz = MySqlDBAdapter.class;
		gsclazz = GraphicAdapter.class;
		schdPropMap = Configurator.schd_prop;
		hostBashInfo = new ConcurrentHashMap<String, HostData>();
		bashInfoListener = new HostBashInfoListener(hostBashInfo, dsclazz);
		blockingQueueRawData = new ArrayBlockingQueue<CommandRets>(Integer
				.parseInt(schdPropMap.get(Constants.rawqsize)));
		blockingQueueFormatedData = new ArrayBlockingQueue<CommandRets>(Integer
				.parseInt(schdPropMap.get(Constants.fmtqsize)));
		poolListener = Executors.newScheduledThreadPool(Integer
				.parseInt(schdPropMap.get(Constants.lsnpoolsize)));
		poolTrigger = Executors.newScheduledThreadPool(Integer
				.parseInt(schdPropMap.get(Constants.schdpoolsize)));
		poolControler = Executors.newCachedThreadPool();
		poolCollector = Executors.newCachedThreadPool();
		poolFormater = Executors.newCachedThreadPool();
		poolPersistences = Executors.newCachedThreadPool();
		poolGrapic = Executors.newCachedThreadPool();
		logger.debug("init end--------------------------------------------");
	}

	private void schedul() {
		logger.debug("start schedule the whole-----------------------------");

		logger.debug("start listener to bash info -------------------------");
		ScheduledFuture<?> result = poolListener.scheduleAtFixedRate(
				bashInfoListener, Integer.parseInt(schdPropMap
						.get(Constants.lsnpooldelay)), Integer
						.parseInt(schdPropMap.get(Constants.lsncycle)),
				TimeUnit.SECONDS);

		ScheduledFuture<?> result2 = poolTrigger.scheduleAtFixedRate(this,
				Integer.parseInt(schdPropMap.get(Constants.schdpooldelay)),
				Integer.parseInt(schdPropMap.get(Constants.schdcycle)),
				TimeUnit.SECONDS);
		logger.debug("the whole started ----------------------------------");
	}

	public Integer call() throws Exception {
		logger.debug("who will call me ?-----------------------------------");
		return execute();
	}

	// String[0]--name,String[1]--ip,String[3]--pwd,
	public int execute() throws InterruptedException {
		logger.debug("real bussiness start here----------------------------");

		Collection<HostData> bashInfo = hostBashInfo.values();
		final Collection<Callable<Integer>> collectors = new ConcurrentLinkedQueue<Callable<Integer>>();
		final Collection<Callable<Integer>> formaters = new ConcurrentLinkedQueue<Callable<Integer>>();
		final Collection<Callable<Integer>> persistences = new ConcurrentLinkedQueue<Callable<Integer>>();
		final Collection<Callable<Integer>> grapic = new ConcurrentLinkedQueue<Callable<Integer>>();

		for (Iterator iter = bashInfo.iterator(); iter.hasNext();) {
			HostData element = (HostData) iter.next();
			if (HostSocketConnector.hostAvailability(element)) {
				Configurator configurator = Configurator.personalizeCommand(element);
				com.jcraft.jsch.Session jschSession = HostSocketConnector
						.create(element);
				collectors.add(new SingleHostInfoCollector(element,
						jschSession, blockingQueueRawData, configurator));
				grapic.add(new SingleHostInfoGraphic(element, gsclazz));
				for (int i = 0; i < Configurator.commands.size(); i++) {
					formaters.add(new SingleHostInfoFormater(
							blockingQueueRawData, blockingQueueFormatedData));
					persistences.add(new SingleHostInfoPersistence(
							blockingQueueFormatedData, dsclazz));
				}
			}
		}
		logger.debug("raw data may be collected----------------------------");
		poolControler.submit(new Runnable() {
			public void run() {
				try {
					List<Future<Integer>> reList = poolCollector
							.invokeAll(collectors);
				} catch (InterruptedException e) {
					logger.error(e.getMessage());
				}
			}
		});
		logger.debug("data may be formated---------------------------------");
		poolControler.submit(new Runnable() {
			public void run() {
				try {
					List<Future<Integer>> reList2 = poolFormater
							.invokeAll(formaters);
				} catch (InterruptedException e) {
					logger.error(e.getMessage());
				}
			}
		});
		logger.debug("data may be persisted in DB--------------------------");
		poolControler.submit(new Runnable() {
			public void run() {
				try {
					List<Future<Integer>> reList3 = poolPersistences
							.invokeAll(persistences);
				} catch (InterruptedException e) {
					logger.error(e.getMessage());
				}
			}
		});
		logger.debug("data may be grapic by tools -------------------------");
		poolControler.submit(new Runnable() {
			public void run() {
				try {
					List<Future<Integer>> reList4 = poolGrapic
							.invokeAll(grapic);
				} catch (InterruptedException e) {
					logger.error(e.getMessage());
				}
			}
		});
		logger.debug("schedule reach here periodically---------------------");
		return 0;
	}

	public void run() {
		try {
			execute();
		} catch (InterruptedException e) {
			logger.error(e.getMessage());
		}
	}
}
