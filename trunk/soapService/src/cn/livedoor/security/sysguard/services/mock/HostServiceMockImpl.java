package cn.livedoor.security.sysguard.services.mock;

import cn.livedoor.security.sysguard.domain.Host;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.interfaces.HostService;

public class HostServiceMockImpl extends AbstractService implements HostService {

	public Host[] getAllHost() {
		Host[] hosts = new Host[10];
		for (int i = 0; i < hosts.length; i++) {
			hosts[i] =  getHostByHostId(i);
		}
		return hosts;
	}

	public Host getHostByHostId(int hostId) {
		Host host = new Host();
		host.setDescription("description");
		host.setDiskpartition("diskpartition");
		host.setGroupId(1);
		host.setHostId(hostId);
		host.setHostIp("10.5.6." + hostId);
		host.setHostName("hostName" + hostId);
		host.setInputTime(getTime());
		host.setLoginName("loginName");
		host.setLoginPwd("loginPwd");
		host.setRrdStatus((byte)0);
		host.setUpdateTime(getTime());
		host.setUptime(1+"");
		host.setValidate((byte)0);
		return host;
	}

	public void modifyHost(Host host) {
		System.out.println("modifyHost" + host.getHostName());
	}

	public void addHost(Host host) {
		System.out.println("addHost" + host.getHostName());
	}

	public void deleteHostByHostId(int hostId) {
		System.out.println("deleteHostByHostId" + hostId);
	}
	
}
