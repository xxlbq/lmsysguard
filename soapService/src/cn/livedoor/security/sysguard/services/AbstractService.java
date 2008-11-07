package cn.livedoor.security.sysguard.services;

import java.util.Calendar;
import java.util.Date;

import com.ibatis.dao.client.DaoManager;

public class AbstractService {

	public AbstractService() {
		super();
	}

	private DaoManager daoManager;

	public void setDaoManager(DaoManager daoManager) {
		this.daoManager = daoManager;
	}

	protected Object getDAO(Class clazz) {
		return daoManager.getDao(clazz);
	}

	/**
	 * @return
	 */
	protected Date getTime() {
		return Calendar.getInstance().getTime();
	}

	protected DaoManager getDaoManager() {
		return this.daoManager;
	}
}