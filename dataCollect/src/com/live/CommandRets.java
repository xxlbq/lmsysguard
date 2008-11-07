package com.live;


public class CommandRets implements Cloneable {
	private HostData hostData = null;

	private String command = null;

	private String unfmtRetStr = null;

	private String[] fmtRets = null;

	public CommandRets(HostData hostData) {
		super();
		this.hostData = hostData;
	}

	public final String getCommand() {
		return command;
	}

	public final void setCommand(String command) {
		this.command = command;
	}

	public final String[] getFmtRets() {
		return fmtRets;
	}

	public final void setFmtRets(String[] fmtRets) {
		this.fmtRets = fmtRets;
	}

	public final String getUnfmtRetStr() {
		return unfmtRetStr;
	}

	public final void setUnfmtRetStr(String unfmtRetStr) {
		this.unfmtRetStr = unfmtRetStr;
	}

	public final HostData getHostData() {
		return hostData;
	}
}
