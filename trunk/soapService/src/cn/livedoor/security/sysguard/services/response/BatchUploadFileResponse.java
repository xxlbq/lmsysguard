package cn.livedoor.security.sysguard.services.response;

public class BatchUploadFileResponse extends Response {
	private String[] uploadResults;

	/**
	 * @return the uploadResults
	 */
	public String[] getUploadResults() {
		return uploadResults;
	}

	/**
	 * @param uploadResults the uploadResults to set
	 */
	public void setUploadResults(String[] uploadResults) {
		this.uploadResults = uploadResults;
	}
	
}
