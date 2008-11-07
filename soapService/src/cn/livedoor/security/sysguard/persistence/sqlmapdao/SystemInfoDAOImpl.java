/*
 * Created on 2006-9-28
 *
 */
package cn.livedoor.security.sysguard.persistence.sqlmapdao;

import java.util.List;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

/**
 * <p>
 * Title: soapService
 * </p>
 * <p>
 * Description: SystemInfoDAOImpl.java
 * </p>
 * <p>
 * Copyright: Copyright (c) 2006
 * </p>
 * <p>
 * Company: 英極軟件開發（大連）有限公司
 * </p>
 * 
 * @author yuzs
 * @version 1.0
 */
public class SystemInfoDAOImpl extends SqlMapDaoTemplate implements SystemInfoDAO {

	public SystemInfoDAOImpl(DaoManager arg0) {
		super(arg0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.security.sysguard.persistence.sqlmapdao.SystemInfoDAO#findAll()
	 */
	@SuppressWarnings("unchecked")
	public List findAll() {
		System.out.println("**********************************");
		List list = queryForList("systeminfo.getSystemInfo");
		System.out.println("**********************************");
		return list;
	}
}
