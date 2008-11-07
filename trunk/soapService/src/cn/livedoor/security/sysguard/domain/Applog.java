package cn.livedoor.security.sysguard.domain;

import java.util.Date;

public class Applog {

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.applog_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private Long applogId;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.user_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private Integer userId;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.host_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private Integer hostId;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.level
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String level;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.uptime
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private Integer uptime;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.class_name
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String className;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.thread_name
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String threadName;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.log_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private Date logTime;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.log_line
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String logLine;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.log_content
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String logContent;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.log_status
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private Byte logStatus;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.solve_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private Date solveTime;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.solve_result
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String solveResult;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.solve_desc
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String solveDesc;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column applog.input_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private Date inputTime;

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.applog_id
     * @return  the value of applog.applog_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public Long getApplogId() {
	return applogId;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.applog_id
     * @param applogId  the value for applog.applog_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setApplogId(Long applogId) {
	this.applogId = applogId;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.user_id
     * @return  the value of applog.user_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public Integer getUserId() {
	return userId;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.user_id
     * @param userId  the value for applog.user_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setUserId(Integer userId) {
	this.userId = userId;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.host_id
     * @return  the value of applog.host_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public Integer getHostId() {
	return hostId;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.host_id
     * @param hostId  the value for applog.host_id
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setHostId(Integer hostId) {
	this.hostId = hostId;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.level
     * @return  the value of applog.level
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getLevel() {
	return level;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.level
     * @param level  the value for applog.level
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setLevel(String level) {
	this.level = level;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.uptime
     * @return  the value of applog.uptime
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public Integer getUptime() {
	return uptime;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.uptime
     * @param uptime  the value for applog.uptime
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setUptime(Integer uptime) {
	this.uptime = uptime;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.class_name
     * @return  the value of applog.class_name
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getClassName() {
	return className;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.class_name
     * @param className  the value for applog.class_name
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setClassName(String className) {
	this.className = className;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.thread_name
     * @return  the value of applog.thread_name
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getThreadName() {
	return threadName;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.thread_name
     * @param threadName  the value for applog.thread_name
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setThreadName(String threadName) {
	this.threadName = threadName;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.log_time
     * @return  the value of applog.log_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public Date getLogTime() {
	return logTime;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.log_time
     * @param logTime  the value for applog.log_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setLogTime(Date logTime) {
	this.logTime = logTime;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.log_line
     * @return  the value of applog.log_line
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getLogLine() {
	return logLine;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.log_line
     * @param logLine  the value for applog.log_line
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setLogLine(String logLine) {
	this.logLine = logLine;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.log_content
     * @return  the value of applog.log_content
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getLogContent() {
	return logContent;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.log_content
     * @param logContent  the value for applog.log_content
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setLogContent(String logContent) {
	this.logContent = logContent;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.log_status
     * @return  the value of applog.log_status
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public Byte getLogStatus() {
	return logStatus;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.log_status
     * @param logStatus  the value for applog.log_status
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setLogStatus(Byte logStatus) {
	this.logStatus = logStatus;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.solve_time
     * @return  the value of applog.solve_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public Date getSolveTime() {
	return solveTime;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.solve_time
     * @param solveTime  the value for applog.solve_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setSolveTime(Date solveTime) {
	this.solveTime = solveTime;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.solve_result
     * @return  the value of applog.solve_result
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getSolveResult() {
	return solveResult;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.solve_result
     * @param solveResult  the value for applog.solve_result
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setSolveResult(String solveResult) {
	this.solveResult = solveResult;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.solve_desc
     * @return  the value of applog.solve_desc
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getSolveDesc() {
	return solveDesc;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.solve_desc
     * @param solveDesc  the value for applog.solve_desc
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setSolveDesc(String solveDesc) {
	this.solveDesc = solveDesc;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column applog.input_time
     * @return  the value of applog.input_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public Date getInputTime() {
	return inputTime;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column applog.input_time
     * @param inputTime  the value for applog.input_time
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setInputTime(Date inputTime) {
	this.inputTime = inputTime;
    }
}