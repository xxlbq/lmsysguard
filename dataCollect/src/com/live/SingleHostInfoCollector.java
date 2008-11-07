package com.live;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SingleHostInfoCollector implements Callable<Integer> {

	private Session jschSession;

	private Channel channel;

	private HostData hostData;

	private BlockingQueue<CommandRets> blockingQueue = null;

	private static Configurator configurator = null;

	private static Logger logger = Logger
			.getLogger(SingleHostInfoCollector.class);

	public SingleHostInfoCollector(HostData hd, Session jsession,
			BlockingQueue<CommandRets> queue, Configurator cfg) {
		hostData = hd;
		jschSession = jsession;
		blockingQueue = queue;
		configurator = cfg;
	}

	public Integer call() throws Exception {
		logger.debug("poolCollector call me -------------------------------");
		return execute();
	}

	public int execute() throws JSchException, IOException,
			InterruptedException, CloneNotSupportedException {
		logger.debug("collector executing ---------------------------------");
		int count = 0;

		jschSession.connect();
		for (Iterator iter = Configurator.commands.iterator(); iter.hasNext();) {
			String command = (String) iter.next();
			String originCmd = command;

			logger.debug("channel open --------------------------------");
			channel = jschSession.openChannel("exec");

			String paramOpt = configurator.cmd_opt.get(command);
			if (paramOpt != null) {
				command = command + " " + paramOpt;
			}

			((ChannelExec) channel).setCommand(command);
			channel.setXForwarding(true);

			// channel.setInputStream(System.in);
			channel.setInputStream(null);

			// channel.setOutputStream(System.out);

			// FileOutputStream fos=new FileOutputStream("/tmp/stderr");
			// ((ChannelExec)channel).setErrStream(fos);
			((ChannelExec) channel).setErrStream(System.err);

			InputStream in = channel.getInputStream();

			logger.debug("channel connect --------------------------------");
			channel.connect();

			byte[] tmp = new byte[1024];
			StringBuffer sb = new StringBuffer();
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;
					sb.append(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					logger.debug("exit-status: " + channel.getExitStatus());
					break;
				}
				Thread.yield();
			}
			
			command = originCmd;

			String unfmtRetStr = sb.toString();

			// import for rrd4j
			hostData.unfmtCmdRets.put(command, unfmtRetStr);

			CommandRets commandRets = new CommandRets(hostData);
			commandRets.setCommand(command);
			commandRets.setUnfmtRetStr(unfmtRetStr);

			logger.info("-------------------------------------------------");
			logger.info("command=" + command + " result=" + sb.toString());
			count++;
			blockingQueue.put(commandRets);
			logger.debug("channel dis connect ----------------------------");
			channel.disconnect();
		}
		jschSession.disconnect();

		logger.debug("collector executed ----------------------------------");
		return count;
	}

}
