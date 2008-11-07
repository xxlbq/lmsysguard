package cn.livedoor.security.sysguard.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import junit.framework.JUnit4TestAdapter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.livedoor.security.sysguard.domain.Applog;
import cn.livedoor.security.sysguard.domain.DataInfo;
import cn.livedoor.security.sysguard.domain.DataInfoType;
import cn.livedoor.security.sysguard.domain.DataInfoTypeExample;
import cn.livedoor.security.sysguard.domain.Host;
import cn.livedoor.security.sysguard.domain.HostExample;
import cn.livedoor.security.sysguard.domain.HostGroup;
import cn.livedoor.security.sysguard.domain.HostGroupExample;
import cn.livedoor.security.sysguard.domain.OsType;
import cn.livedoor.security.sysguard.domain.OsTypeExample;
import cn.livedoor.security.sysguard.domain.User;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.ApplogDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.DataInfoDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostGroupDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.OsTypeDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.UserDAO;
import cn.livedoor.security.sysguard.services.exceptions.HostIpExistException;
import cn.livedoor.security.sysguard.services.exceptions.HostLoginAuthFailException;
import cn.livedoor.security.sysguard.services.exceptions.HostNameExistException;
import cn.livedoor.security.sysguard.services.interfaces.HostService;

import com.ibatis.dao.client.DaoManager;

public class HostServiceIbatisImplTest {
	static HostService hostService = null;

	static DaoManager daoManager;
	static Integer groupId = null;
	@BeforeClass
	public static void setUp() throws Exception {
		try {

			//init daoManager
			daoManager = DaoConfig.getDaoManager();
			//init hostService
			hostService = ServiceFactory.getHostService();
			hostService.setDaoManager(daoManager);
			Integer osTypeId = null;
//			Integer groupId = null;
			
			
			//insert os_type table
			OsType osType = new OsType();
			osType.setOsName("Only Test Linux");
			OsTypeDAO osTypeDAO = (OsTypeDAO)daoManager.getDao(OsTypeDAO.class);
			osTypeDAO.insert(osType);
			
			OsTypeExample osTypeExample = new OsTypeExample();
			osTypeExample.setOsName(osType.getOsName());
			osTypeExample.setOsName_Indicator(OsTypeExample.EXAMPLE_EQUALS);
			List ostypes = osTypeDAO.selectByExample(osTypeExample);
			
			if(ostypes.size()>0){
				osTypeId = ((OsType)ostypes.get(0)).getOsId();
			}
			
			
			//insert host_group table
			HostGroup hostGroup = new HostGroup();
			hostGroup.setGroupName("Only Test Group");
			hostGroup.setOsId(osTypeId);
			
			HostGroupDAO groupDAO = (HostGroupDAO)daoManager.getDao(HostGroupDAO.class);
			groupDAO.insert(hostGroup);
			
			HostGroupExample groupExample = new HostGroupExample();
			groupExample.setGroupName(hostGroup.getGroupName());
			groupExample.setGroupName_Indicator(HostGroupExample.EXAMPLE_EQUALS);
			List groups = groupDAO.selectByExample(groupExample);
			if(groups.size()>0){
				groupId = ((HostGroup)groups.get(0)).getGroupId();
			}
			
			//insert host table
			Host host = new Host();
			host.setGroupId(groupId);
			host.setDiskpartition("Only Test Ext3");
			host.setHostIp("10.5.1.112");
			host.setHostName("Only Test hostName");
			host.setLoginName("root");
			host.setLoginPwd("livedoor");
			host.setRrdStatus((byte)1);
			host.setUptime(1+"");
			host.setValidate((byte)0);
			host.setDescription("desc");
			HostDAO dao = (HostDAO)daoManager.getDao(HostDAO.class);
			dao.insert(host);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		daoManager = DaoConfig.getDaoManager();
		
		ApplogDAO applogDAO = (ApplogDAO)daoManager.getDao(ApplogDAO.class);
		for(int i = 29;i<58;i++){
			Applog applog = new Applog();
			applog = new Applog();
			applog.setLogContent("log content" + i);
//			applog.setApplogId((long)i);
			applog.setLevel("INFO");
			applog.setClassName("className" + i);
			applog.setHostId(i);
			applog.setInputTime(getTime());
			applog.setLogLine("10");
			applog.setLogStatus((byte)0);
			applog.setLogTime(getTime());
			applog.setSolveDesc("solveDesc");
			applog.setSolveResult("solveResult");
			applog.setSolveTime(getTime());
			applog.setUserId(61);
			applog.setThreadName("threadName");
			applog.setUptime(1);
			applogDAO.insert(applog);
		}
		
		
	}
	protected static Date getTime() {
		return Calendar.getInstance().getTime();
	}
	@Test
	public void getAllHost(){
		Host[] hosts = hostService.getAllHost();
		boolean flag = false;
		for (int i = 0; i < hosts.length; i++) {
			if(hosts[i].getHostIp().equals("10.5.1.112")){
				flag = true;
			}
		}
		assertTrue("There should be one host exist",flag);
	}
	@Test
	public void addHost(){
		Host host = new Host();
		host.setGroupId(groupId);
		host.setDiskpartition("Only Test Ext3");
		host.setHostIp("10.5.1.116");
		host.setHostName("Only Test hostName 1");
		host.setLoginName("root");
		host.setLoginPwd("livedoor");
		host.setRrdStatus((byte)1);
		host.setUptime(1+"");
		host.setValidate((byte)0);
		host.setDescription("desc");
		hostService.addHost(host);
		
		HostExample hostExample = new HostExample();
		hostExample.setHostIp("10.5.1.116");
		hostExample.setHostIp_Indicator(HostExample.EXAMPLE_EQUALS);
		HostDAO dao = (HostDAO)daoManager.getDao(HostDAO.class);
		List list = dao.selectByExample(hostExample);
		assertEquals(1,list.size());
		
		dao.deleteByExample(hostExample);
	}
	@Test(expected=HostIpExistException.class)
	public void addHostIpExist(){
		Host host = new Host();
		host.setGroupId(groupId);
		host.setDiskpartition("Only Test Ext3");
		host.setHostIp("10.5.1.112");
		host.setHostName("Only Test hostName 1");
		host.setLoginName("root");
		host.setLoginPwd("livedoor");
		host.setRrdStatus((byte)1);
		host.setUptime(1+"");
		host.setValidate((byte)0);
		host.setDescription("desc");
		hostService.addHost(host);
	}
	@Test(expected=HostNameExistException.class)
	public void addHostNameExist(){
		Host host = new Host();
		host.setGroupId(groupId);
		host.setDiskpartition("Only Test Ext3");
		host.setHostIp("10.5.1.116");
		host.setHostName("Only Test hostName");
		host.setLoginName("root");
		host.setLoginPwd("livedoor");
		host.setRrdStatus((byte)1);
		host.setUptime(1+"");
		host.setValidate((byte)0);
		host.setDescription("desc");
		hostService.addHost(host);
	}
	@Test(expected=HostLoginAuthFailException.class)
	public void addHostAuthFail(){
		Host host = new Host();
		host.setGroupId(groupId);
		host.setDiskpartition("Only Test Ext3");
		host.setHostIp("10.5.1.116");
		host.setHostName("Only Test hostName 1");
		host.setLoginName("root");
		host.setLoginPwd("livedoor1");
		host.setRrdStatus((byte)1);
		host.setUptime(1+"");
		host.setValidate((byte)0);
		host.setDescription("desc");
		hostService.addHost(host);
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
//		init daoManager
		daoManager = DaoConfig.getDaoManager();
		
//		delete host table
		HostExample hostExample = new HostExample();
		hostExample.setHostName("Only Test%");
		hostExample.setHostName_Indicator(HostExample.EXAMPLE_LIKE);
		HostDAO hostDAO = (HostDAO)daoManager.getDao(HostDAO.class);
		hostDAO.deleteByExample(hostExample);
		
		//delete host_group
		HostGroupExample groupExample = new HostGroupExample();
		groupExample.setGroupName("Only Test Group");
		groupExample.setGroupName_Indicator(HostGroupExample.EXAMPLE_EQUALS);
		HostGroupDAO groupDAO = (HostGroupDAO)daoManager.getDao(HostGroupDAO.class);
		groupDAO.deleteByExample(groupExample);
		
		
		//delete os_type table
		OsTypeDAO osTypeDAO = (OsTypeDAO)daoManager.getDao(OsTypeDAO.class);
		OsTypeExample osTypeExample = new OsTypeExample();
		osTypeExample.setOsName("Only Test Linux");
		osTypeExample.setOsName_Indicator(OsTypeExample.EXAMPLE_EQUALS);
		osTypeDAO.deleteByExample(osTypeExample);
		
	}
	
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(HostServiceIbatisImplTest.class);
		
	}
}
