package cn.livedoor.security.sysguard.services.interfaces;

import cn.livedoor.security.sysguard.domain.Role;

public interface RoleService extends DaoManagerService{
	public Role getRoleByRoleId(int roleId);
	public Role[] getAllRole();
}
