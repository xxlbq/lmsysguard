package com.live;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;

public class Configurator {

	public final static List<String> schdkey = new ArrayList<String>();

	public final static ConcurrentMap<String, String> schd_prop = new ConcurrentHashMap<String, String>();

	public final static List<String> commands = new ArrayList<String>();

	public final static ConcurrentMap<String, String[]> cmd_fmt = new ConcurrentHashMap<String, String[]>();

	public final ConcurrentMap<String, String> cmd_opt = new ConcurrentHashMap<String, String>();

	private static ResourceBundle rb = null;

	private static Logger logger = Logger.getLogger(Configurator.class);

	static {
		try {
			rb = ResourceBundle.getBundle("runtime");

		} catch (Exception e) {
			logger.fatal("Can't find runtime in classpath,we use default.");
			rb = ResourceBundle.getBundle("config.runtime");
		}
		loadResourceArgs();
	}

	private static void loadResourceArgs() {
		Enumeration<String> keys = rb.getKeys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			if (key.startsWith("command")) {
				cmdArgs(key);
			} else {
				schedualArgs(key);
			}
		}
	}

	private static void cmdArgs(String key) {
		if (!key.contains("_")) {
			commands.add(rb.getString(key));
			int fmtsz = Integer.parseInt(rb.getString(key + "_fmtsz"));
			String[] regexs = new String[fmtsz];
			for (int i = 0; i < regexs.length; i++) {
				regexs[i] = rb.getString(key + "_" + i);
			}
			cmd_fmt.put(rb.getString(key), regexs);
		}
	}

	private static void schedualArgs(String key) {
		schdkey.add(key);
		schd_prop.put(key, rb.getString(key));
	}

	// who should I belong to ?
	public void setCommandsOpt(Map<String, String> map) {
		cmd_opt.putAll(map);
	}

	public static Configurator personalizeCommand(HostData hostData) {
		Configurator configurator = new Configurator();
		configurator.cmd_opt.put("df", hostData.getDiskpartition());
		return configurator;
	}
}
