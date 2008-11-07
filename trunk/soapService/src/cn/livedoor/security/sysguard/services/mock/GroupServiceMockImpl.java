package cn.livedoor.security.sysguard.services.mock;

import cn.livedoor.security.sysguard.domain.HostGroup;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.interfaces.GroupService;

public class GroupServiceMockImpl extends AbstractService implements GroupService {

	public HostGroup getGroupByGroupId(Integer groupId) {
		HostGroup hostGroup = new HostGroup();
//		hostGroup.setDescription("group description");
		hostGroup.setGroupId(groupId);
		hostGroup.setGroupName("groupName");
//		hostGroup.setInputTime(getTime());
		hostGroup.setOsId(0);
		return hostGroup;
	}

	public HostGroup[] getAllHostGroup() {
		HostGroup[] groups = new HostGroup[10];
		for (int i = 0; i < groups.length; i++) {
			groups[i] = getGroupByGroupId(i);
		}
		return groups;
	}

	public void modifyHostGroup(HostGroup hostGroup) {
		System.out.println("modifyHostGroup" + hostGroup.getGroupName());
	}

	public void addHostGroup(HostGroup hostGroup) {
		System.out.println("addHostGroup" + hostGroup.getGroupName());		
	}

	public void deleteHostGroupByGroupId(int groupId) {
		System.out.println("deleteHostGroupByGroupId" + groupId);	
	}

}
