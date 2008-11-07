package cn.livedoor.security.sysguard.services;

import java.util.List;

import cn.livedoor.security.sysguard.domain.DataInfoType;
import cn.livedoor.security.sysguard.domain.DataInfoTypeExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.DataInfoDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.DataInfoTypeDAO;
import cn.livedoor.security.sysguard.services.interfaces.DataInfoTypeService;

public class DataInfoTypeServiceIbatisImpl extends AbstractService implements DataInfoTypeService {

	public DataInfoType[] getAllDataInfoTypes() {
		DataInfoTypeDAO dataInfoDAO = (DataInfoTypeDAO)getDAO(DataInfoTypeDAO.class);
		DataInfoTypeExample dataInfoExample = new DataInfoTypeExample();
		List<DataInfoType> list = dataInfoDAO.selectByExample(dataInfoExample);
		return list.toArray(new DataInfoType[list.size()]);
	}

	public DataInfoType getDataInfoTypeByTypeId(int typeId) {
		return null;
	}

}
