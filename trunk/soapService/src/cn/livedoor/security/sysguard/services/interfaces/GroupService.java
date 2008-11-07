package cn.livedoor.security.sysguard.services.interfaces;

import cn.livedoor.security.sysguard.domain.HostGroup;

public interface GroupService extends DaoManagerService {

	public HostGroup getGroupByGroupId(Integer groupId);

	public HostGroup[] getAllHostGroup();

	public void modifyHostGroup(HostGroup hostGroup);

	public void addHostGroup(HostGroup hostGroup);

	public void deleteHostGroupByGroupId(int groupId);

}
