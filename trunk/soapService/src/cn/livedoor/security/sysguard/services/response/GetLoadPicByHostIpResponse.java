package cn.livedoor.security.sysguard.services.response;

public class GetLoadPicByHostIpResponse extends Response {
	private byte[] dayLoadAveragePic;

	private byte[] monthLoadAveragePic;

	private byte[] yearLoadAveragePic;
	
	private String fileType;
	
	
	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * @param fileType the fileType to set
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	/**
	 * @return the dayLoadAveragePic
	 */
	public byte[] getDayLoadAveragePic() {
		return dayLoadAveragePic;
	}

	/**
	 * @return the monthLoadAveragePic
	 */
	public byte[] getMonthLoadAveragePic() {
		return monthLoadAveragePic;
	}

	/**
	 * @return the yearLoadAveragePic
	 */
	public byte[] getYearLoadAveragePic() {
		return yearLoadAveragePic;
	}

	/**
	 * @param dayLoadAveragePic
	 *            the dayLoadAveragePic to set
	 */
	public void setDayLoadAveragePic(byte[] dayLoadAveragePic) {
		this.dayLoadAveragePic = dayLoadAveragePic;
	}

	/**
	 * @param monthLoadAveragePic
	 *            the monthLoadAveragePic to set
	 */
	public void setMonthLoadAveragePic(byte[] monthLoadAveragePic) {
		this.monthLoadAveragePic = monthLoadAveragePic;
	}

	/**
	 * @param yearLoadAveragePic
	 *            the yearLoadAveragePic to set
	 */
	public void setYearLoadAveragePic(byte[] yearLoadAveragePic) {
		this.yearLoadAveragePic = yearLoadAveragePic;
	}

}
