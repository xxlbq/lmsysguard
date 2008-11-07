package cn.livedoor.security.sysguard.services;

import cn.livedoor.security.sysguard.services.interfaces.BatchService;
import cn.livedoor.security.sysguard.services.interfaces.DataInfoTypeService;
import cn.livedoor.security.sysguard.services.interfaces.GroupService;
import cn.livedoor.security.sysguard.services.interfaces.HostService;
import cn.livedoor.security.sysguard.services.interfaces.LogInfoService;
import cn.livedoor.security.sysguard.services.interfaces.OperationService;
import cn.livedoor.security.sysguard.services.interfaces.OsTypeService;
import cn.livedoor.security.sysguard.services.interfaces.RoleService;
import cn.livedoor.security.sysguard.services.interfaces.SystemService;
import cn.livedoor.security.sysguard.services.interfaces.UserService;

public class ServiceFactory {
	public static UserService getUserService() {
		return new UserServiceIbatisImpl();
	}

	public static SystemService getSystemService() {
		return new SystemServiceIbatisImpl();
	}

	public static RoleService getRoleServices() {
		return new RoleServiceIbatisImpl();
	}

	public static DataInfoTypeService getDataInfoTypeService() {
		return new DataInfoTypeServiceIbatisImpl();
	}

	public static LogInfoService getLogInfoService() {
		return new LogInfoServiceIbatisImpl();
	}

	public static HostService getHostService() {
		return new HostServiceIbatisImpl();
	}

	public static GroupService getGroupService() {
		return new GroupServiceIbatisImpl();
	}

	public static OsTypeService getOsTypeService() {
		return new OsTypeServiceIbatisImpl();
	}

	public static OperationService getOperationService() {
		return new OperationServiceIbatisImpl();
	}

	public static BatchService getBatchService() {
		return new BatchServiceImpl();
	}
}
