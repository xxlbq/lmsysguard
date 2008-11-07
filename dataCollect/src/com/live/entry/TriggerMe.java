package com.live.entry;

import org.apache.log4j.Logger;

import com.live.HostInfoEntry;

public class TriggerMe {
	private static Logger logger = Logger.getLogger(HostInfoEntry.class);
	public static void main(String[] args) {
		logger.debug("Module's entry --------------------------------------");
		HostInfoEntry entry = new HostInfoEntry();
		logger.debug("Module's entry --------------------------------------"+entry);
	}
}
