package cn.livedoor.security.sysguard.services;

public class SystemInfo {
	private int hostId;

	private String hostIp;

	private String cpu;

	private int cpuStatus;

	private String load;

	private int loadStatus;

	private String memory;

	private int memoryStatus;

	private String responseTime;

	private int responseTimeStatus;

	private String disk;

	private int diskStatus;

	/**
	 * @return the cpuStatus
	 */
	public int getCpuStatus() {
		return cpuStatus;
	}

	/**
	 * @return the diskStatus
	 */
	public int getDiskStatus() {
		return diskStatus;
	}

	/**
	 * @return the loadStatus
	 */
	public int getLoadStatus() {
		return loadStatus;
	}

	/**
	 * @return the memoryStatus
	 */
	public int getMemoryStatus() {
		return memoryStatus;
	}

	/**
	 * @return the responseTimeStatus
	 */
	public int getResponseTimeStatus() {
		return responseTimeStatus;
	}

	/**
	 * @param cpuStatus
	 *            the cpuStatus to set
	 */
	public void setCpuStatus(int cpuStatus) {
		this.cpuStatus = cpuStatus;
	}

	/**
	 * @param diskStatus
	 *            the diskStatus to set
	 */
	public void setDiskStatus(int diskStatus) {
		this.diskStatus = diskStatus;
	}

	/**
	 * @param loadStatus
	 *            the loadStatus to set
	 */
	public void setLoadStatus(int loadStatus) {
		this.loadStatus = loadStatus;
	}

	/**
	 * @param memoryStatus
	 *            the memoryStatus to set
	 */
	public void setMemoryStatus(int memoryStatus) {
		this.memoryStatus = memoryStatus;
	}

	/**
	 * @param responseTimeStatus
	 *            the responseTimeStatus to set
	 */
	public void setResponseTimeStatus(int responseTimeStatus) {
		this.responseTimeStatus = responseTimeStatus;
	}

	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}

	/**
	 * @return the disk
	 */
	public String getDisk() {
		return disk;
	}

	/**
	 * @return the hostId
	 */
	public int getHostId() {
		return hostId;
	}

	/**
	 * @return the hostIp
	 */
	public String getHostIp() {
		return hostIp;
	}

	/**
	 * @return the load
	 */
	public String getLoad() {
		return load;
	}

	/**
	 * @return the memory
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * @return the responseTime
	 */
	public String getResponseTime() {
		return responseTime;
	}

	/**
	 * @param cpu
	 *            the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * @param disk
	 *            the disk to set
	 */
	public void setDisk(String disk) {
		this.disk = disk;
	}

	/**
	 * @param hostId
	 *            the hostId to set
	 */
	public void setHostId(int hostId) {
		this.hostId = hostId;
	}

	/**
	 * @param hostIp
	 *            the hostIp to set
	 */
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	/**
	 * @param load
	 *            the load to set
	 */
	public void setLoad(String load) {
		this.load = load;
	}

	/**
	 * @param memory
	 *            the memory to set
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}

	/**
	 * @param responseTime
	 *            the responseTime to set
	 */
	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

}
