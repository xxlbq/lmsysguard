/**
 * SysguardSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: SNAPSHOT Sep 07, 2006 (07:23:02 GMT+00:00)
 */
package cn.livedoor.security.sysguard.services.facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.livedoor.security.sysguard.Utils;
import cn.livedoor.security.sysguard.domain.Applog;
import cn.livedoor.security.sysguard.domain.DataInfoType;
import cn.livedoor.security.sysguard.domain.Host;
import cn.livedoor.security.sysguard.domain.HostGroup;
import cn.livedoor.security.sysguard.domain.OperationWithBLOBs;
import cn.livedoor.security.sysguard.domain.OsType;
import cn.livedoor.security.sysguard.domain.Role;
import cn.livedoor.security.sysguard.domain.User;
import cn.livedoor.security.sysguard.services.ServiceFactory;
import cn.livedoor.security.sysguard.services.exceptions.OldPasswordNotMatchException;
import cn.livedoor.security.sysguard.services.exceptions.PicFileNotFouncException;
import cn.livedoor.security.sysguard.services.exceptions.PicIOException;
import cn.livedoor.security.sysguard.services.exceptions.UserNotLoginException;
import cn.livedoor.security.sysguard.services.interfaces.BatchService;
import cn.livedoor.security.sysguard.services.interfaces.DataInfoTypeService;
import cn.livedoor.security.sysguard.services.interfaces.GroupService;
import cn.livedoor.security.sysguard.services.interfaces.HostService;
import cn.livedoor.security.sysguard.services.interfaces.LogInfoService;
import cn.livedoor.security.sysguard.services.interfaces.OperationService;
import cn.livedoor.security.sysguard.services.interfaces.OsTypeService;
import cn.livedoor.security.sysguard.services.interfaces.RoleService;
import cn.livedoor.security.sysguard.services.interfaces.SystemService;
import cn.livedoor.security.sysguard.services.interfaces.UserService;
import cn.livedoor.security.sysguard.services.response.AddGroupResponse;
import cn.livedoor.security.sysguard.services.response.AddHostResponse;
import cn.livedoor.security.sysguard.services.response.AddOperationInfoResponse;
import cn.livedoor.security.sysguard.services.response.AddOsTypeInfoResponse;
import cn.livedoor.security.sysguard.services.response.AddUserResponse;
import cn.livedoor.security.sysguard.services.response.BatchExecuteCommandResponse;
import cn.livedoor.security.sysguard.services.response.BatchUploadFileResponse;
import cn.livedoor.security.sysguard.services.response.DeleteGroupByGroupIdResponse;
import cn.livedoor.security.sysguard.services.response.DeleteHostByHostIdResponse;
import cn.livedoor.security.sysguard.services.response.DeleteOperationInfoByOperationIdResponse;
import cn.livedoor.security.sysguard.services.response.DeleteOsTypeInfoByOsTypeIdResponse;
import cn.livedoor.security.sysguard.services.response.DeleteUserByUserIdResponse;
import cn.livedoor.security.sysguard.services.response.GetAllDataInfoStandardResponse;
import cn.livedoor.security.sysguard.services.response.GetAllGroupInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllHostInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllLogInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllOperationInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllOsTypeInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllRoleInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllSystemInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllUserInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetLoadPicByHostIpResponse;
import cn.livedoor.security.sysguard.services.response.GetOperationByIdResponse;
import cn.livedoor.security.sysguard.services.response.LoginResponse;
import cn.livedoor.security.sysguard.services.response.LogoutResponse;
import cn.livedoor.security.sysguard.services.response.ModifyGroupInfResponse;
import cn.livedoor.security.sysguard.services.response.ModifyHostInfoResponse;
import cn.livedoor.security.sysguard.services.response.ModifyLogInfoResponse;
import cn.livedoor.security.sysguard.services.response.ModifyOperationInfoResponse;
import cn.livedoor.security.sysguard.services.response.ModifyOsTypeInfoResponse;
import cn.livedoor.security.sysguard.services.response.ModifyUserInfoResponse;
import cn.livedoor.www.sysguard.DataInfoStandard;
import cn.livedoor.www.sysguard.GetAllRoleInfoRequest;
import cn.livedoor.www.sysguard.GetOperationByIdRequest;
import cn.livedoor.www.sysguard.GroupInfo;
import cn.livedoor.www.sysguard.HostInfo;
import cn.livedoor.www.sysguard.LogInfo;
import cn.livedoor.www.sysguard.OperationInfo;
import cn.livedoor.www.sysguard.OsTypeInfo;
import cn.livedoor.www.sysguard.RoleInfo;
import cn.livedoor.www.sysguard.SystemInfo;
import cn.livedoor.www.sysguard.UserInfo;

import com.ibatis.dao.client.DaoManager;

/**
 * SysguardSkeleton java skeleton for the axisService
 */
public class SysguardServiceImpl implements SysguardService {

	private DaoManager daoManager;

	private static Log log = LogFactory.getLog(SysguardServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetAllOsTypeInfo(cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetAllOsTypeInfoResponse GetAllOsTypeInfo(
			cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest param4, String userName)

	{
		GetAllOsTypeInfoResponse response = new GetAllOsTypeInfoResponse();
		OsType[] osTypes = getOsTypeService().getAllOsTypes();
		if (osTypes.length > 0) {
			OsTypeInfo[] osTypeInfos = new OsTypeInfo[osTypes.length];
			for (int i = 0; i < osTypeInfos.length; i++) {
				osTypeInfos[i] = new OsTypeInfo();
				if (Utils.isNotNullString(osTypes[i].getDescription())) {
					osTypeInfos[i].setDescription(osTypes[i].getDescription());
				}
				if (osTypes[i].getInputTime() != null) {
					osTypeInfos[i].setInputTime(getCalendar(osTypes[i].getInputTime()));
				}
				osTypeInfos[i].setOsName(osTypes[i].getOsName());
				osTypeInfos[i].setOsId(osTypes[i].getOsId());
			}
			response.setAllOsType(osTypeInfos);
		}
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#ModifyOsTypeInfo(cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.ModifyOsTypeInfoResponse ModifyOsTypeInfo(
			cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest request, String userName)

	{
		ModifyOsTypeInfoResponse response = new ModifyOsTypeInfoResponse();
		OsType osType = new OsType();
		OsTypeInfo osTypeInfo = request.getOsType();
		copyOsType(osType, osTypeInfo);
		getOsTypeService().modifyOsType(osType);
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#AddOsTypeInfo(cn.livedoor.www.sysguard.AddOsTypeInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.AddOsTypeInfoResponse AddOsTypeInfo(cn.livedoor.www.sysguard.AddOsTypeInfoRequest request,
			String userName)

	{
		AddOsTypeInfoResponse response = new AddOsTypeInfoResponse();

		OsType osType = new OsType();
		OsTypeInfo osTypeInfo = request.getOsType();
		copyOsType(osType, osTypeInfo);
		getOsTypeService().addOsType(osType);
		response.setReturnCode(0);

		return response;
	}

	/**
	 * @param osType
	 * @param osTypeInfo
	 */
	private void copyOsType(OsType osType, OsTypeInfo osTypeInfo) {
		osType.setDescription(osTypeInfo.getDescription());
//		osType.setInputTime(osTypeInfo.getInputTime().getTime());
		osType.setOsId(osTypeInfo.getOsId());
		osType.setOsName(osTypeInfo.getOsName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#DeleteOsTypeInfoByOsTypeId(cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.DeleteOsTypeInfoByOsTypeIdResponse DeleteOsTypeInfoByOsTypeId(
			cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest request, String userName)

	{
		DeleteOsTypeInfoByOsTypeIdResponse response = new DeleteOsTypeInfoByOsTypeIdResponse();
		getOsTypeService().deleteOsTypeByOsTypeId(request.getOsTypeId());
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetLoadPicByHostIp(cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetLoadPicByHostIpResponse GetLoadPicByHostIp(
			cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest request, String userName)

	{

		String hostIp = request.getHostIp();
		GetLoadPicByHostIpResponse response = new GetLoadPicByHostIpResponse();
		System.out.println("get the " + hostIp + " load pics");
		String picsPath = System.getProperty("picsPath");

		String picPath = picsPath + File.separator + hostIp;
		System.out.println(picPath);
		File dayPicFile = new File(picPath + "-day.png");
		File mothPicFile = new File(picPath + "-month.png");
		File yearPicFile = new File(picPath + "-year.png");

		try {
			FileInputStream dayFis = new FileInputStream(dayPicFile);
			FileInputStream monthFis = new FileInputStream(mothPicFile);
			FileInputStream yearFis = new FileInputStream(yearPicFile);
			byte[] dayPic = new byte[(int) dayPicFile.length()];
			byte[] monthPic = new byte[(int) mothPicFile.length()];
			byte[] yearPic = new byte[(int) yearPicFile.length()];
			dayFis.read(dayPic);
			monthFis.read(monthPic);
			yearFis.read(yearPic);
			response.setDayLoadAveragePic(dayPic);
			response.setMonthLoadAveragePic(monthPic);
			response.setYearLoadAveragePic(yearPic);
			response.setReturnCode(0);
			String[] s = StringUtils.split(dayPicFile.getName(), ".");
			if (s.length > 1) {
				response.setFileType(s[s.length - 1]);
			}
			response.setFileType("png");
		} catch (FileNotFoundException e) {
			throw new PicFileNotFouncException(e.getMessage());
		} catch (IOException e) {
			throw new PicIOException(e.getMessage());
		}
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#AddGroup(cn.livedoor.www.sysguard.AddGroupRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.AddGroupResponse AddGroup(cn.livedoor.www.sysguard.AddGroupRequest request, String userName)

	{
		AddGroupResponse response = new AddGroupResponse();

		GroupInfo groupInfo = request.getGroupInf();
		HostGroup hostGroup = new HostGroup();

		copyHostGroup(groupInfo, hostGroup);

		GroupService groupService = getGroupService();
		groupService.addHostGroup(hostGroup);
		response.setReturnCode(0);

		return response;
	}

	/**
	 * @param groupInfo
	 * @param hostGroup
	 */
	private void copyHostGroup(GroupInfo groupInfo, HostGroup hostGroup) {
		hostGroup.setDescription(groupInfo.getDescription());
		hostGroup.setGroupId(groupInfo.getGroupId());
		hostGroup.setGroupName(groupInfo.getGroupName());
//		hostGroup.setInputTime(groupInfo.getInputTime().getTime());
		hostGroup.setOsId(groupInfo.getOsId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#DeleteOperationInfoByOperationId(cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.DeleteOperationInfoByOperationIdResponse DeleteOperationInfoByOperationId(
			cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest request, String userName)

	{
		DeleteOperationInfoByOperationIdResponse response = new DeleteOperationInfoByOperationIdResponse();
		OperationService operationService = getOperationService();
		operationService.deleteOperationByOperationId(request.getOperationId());
		response.setReturnCode(0);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#BatchExecuteCommand(cn.livedoor.www.sysguard.BatchExecuteCommandRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.BatchExecuteCommandResponse BatchExecuteCommand(
			cn.livedoor.www.sysguard.BatchExecuteCommandRequest request, String userName)

	{
		BatchService batchService = getBatchService();

		BatchExecuteCommandResponse response = new BatchExecuteCommandResponse();
		String command = request.getCommand();
		int[] hostIds = request.getHostIds();
		response.setExecuteResults(batchService.BatchExecuteCommand(hostIds, command));
		response.setReturnCode(0);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#ModifyOperationInfo(cn.livedoor.www.sysguard.ModifyOperationInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.ModifyOperationInfoResponse ModifyOperationInfo(
			cn.livedoor.www.sysguard.ModifyOperationInfoRequest request, String userName)

	{
		ModifyOperationInfoResponse response = new ModifyOperationInfoResponse();
		OperationService operationService = getOperationService();
		OperationWithBLOBs operation = new OperationWithBLOBs();
		OperationInfo operationInfo = request.getOperationInfo();

		copyOperation(operation, operationInfo);

		operationService.modifyOperation(operation);
		response.setReturnCode(0);

		return response;
	}

	/**
	 * @param operation
	 * @param operationInfo
	 */
	private void copyOperation(OperationWithBLOBs operation, OperationInfo operationInfo) {
		operation.setErrorDesp(operationInfo.getErrorDesp());
//		operation.setInputTime(operationInfo.getInputTime().getTime());
		operation.setOperContent(operationInfo.getOperContent());
		operation.setOperId(operationInfo.getOperId());
		operation.setUserId(operationInfo.getUserId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#ModifyUserInfo(cn.livedoor.www.sysguard.ModifyUserInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.ModifyUserInfoResponse ModifyUserInfo(
			cn.livedoor.www.sysguard.ModifyUserInfoRequest request, String userName) {
		ModifyUserInfoResponse response = new ModifyUserInfoResponse();

		UserService userService = getUserService();
		User user = new User();
		UserInfo userInfo = request.getEditUser();
		User oldUser = userService.getUserInfoByUserId(userInfo.getUserId());
		if (oldUser.getPasswd().equals(request.getOldPassword())) {
			copyUser(user, userInfo);
			userService.modifyUser(user);
		} else {
			throw new OldPasswordNotMatchException("Your old password is not match!");
		}
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetAllHostInfo(cn.livedoor.www.sysguard.GetAllHostInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetAllHostInfoResponse GetAllHostInfo(
			cn.livedoor.www.sysguard.GetAllHostInfoRequest request, String userName)

	{
		GetAllHostInfoResponse response = new GetAllHostInfoResponse();
		HostService hostService = getHostService();
		Host[] hosts = hostService.getAllHost();
		if (Utils.isNotNullArray(hosts)) {
			HostInfo[] hostInfos = new HostInfo[hosts.length];
			for (int i = 0; i < hostInfos.length; i++) {
				hostInfos[i] = new HostInfo();
				if (hosts[i].getInputTime() != null) {
					hostInfos[i].setInputTime(getCalendar(hosts[i].getInputTime()));
				}
				if (hosts[i].getUpdateTime() != null) {
					hostInfos[i].setUpdateTime(getCalendar(hosts[i].getUpdateTime()));
				}
				hostInfos[i].setDescription(hosts[i].getDescription());
				hostInfos[i].setDiskpartition(hosts[i].getDiskpartition());
				hostInfos[i].setGroupId(hosts[i].getGroupId());
				hostInfos[i].setHostId(hosts[i].getHostId());
				hostInfos[i].setHostName(hosts[i].getHostName());
				if (Utils.isNotNullString(hosts[i].getUptime())) {
					hostInfos[i].setUptime(hosts[i].getUptime());
				}
				hostInfos[i].setValidate(hosts[i].getValidate());
				hostInfos[i].setHostIp(hosts[i].getHostIp());
			}
			response.setAllHostInfo(hostInfos);
		}
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#Logout(cn.livedoor.www.sysguard.LogoutRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.LogoutResponse Logout(cn.livedoor.www.sysguard.LogoutRequest request, String userName)

	{
		LogoutResponse response = new LogoutResponse();
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#ModifyLogInfo(cn.livedoor.www.sysguard.ModifyLogInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.ModifyLogInfoResponse ModifyLogInfo(cn.livedoor.www.sysguard.ModifyLogInfoRequest request,
			String userName)

	{
		ModifyLogInfoResponse response = new ModifyLogInfoResponse();

		LogInfo logInfo = request.getLogInfo();
		Applog applog = new Applog();
		applog.setLogStatus((byte) logInfo.getLogStatus());
		applog.setApplogId(logInfo.getApplogId());
		applog.setClassName(logInfo.getClassName());
		applog.setHostId(logInfo.getHostId());
//		applog.setInputTime(logInfo.getInputTime().getTime());
		applog.setLevel(logInfo.getLevel());
		applog.setLogContent(logInfo.getLogContent());
		applog.setLogLine(logInfo.getLogLine());
//		applog.setLogTime(logInfo.getLogTime().getTime());
		applog.setSolveDesc(logInfo.getSolveDesc());
		applog.setSolveResult(logInfo.getSolveResult());
		applog.setThreadName(logInfo.getThreadName());
		applog.setUptime(logInfo.getUptime());
		applog.setUserId(logInfo.getUserId());
		LogInfoService logInfoService = getLogInfoService();
		logInfoService.modifyApplog(applog);
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetAllGroupInfo(cn.livedoor.www.sysguard.GetAllGroupInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetAllGroupInfoResponse GetAllGroupInfo(
			cn.livedoor.www.sysguard.GetAllGroupInfoRequest param20, String userName)

	{

		GetAllGroupInfoResponse response = new GetAllGroupInfoResponse();

		GroupService gourpService = getGroupService();
		HostGroup[] hostGroups = gourpService.getAllHostGroup();
		OsTypeService osTypeService = getOsTypeService();
		if (Utils.isNotNullArray(hostGroups)) {
			GroupInfo[] groupInfos = new GroupInfo[hostGroups.length];
			for (int i = 0; i < groupInfos.length; i++) {
				groupInfos[i] = new GroupInfo();
				OsType osType = osTypeService.getOsTypeByTypeId(hostGroups[i].getOsId());
				if (Utils.isNotNullString(hostGroups[i].getDescription())) {
					groupInfos[i].setDescription(hostGroups[i].getDescription());
				}
				if (hostGroups[i].getInputTime() != null) {
					groupInfos[i].setInputTime(getCalendar(hostGroups[i].getInputTime()));
				}
				groupInfos[i].setGroupId(hostGroups[i].getGroupId());
				groupInfos[i].setGroupName(hostGroups[i].getGroupName());
				groupInfos[i].setOsId(osType.getOsId());
			}
			response.setAllGroupInfo(groupInfos);
		}
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#DeleteGroupByGroupId(cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.DeleteGroupByGroupIdResponse DeleteGroupByGroupId(
			cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest request, String userName)

	{
		DeleteGroupByGroupIdResponse response = new DeleteGroupByGroupIdResponse();
		GroupService groupService = getGroupService();
		groupService.deleteHostGroupByGroupId(request.getGroupId());
		response.setReturnCode(0);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetAllSystemInfo(cn.livedoor.www.sysguard.GetAllSystemInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetAllSystemInfoResponse GetAllSystemInfo(
			cn.livedoor.www.sysguard.GetAllSystemInfoRequest request, String userName)

	{
		System.out.println("&&&&&&&&&&&&&&&&0&&&&&&&&&&&&&");
		GetAllSystemInfoResponse response = new GetAllSystemInfoResponse();
		System.out.println("&&&&&&&&&&&&&&&&1&&&&&&&&&&&&&");
		SystemService systemService = getSystemService();
		System.out.println("&&&&&&&&&&&&&&&2&&&&&&&&&&&&&&");
		cn.livedoor.security.sysguard.services.SystemInfo[] infos = systemService.getAllDataInfos();
		System.out.println("&&&&&&&&&&&&&&3&&&&&&&&&&&&&&&");
		SystemInfo[] param = new SystemInfo[infos.length];
		System.out.println("&&&&&&&&&&&&&&4&&&&&&&&&&&&&&&");
		for (int i = 0; i < param.length; i++) {
			param[i] = new SystemInfo();
			copyBean(param[i], infos[i]);
		}
		System.out.println("&&&&&&&&&&&&&&&5&&&&&&&&&&&&&&");
		response.setAllSysInfo(param);
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetAllOperationInfo(cn.livedoor.www.sysguard.GetAllOperationInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetAllOperationInfoResponse GetAllOperationInfo(
			cn.livedoor.www.sysguard.GetAllOperationRequest param26, String userName) {
		GetAllOperationInfoResponse response = new GetAllOperationInfoResponse();
		OperationService operationService = getOperationService();
		OperationWithBLOBs[] operations = operationService.getAllOperation();
		if (Utils.isNotNullArray(operations)) {
			OperationInfo[] operationInfos = new OperationInfo[operations.length];
			for (int i = 0; i < operationInfos.length; i++) {
				operationInfos[i] = new OperationInfo();
				operationInfos[i].setOperId(operations[i].getOperId());
				operationInfos[i].setUserId(operations[i].getUserId());
				operationInfos[i].setErrorDesp(operations[i].getErrorDesp());
				operationInfos[i].setOperContent(operations[i].getOperContent());
				if (operations[i].getInputTime() != null) {
					operationInfos[i].setInputTime(getCalendar(operations[i].getInputTime()));
				}
			}
			response.setAllOperations(operationInfos);
		}
		response.setReturnCode(0);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#DeleteUserByUserId(cn.livedoor.www.sysguard.DeleteUserByUserIdRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.DeleteUserByUserIdResponse DeleteUserByUserId(
			cn.livedoor.www.sysguard.DeleteUserByUserIdRequest request, String userName)

	{
		DeleteUserByUserIdResponse response = new DeleteUserByUserIdResponse();

		UserService userService = getUserService();
		userService.deleteUser(request.getUserId());
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#Login(cn.livedoor.www.sysguard.LoginRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.LoginResponse Login(cn.livedoor.www.sysguard.LoginRequest request) {
		String userName = request.getUsername();
		String password = request.getPassword();
		LoginResponse response = new LoginResponse();
		UserService userService = getUserService();
		User user = userService.login(userName, password);
		UserInfo userInfo = new UserInfo();

		userInfo = new UserInfo();
		userInfo.setUserId(user.getUserId());
		userInfo.setName(user.getName());
		userInfo.setRoleId(user.getRoleId());
		userInfo.setRealName(user.getRealName());
		userInfo.setValidate(user.getValidate());
		userInfo.setPasswd(user.getPasswd());
		if (Utils.isNotNullString(user.getMail())) {
			userInfo.setMail(user.getMail());
		}
		if (user.getInputTime() != null) {
			userInfo.setInputTime(getCalendar(user.getInputTime()));
		}
		if (Utils.isNotNullString(user.getMsn())) {
			userInfo.setMsn(user.getMsn());
		}
		if (Utils.isNotNullString(user.getMail())) {
			userInfo.setMail(user.getMail());
		}
		if (Utils.isNotNullString(user.getSkype())) {
			userInfo.setSkype(user.getSkype());
		}
		if (user.getOnline() != null) {
			userInfo.setOnline(user.getOnline());
		}
		if (user.getUpdateTime() != null) {
			userInfo.setUpdateTime(getCalendar(user.getUpdateTime()));
		}
		if (user.getLastLoginTime() != null) {
			userInfo.setLastLoginTime(getCalendar(user.getLastLoginTime()));
		}

		// userInfo.setDescription("desc");
		response.setUserInfo(userInfo);
		response.setReturnCode(0);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#ModifyGroupInf(cn.livedoor.www.sysguard.ModifyGroupInfRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.ModifyGroupInfResponse ModifyGroupInf(
			cn.livedoor.www.sysguard.ModifyGroupInfRequest request, String userName)

	{
		ModifyGroupInfResponse response = new ModifyGroupInfResponse();
		GroupInfo groupInfo = request.getGroupInfo();
		HostGroup hostGroup = new HostGroup();
		copyHostGroup(groupInfo, hostGroup);
		GroupService groupService = getGroupService();
		groupService.modifyHostGroup(hostGroup);
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#DeleteHostByHostId(cn.livedoor.www.sysguard.DeleteHostByHostIdRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.DeleteHostByHostIdResponse DeleteHostByHostId(
			cn.livedoor.www.sysguard.DeleteHostByHostIdRequest request, String userName)

	{
		DeleteHostByHostIdResponse response = new DeleteHostByHostIdResponse();

		HostService hostService = getHostService();
		hostService.deleteHostByHostId(request.getHostId());
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#ModifyHostInfo(cn.livedoor.www.sysguard.ModifyHostInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.ModifyHostInfoResponse ModifyHostInfo(
			cn.livedoor.www.sysguard.ModifyHostInfoRequest request, String userName)

	{
		ModifyHostInfoResponse response = new ModifyHostInfoResponse();

		HostService hostService = getHostService();
		Host host = new Host();
		HostInfo hostInfo = request.getHostInfo();

		copyHost(host, hostInfo);

		hostService.modifyHost(host);
		response.setReturnCode(0);

		return response;
	}

	/**
	 * @param host
	 * @param hostInfo
	 */
	private void copyHost(Host host, HostInfo hostInfo) {
		host.setDescription(hostInfo.getDescription());
		host.setDiskpartition(hostInfo.getDiskpartition());
		host.setGroupId(hostInfo.getGroupId());
		host.setHostId(hostInfo.getHostId());
		host.setHostIp(hostInfo.getHostIp());
		host.setHostName(hostInfo.getHostName());
//		host.setInputTime(hostInfo.getInputTime().getTime());
//		host.setUpdateTime(hostInfo.getUpdateTime().getTime());
		host.setUptime(hostInfo.getUptime());
		host.setValidate(hostInfo.getValidate());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#AddUser(cn.livedoor.www.sysguard.AddUserRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.AddUserResponse AddUser(cn.livedoor.www.sysguard.AddUserRequest request, String userName) {
		AddUserResponse response = new AddUserResponse();

		UserService userService = getUserService();
		User user = new User();
		UserInfo userInfo = request.getUser();
		copyUser(user, userInfo);

		userService.addUser(user);
		response.setReturnCode(0);

		return response;
	}

	/**
	 * @param user
	 * @param userInfo
	 */
	private void copyUser(User user, UserInfo userInfo) {
//		user.setInputTime(userInfo.getInputTime().getTime());
//		user.setLastLoginTime(userInfo.getLastLoginTime().getTime());
		user.setMail(userInfo.getMail());
		user.setMsn(userInfo.getMsn());
		user.setName(userInfo.getName());
		user.setOnline(userInfo.getOnline());
		user.setPasswd(userInfo.getPasswd());
		user.setRealName(userInfo.getRealName());
		user.setRoleId(userInfo.getRoleId());
		user.setSkype(userInfo.getSkype());
//		user.setUpdateTime(userInfo.getUpdateTime().getTime());
		user.setUserId(userInfo.getUserId());
		user.setValidate(userInfo.getValidate());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#AddOperationInfo(cn.livedoor.www.sysguard.AddOperationInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.AddOperationInfoResponse AddOperationInfo(
			cn.livedoor.www.sysguard.AddOperationInfoRequest request, String userName) {
		AddOperationInfoResponse response = new AddOperationInfoResponse();

		OperationService operationService = getOperationService();
		OperationWithBLOBs operation = new OperationWithBLOBs();
		OperationInfo operationInfo = request.getOperationInfo();
		copyOperation(operation, operationInfo);
		operationService.addOperation(operation);
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#BatchUploadFile(cn.livedoor.www.sysguard.BatchUploadFileRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.BatchUploadFileResponse BatchUploadFile(
			cn.livedoor.www.sysguard.BatchUploadFileRequest request, String userName)

	{
		int[] hostIds = request.getHostIds();
		String path = request.getPath();
		String fileName = request.getFileName();
		byte[] file = request.getFile().getBytes();

		BatchUploadFileResponse response = new BatchUploadFileResponse();
		BatchService batchService = getBatchService();
		String[] results = batchService.BatchUploadFile(hostIds, file, path, fileName);

		response.setUploadResults(results);

		response.setReturnCode(0);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetAllLogInfo(cn.livedoor.www.sysguard.GetAllLogInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetAllLogInfoResponse GetAllLogInfo(cn.livedoor.www.sysguard.GetAllLogInfoRequest request,
			String userName)

	{
		GetAllLogInfoResponse response = new GetAllLogInfoResponse();

		LogInfoService logInfoService = getLogInfoService();
		HostService hostService = getHostService();
		Applog[] applogs = logInfoService.getAllApplogs();
		if (Utils.isNotNullArray(applogs)) {
			LogInfo[] logInfos = new LogInfo[applogs.length];
			for (int i = 0; i < logInfos.length; i++) {
				logInfos[i] = new LogInfo();
				logInfos[i].setApplogId(applogs[i].getApplogId());
				logInfos[i].setHostId(applogs[i].getHostId());
				Host host = hostService.getHostByHostId(applogs[i].getHostId());
				if (host != null) {
					logInfos[i].setHostIp(host.getHostIp());
				} else {
					logInfos[i].setHostIp("Host not exist!");
				}
				logInfos[i].setLogStatus(applogs[i].getLogStatus());
				if (Utils.isNotNullString(applogs[i].getClassName())) {
					logInfos[i].setClassName(applogs[i].getClassName());
				}
				if (applogs[i].getInputTime() != null) {
					logInfos[i].setInputTime(getCalendar(applogs[i].getInputTime()));
				}
				if (Utils.isNotNullString(applogs[i].getClassName())) {
					logInfos[i].setClassName(applogs[i].getClassName());
				}
				if (Utils.isNotNullString(applogs[i].getLevel())) {
					logInfos[i].setLevel(applogs[i].getLevel());
				}
				if (Utils.isNotNullString(applogs[i].getLogContent())) {
					logInfos[i].setLogContent(applogs[i].getLogContent());
				}
				if (Utils.isNotNullString(applogs[i].getLogLine())) {
					logInfos[i].setLogLine(applogs[i].getLogLine());
				}
				if (applogs[i].getLogTime() != null) {
					logInfos[i].setLogTime(getCalendar(applogs[i].getLogTime()));
				}
				if (Utils.isNotNullString(applogs[i].getSolveDesc())) {
					logInfos[i].setSolveDesc(applogs[i].getSolveDesc());
				}
				if (Utils.isNotNullString(applogs[i].getSolveResult())) {
					logInfos[i].setSolveResult(applogs[i].getSolveResult());
				}
				if (applogs[i].getSolveTime() != null) {
					logInfos[i].setSolveTime(getCalendar(applogs[i].getSolveTime()));
				}
				if (applogs[i].getUserId() != null) {
					logInfos[i].setUserId(applogs[i].getUserId());
				}
				if (Utils.isNotNullString(applogs[i].getThreadName())) {
					logInfos[i].setThreadName(applogs[i].getThreadName());
				}
				if (applogs[i].getUptime() != null) {
					logInfos[i].setUptime(applogs[i].getUptime());
				}
			}
			response.setAllLogInfo(logInfos);
		}
		response.setReturnCode(0);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetAllUserInfo(cn.livedoor.www.sysguard.GetAllUserInfoRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetAllUserInfoResponse GetAllUserInfo(
			cn.livedoor.www.sysguard.GetAllUserInfoRequest param46, String userName)

	{
		GetAllUserInfoResponse response = new GetAllUserInfoResponse();

		UserService userService = getUserService();
		User[] users = userService.getAllUserInfo();
		if (Utils.isNotNullArray(users)) {
			UserInfo[] userInfos = new UserInfo[users.length];
			for (int i = 0; i < userInfos.length; i++) {
				userInfos[i] = new UserInfo();
				userInfos[i].setUserId(users[i].getUserId());
				userInfos[i].setName(users[i].getName());
				userInfos[i].setRoleId(users[i].getRoleId());
				userInfos[i].setRealName(users[i].getRealName());
				userInfos[i].setValidate(users[i].getValidate());
				userInfos[i].setPasswd(users[i].getPasswd());
				if (Utils.isNotNullString(users[i].getMail())) {
					userInfos[i].setMail(users[i].getMail());
				}
				if (users[i].getInputTime() != null) {
					userInfos[i].setInputTime(getCalendar(users[i].getInputTime()));
				}
				if (Utils.isNotNullString(users[i].getMsn())) {
					userInfos[i].setMsn(users[i].getMsn());
				}
				if (Utils.isNotNullString(users[i].getMail())) {
					userInfos[i].setMail(users[i].getMail());
				}
				if (Utils.isNotNullString(users[i].getSkype())) {
					userInfos[i].setSkype(users[i].getSkype());
				}
				if (users[i].getOnline() != null) {
					userInfos[i].setOnline(users[i].getOnline());
				}
				if (users[i].getUpdateTime() != null) {
					userInfos[i].setUpdateTime(getCalendar(users[i].getUpdateTime()));
				}
				if (users[i].getLastLoginTime() != null) {
					userInfos[i].setLastLoginTime(getCalendar(users[i].getLastLoginTime()));
				}
			}
			response.setAllUserInfo(userInfos);
		}
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#AddHost(cn.livedoor.www.sysguard.AddHostRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.AddHostResponse AddHost(cn.livedoor.www.sysguard.AddHostRequest request, String userName)

	{
		AddHostResponse response = new AddHostResponse();

		HostService hostService = getHostService();
		Host host = new Host();
		HostInfo hostInfo = request.getHostInfo();
		copyHost(host, hostInfo);
		host.setLoginName(request.getLoginName());
		host.setLoginPwd(request.getLoginPwd());
		hostService.addHost(host);
		response.setReturnCode(0);

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.livedoor.www.sysguard.SysguardService#GetAllDataInfoStandard(cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest)
	 */
	public cn.livedoor.security.sysguard.services.response.GetAllDataInfoStandardResponse GetAllDataInfoStandard(
			cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest request, String userName)

	{
		GetAllDataInfoStandardResponse response = new GetAllDataInfoStandardResponse();

		DataInfoTypeService dataInfoTypeService = ServiceFactory.getDataInfoTypeService();
		dataInfoTypeService.setDaoManager(getDaoManager());
		DataInfoType[] dataInfoTypes = dataInfoTypeService.getAllDataInfoTypes();
		if (Utils.isNotNullArray(dataInfoTypes)) {
			DataInfoStandard[] standards = new DataInfoStandard[dataInfoTypes.length];
			for (int i = 0; i < dataInfoTypes.length; i++) {
				standards[i] = new DataInfoStandard();
				copyBean(standards[i], dataInfoTypes[i]);
			}
			response.setAllStandard(standards);
		}
		response.setReturnCode(0);
		return response;
	}

	public GetAllRoleInfoResponse GetAllRoleInfo(GetAllRoleInfoRequest request, String userName) {
		GetAllRoleInfoResponse response = new GetAllRoleInfoResponse();
		RoleService roleService = getRoleService();
		Role[] roles = roleService.getAllRole();
		if (Utils.isNotNullArray(roles)) {
			RoleInfo[] roleInfos = new RoleInfo[roles.length];
			for (int i = 0; i < roleInfos.length; i++) {
				roleInfos[i] = new RoleInfo();
				if (Utils.isNotNullString(roles[i].getDescription())) {
					roleInfos[i].setDescription(roles[i].getDescription());
				}
				if (roles[i].getInputTime() != null) {
					roleInfos[i].setInputTime(getCalendar(roles[i].getInputTime()));
				}
				roleInfos[i].setRoleId(roles[i].getRoleId());
				roleInfos[i].setName(roles[i].getName());
			}
			response.setAllRole(roleInfos);
		}
		response.setReturnCode(0);
		return response;
	}

	public GetOperationByIdResponse GetOperationById(GetOperationByIdRequest request, String userName) {
		GetOperationByIdResponse response = new GetOperationByIdResponse();
		OperationService operationService = getOperationService();
		OperationWithBLOBs operation = operationService.getOperationByOperationId(request.getOperId());
		OperationInfo info = new OperationInfo();
		if (operation.getInputTime() != null) {
			info.setInputTime(getCalendar(operation.getInputTime()));
		}
		info.setErrorDesp(operation.getErrorDesp());
		info.setOperContent(operation.getOperContent());
		info.setOperId(operation.getOperId());
		info.setUserId(operation.getUserId());

		response.setReturnCode(0);
		return response;
	}

	private GroupService getGroupService() {
		GroupService groupService = ServiceFactory.getGroupService();
		groupService.setDaoManager(getDaoManager());
		return groupService;
	}

	private HostService getHostService() {
		HostService hostService = ServiceFactory.getHostService();
		hostService.setDaoManager(getDaoManager());
		return hostService;
	}

	/**
	 * @return
	 */
	private LogInfoService getLogInfoService() {
		LogInfoService logInfoService = ServiceFactory.getLogInfoService();
		logInfoService.setDaoManager(getDaoManager());
		return logInfoService;
	}

	private OsTypeService getOsTypeService() {
		OsTypeService osTypeService = ServiceFactory.getOsTypeService();
		osTypeService.setDaoManager(getDaoManager());
		return osTypeService;
	}

	/**
	 * @return
	 */
	private SystemService getSystemService() {
		SystemService systemService = ServiceFactory.getSystemService();
		systemService.setDaoManager(getDaoManager());
		return systemService;
	}

	private OperationService getOperationService() {
		OperationService operationService = ServiceFactory.getOperationService();
		operationService.setDaoManager(getDaoManager());
		return operationService;
	}

	/**
	 * @return
	 */
	private RoleService getRoleService() {
		RoleService roleService = ServiceFactory.getRoleServices();
		roleService.setDaoManager(getDaoManager());
		return roleService;
	}

	/**
	 * @return
	 */
	private UserService getUserService() {
		UserService userService = ServiceFactory.getUserService();
		userService.setDaoManager(getDaoManager());
		return userService;
	}

	private BatchService getBatchService() {
		BatchService batchService = ServiceFactory.getBatchService();
		batchService.setDaoManager(getDaoManager());
		return batchService;
	}

	/**
	 * @param osTypes
	 * @param i
	 */
	private Calendar getCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	private DaoManager getDaoManager() {
		return daoManager;
	}

	public void setDaoManager(DaoManager daoManager) {
		this.daoManager = daoManager;
	}

	private void copyBean(Object dest, Object src) {
		try {
			PropertyUtils.copyProperties(dest, src);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e.getStackTrace());
			}
		}
	}
}
