package cn.livedoor.www.sysguard;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.OperationContext;
import org.apache.axis2.context.SessionContext;
import org.apache.axis2.databinding.types.HexBinary;
import org.apache.axis2.wsdl.WSDLConstants;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.livedoor.security.sysguard.services.DaoConfig;
import cn.livedoor.security.sysguard.services.facade.InterceptorFactory;
import cn.livedoor.security.sysguard.services.facade.SysguardService;
import cn.livedoor.security.sysguard.services.response.BatchUploadFileResponse;
import cn.livedoor.security.sysguard.services.response.GetAllLogInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllSystemInfoResponse;
import cn.livedoor.security.sysguard.services.response.GetAllUserInfoResponse;

import com.ibatis.dao.client.DaoManager;

/**
 * SysguardSkeleton java skeleton for the axisService
 */
public class SysguardSkeleton {
	private static final String DAO_MANAGER = "daoManager";

	private static final String USERNAME = "username";

	private static Log log = LogFactory.getLog(SysguardSkeleton.class);

	SessionContext context = null;

	ConfigurationContext configurationContext = null;

	SysguardService sysguardService = InterceptorFactory.getSysguardService();

	public void setOperationContext(OperationContext operationContext) throws AxisFault {
		MessageContext msgCnt = operationContext.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
		this.context = msgCnt.getSessionContext();
		this.configurationContext = operationContext.getConfigurationContext();

		if (this.configurationContext.getProperty(DAO_MANAGER) == null) {
			try {
				this.configurationContext.setProperty(DAO_MANAGER, DaoConfig.getDaoManager());
			} catch (Exception e) {
				if(log.isErrorEnabled()){
					log.error("Inital Ibatis DaoManager Exception",e);
				}
			}
		}
		if(log.isDebugEnabled()){
			log.debug("Call the method: [" + operationContext.getAxisOperation().getName() + "]");
		}
		sysguardService.setDaoManager(getDaoManager());
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param0
	 * 
	 */
	public cn.livedoor.www.sysguard.GetLoadPicByHostIpResponse GetLoadPicByHostIp(cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest request)

	{
		GetLoadPicByHostIpResponse response = new GetLoadPicByHostIpResponse();
		cn.livedoor.security.sysguard.services.response.GetLoadPicByHostIpResponse resp = sysguardService.GetLoadPicByHostIp(request, getUserName());
		if (resp.getDayLoadAveragePic() != null) {
			response.setDayLoadAveragePic(new HexBinary(resp.getDayLoadAveragePic()));
		}
		if (resp.getMonthLoadAveragePic() != null) {
			response.setMonthLoadAveragePic(new HexBinary(resp.getMonthLoadAveragePic()));
		}
		if (resp.getYearLoadAveragePic() != null) {
			response.setYearLoadAveragePic(new HexBinary(resp.getYearLoadAveragePic()));
		}
		response.setHostIp(request.getHostIp());
		response.setFileType(resp.getFileType());
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param2
	 * 
	 */
	public cn.livedoor.www.sysguard.AddGroupResponse AddGroup(cn.livedoor.www.sysguard.AddGroupRequest request)

	{
		AddGroupResponse response = new AddGroupResponse();
		copyBean(response, sysguardService.AddGroup(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param4
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllOsTypeInfoResponse GetAllOsTypeInfo(cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest request)

	{
		GetAllOsTypeInfoResponse response = new GetAllOsTypeInfoResponse();
		cn.livedoor.security.sysguard.services.response.GetAllOsTypeInfoResponse resp = sysguardService.GetAllOsTypeInfo(request, getUserName());
		if (resp.getAllOsType() != null) {
			response.setAllOsType(resp.getAllOsType());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param6
	 * 
	 */
	public cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdResponse DeleteOperationInfoByOperationId(
			cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest request)

	{
		DeleteOperationInfoByOperationIdResponse response = new DeleteOperationInfoByOperationIdResponse();
		copyBean(response, sysguardService.DeleteOperationInfoByOperationId(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param8
	 * 
	 */
	public cn.livedoor.www.sysguard.BatchExecuteCommandResponse BatchExecuteCommand(cn.livedoor.www.sysguard.BatchExecuteCommandRequest request)

	{
		BatchExecuteCommandResponse response = new BatchExecuteCommandResponse();
		cn.livedoor.security.sysguard.services.response.BatchExecuteCommandResponse resp = sysguardService
				.BatchExecuteCommand(request, getUserName());
		if (resp.getExecuteResults() != null) {
			response.setExecuteResults(resp.getExecuteResults());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param10
	 * 
	 */
	public cn.livedoor.www.sysguard.ModifyOperationInfoResponse ModifyOperationInfo(cn.livedoor.www.sysguard.ModifyOperationInfoRequest request)

	{
		ModifyOperationInfoResponse response = new ModifyOperationInfoResponse();
		copyBean(response, sysguardService.ModifyOperationInfo(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param12
	 * 
	 */
	public cn.livedoor.www.sysguard.ModifyUserInfoResponse ModifyUserInfo(cn.livedoor.www.sysguard.ModifyUserInfoRequest request)

	{
		ModifyUserInfoResponse response = new ModifyUserInfoResponse();
		copyBean(response, sysguardService.ModifyUserInfo(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param14
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllHostInfoResponse GetAllHostInfo(cn.livedoor.www.sysguard.GetAllHostInfoRequest request)

	{
		GetAllHostInfoResponse response = new GetAllHostInfoResponse();
		cn.livedoor.security.sysguard.services.response.GetAllHostInfoResponse resp = sysguardService.GetAllHostInfo(request, getUserName());
		if (resp.getAllHostInfo() != null) {
			response.setAllHostInfo(resp.getAllHostInfo());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param16
	 * 
	 */
	public cn.livedoor.www.sysguard.LogoutResponse Logout(cn.livedoor.www.sysguard.LogoutRequest request)

	{
		LogoutResponse response = new LogoutResponse();
		copyBean(response, sysguardService.Logout(request, getUserName()));
		// set the username to null
		setProperty(USERNAME, null);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param18
	 * 
	 */
	public cn.livedoor.www.sysguard.ModifyOsTypeInfoResponse ModifyOsTypeInfo(cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest request)

	{
		ModifyOsTypeInfoResponse response = new ModifyOsTypeInfoResponse();
		copyBean(response, sysguardService.ModifyOsTypeInfo(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param20
	 * 
	 */
	public cn.livedoor.www.sysguard.ModifyLogInfoResponse ModifyLogInfo(cn.livedoor.www.sysguard.ModifyLogInfoRequest request)

	{
		ModifyLogInfoResponse response = new ModifyLogInfoResponse();
		copyBean(response, sysguardService.ModifyLogInfo(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param22
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllGroupInfoResponse GetAllGroupInfo(cn.livedoor.www.sysguard.GetAllGroupInfoRequest request)

	{
		GetAllGroupInfoResponse response = new GetAllGroupInfoResponse();
		cn.livedoor.security.sysguard.services.response.GetAllGroupInfoResponse resp = sysguardService.GetAllGroupInfo(request, getUserName());
		if (resp.getAllGroupInfo() != null) {
			response.setAllGroupInfo(resp.getAllGroupInfo());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param24
	 * 
	 */
	public cn.livedoor.www.sysguard.DeleteGroupByGroupIdResponse DeleteGroupByGroupId(cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest request)

	{
		DeleteGroupByGroupIdResponse response = new DeleteGroupByGroupIdResponse();
		copyBean(response, sysguardService.DeleteGroupByGroupId(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param26
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllSystemInfoResponse GetAllSystemInfo(cn.livedoor.www.sysguard.GetAllSystemInfoRequest request)

	{
		cn.livedoor.www.sysguard.GetAllSystemInfoResponse response = new cn.livedoor.www.sysguard.GetAllSystemInfoResponse();
		GetAllSystemInfoResponse resp = sysguardService.GetAllSystemInfo(request, getUserName());
		if (resp.getAllSysInfo() != null) {
			response.setAllSysInfo(resp.getAllSysInfo());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param28
	 * 
	 */
	public cn.livedoor.www.sysguard.AddOsTypeInfoResponse AddOsTypeInfo(cn.livedoor.www.sysguard.AddOsTypeInfoRequest request)

	{
		AddOsTypeInfoResponse response = new AddOsTypeInfoResponse();
		copyBean(response, sysguardService.AddOsTypeInfo(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param30
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllOperationResponse GetAllOperation(cn.livedoor.www.sysguard.GetAllOperationRequest request)

	{
		GetAllOperationResponse response = new GetAllOperationResponse();
		cn.livedoor.security.sysguard.services.response.GetAllOperationInfoResponse resp = sysguardService
				.GetAllOperationInfo(request, getUserName());
		if (resp.getAllOperations() != null) {
			response.setAllOperations(resp.getAllOperations());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param40
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllRoleInfoResponse GetAllRoleInfo(cn.livedoor.www.sysguard.GetAllRoleInfoRequest request)

	{
		GetAllRoleInfoResponse response = new GetAllRoleInfoResponse();
		cn.livedoor.security.sysguard.services.response.GetAllRoleInfoResponse resp = sysguardService.GetAllRoleInfo(request, getUserName());
		if (resp.getAllRole() != null) {
			response.setAllRole(resp.getAllRole());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param32
	 * 
	 */
	public cn.livedoor.www.sysguard.DeleteUserByUserIdResponse DeleteUserByUserId(cn.livedoor.www.sysguard.DeleteUserByUserIdRequest request)

	{
		DeleteUserByUserIdResponse response = new DeleteUserByUserIdResponse();
		copyBean(response, sysguardService.DeleteUserByUserId(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param34
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllDataInfoStandardResponse GetAllDataInfoStandard(
			cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest request)

	{
		GetAllDataInfoStandardResponse response = new GetAllDataInfoStandardResponse();
		cn.livedoor.security.sysguard.services.response.GetAllDataInfoStandardResponse resp = sysguardService.GetAllDataInfoStandard(request,
				getUserName());
		if (resp.getAllStandard() != null) {
			response.setAllStandard(resp.getAllStandard());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param36
	 * 
	 */
	public cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdResponse DeleteOsTypeInfoByOsTypeId(
			cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest request)

	{
		DeleteOsTypeInfoByOsTypeIdResponse response = new DeleteOsTypeInfoByOsTypeIdResponse();
		copyBean(response, sysguardService.DeleteOsTypeInfoByOsTypeId(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param38
	 * 
	 */
	public cn.livedoor.www.sysguard.LoginResponse Login(cn.livedoor.www.sysguard.LoginRequest request)

	{
		LoginResponse response = new LoginResponse();
		cn.livedoor.security.sysguard.services.response.LoginResponse resp = sysguardService.Login(request);
		response.setReturnCode(resp.getReturnCode());
		if (resp.getUserInfo() != null) {
			response.setUserInfo(resp.getUserInfo());
		}
		if (resp.getReturnCode() == 0) {
			System.out.println("set the user '" + request.getUsername() + "' into the session");
			setProperty(USERNAME, request.getUsername());
		}
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param40
	 * 
	 */
	public cn.livedoor.www.sysguard.ModifyGroupInfResponse ModifyGroupInf(cn.livedoor.www.sysguard.ModifyGroupInfRequest request)

	{
		ModifyGroupInfResponse response = new ModifyGroupInfResponse();
		copyBean(response, sysguardService.ModifyGroupInf(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param42
	 * 
	 */
	public cn.livedoor.www.sysguard.DeleteHostByHostIdResponse DeleteHostByHostId(cn.livedoor.www.sysguard.DeleteHostByHostIdRequest request)

	{
		DeleteHostByHostIdResponse response = new DeleteHostByHostIdResponse();
		copyBean(response, sysguardService.DeleteHostByHostId(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param44
	 * 
	 */
	public cn.livedoor.www.sysguard.ModifyHostInfoResponse ModifyHostInfo(cn.livedoor.www.sysguard.ModifyHostInfoRequest request)

	{
		ModifyHostInfoResponse response = new ModifyHostInfoResponse();
		copyBean(response, sysguardService.ModifyHostInfo(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param46
	 * 
	 */
	public cn.livedoor.www.sysguard.AddUserResponse AddUser(cn.livedoor.www.sysguard.AddUserRequest request)

	{
		AddUserResponse response = new AddUserResponse();
		copyBean(response, sysguardService.AddUser(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param48
	 * 
	 */
	public cn.livedoor.www.sysguard.AddOperationInfoResponse AddOperationInfo(cn.livedoor.www.sysguard.AddOperationInfoRequest request)

	{
		AddOperationInfoResponse response = new AddOperationInfoResponse();
		copyBean(response, sysguardService.AddOperationInfo(request, getUserName()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param52
	 * 
	 */
	public cn.livedoor.www.sysguard.GetOperationByIdResponse GetOperationById(cn.livedoor.www.sysguard.GetOperationByIdRequest request)

	{
		GetOperationByIdResponse response = new GetOperationByIdResponse();
		cn.livedoor.security.sysguard.services.response.GetOperationByIdResponse resp = sysguardService.GetOperationById(request, getUserName());
		if(resp.getOperationInfo() != null){
			response.setOperationInfo(resp.getOperationInfo());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param50
	 * 
	 */
	public cn.livedoor.www.sysguard.BatchUploadFileResponse BatchUploadFile(cn.livedoor.www.sysguard.BatchUploadFileRequest request)

	{
		cn.livedoor.www.sysguard.BatchUploadFileResponse response = new cn.livedoor.www.sysguard.BatchUploadFileResponse();
		BatchUploadFileResponse resp = sysguardService.BatchUploadFile(request, getUserName());
		if (resp.getUploadResults() != null) {
			response.setUploadResults(resp.getUploadResults());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param52
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllLogInfoResponse GetAllLogInfo(cn.livedoor.www.sysguard.GetAllLogInfoRequest request)

	{
		cn.livedoor.www.sysguard.GetAllLogInfoResponse response = new cn.livedoor.www.sysguard.GetAllLogInfoResponse();
		GetAllLogInfoResponse resp = sysguardService.GetAllLogInfo(request, getUserName());
		if (resp.getAllLogInfo() != null) {
			response.setAllLogInfo(resp.getAllLogInfo());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param54
	 * 
	 */
	public cn.livedoor.www.sysguard.GetAllUserInfoResponse GetAllUserInfo(cn.livedoor.www.sysguard.GetAllUserInfoRequest request)

	{
		cn.livedoor.www.sysguard.GetAllUserInfoResponse response = new cn.livedoor.www.sysguard.GetAllUserInfoResponse();
		GetAllUserInfoResponse resp = sysguardService.GetAllUserInfo(request, getUserName());
		if (resp.getAllUserInfo() != null) {
			response.setAllUserInfo(resp.getAllUserInfo());
		}
		response.setReturnCode(resp.getReturnCode());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param param56
	 * 
	 */
	public cn.livedoor.www.sysguard.AddHostResponse AddHost(cn.livedoor.www.sysguard.AddHostRequest request)

	{
		AddHostResponse response = new AddHostResponse();
		copyBean(response, sysguardService.AddHost(request, getUserName()));
		return response;
	}

	private void setProperty(String key, Object value) {

		context.setProperty(key, value);
	}

	private Object getProperty(String key) {
		return context.getProperty(key);
	}

	private String getUserName() {
		return (String) getProperty(USERNAME);
	}

	private DaoManager getDaoManager() {
		return (DaoManager) configurationContext.getProperty(DAO_MANAGER);
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
