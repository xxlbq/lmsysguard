package cn.livedoor.security.sysguard.services.mock;

import cn.livedoor.security.sysguard.domain.OperationWithBLOBs;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.interfaces.OperationService;

public class OperationServiceMockImpl extends AbstractService implements OperationService {

	public OperationWithBLOBs[] getAllOperation() {
		OperationWithBLOBs[] operations = new OperationWithBLOBs[10];
		for (int i = 0; i < operations.length; i++) {
			operations[i] = getOperationByOperationId(i);
		}
		return operations;
	}

	public OperationWithBLOBs getOperationByOperationId(int operId) {
		OperationWithBLOBs operation = new OperationWithBLOBs();
		operation.setErrorDesp("errorDesp");
		operation.setInputTime(getTime());
		operation.setOperContent("operContent");
		operation.setOperId(operId);
		operation.setUserId(1);
		return operation;
	}

	public void modifyOperation(OperationWithBLOBs operation) {
		System.out.println(" modifyOperation" + operation.getOperContent());
	}

	public void addOperation(OperationWithBLOBs operation) {
		System.out.println(" addOperation" + operation.getOperContent());
	}

	public void deleteOperationByOperationId(int operationId) {
		System.out.println(" deleteOperationByOperationId" + operationId);
	}
	

}
