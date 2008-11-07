package com.live.adapter;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;

import cn.livedoor.security.sysguard.domain.DataInfo;
import cn.livedoor.security.sysguard.domain.DataInfoExample;
import cn.livedoor.security.sysguard.domain.Host;
import cn.livedoor.security.sysguard.domain.HostExample;
import cn.livedoor.security.sysguard.persistence.DaoConfig;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.DataInfoDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostDAO;

import com.ibatis.dao.client.DaoManager;
import com.live.CommandRets;
import com.live.HostData;
import com.live.IDataSource;

public class MySqlDBAdapter implements IDataSource {

	private static Logger logger = Logger.getLogger(MySqlDBAdapter.class);

	public void populateDataInof(CommandRets cmdRets) {
		logger.debug("populateDataInof start -----------------------------");
		DaoManager daoMgr = DaoConfig.getDaoManager();
		daoMgr.startTransaction();

		DataInfoDAO infoTypeDAO = (DataInfoDAO) daoMgr
				.getDao(DataInfoDAO.class);

		DataInfo info = new DataInfo();
		HostData hostData = cmdRets.getHostData();
		String hostid = hostData.getHostid();
		// String groupid = hostData.getGroupid();
		String command = cmdRets.getCommand();

		String[] fmtRets = cmdRets.getFmtRets();

		info.setHostId(Integer.parseInt(hostid));
		try {
			if (command.equalsIgnoreCase("uptime")) {// 2load
				info.setTypeId(2);
				int ret = (int) (Double.parseDouble(fmtRets[1]) * 100);
				info.setValue1(String.valueOf(ret));
				info.setValue2(null);
				info.setValue3(null);
			} else if (command.equalsIgnoreCase("df")) {// 5disk
				info.setTypeId(5);
				info.setValue1(fmtRets[0]);
				info.setValue2(null);
				info.setValue3(null);
			} else if (command.equalsIgnoreCase("vmstat")) {// 1cpu
				info.setTypeId(1);
				info.setValue1(fmtRets[0]);
				info.setValue2(null);
				info.setValue3(null);
			} else if (command.equalsIgnoreCase("free")) {// 3mem
				info.setTypeId(3);
				int ret = (int) (Double.parseDouble(fmtRets[1])
						/ Double.parseDouble(fmtRets[0]) * 100);
				info.setValue1(String.valueOf(ret));
				info.setValue2(null);
				info.setValue3(null);
			} else {// 4responseTime
				info.setTypeId(4);
				info.setValue1(fmtRets[0]);
				info.setValue2(null);
				info.setValue3(null);
			}
		} catch (NumberFormatException e) {
			logger.error("shit db-------------------------------------" + e);
		}

		List infoList = infoTypeDAO.selectByExample(new DataInfoExample());
		boolean flag = false;
		for (Iterator iter = infoList.iterator(); iter.hasNext();) {
			DataInfo element = (DataInfo) iter.next();
			if (info.getHostId().intValue()==element.getHostId().intValue() && info.getTypeId().intValue() == element.getTypeId().intValue()) {
				flag = true;
				break;
			}
		}
		if (flag) {
			logger.info("updating ----------------------------------------");
			infoTypeDAO.updateByPrimaryKey(info);
		} else {
			logger.info("inserting ---------------------------------------");
			infoTypeDAO.insert(info);
		}

		daoMgr.commitTransaction();
		logger.debug("populateDataInof end -------------------------------");
	}

	public void queryHostInof(ConcurrentMap<String, HostData> concurrentMap) {
		logger.debug("queryHostInof start --------------------------------");

		DaoManager daoMgr = DaoConfig.getDaoManager();

		HostDAO hostDAO = (HostDAO) daoMgr.getDao(HostDAO.class);

		// List<Host> hostList = hostDAO.selectByExample(new HostExample());
		List hostList = hostDAO.selectByExample(new HostExample());
		concurrentMap.clear();
		// for (Iterator<Host> iter = hostList.iterator(); iter.hasNext();) {
		for (Iterator iter = hostList.iterator(); iter.hasNext();) {
			Host element = (Host) iter.next();
			HostData hostData = new HostData(element.getHostId().toString(),
					element.getGroupId().toString(), element.getHostIp(),
					element.getLoginName(), element.getLoginPwd(), element
							.getDiskpartition());
			concurrentMap.put(element.getHostIp(), hostData);
		}
		logger.debug("queryHostInof end ----------------------------------");
	}

}
