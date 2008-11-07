package cn.livedoor.security.sysguard.services.mock;

import cn.livedoor.security.sysguard.domain.DataInfo;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.SystemInfo;
import cn.livedoor.security.sysguard.services.interfaces.SystemService;

public class SystemServiceMockImpl extends AbstractService implements SystemService {
	public SystemInfo[] getAllDataInfos(){
		System.out.println("============In getAllDataInfos==============");
		SystemInfo[] systemInfos = new SystemInfo[10];
		for (int i = 0; i < systemInfos.length; i++) {
			systemInfos[i] = new SystemInfo();
			systemInfos[i].setHostId(i);
			systemInfos[i].setHostIp("10.5.6." + (60 + i));
			systemInfos[i].setCpu("20");
			systemInfos[i].setDisk("20");
			systemInfos[i].setLoad("30");
			systemInfos[i].setMemory("40");
			systemInfos[i].setResponseTime("10");
			systemInfos[i].setCpuStatus(0);
			systemInfos[i].setLoadStatus(1);
			systemInfos[i].setMemoryStatus(0);
			systemInfos[i].setResponseTimeStatus(i%3);
			systemInfos[i].setDiskStatus(i%3);
		}
		System.out.println("============Out getAllDataInfos==============");
		return systemInfos;
	}
}
