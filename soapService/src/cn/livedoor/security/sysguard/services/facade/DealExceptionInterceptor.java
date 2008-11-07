package cn.livedoor.security.sysguard.services.facade;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.livedoor.security.sysguard.services.exceptions.CreateTmpFileException;
import cn.livedoor.security.sysguard.services.exceptions.GroupReferenceByHostException;
import cn.livedoor.security.sysguard.services.exceptions.HostGroupNameExistException;
import cn.livedoor.security.sysguard.services.exceptions.HostIpExistException;
import cn.livedoor.security.sysguard.services.exceptions.HostLoginAuthFailException;
import cn.livedoor.security.sysguard.services.exceptions.HostNameExistException;
import cn.livedoor.security.sysguard.services.exceptions.OldPasswordNotMatchException;
import cn.livedoor.security.sysguard.services.exceptions.PasswordNotMatchException;
import cn.livedoor.security.sysguard.services.exceptions.PicFileNotFouncException;
import cn.livedoor.security.sysguard.services.exceptions.PicIOException;
import cn.livedoor.security.sysguard.services.exceptions.SuperException;
import cn.livedoor.security.sysguard.services.exceptions.UserNameExistException;
import cn.livedoor.security.sysguard.services.exceptions.UserNotExistException;
import cn.livedoor.security.sysguard.services.exceptions.UserNotLoginException;
import cn.livedoor.security.sysguard.services.response.Response;

public class DealExceptionInterceptor extends AbstractInterceptor {

	private static Log log = LogFactory.getLog(DealExceptionInterceptor.class);

	private static final int OTHER_EXCEPTION = 3;

	private static final int USER_NOT_EXIST = 1;

	private static final int USERNAME_EXIST = 2;

	private static final int PIC_IO_EXCEPTION = 4;

	private static final int PIC_FILE_NOT_FOUND = 2;

	private static final int PASSWORD_NOT_MATCH = 2;

	private static final int USER_NOT_LOGIN = 1;

	private static final int HOST_IP_EXIST = 2;

	private static final int HOST_NAME_EXIST = 4;

	private static final int LOGIN_AUTH_FAIL = 5;

	private static final int HOST_GROUP_NAME_EXIST = 2;

	private static final int CREATE_TMP_FILE_ERROR = 4;

	private static final int OLD_PWD_NOT_MATCH = 2;

	private static final int GROUP_BY_REFERENCE = 2;

	@Override
	public void exceptionThrow(InvokeInfo invInfo) {
		Response response = (Response) invInfo.getResult();
		String methodName = invInfo.getMethod().getName();
		SuperException tr = (SuperException) (invInfo.getException().getCause());
		if (tr == null) {
			tr = (SuperException) invInfo.getException();
		}

		if (tr instanceof UserNotLoginException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw UserNotLoginException");
			}
			response.setReturnCode(USER_NOT_LOGIN);
		} else if (tr instanceof PasswordNotMatchException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw PasswordNotMatchException");
			}
			response.setReturnCode(PASSWORD_NOT_MATCH);
		} else if (tr instanceof PicFileNotFouncException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw PicFileNotFouncException");
			}
			response.setReturnCode(PIC_FILE_NOT_FOUND);
		} else if (tr instanceof PicIOException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw PicIOException");
			}
			response.setReturnCode(PIC_IO_EXCEPTION);
		} else if (tr instanceof UserNameExistException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw UserNameExistException");
			}
			response.setReturnCode(USERNAME_EXIST);
		} else if (tr instanceof UserNotExistException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw UserNotExistException");
			}
			response.setReturnCode(USER_NOT_EXIST);
		} else if (tr instanceof HostIpExistException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw HostIpExistException");
			}
			response.setReturnCode(HOST_IP_EXIST);
		} else if (tr instanceof HostNameExistException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw HostNameExistException");
			}
			response.setReturnCode(HOST_NAME_EXIST);
		} else if (tr instanceof HostLoginAuthFailException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw HostLoginAuthFailException");
			}
			response.setReturnCode(LOGIN_AUTH_FAIL);
		} else if (tr instanceof HostGroupNameExistException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw HostGroupNameExistException");
			}
			response.setReturnCode(HOST_GROUP_NAME_EXIST);
		} else if (tr instanceof CreateTmpFileException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw CreateTmpFileException");
			}
			response.setReturnCode(CREATE_TMP_FILE_ERROR);
		} else if (tr instanceof OldPasswordNotMatchException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw OldPasswordNotMatchException");
			}
			response.setReturnCode(OLD_PWD_NOT_MATCH);
		} else if (tr instanceof GroupReferenceByHostException) {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw GroupReferenceByHostException");
			}
			response.setReturnCode(GROUP_BY_REFERENCE);
		} else {
			if (log.isDebugEnabled()) {
				log.debug(methodName + " throw other Exception");
			}
			response.setReturnCode(OTHER_EXCEPTION);
		}
	}
}
