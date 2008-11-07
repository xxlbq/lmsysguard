package cn.livedoor.security.sysguard.services;

import java.util.List;

import cn.livedoor.security.sysguard.domain.OsType;
import cn.livedoor.security.sysguard.domain.OsTypeExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.OsTypeDAO;
import cn.livedoor.security.sysguard.services.interfaces.OsTypeService;

public class OsTypeServiceIbatisImpl extends AbstractService implements OsTypeService {

	public OsType getOsTypeByTypeId(Integer osId) {
		OsTypeDAO osTypeDAO = (OsTypeDAO) getDAO(OsTypeDAO.class);
		return osTypeDAO.selectByPrimaryKey(osId);
	}

	@SuppressWarnings("unchecked")
	public OsType[] getAllOsTypes() {
		OsTypeDAO osTypeDAO = (OsTypeDAO) getDAO(OsTypeDAO.class);
		OsTypeExample example = new OsTypeExample();
		List<OsType> list = osTypeDAO.selectByExample(example);
		return list.toArray(new OsType[list.size()]);
	}

	public void modifyOsType(OsType osType) {
		OsTypeDAO osTypeDAO = (OsTypeDAO) getDAO(OsTypeDAO.class);
		osTypeDAO.updateByPrimaryKeySelective(osType);
	}

	public void addOsType(OsType osType) {
		OsTypeDAO osTypeDAO = (OsTypeDAO) getDAO(OsTypeDAO.class);
		osType.setInputTime(getTime());
		osTypeDAO.insert(osType);
	}

	public void deleteOsTypeByOsTypeId(int osTypeId) {
		OsTypeDAO osTypeDAO = (OsTypeDAO) getDAO(OsTypeDAO.class);
		osTypeDAO.deleteByPrimaryKey(osTypeId);
	}

}
