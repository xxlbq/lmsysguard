package cn.livedoor.security.sysguard.services;

import java.util.List;

import junit.framework.JUnit4TestAdapter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.livedoor.security.sysguard.domain.Host;
import cn.livedoor.security.sysguard.domain.HostExample;
import cn.livedoor.security.sysguard.domain.HostGroup;
import cn.livedoor.security.sysguard.domain.HostGroupExample;
import cn.livedoor.security.sysguard.domain.OsType;
import cn.livedoor.security.sysguard.domain.OsTypeExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostGroupDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.OsTypeDAO;
import cn.livedoor.security.sysguard.services.exceptions.HostGroupNameExistException;
import cn.livedoor.security.sysguard.services.interfaces.GroupService;
import cn.livedoor.security.sysguard.services.interfaces.HostService;

import com.ibatis.dao.client.DaoManager;

public class GroupServiceIbatisImplTest {
	static GroupService groupService = null;

	static DaoManager daoManager;

	static Integer groupId = null;

	static Integer osTypeId = null;

	@BeforeClass
	public static void setUp() throws Exception {
		try {

			// init daoManager
			daoManager = DaoConfig.getDaoManager();
			// init hostService
			groupService = ServiceFactory.getGroupService();
			groupService.setDaoManager(daoManager);
			// Integer osTypeId = null;
			// Integer groupId = null;

			// insert os_type table
			OsType osType = new OsType();
			osType.setOsName("Only Test Linux");
			OsTypeDAO osTypeDAO = (OsTypeDAO) daoManager.getDao(OsTypeDAO.class);
			osTypeDAO.insert(osType);

			OsTypeExample osTypeExample = new OsTypeExample();
			osTypeExample.setOsName(osType.getOsName());
			osTypeExample.setOsName_Indicator(OsTypeExample.EXAMPLE_EQUALS);
			List ostypes = osTypeDAO.selectByExample(osTypeExample);

			if (ostypes.size() > 0) {
				osTypeId = ((OsType) ostypes.get(0)).getOsId();
			}

			// insert host_group table
			HostGroup hostGroup = new HostGroup();
			hostGroup.setGroupName("Only Test Group");
			hostGroup.setOsId(osTypeId);

			HostGroupDAO groupDAO = (HostGroupDAO) daoManager.getDao(HostGroupDAO.class);
			groupDAO.insert(hostGroup);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = HostGroupNameExistException.class)
	public void addGroupNameExist() {
		HostGroup hostGroup = new HostGroup();
		hostGroup.setGroupName("Only Test Group");
		hostGroup.setOsId(osTypeId);
		groupService.addHostGroup(hostGroup);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		// init daoManager
		daoManager = DaoConfig.getDaoManager();

		// delete host_group
		HostGroupExample groupExample = new HostGroupExample();
		groupExample.setGroupName("Only Test Group");
		groupExample.setGroupName_Indicator(HostGroupExample.EXAMPLE_EQUALS);
		HostGroupDAO groupDAO = (HostGroupDAO) daoManager.getDao(HostGroupDAO.class);
		groupDAO.deleteByExample(groupExample);

		// delete os_type table
		OsTypeDAO osTypeDAO = (OsTypeDAO) daoManager.getDao(OsTypeDAO.class);
		OsTypeExample osTypeExample = new OsTypeExample();
		osTypeExample.setOsName("Only Test Linux");
		osTypeExample.setOsName_Indicator(OsTypeExample.EXAMPLE_EQUALS);
		osTypeDAO.deleteByExample(osTypeExample);

	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(GroupServiceIbatisImplTest.class);

	}
}
