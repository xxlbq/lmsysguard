package cn.livedoor.security.sysguard.services.mock;

import java.util.Calendar;

import cn.livedoor.security.sysguard.domain.DataInfoType;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.interfaces.DataInfoTypeService;

public class DataInfoTypeServiceMockImpl extends AbstractService implements DataInfoTypeService {

	public DataInfoType[] getAllDataInfoTypes() {
		DataInfoType[] dataInfoTypes = new DataInfoType[5];
		for (int i = 0; i < dataInfoTypes.length; i++) {
			dataInfoTypes[i] = getDataInfoTypeByTypeId(i);
		}
		return dataInfoTypes;
	}

	public DataInfoType getDataInfoTypeByTypeId(int typeId) {
		DataInfoType dataInfoType = new DataInfoType();
		String typeName = "";
		switch (typeId) {
		case 0:
			typeName = "cpu";
			break;
		case 1:
			typeName = "load";
			break;
		case 2:
			typeName = "memory";
			break;
		case 3:
			typeName = "response";
			break;
		case 4:
			typeName = "disk";
			break;
		default:
			break;
		}
		dataInfoType.setTypeId(typeId);
		dataInfoType.setTypeName("typeName" + typeName);
		
		dataInfoType.setInputTime(Calendar.getInstance().getTime());
		dataInfoType.setWarnValue(70);
		dataInfoType.setErrorValue(80);
		return dataInfoType;
	}
}
