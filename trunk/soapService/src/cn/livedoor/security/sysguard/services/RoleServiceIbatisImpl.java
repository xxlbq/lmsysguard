package cn.livedoor.security.sysguard.services;

import java.util.List;

import cn.livedoor.security.sysguard.domain.Role;
import cn.livedoor.security.sysguard.domain.RoleExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.RoleDAO;
import cn.livedoor.security.sysguard.services.interfaces.RoleService;

public class RoleServiceIbatisImpl extends AbstractService implements RoleService {

	public Role getRoleByRoleId(int roleId) {
		RoleDAO roleDAO = (RoleDAO) getDAO(RoleDAO.class);
		return roleDAO.selectByPrimaryKey(roleId);
	}

	public Role[] getAllRole() {
		RoleDAO roleDAO = (RoleDAO) getDAO(RoleDAO.class);
		RoleExample example = new RoleExample();
		List<Role> list = roleDAO.selectByExample(example);
		return list.toArray(new Role[list.size()]);
	}

}
