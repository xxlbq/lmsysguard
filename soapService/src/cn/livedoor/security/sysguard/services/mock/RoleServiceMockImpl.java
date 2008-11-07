package cn.livedoor.security.sysguard.services.mock;

import java.util.Calendar;

import cn.livedoor.security.sysguard.domain.Role;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.interfaces.RoleService;

public class RoleServiceMockImpl extends AbstractService implements RoleService {

	public Role getRoleByRoleId(int roleId) {
		Role role = new Role();
		role.setDescription("role description");
		role.setInputTime(Calendar.getInstance().getTime());
		role.setName("roleName" + roleId);
		role.setRoleId(roleId);
		return role;
	}

	public Role[] getAllRole() {
		Role[] roles = new Role[3];
		for (int i = 0; i < roles.length; i++) {
			roles[i] = getRoleByRoleId(i);
		}
		return roles;
	}
	
}
