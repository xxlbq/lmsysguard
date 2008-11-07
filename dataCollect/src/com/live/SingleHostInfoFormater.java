package com.live;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class SingleHostInfoFormater implements Callable<Integer> {

	private BlockingQueue<CommandRets> blockingQueueRawData = null;

	private BlockingQueue<CommandRets> blockingQueueFormatedData = null;

	private Logger logger = Logger.getLogger(SingleHostInfoFormater.class);

	public SingleHostInfoFormater(BlockingQueue<CommandRets> raw,
			BlockingQueue<CommandRets> formated) {
		this.blockingQueueRawData = raw;
		this.blockingQueueFormatedData = formated;
	}

	public Integer call() throws Exception {
		logger.debug("poolCollector call me -------------------------------");
		return execute();
	}

	public int execute() throws InterruptedException,
			CloneNotSupportedException {
		logger.debug("formater executing ---------------------------------");

		CommandRets cmdRets = blockingQueueRawData.take();
		String command = cmdRets.getCommand();
		String unfmtRetStr = cmdRets.getUnfmtRetStr();

		String[] regexs = Configurator.cmd_fmt.get(command);
		String[] fmtRets = formater(unfmtRetStr, regexs);

		// import for rrd4j
		HostData hostData = cmdRets.getHostData();
		hostData.fmtCmdRets.put(command, fmtRets);
		logger.info("semaphore release --------------------------"+command);
		hostData.semaphore.release();

		cmdRets.setFmtRets(fmtRets);
		blockingQueueFormatedData.put(cmdRets);
		logger.debug("formater executed ----------------------------------");
		return 0;
	}

	public String[] formater(String unfmtRetStr, String[] regexs) {
		StringBuffer sb = null;
		String unfmttmp = unfmtRetStr;
		logger.debug("regexs.length ------------------------" + regexs.length);
		for (int i = 0; i < regexs.length; i++) {
			java.util.regex.Pattern p = java.util.regex.Pattern.compile(
					regexs[i], Pattern.MULTILINE);
			java.util.regex.Matcher m = p.matcher(unfmttmp);
			sb = new StringBuffer();
			while (m.find()) {
				String matchedText = m.group();
				int matchedFrom = m.start();
				int matchedTo = m.end();
				sb.append(matchedText + "|");
				logger.debug("matched [" + matchedText + "] from "
						+ matchedFrom + " to " + matchedTo + ".");
			}
			unfmttmp = sb.toString();
			logger.info(unfmttmp);
		}
		return sb.toString().split("\\|");
	}

}
