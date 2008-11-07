package cn.livedoor.security.sysguard.services;

import java.util.List;

import cn.livedoor.security.sysguard.domain.DataInfo;
import cn.livedoor.security.sysguard.domain.DataInfoType;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.SystemInfoDAO;
import cn.livedoor.security.sysguard.services.interfaces.DataInfoTypeService;
import cn.livedoor.security.sysguard.services.interfaces.SystemService;

public class SystemServiceIbatisImpl extends AbstractService implements SystemService {
	private DataInfoType[] dataInfoTypes;

	private DataInfoType cpuType;

	private DataInfoType memoryType;

	private DataInfoType loadType;

	private DataInfoType responseType;

	private DataInfoType diskType;

	public int RIGHT_VALUE = 0;

	public int WARN_VALUE = 1;

	public int ERROR_VALUE = 2;

	/**
	 * getAllDataInfos
	 */
	@SuppressWarnings("unchecked")
	public SystemInfo[] getAllDataInfos() {
		SystemInfoDAO dao = (SystemInfoDAO) this.getDAO(SystemInfoDAO.class);
		List<SystemInfo> list = dao.findAll();
		SystemInfo[] systemInfos = list.toArray(new SystemInfo[list.size()]);
//		SystemInfo[] systemInfos = (SystemInfo[]) dao.findAll().toArray(new SystemInfo[0]);
		getDataInfoTypes();
		getCpuType();
		getLoadType();
		getMemoryType();
		getResponseTimeType();
		getDiskType();
		for (int i = 0; i < systemInfos.length; i++) {
			setInfoStatus(systemInfos[i]);
		}
		return systemInfos;
	}

	private void setInfoStatus(SystemInfo info) {
		int cpuValue = Integer.parseInt(info.getCpu());
		int loadValue = Integer.parseInt(info.getLoad());
		int memoryValue = Integer.parseInt(info.getMemory());
		int responseValue = Integer.parseInt(info.getResponseTime());
		int diskValue = Integer.parseInt(info.getDisk());
		if (cpuValue < cpuType.getWarnValue()) {
			info.setCpuStatus(RIGHT_VALUE);
		} else if (cpuValue < cpuType.getErrorValue()) {
			info.setCpuStatus(WARN_VALUE);
		} else {
			info.setCpuStatus(ERROR_VALUE);
		}
		if (loadValue < loadType.getWarnValue()) {
			info.setLoadStatus(RIGHT_VALUE);
		} else if (loadValue < loadType.getErrorValue()) {
			info.setLoadStatus(WARN_VALUE);
		} else {
			info.setLoadStatus(ERROR_VALUE);
		}
		if (memoryValue < memoryType.getWarnValue()) {
			info.setMemoryStatus(RIGHT_VALUE);
		} else if (memoryValue < memoryType.getErrorValue()) {
			info.setMemoryStatus(WARN_VALUE);
		} else {
			info.setMemoryStatus(ERROR_VALUE);
		}
		if (responseValue < responseType.getWarnValue()) {
			info.setResponseTimeStatus(RIGHT_VALUE);
		} else if (responseValue < responseType.getErrorValue()) {
			info.setResponseTimeStatus(WARN_VALUE);
		} else {
			info.setResponseTimeStatus(ERROR_VALUE);
		}
		if (diskValue < diskType.getWarnValue()) {
			info.setDiskStatus(RIGHT_VALUE);
		} else if (diskValue < diskType.getErrorValue()) {
			info.setDiskStatus(WARN_VALUE);
		} else {
			info.setDiskStatus(ERROR_VALUE);
		}
	}

	private void getCpuType() {
		for (int i = 0; i < dataInfoTypes.length; i++) {
			if (dataInfoTypes[i].getTypeId() == 1) {
				this.cpuType = dataInfoTypes[i];
			}
		}
	}

	private void getLoadType() {
		for (int i = 0; i < dataInfoTypes.length; i++) {
			if (dataInfoTypes[i].getTypeId() == 2) {
				this.loadType = dataInfoTypes[i];
			}
		}
	}

	private void getMemoryType() {
		for (int i = 0; i < dataInfoTypes.length; i++) {
			if (dataInfoTypes[i].getTypeId() == 3) {
				this.memoryType = dataInfoTypes[i];
			}
		}
	}

	private void getResponseTimeType() {
		for (int i = 0; i < dataInfoTypes.length; i++) {
			if (dataInfoTypes[i].getTypeId() == 4) {
				this.responseType = dataInfoTypes[i];
			}
		}
	}

	private void getDiskType() {
		for (int i = 0; i < dataInfoTypes.length; i++) {
			if (dataInfoTypes[i].getTypeId() == 5) {
				this.diskType = dataInfoTypes[i];
			}
		}
	}

	private void getDataInfoTypes() {
		DataInfoTypeService dataInfoTypeService = ServiceFactory.getDataInfoTypeService();
		dataInfoTypeService.setDaoManager(getDaoManager());
		this.dataInfoTypes = dataInfoTypeService.getAllDataInfoTypes();
	}
}
