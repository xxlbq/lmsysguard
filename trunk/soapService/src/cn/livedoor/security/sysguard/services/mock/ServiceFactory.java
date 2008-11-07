package cn.livedoor.security.sysguard.services.mock;

import cn.livedoor.security.sysguard.services.RoleServiceIbatisImpl;
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
	public static UserService getUserService(){
		return new UserServiceMockImpl();
	}

	public static SystemService getSystemService() {
		return new SystemServiceMockImpl();
	}
	
	public static RoleService getRoleServices(){
		return new RoleServiceMockImpl();
	}

	public static DataInfoTypeService getDataInfoTypeService() {
		// TODO Auto-generated method stub
		return new DataInfoTypeServiceMockImpl();
	}
////////////////////////////////////////////////////////////////////////////////
	public static LogInfoService getLogInfoService() {
		return new LogInfoServiceMockImpl();
	}

	public static HostService getHostService() {
		return new HostServiceMockImpl();
	}

	public static GroupService getGroupService() {
		return new GroupServiceMockImpl();
	}

	public static OsTypeService getOsTypeService() {
		return new OsTypeServiceMockImpl();
	}

	public static OperationService getOperationService() {
		return new OperationServiceMockImpl();
	}
	
}
