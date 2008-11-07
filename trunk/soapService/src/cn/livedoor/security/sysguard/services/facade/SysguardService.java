package cn.livedoor.security.sysguard.services.facade;

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
import cn.livedoor.www.sysguard.AddGroupRequest;
import cn.livedoor.www.sysguard.AddHostRequest;
import cn.livedoor.www.sysguard.AddOperationInfoRequest;
import cn.livedoor.www.sysguard.AddOsTypeInfoRequest;
import cn.livedoor.www.sysguard.AddUserRequest;
import cn.livedoor.www.sysguard.BatchExecuteCommandRequest;
import cn.livedoor.www.sysguard.BatchUploadFileRequest;
import cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest;
import cn.livedoor.www.sysguard.DeleteHostByHostIdRequest;
import cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest;
import cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest;
import cn.livedoor.www.sysguard.DeleteUserByUserIdRequest;
import cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest;
import cn.livedoor.www.sysguard.GetAllGroupInfoRequest;
import cn.livedoor.www.sysguard.GetAllHostInfoRequest;
import cn.livedoor.www.sysguard.GetAllLogInfoRequest;
import cn.livedoor.www.sysguard.GetAllOperationRequest;
import cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest;
import cn.livedoor.www.sysguard.GetAllRoleInfoRequest;
import cn.livedoor.www.sysguard.GetAllSystemInfoRequest;
import cn.livedoor.www.sysguard.GetAllUserInfoRequest;
import cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest;
import cn.livedoor.www.sysguard.GetOperationByIdRequest;
import cn.livedoor.www.sysguard.LoginRequest;
import cn.livedoor.www.sysguard.LogoutRequest;
import cn.livedoor.www.sysguard.ModifyGroupInfRequest;
import cn.livedoor.www.sysguard.ModifyHostInfoRequest;
import cn.livedoor.www.sysguard.ModifyLogInfoRequest;
import cn.livedoor.www.sysguard.ModifyOperationInfoRequest;
import cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest;
import cn.livedoor.www.sysguard.ModifyUserInfoRequest;

import com.ibatis.dao.client.DaoManager;


public interface SysguardService {

	
	/**
	 * ��ȡȫ������������Ϣ��ȡ�����ݿ�os_type������������ݣ�
	 * @param request	�޲���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return	��������ɹ�����allOsTypeInfo�ﱣ�����е�����������ϢOsTypeInfo��������
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public GetAllOsTypeInfoResponse GetAllOsTypeInfo(GetAllOsTypeInfoRequest request, String userName);

	
	/**
	 * �޸�����������Ϣ(�����޸Ĵ�����������Ͷ�Ӧ�����ݿ��¼�޸�)
	 * @param request	osTypeInfo��Ҫ�޸ĵ�OsTypeInfo����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public ModifyOsTypeInfoResponse ModifyOsTypeInfo(ModifyOsTypeInfoRequest request, String userName);

	
	/**
	 * �������������Ϣ(�����������������Ϣ��ӵ����ݿ�os_type����)
	 * @param request osTypeInfo��Ҫ��ӵ�������Ϣ����OsTypeInfo����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public AddOsTypeInfoResponse AddOsTypeInfo(AddOsTypeInfoRequest request,String userName);

	
	/**
	 * ɾ���������ͣ������ݿ⽫�봫�����������Id��Ӧ�����ݼ�¼ɾ����
	 * @param request	osTypeId��Ҫɾ��������������ϢId
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ�����
	 * 3	�����쳣
	 */
	public DeleteOsTypeInfoByOsTypeIdResponse DeleteOsTypeInfoByOsTypeId(DeleteOsTypeInfoByOsTypeIdRequest request, String userName);

	
	/**
	 * ��ȡ����ͼƬ��Ϣ��ȡ�����������IP��Ӧ�����������졢�º����ͼƬ��
	 * @param request	hostIp��Ҫȡ���ݵ�����Ip
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return	��������ɹ���	dayLoadAveragePic �ո���ͼƬbyte����
	 * 						monthLoadAveragePic �¸���ͼƬbyte����
	 * 						yearLoadAveragePic �긺��ͼƬbyte����
	 * 						fileTypeͼƬ�ı����ʽ
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	ͼƬδ�ҵ�
	 * 3	�����쳣
	 * 4	Io�쳣
	 */
	public GetLoadPicByHostIpResponse GetLoadPicByHostIp(GetLoadPicByHostIpRequest request, String userName);

	
	/**
	 * ����飨������ӵ�����ϢGroupInfo���󣬲������ݿ��в��������¼��
	 * @param request	groupInfo��Ҫ��ӵ�����ϢGroupInfo����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	�����Ѵ���
	 * 3	�����쳣
	 */
	public AddGroupResponse AddGroup(AddGroupRequest request, String userName);

	
	/**
	 * ɾ����Ӧ��Ϣ��ͨ������Ķ�Ӧ��Ϣ��Id��ɾ�����ݿ��ж�Ӧ�Ķ�Ӧ��Ϣ��¼��
	 * @param request	operationId��Ҫɾ���Ķ�Ӧ��ϢId
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public DeleteOperationInfoByOperationIdResponse DeleteOperationInfoByOperationId(DeleteOperationInfoByOperationIdRequest request, String userName);

	/**
	 * @param request
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * returnCode�ĺ��壺
	 */
	public GetOperationByIdResponse GetOperationById(GetOperationByIdRequest request, String userName);

	
	/**
	 * ����ִ�����ͨ��ssh���ڴ���Ķ�Ӧ�����������Ϸֱ�ִ�д�������
	 * @param request	hostIds����Ҫִ����������Id���飩
	 * 					command��ִ�е����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return	���ܲ��������Σ�������ִ����������һ����ÿ��������Ӧ���ַ�������		
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	��¼��������������¼�����������
	 * 3	�����쳣
	 */
	public BatchExecuteCommandResponse BatchExecuteCommand(BatchExecuteCommandRequest request, String userName);

	
	/**
	 * �޸Ķ�Ӧ��Ϣ���޸Ĵ����Ķ�Ӧ��Ϣ��¼��
	 * @param request	operationInfo������Ҫ�޸ĵĶ�Ӧ��ϢOperationInfo����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public ModifyOperationInfoResponse ModifyOperationInfo(ModifyOperationInfoRequest request, String userName);

	
	/**
	 * �޸��û���Ϣ��������Ҫ�޸ĵ��û���ϢUserInfo�����޸����ݿ��Ӧ�ļ�¼��
	 * @param request	editUser��Ҫ�޸ĵ�UserInfo����
	 * 					oldPassword��֤���޸��û��ľ�����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	���벻ƥ��
	 * 3	�����쳣
	 */
	public ModifyUserInfoResponse ModifyUserInfo(ModifyUserInfoRequest request, String userName);

	/**
	 * ��ȡȫ��������Ϣ��ȡ�����ݿ�host������Ӧ��ȫ����¼)
	 * @param request	�޲���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return	��������ɹ�����allHostInfo�б������е�������ϢHostInfo��������
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public GetAllHostInfoResponse GetAllHostInfo(GetAllHostInfoRequest request, String userName);

	
	/**
	 * �û��˳�ϵͳ(ɾ��ϵͳ��Session����ĸ��û���session��
	 * @param request	userNameҪ�˳�ϵͳ���û���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public LogoutResponse Logout(LogoutRequest request, String userName);

	
	/**
	 * �޸���־��������Ҫ�޸ĵ���־��ϢLogInfo�����޸����ݿ��Ӧ�ļ�¼��
	 * @param request  ��Ҫ�޸���־LogInfo�Ķ���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 *
	 */
	public ModifyLogInfoResponse ModifyLogInfo(ModifyLogInfoRequest request,String userName);

	/**
	 * ��ȡ��������Ϣ��ȡ�����ݿ�host_group���е��������ݣ�
	 * @param request	�޲���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return	��������ɹ���allGroupInfo������������ϢGroupInfo��������
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public GetAllGroupInfoResponse GetAllGroupInfo(GetAllGroupInfoRequest request, String userName);

	
	/**
	 * ɾ���飨������Ҫɾ��������Ϣ��Id�������ݿ���ɾ����Ӧ������Ϣ��
	 * @param request	groupId ��Ҫɾ������Id
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	�鱻Host���ã�����ɾ��
	 * 3	�����쳣
	 */
	public DeleteGroupByGroupIdResponse DeleteGroupByGroupId(DeleteGroupByGroupIdRequest request, String userName);


	/**
	 * ��ȡȫ��ϵͳ��Ϣ
	 * @param request   �޲���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼	��ǰ��¼���û���������û��Ƿ��¼
	 * @return GetAllSystemInfoResponse ����returnCode����������ɹ���allSysInfo�ﲢ��������ϵͳ��ϢSystemInfo��������
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 3	�����쳣
	 * 
	 */
	public GetAllSystemInfoResponse GetAllSystemInfo(GetAllSystemInfoRequest request, String userName);

	
	/**
	 * ��ȡȫ����Ӧ��Ϣ��ȡ�����ݿ�operation���е����м�¼��
	 * @param request
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣

	 */
	public GetAllOperationInfoResponse GetAllOperationInfo(GetAllOperationRequest request, String userName);

	/**
	 * @param request
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * returnCode�ĺ��壺
	 */
	public GetAllRoleInfoResponse GetAllRoleInfo(GetAllRoleInfoRequest request, String userName);

	
	/**
	 * ɾ���û�������Ҫ��ɾ�����û����û�Id�������ݿ���ɾ����Ӧ���û���¼��
	 * @param request	userId��Ҫɾ�����û�Id
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public DeleteUserByUserIdResponse DeleteUserByUserId(DeleteUserByUserIdRequest request, String userName);

	/**
	 * �û���¼
	 * 
	 * @param request request ���� ���û������͡����롰
	 * @return LoginResponse ����returnCode�������¼�ɹ���������¼�û����û���ϢUserInfo����
	 * returnCode�ĺ��壺
	 * 0	��¼��ȷ
	 * 1	�û���������
	 * 2	���벻ƥ��
	 * 3	��������
	 * 
	 */
	public LoginResponse Login(LoginRequest request);

	
	/**
	 * �޸�����Ϣ(������Ҫ�޸ĵ�����ϢGroupInfo���󣬲������ݿ����޸Ķ�Ӧ�ļ�¼)
	 * @param request	groupInfo��Ҫ�޸ĵ�����ϢGroupInfo����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public ModifyGroupInfResponse ModifyGroupInf(ModifyGroupInfRequest request, String userName);

	
	/**
	 * ɾ��������������Ҫɾ��������ID�������ݿ���ɾ����Ӧ�ļ�¼��
	 * @param request 	hostId��Ҫɾ��������Id
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public DeleteHostByHostIdResponse DeleteHostByHostId(DeleteHostByHostIdRequest request, String userName);

	
	/**
	 * �޸�������Ϣ��������Ҫ�޸ĵ�������ϢHostInfo���������ݿ��н�����Ӧ���޸ģ�
	 * @param request	hostInfo��Ҫ�޸ĵ�������Ϣ����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public ModifyHostInfoResponse ModifyHostInfo(ModifyHostInfoRequest request, String userName);

	
	/**
	 * ����û��������ݿ�user�������һ���û���Ϣ�ļ�¼��
	 * @param request	user��Ҫ��ӵ��û���Ϣ
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	�û����Ѵ���
	 * 3	�����쳣
	 */
	public AddUserResponse AddUser(AddUserRequest request, String userName);

	
	/**
	 * ��Ӷ�Ӧ��Ϣ��������Ķ�Ӧ��ϢOperationInfo������뵽���ݿ�operation���У�
	 * @param request	operationInof������Ҫ��ӵĶ�Ӧ��ϢOperationInfo����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public AddOperationInfoResponse AddOperationInfo(AddOperationInfoRequest request, String userName);

	
	/**
	 * �����ϴ����Դ�������������ϴ�������ļ���ָ����Ŀ¼��
	 * @param request	hostIds����Ҫ�ϴ��ļ�������Id���飩
	 * 					file���ϴ��ļ��Ķ��������飩
	 * 					fileName���ϴ��ļ����ļ�����
	 * 					path(�ϴ��ļ���·����
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return	���ܲ��������Σ��������ϴ������һ����ÿ��������Ӧ���ַ�������
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public BatchUploadFileResponse BatchUploadFile(BatchUploadFileRequest request, String userName);
	/**
	 * ��ȡȫ����־��Ϣ(ȡ��applog�����������)
	 * @param request �޲���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼ 
	 * @return ��������ɹ�����allLogInfo���ﱣ�����е�ϵͳ��־���Ͷ�������
	 * returnCode���壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 3	�����쳣
	 */
	public GetAllLogInfoResponse GetAllLogInfo(GetAllLogInfoRequest request,String userName);


	/**
	 * ��ȡȫ���û���Ϣ��ȡ��user����������ݣ�
	 * @param request �޲���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return ��������ɹ�����allUserInfo���ﱣ�����е��û���Ϣ���Ͷ�������
	 * returnCode�ĺ��壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	δ����
	 * 3	�����쳣
	 */
	public GetAllUserInfoResponse GetAllUserInfo(GetAllUserInfoRequest request, String userName);

	
	/**
	 * ���������������Ҫ��ӵ�������Ϣ��
	 * @param request	hostInfo ��Ҫ��ӵ�������Ϣ
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return
 	 * returnCode�ĺ��壺
 	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 2	����Ip�Ѵ���
	 * 3	�����쳣
	 * 4	�������Ѵ���
	 * 5	�����û��������벻��ȷ
	 */
	public AddHostResponse AddHost(AddHostRequest request, String userName);


	/**
	 * ��ȡȫ��ϵͳ��Ϣ����(ȡ��data_info_type�����������)
	 * @param request �޲���
	 * @param userName	��ǰ��¼���û���������û��Ƿ��¼
	 * @return ��������ɹ�����allStandard���ﱣ�����е�ϵͳ��Ϣ���Ͷ�������
	 * returnCode���壺
	 * 0	��ȷ����
	 * 1	û�е�¼
	 * 3	�����쳣
	 */
	public GetAllDataInfoStandardResponse GetAllDataInfoStandard(GetAllDataInfoStandardRequest request, String userName);

	
	/**
	 * ��������ȡ�������DaoManager���󣬴��ݸ�����Service
	 * @param daoManager DaoManager�������ڹ���Ibatis��Dao����
	 */
	public void setDaoManager(DaoManager daoManager);
}