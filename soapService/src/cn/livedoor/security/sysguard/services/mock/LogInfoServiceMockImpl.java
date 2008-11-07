package cn.livedoor.security.sysguard.services.mock;


import cn.livedoor.security.sysguard.domain.Applog;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.interfaces.LogInfoService;

public class LogInfoServiceMockImpl extends AbstractService implements LogInfoService {

	public Applog[] getAllApplogs() {
		Applog[] applogs = new Applog[10];
		for (int i = 0; i < applogs.length; i++) {
			applogs[i] = new Applog();
			applogs[i].setLogContent("log content" + i);
			applogs[i].setApplogId((long)i);
			applogs[i].setLevel("INFO");
			applogs[i].setClassName("className" + i);
			applogs[i].setHostId(1);
			applogs[i].setInputTime(getTime());
			applogs[i].setLogLine("10");
			applogs[i].setLogStatus((byte)(i%3));
			applogs[i].setLogTime(getTime());
			applogs[i].setSolveDesc("solveDesc");
			applogs[i].setSolveResult("solveResult");
			applogs[i].setSolveTime(getTime());
			applogs[i].setUserId(i);
			applogs[i].setThreadName("threadName");
			applogs[i].setUptime(1);
		}
		return applogs;
	}

	public void modifyApplog(Applog applog) {
	}

}
