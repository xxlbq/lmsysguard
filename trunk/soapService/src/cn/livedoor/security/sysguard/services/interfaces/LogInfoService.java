package cn.livedoor.security.sysguard.services.interfaces;

import cn.livedoor.security.sysguard.domain.Applog;

public interface LogInfoService extends DaoManagerService {

	public Applog[] getAllApplogs();

	public void modifyApplog(Applog applog);

}
