package cn.livedoor.security.sysguard.services;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import junit.framework.JUnit4TestAdapter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.livedoor.security.sysguard.domain.DataInfo;
import cn.livedoor.security.sysguard.domain.DataInfoExample;
import cn.livedoor.security.sysguard.domain.DataInfoType;
import cn.livedoor.security.sysguard.domain.DataInfoTypeExample;
import cn.livedoor.security.sysguard.domain.Host;
import cn.livedoor.security.sysguard.domain.HostExample;
import cn.livedoor.security.sysguard.domain.HostGroup;
import cn.livedoor.security.sysguard.domain.HostGroupExample;
import cn.livedoor.security.sysguard.domain.OsType;
import cn.livedoor.security.sysguard.domain.OsTypeExample;
import cn.livedoor.security.sysguard.domain.User;
import cn.livedoor.security.sysguard.domain.UserExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.DataInfoDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.DataInfoTypeDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostGroupDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.OsTypeDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.SystemInfoDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.UserDAO;
import cn.livedoor.security.sysguard.services.interfaces.SystemService;

import com.ibatis.dao.client.DaoManager;

public class SystemServiceIbatisImplTest {
	static SystemService systemService = null;
	@BeforeClass
	public static void setUp() throws Exception {
//		systemService = ServiceFactory.getSystemService();
		try {
			Integer osId = null;
			Integer groupId = null;
			Integer hostId = null;
			
			
			DaoManager manager = DaoConfig.getDaoManager();
			//init OsType
			OsType osType = new OsType();
			osType.setOsId(1);
			osType.setOsName("Test Linux");
			OsTypeDAO osTypeDAO = (OsTypeDAO)manager.getDao(OsTypeDAO.class);
			osTypeDAO.insert(osType);
			OsTypeExample osExample = new OsTypeExample();
			osExample.setOsName("Test Linux");
			osExample.setOsName_Indicator(OsTypeExample.EXAMPLE_EQUALS);
			List osList = osTypeDAO.selectByExample(osExample);
			
			if(osList.size()>0){
				osId = ((OsType)osList.get(0)).getOsId();
			}
			//init HostGroup
			HostGroup hostGroup = new HostGroup();
			hostGroup.setOsId(osId);
			hostGroup.setGroupName("test Group name");
			hostGroup.setDescription("test group description");
			
			HostGroupDAO groupDAO = (HostGroupDAO)manager.getDao(HostGroupDAO.class);
			groupDAO.insert(hostGroup);
			HostGroupExample hostGroupExample = new HostGroupExample();
			hostGroupExample.setGroupName("test Group name");
			hostGroupExample.setGroupName_Indicator(HostGroupExample.EXAMPLE_EQUALS);
			List groupList = groupDAO.selectByExample(hostGroupExample);
			
			if(osList.size()>0){
				groupId = ((HostGroup)groupList.get(0)).getGroupId();
			}
			//init Host
			Host host = new Host();
			host.setGroupId(groupId);
			host.setHostIp("10.5.6.63");
			host.setHostName("test hostName");
			host.setLoginName("test login name");
			host.setLoginPwd("test login password");
			host.setUptime(1+"");
			host.setDescription("test host description");
			host.setDiskpartition("EXT3");
			host.setValidate(new Byte((byte)0));
			host.setRrdStatus(new Byte((byte)0));
			HostDAO hostDAO = (HostDAO)manager.getDao(HostDAO.class);
			hostDAO.insert(host);
			HostExample hostExample = new HostExample();
			hostExample.setDescription("test host description");
			hostExample.setDescription_Indicator(HostExample.EXAMPLE_EQUALS);
			List hostList = hostDAO.selectByExample(hostExample);
			
			if(osList.size()>0){
				hostId = ((Host)hostList.get(0)).getHostId();
			}
			//init DataInfoType
			DataInfoTypeDAO dataInfoTypeDAO = (DataInfoTypeDAO)manager.getDao(DataInfoTypeDAO.class);
			String[] typeNames = new String[]{"test cpu","test memory","test load","test disc","test responseTime"};
			Integer[] warnValues = new Integer[]{80,80,80,80,20};
			Integer[] errorValues = new Integer[]{90,90,90,90,30};
			for (int i = 0; i < errorValues.length; i++) {
				DataInfoType dataInfoType = new DataInfoType();
				dataInfoType.setTypeName(typeNames[i]);
				dataInfoType.setErrorValue(errorValues[i]);
				dataInfoType.setWarnValue(warnValues[i]);
				dataInfoType.setDataCommand("test dataCommand" + i);
				dataInfoTypeDAO.insert(dataInfoType);		
			}
			
			//init DataInfo
			DataInfoDAO dataInfoDAO = (DataInfoDAO)manager.getDao(DataInfoDAO.class);
			
			List dataInfoTypeList = dataInfoTypeDAO.selectByExample(new DataInfoTypeExample());
			for (Iterator iter = dataInfoTypeList.iterator(); iter.hasNext();) {
				DataInfoType infoType = (DataInfoType) iter.next();
				DataInfo dataInfo = new DataInfo();
				dataInfo.setHostId(hostId);
				dataInfo.setInputTime(Calendar.getInstance().getTime());
//				dataInfo.setDataCommand(infoType.getDataCommand());
				dataInfo.setValue1("only junit test value1 " + infoType.getTypeName());
				dataInfo.setValue2("only junit test value2 " + infoType.getTypeName());
				dataInfo.setValue3("only junit test value3 " + infoType.getTypeName());
				dataInfoDAO.insert(dataInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test(){
		
	}
	
	public static void main(String[] args) {
		DaoManager manager = DaoConfig.getDaoManager();
		SystemInfoDAO d = (SystemInfoDAO)manager.getDao(SystemInfoDAO.class);
		d.findAll();
		System.out.println();
	}
	
	@AfterClass
	public static void tearDown() throws Exception {

		DaoManager manager = DaoConfig.getDaoManager();
		//delete dataInfo
		DataInfoDAO dataInfoDAO = (DataInfoDAO)manager.getDao(DataInfoDAO.class);
		DataInfoExample dataInfoExample = new DataInfoExample();
		dataInfoExample.setValue1("only junit test value1 " + "%");
		dataInfoExample.setValue1_Indicator(DataInfoExample.EXAMPLE_LIKE);
		dataInfoDAO.deleteByExample(dataInfoExample);
		
		//delete dataInfoType
		DataInfoTypeDAO dataInfoTypeDAO = (DataInfoTypeDAO)manager.getDao(DataInfoTypeDAO.class);
		DataInfoTypeExample dataInfoTypeExample = new DataInfoTypeExample();
		dataInfoTypeExample.setTypeName("test" + "%");
		dataInfoTypeExample.setTypeName_Indicator(DataInfoTypeExample.EXAMPLE_LIKE);
		dataInfoTypeDAO.deleteByExample(dataInfoTypeExample);
		
		//delete host
		HostDAO hostDAO = (HostDAO)manager.getDao(HostDAO.class);
		HostExample hostExample = new HostExample();
		hostExample.setDescription("test host description");
		hostExample.setDescription_Indicator(HostExample.EXAMPLE_EQUALS);
		hostDAO.deleteByExample(hostExample);
		
		
		//delete hostGroup
		HostGroupDAO groupDAO = (HostGroupDAO)manager.getDao(HostGroupDAO.class);
		HostGroupExample hostGroupExample = new HostGroupExample();
		hostGroupExample.setGroupName("test Group name");
		hostGroupExample.setGroupName_Indicator(HostGroupExample.EXAMPLE_EQUALS);
		groupDAO.deleteByExample(hostGroupExample);
		
		
		//delete OsType
		OsTypeDAO osTypeDAO = (OsTypeDAO)manager.getDao(OsTypeDAO.class);
		OsTypeExample osExample = new OsTypeExample();
		osExample.setOsName("Test Linux");
		osExample.setOsName_Indicator(OsTypeExample.EXAMPLE_EQUALS);
		osTypeDAO.deleteByExample(osExample);
	}
	
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(SystemServiceIbatisImplTest.class);
		
	}
}
