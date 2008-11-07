package demo;

import cn.livedoor.security.sysguard.domain.DataInfoType;
import cn.livedoor.security.sysguard.persistence.DaoConfig;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.DataInfoTypeDAO;

import com.ibatis.dao.client.DaoManager;

public class IbatisDemo {

	public static void main(String[] args) {
		DaoManager daoMgr = DaoConfig.getDaoManager();

		daoMgr.startTransaction();

		DataInfoTypeDAO infoTypeDAO = (DataInfoTypeDAO) daoMgr
				.getDao(DataInfoTypeDAO.class);
		
		DataInfoType infoType = new DataInfoType();
		
		
		
		daoMgr.commitTransaction();

	}
}
