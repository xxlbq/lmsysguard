package cn.livedoor.security.sysguard.services.interfaces;

import cn.livedoor.security.sysguard.domain.OsType;

public interface OsTypeService extends DaoManagerService {

	public OsType getOsTypeByTypeId(Integer osId);

	public OsType[] getAllOsTypes();

	public void modifyOsType(OsType osType);

	public void addOsType(OsType osType);

	public void deleteOsTypeByOsTypeId(int osTypeId);

}
