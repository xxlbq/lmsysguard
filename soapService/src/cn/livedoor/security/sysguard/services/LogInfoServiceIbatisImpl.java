package cn.livedoor.security.sysguard.services;

import cn.livedoor.security.sysguard.domain.Applog;
import cn.livedoor.security.sysguard.domain.ApplogExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.ApplogDAO;
import cn.livedoor.security.sysguard.services.interfaces.LogInfoService;

public class LogInfoServiceIbatisImpl extends AbstractService implements LogInfoService {
    
   
	public Applog[] getAllApplogs() {
        // TODO Auto-generated method stub            
        ApplogDAO logDao = (ApplogDAO)this.getDAO(ApplogDAO.class);   
        return (Applog[])logDao.selectByExample(new ApplogExample()).toArray(new Applog[0]);
	}

	public void modifyApplog(Applog applog) {
        // TODO Auto-generated method stub        
        ApplogDAO logDao = (ApplogDAO)this.getDAO(ApplogDAO.class);  
        applog.setSolveTime(getTime());
        logDao.updateByPrimaryKey(applog);
	}

}
