package cn.livedoor.security.sysguard.services.facade;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.livedoor.security.sysguard.Utils;
import cn.livedoor.security.sysguard.services.exceptions.UserNotLoginException;


public class CheckUserIsNullInterceptor extends AbstractInterceptor {
	private static Log log = LogFactory.getLog(CheckUserIsNullInterceptor.class);
	/* (non-Javadoc)
	 * @see com.livedoor.securities.comet.util.intercept.AbstractInterceptor#before(com.livedoor.securities.comet.util.intercept.InvokeJniInfo)
	 */
	public void before(InvokeInfo invInfo) {
		if(invInfo.getArgs().length>1){
			checkUserIsInContext((String)invInfo.getArgs()[1]);
		}
	}
	
	/**
	 * 
	 */
	private void checkUserIsInContext(String userName) {
		System.out.println(userName + " is operation");
		if (!Utils.isNotNullString(userName)) {
			if(log.isDebugEnabled()){
				log.debug("***********************User is not login or session is dead!*********");
			}
			throw new UserNotLoginException("user is not login!");
		}
	}
	
}
