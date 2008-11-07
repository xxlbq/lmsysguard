package cn.livedoor.security.sysguard.services.mock;

import cn.livedoor.security.sysguard.domain.OsType;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.interfaces.OsTypeService;

public class OsTypeServiceMockImpl extends AbstractService implements OsTypeService {

	public OsType getOsTypeByTypeId(Integer osId) {
		OsType osType = new OsType();
		osType.setDescription("desc");
		osType.setInputTime(getTime());
		osType.setOsId(osId);
		osType.setOsName("linux");
		return osType;
	}

	public OsType[] getAllOsTypes() {
		OsType[] osTypes = new OsType[3];
		for (int i = 0; i < osTypes.length; i++) {
			osTypes[i] = getOsTypeByTypeId(i);
		}
		return osTypes;
	}

	public void modifyOsType(OsType osType) {
		System.out.println("modifyOsType" + osType.getOsName());
	}

	public void addOsType(OsType osType) {
		System.out.println("addOsType" + osType.getOsName());
	}

	public void deleteOsTypeByOsTypeId(int osTypeId) {
		System.out.println("deleteOsTypeByOsTypeId " + osTypeId);
	}

}
