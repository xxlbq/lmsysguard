package cn.livedoor.security.sysguard.services.mock;

import com.ibatis.dao.client.DaoManager;

public class AbstractService {

	public AbstractService() {
		super();
	}
	private DaoManager daoManager;
	
	public void setDaoManager(DaoManager daoManager){
		this.daoManager = daoManager;
	}
	
	protected Object getDAO(Class clazz) {
		return daoManager.getDao(clazz);
	}

}