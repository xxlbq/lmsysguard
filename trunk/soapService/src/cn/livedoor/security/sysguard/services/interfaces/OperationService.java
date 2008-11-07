package cn.livedoor.security.sysguard.services.interfaces;

import cn.livedoor.security.sysguard.domain.OperationWithBLOBs;

public interface OperationService extends DaoManagerService {

	public OperationWithBLOBs[] getAllOperation();
	public OperationWithBLOBs getOperationByOperationId(int operationId);
	public void modifyOperation(OperationWithBLOBs operation);
	public void addOperation(OperationWithBLOBs operation);
	public void deleteOperationByOperationId(int operationId);
}
