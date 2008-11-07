package cn.livedoor.security.sysguard.services;

import java.util.List;

import cn.livedoor.security.sysguard.domain.Applog;
import cn.livedoor.security.sysguard.domain.ApplogExample;
import cn.livedoor.security.sysguard.domain.DataInfoExample;
import cn.livedoor.security.sysguard.domain.Host;
import cn.livedoor.security.sysguard.domain.HostExample;
import cn.livedoor.security.sysguard.jsch.JschUtil;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.ApplogDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.DataInfoDAO;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.HostDAO;
import cn.livedoor.security.sysguard.services.exceptions.HostIpExistException;
import cn.livedoor.security.sysguard.services.exceptions.HostLoginAuthFailException;
import cn.livedoor.security.sysguard.services.exceptions.HostNameExistException;
import cn.livedoor.security.sysguard.services.interfaces.HostService;
import cn.livedoor.security.sysguard.services.interfaces.SystemService;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class HostServiceIbatisImpl extends AbstractService implements HostService {

	@SuppressWarnings("unchecked")
	public Host[] getAllHost() {
		HostDAO hostDAO = (HostDAO) getDAO(HostDAO.class);
		HostExample example = new HostExample();
		List<Host> list = hostDAO.selectByExample(example);
		Host[] hosts = new Host[list.size()];
		return list.toArray(hosts);
	}

	public Host getHostByHostId(int hostId) {
		HostDAO hostDAO = (HostDAO) getDAO(HostDAO.class);
		Host host = hostDAO.selectByPrimaryKey(hostId);
		return host;
	}

	public void modifyHost(Host host) {
		HostDAO hostDAO = (HostDAO) getDAO(HostDAO.class);
		host.setUpdateTime(getTime());
		hostDAO.updateByPrimaryKeySelective(host);
	}

	public void addHost(Host host) {
		HostDAO hostDAO = (HostDAO) getDAO(HostDAO.class);
		HostExample hostExample = new HostExample();
		hostExample.setHostIp(host.getHostIp());
		hostExample.setHostIp_Indicator(HostExample.EXAMPLE_EQUALS);
		List list = hostDAO.selectByExample(hostExample);
		if (list.size() > 0) {
			throw new HostIpExistException("The '" + host.getHostIp() + "' is exist!");
		}
		HostExample hostExample1 = new HostExample();
		hostExample1.setHostName(host.getHostName());
		hostExample1.setHostName_Indicator(HostExample.EXAMPLE_EQUALS);
		list = hostDAO.selectByExample(hostExample1);
		if (list.size() > 0) {
			throw new HostNameExistException("The '" + host.getHostName() + "' is exist!");
		}
		Session session = null;
		try {
			JschUtil jschUtil = new JschUtil();
			session = jschUtil.getSession(host.getHostIp(), host.getLoginName(), host.getLoginPwd());
		} catch (JSchException e) {
			throw new HostLoginAuthFailException("The loginName and loginPasswod is wrong!");
		}finally{
			if(session!=null){
				session.disconnect();
			}
		}
		host.setRrdStatus((byte)0);
		host.setInputTime(getTime());
		host.setUpdateTime(getTime());
		hostDAO.insert(host);
	}

	public void deleteHostByHostId(int hostId) {
		HostDAO hostDAO = (HostDAO) getDAO(HostDAO.class);
		DataInfoDAO dataInfoDAO = (DataInfoDAO)getDAO(DataInfoDAO.class);
		DataInfoExample dataInfoExample = new DataInfoExample();
		dataInfoExample.setHostId(hostId);
		dataInfoExample.setHostId_Indicator(DataInfoExample.EXAMPLE_EQUALS);
		dataInfoDAO.deleteByExample(dataInfoExample);
		hostDAO.deleteByPrimaryKey(hostId);
	}

}
