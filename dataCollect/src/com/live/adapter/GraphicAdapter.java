package com.live.adapter;

import java.io.File;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;

import com.live.HostData;
import com.live.IGraphic;
import com.live.rrd4j.RrdTools;

public class GraphicAdapter implements IGraphic {

	private final static ConcurrentLinkedQueue<String> rrd4jDBKey = new ConcurrentLinkedQueue<String>();

	private static Logger logger = Logger.getLogger(GraphicAdapter.class);

	public void drawGraphic(HostData hostData) {

		logger.debug("drawGraphic start -----------------------------------");

		ConcurrentMap<String, String[]> fmtRet = hostData.fmtCmdRets;
		// stub-------------------------
		Random generator = new Random();

		double cpu = 0;
		double mem = 0;
		double disk = 0;
		double load = 0;
		// double apptime = 0;
		String hostip = hostData.getHostip();
		try {
			String loadArgs = fmtRet.get("uptime")[1];
			load = Double.parseDouble(loadArgs)*100;
			
			String diskArgs = fmtRet.get("df")[0];
			disk = Double.parseDouble(diskArgs);
			
			String cpuArgs = fmtRet.get("vmstat")[0];
			cpu = Double.parseDouble(cpuArgs);

			String[] memArgs = fmtRet.get("free");
			mem = Double.parseDouble(memArgs[1])
					/ Double.parseDouble(memArgs[0]) * 100;

		} catch (NumberFormatException e) {
			logger.debug("shit db -----------------------------------------");
		}

		// /////////////////////////
		int apptime = generator.nextInt(20) + 1;

		// real work do here
		createRrdDatabase(hostip);
		updateRrdData(hostip, cpu, mem, disk, load, new Double(apptime));
		createGraph(hostip);
		logger.debug("drawGraphic end -------------------------------------");
	}

	public void createRrdDatabase(String hostip) {
		if (!new File(hostip + ".rrd").exists()) {
			logger.debug("create db ---------------------------------------");
			rrd4jDBKey.add(hostip);
			RrdTools.createRrdDatabase(hostip);
		}
	}

	public void updateRrdData(String hostIp, Double cpu, Double mem,
			Double disk, Double load, Double apptime) {
		logger.debug("update data -----------------------------------------");
		RrdTools.updateRrdData(hostIp, cpu, mem, disk, load, apptime);
	}

	public void createGraph(String hostip) {
		logger.debug("create graphic --------------------------------------");
		RrdTools.createGraph(hostip);
	}

}
