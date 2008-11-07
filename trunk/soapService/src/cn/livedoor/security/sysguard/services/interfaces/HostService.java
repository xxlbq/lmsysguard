package cn.livedoor.security.sysguard.services.interfaces;

import cn.livedoor.security.sysguard.domain.Host;

public interface HostService extends DaoManagerService {

	public Host[] getAllHost();
	public Host getHostByHostId(int hostId);
	public void modifyHost(Host host);
	public void addHost(Host host);
	public void deleteHostByHostId(int hostId);
}
