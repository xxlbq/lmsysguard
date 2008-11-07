package cn.livedoor.security.sysguard.services.interfaces;

public interface BatchService extends DaoManagerService{

	public String[] BatchUploadFile(int[] hostIds,byte[] file ,String path, String fileName);
	
	public String[] BatchExecuteCommand(int[] hostIds,String command);
}
