package cn.livedoor.security.sysguard.services;

import java.util.List;

import cn.livedoor.security.sysguard.domain.HostExample;
import cn.livedoor.security.sysguard.domain.HostGroup;
import cn.livedoor.security.sysguard.domain.HostGroupExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostGroupDAO;
import cn.livedoor.security.sysguard.services.exceptions.GroupReferenceByHostException;
import cn.livedoor.security.sysguard.services.exceptions.HostGroupNameExistException;
import cn.livedoor.security.sysguard.services.interfaces.GroupService;

public class GroupServiceIbatisImpl extends AbstractService implements GroupService {

	public HostGroup getGroupByGroupId(Integer groupId) {
		HostGroupDAO hostDao = (HostGroupDAO) getDAO(HostGroupDAO.class);
		HostGroup hostGroup = hostDao.selectByPrimaryKey(groupId);
		return hostGroup;
	}

	@SuppressWarnings("unchecked")
	public HostGroup[] getAllHostGroup() {
		HostGroupDAO hostDao = (HostGroupDAO) getDAO(HostGroupDAO.class);
		HostGroupExample groupExample = new HostGroupExample();
		List<HostGroup> list = hostDao.selectByExample(groupExample);
		return list.toArray(new HostGroup[list.size()]);
	}

	public void modifyHostGroup(HostGroup hostGroup) {
		HostGroupDAO hostDao = (HostGroupDAO) getDAO(HostGroupDAO.class);
		hostDao.updateByPrimaryKeySelective(hostGroup);
	}

	public void addHostGroup(HostGroup hostGroup) {
		HostGroupDAO hostDao = (HostGroupDAO) getDAO(HostGroupDAO.class);
		HostGroupExample example = new HostGroupExample();
		example.setGroupName(hostGroup.getGroupName());
		example.setGroupName_Indicator(HostGroupExample.EXAMPLE_EQUALS);
		List list = hostDao.selectByExample(example);
		if (list.size() > 0) {
			throw new HostGroupNameExistException("The host name '" + hostGroup.getGroupName() + "' is exist!");
		}
		hostGroup.setInputTime(getTime());
		hostDao.insert(hostGroup);
	}

	public void deleteHostGroupByGroupId(int groupId) {
		HostGroupDAO hosGrouptDao = (HostGroupDAO) getDAO(HostGroupDAO.class);
		HostDAO hostDAO = (HostDAO)getDAO(HostDAO.class);
		HostExample example = new HostExample();
		example.setGroupId(groupId);
		example.setGroupId_Indicator(HostExample.EXAMPLE_EQUALS);
		if(hostDAO.selectByExample(example).size()>0){
			throw new GroupReferenceByHostException("The group is referenced by some hosts!");
		}
		hosGrouptDao.deleteByPrimaryKey(groupId);
	}

}
