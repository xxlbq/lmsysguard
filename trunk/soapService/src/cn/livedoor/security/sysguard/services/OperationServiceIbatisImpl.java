package cn.livedoor.security.sysguard.services;

import java.util.List;

import cn.livedoor.security.sysguard.domain.OperationExample;
import cn.livedoor.security.sysguard.domain.OperationWithBLOBs;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.OperationDAO;
import cn.livedoor.security.sysguard.services.interfaces.OperationService;

public class OperationServiceIbatisImpl extends AbstractService implements OperationService {

	public OperationWithBLOBs[] getAllOperation() {
		OperationDAO operationDAO = (OperationDAO)getDAO(OperationDAO.class);
		OperationExample operationExample = new OperationExample();
		List<OperationWithBLOBs> list = operationDAO.selectByExampleWithBLOBs(operationExample);
		return list.toArray(new OperationWithBLOBs[list.size()]);
	}

	public OperationWithBLOBs getOperationByOperationId(int operationId) {
		OperationDAO operationDAO = (OperationDAO)getDAO(OperationDAO.class);
		return operationDAO.selectByPrimaryKey(operationId);
	}

	public void modifyOperation(OperationWithBLOBs operation) {
		OperationDAO operationDAO = (OperationDAO)getDAO(OperationDAO.class);
		operationDAO.updateByPrimaryKey(operation);
	}

	public void addOperation(OperationWithBLOBs operation) {
		OperationDAO operationDAO = (OperationDAO)getDAO(OperationDAO.class);
		operation.setInputTime(getTime());
		operationDAO.insert(operation);
	}

	public void deleteOperationByOperationId(int operationId) {
		OperationDAO operationDAO = (OperationDAO)getDAO(OperationDAO.class);
		operationDAO.deleteByPrimaryKey(operationId);
	}

}
