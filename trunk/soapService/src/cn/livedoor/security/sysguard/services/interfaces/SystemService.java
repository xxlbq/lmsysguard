package cn.livedoor.security.sysguard.services.interfaces;

import cn.livedoor.security.sysguard.services.SystemInfo;

public interface SystemService extends DaoManagerService {

	public SystemInfo[] getAllDataInfos();

}
