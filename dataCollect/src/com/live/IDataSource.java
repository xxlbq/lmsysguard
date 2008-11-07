package com.live;

import java.util.concurrent.ConcurrentMap;

public interface IDataSource {
	public abstract void queryHostInof(
			ConcurrentMap<String, HostData> concurrentMap);

	public abstract void populateDataInof(CommandRets cmdRets);

}