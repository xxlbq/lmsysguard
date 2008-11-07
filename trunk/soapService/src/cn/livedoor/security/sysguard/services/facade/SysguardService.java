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
	 * 获取全部主机类型信息（取出数据库os_type表里的所有数据）
	 * @param request	无参数
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return	如果操作成功，在allOsTypeInfo里保存所有的主机类型信息OsTypeInfo对象数组
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public GetAllOsTypeInfoResponse GetAllOsTypeInfo(GetAllOsTypeInfoRequest request, String userName);

	
	/**
	 * 修改主机类型信息(将与修改传入的主机类型对应的数据库记录修改)
	 * @param request	osTypeInfo需要修改的OsTypeInfo对象
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public ModifyOsTypeInfoResponse ModifyOsTypeInfo(ModifyOsTypeInfoRequest request, String userName);

	
	/**
	 * 添加主机类型信息(将传入的主机类型信息添加到数据库os_type表中)
	 * @param request osTypeInfo需要添加的主机信息类型OsTypeInfo对象
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public AddOsTypeInfoResponse AddOsTypeInfo(AddOsTypeInfoRequest request,String userName);

	
	/**
	 * 删除主机类型（从数据库将与传入的主机类型Id对应的数据记录删掉）
	 * @param request	osTypeId需要删除的主机类新信息Id
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义÷
	 * 3	其他异常
	 */
	public DeleteOsTypeInfoByOsTypeIdResponse DeleteOsTypeInfoByOsTypeId(DeleteOsTypeInfoByOsTypeIdRequest request, String userName);

	
	/**
	 * 获取负载图片信息（取出传入的主机IP对应的主机负载天、月和年的图片）
	 * @param request	hostIp需要取数据的主机Ip
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return	如果操作成功，	dayLoadAveragePic 日负载图片byte数组
	 * 						monthLoadAveragePic 月负载图片byte数组
	 * 						yearLoadAveragePic 年负载图片byte数组
	 * 						fileType图片的保存格式
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	图片未找到
	 * 3	其他异常
	 * 4	Io异常
	 */
	public GetLoadPicByHostIpResponse GetLoadPicByHostIp(GetLoadPicByHostIpRequest request, String userName);

	
	/**
	 * 添加组（传进添加的组信息GroupInfo对象，并在数据库中插入该条记录）
	 * @param request	groupInfo需要添加的组信息GroupInfo对象
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	组名已存在
	 * 3	其他异常
	 */
	public AddGroupResponse AddGroup(AddGroupRequest request, String userName);

	
	/**
	 * 删除对应信息（通过传入的对应信息的Id，删除数据库中对应的对应信息记录）
	 * @param request	operationId需要删除的对应信息Id
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public DeleteOperationInfoByOperationIdResponse DeleteOperationInfoByOperationId(DeleteOperationInfoByOperationIdRequest request, String userName);

	/**
	 * @param request
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * returnCode的含义：
	 */
	public GetOperationByIdResponse GetOperationById(GetOperationByIdRequest request, String userName);

	
	/**
	 * 批量执行命令（通过ssh，在传入的对应的所有主机上分别执行传入的命令）
	 * @param request	hostIds（需要执行命令主机Id数组）
	 * 					command（执行的命令）
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return	不管操作结果如何，都返回执行命令结果，一个与每个主机对应的字符串数组		
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	登录主机错误（主机登录名、密码错误）
	 * 3	其他异常
	 */
	public BatchExecuteCommandResponse BatchExecuteCommand(BatchExecuteCommandRequest request, String userName);

	
	/**
	 * 修改对应信息（修改传进的对应信息记录）
	 * @param request	operationInfo保存需要修改的对应信息OperationInfo对象
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public ModifyOperationInfoResponse ModifyOperationInfo(ModifyOperationInfoRequest request, String userName);

	
	/**
	 * 修改用户信息（传进需要修改的用户信息UserInfo对象，修改数据库对应的记录）
	 * @param request	editUser需要修改的UserInfo对象
	 * 					oldPassword验证被修改用户的旧密码
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	密码不匹配
	 * 3	其他异常
	 */
	public ModifyUserInfoResponse ModifyUserInfo(ModifyUserInfoRequest request, String userName);

	/**
	 * 获取全部主机信息（取出数据库host表所对应的全部记录)
	 * @param request	无参数
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return	如果操作成功，在allHostInfo中保存所有的主机信息HostInfo对象数组
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public GetAllHostInfoResponse GetAllHostInfo(GetAllHostInfoRequest request, String userName);

	
	/**
	 * 用户退出系统(删除系统中Session保存的改用户的session）
	 * @param request	userName要退出系统的用户名
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public LogoutResponse Logout(LogoutRequest request, String userName);

	
	/**
	 * 修改日志（传进需要修改的日志信息LogInfo对象，修改数据库对应的记录）
	 * @param request  需要修改日志LogInfo的对象
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 *
	 */
	public ModifyLogInfoResponse ModifyLogInfo(ModifyLogInfoRequest request,String userName);

	/**
	 * 获取所以组信息（取出数据库host_group表中的所有数据）
	 * @param request	无参数
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return	如果操作成功，allGroupInfo包含所有组信息GroupInfo对象数组
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public GetAllGroupInfoResponse GetAllGroupInfo(GetAllGroupInfoRequest request, String userName);

	
	/**
	 * 删除组（传进需要删除的组信息的Id，从数据库中删除对应的组信息）
	 * @param request	groupId 需要删除的组Id
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	组被Host引用，不能删除
	 * 3	其他异常
	 */
	public DeleteGroupByGroupIdResponse DeleteGroupByGroupId(DeleteGroupByGroupIdRequest request, String userName);


	/**
	 * 获取全部系统信息
	 * @param request   无参数
	 * @param userName	当前登录的用户名，检查用户是否登录	当前登录的用户名，检查用户是否登录
	 * @return GetAllSystemInfoResponse 包含returnCode，如果操作成功在allSysInfo里并包含所有系统信息SystemInfo对象数组
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 3	其他异常
	 * 
	 */
	public GetAllSystemInfoResponse GetAllSystemInfo(GetAllSystemInfoRequest request, String userName);

	
	/**
	 * 获取全部对应信息（取出数据库operation表中的所有记录）
	 * @param request
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常

	 */
	public GetAllOperationInfoResponse GetAllOperationInfo(GetAllOperationRequest request, String userName);

	/**
	 * @param request
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * returnCode的含义：
	 */
	public GetAllRoleInfoResponse GetAllRoleInfo(GetAllRoleInfoRequest request, String userName);

	
	/**
	 * 删除用户（传进要被删除的用户的用户Id，从数据库中删除对应的用户记录）
	 * @param request	userId需要删除的用户Id
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public DeleteUserByUserIdResponse DeleteUserByUserId(DeleteUserByUserIdRequest request, String userName);

	/**
	 * 用户登录
	 * 
	 * @param request request 包含 “用户名”和”密码“
	 * @return LoginResponse 包含returnCode，如果登录成功还包含登录用户的用户信息UserInfo对象
	 * returnCode的含义：
	 * 0	登录正确
	 * 1	用户名不存在
	 * 2	密码不匹配
	 * 3	其他错误
	 * 
	 */
	public LoginResponse Login(LoginRequest request);

	
	/**
	 * 修改组信息(传进需要修改的组信息GroupInfo对象，并在数据库中修改对应的记录)
	 * @param request	groupInfo需要修改的组信息GroupInfo对象
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public ModifyGroupInfResponse ModifyGroupInf(ModifyGroupInfRequest request, String userName);

	
	/**
	 * 删除主机（传进需要删除的主机ID，从数据库中删除对应的记录）
	 * @param request 	hostId需要删除的主机Id
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public DeleteHostByHostIdResponse DeleteHostByHostId(DeleteHostByHostIdRequest request, String userName);

	
	/**
	 * 修改主机信息（传进需要修改的主机信息HostInfo对象，在数据库中进行相应的修改）
	 * @param request	hostInfo需要修改的主机信息对象
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public ModifyHostInfoResponse ModifyHostInfo(ModifyHostInfoRequest request, String userName);

	
	/**
	 * 添加用户（在数据库user表中添加一条用户信息的记录）
	 * @param request	user需要添加的用户信息
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	用户名已存在
	 * 3	其他异常
	 */
	public AddUserResponse AddUser(AddUserRequest request, String userName);

	
	/**
	 * 添加对应信息（将传入的对应信息OperationInfo对象插入到数据库operation表中）
	 * @param request	operationInof保存需要添加的对应信息OperationInfo对象
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public AddOperationInfoResponse AddOperationInfo(AddOperationInfoRequest request, String userName);

	
	/**
	 * 批量上传（对传入的所有主机上传传入的文件到指定的目录）
	 * @param request	hostIds（需要上传文件的主机Id数组）
	 * 					file（上传文件的二进制数组）
	 * 					fileName（上传文件的文件名）
	 * 					path(上传文件的路径）
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return	不管操作结果如何，都返回上传结果，一个与每个主机对应的字符串数组
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public BatchUploadFileResponse BatchUploadFile(BatchUploadFileRequest request, String userName);
	/**
	 * 获取全部日志信息(取出applog表的所有数据)
	 * @param request 无参数
	 * @param userName	当前登录的用户名，检查用户是否登录 
	 * @return 如果操作成功，在allLogInfo引里保存所有的系统日志类型对象数组
	 * returnCode含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 3	其他异常
	 */
	public GetAllLogInfoResponse GetAllLogInfo(GetAllLogInfoRequest request,String userName);


	/**
	 * 获取全部用户信息（取出user表的所有数据）
	 * @param request 无参数
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return 如果操作成功，在allUserInfo引里保存所有的用户信息类型对象数组
	 * returnCode的含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 2	未定义
	 * 3	其他异常
	 */
	public GetAllUserInfoResponse GetAllUserInfo(GetAllUserInfoRequest request, String userName);

	
	/**
	 * 添加主机（传进需要添加的主机信息）
	 * @param request	hostInfo 需要添加的主机信息
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return
 	 * returnCode的含义：
 	 * 0	正确返回
	 * 1	没有登录
	 * 2	主机Ip已存在
	 * 3	其他异常
	 * 4	主机名已存在
	 * 5	主机用户名、密码不正确
	 */
	public AddHostResponse AddHost(AddHostRequest request, String userName);


	/**
	 * 获取全部系统信息类型(取出data_info_type表的所有数据)
	 * @param request 无参数
	 * @param userName	当前登录的用户名，检查用户是否登录
	 * @return 如果操作成功，在allStandard引里保存所有的系统信息类型对象数组
	 * returnCode含义：
	 * 0	正确返回
	 * 1	没有登录
	 * 3	其他异常
	 */
	public GetAllDataInfoStandardResponse GetAllDataInfoStandard(GetAllDataInfoStandardRequest request, String userName);

	
	/**
	 * 从容器里取出保存的DaoManager对象，传递给各个Service
	 * @param daoManager DaoManager对象，用于管理Ibatis的Dao对象
	 */
	public void setDaoManager(DaoManager daoManager);
}