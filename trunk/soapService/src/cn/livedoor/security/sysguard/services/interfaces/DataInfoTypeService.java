package cn.livedoor.security.sysguard.services.interfaces;

import java.util.Calendar;

import cn.livedoor.security.sysguard.domain.DataInfoType;

public interface DataInfoTypeService extends DaoManagerService {

	public DataInfoType[] getAllDataInfoTypes();

	public DataInfoType getDataInfoTypeByTypeId(int typeId);

}
