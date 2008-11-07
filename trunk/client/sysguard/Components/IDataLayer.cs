using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
using sysguard.Components;
namespace sysguard.Components
{

    public interface IDataLayer
    {
        UserInfo User { get; set;}
        IDictionary<long, LogInfo> LogInfoList { get;set;}
        IDictionary<int, UserInfo> UserInfoList { get;set;}
        IDictionary<int, HostInfo> HostInfoList { get;set;}
        IDictionary<string, SystemInfo> SystemInfoList { get;set;}
        IDictionary<int, DataInfoStandard> DataInfoStandardList { get;set;}
        IDictionary<int, GroupInfo> GroupInfoList { get;set;}
        IDictionary<int, OperationInfo> OperationInfoList { get;set;}
        IDictionary<int, OsTypeInfo> OsTypeInfoList { get;set;}
        IDictionary<string, PicInfo> PicInfoMap { get;set;}
        IDictionary<int, RoleInfo> RoleInfoList { get;set;}
        IList<string> ExecuteResultList { get;set; }
        IList<string> UploadResultList { get;set; }
        StateProcessor StateProcessor { set;}
        IConnectionStateManager ConnStateManager { set;get; }

        DataLayerResult Login(string userName, string userPassword);
        DataLayerResult GetAllLogInfo();
        DataLayerResult ModifyLogInfo(LogInfo _logInfo);
        DataLayerResult GetAllUserInfo();
        DataLayerResult ModifyUserInfo(UserInfo _userInfo, string password);
        DataLayerResult AddUser(UserInfo _userInfo);
        DataLayerResult GetAllHostInfo();
        DataLayerResult ModifyHostInfo(HostInfo _hostInfo);
        DataLayerResult DeleteUserByUserId(int _userId);
        DataLayerResult DeleteHostByHostId(int _hostId);
        DataLayerResult AddHost(HostInfo _hostInfo, string _loginName, string _loginPwd);
        DataLayerResult GetAllSystemInfo();
        DataLayerResult GetAllDataInfoStandard();
        DataLayerResult GetAllGroupInfo();
        DataLayerResult AddGroup(GroupInfo _groupInfo);
        DataLayerResult ModifyGroupInf(GroupInfo _groupInfo);
        DataLayerResult DeleteGroupByGroupId(int _groupId);
        DataLayerResult GetAllOperationInfo();
        DataLayerResult ModifyOperationInfo(OperationInfo _operationInfo);
        DataLayerResult AddOperationInfo(OperationInfo _operationInfo);
        DataLayerResult DeleteOperationInfoByOperationId(int _operationId);
        DataLayerResult Logout(string _userName);
        DataLayerResult GetAllOsTypeInfo();
        DataLayerResult ModifyOsTypeInfo(OsTypeInfo _osTypeInfo);
        DataLayerResult AddOsTypeInfo(OsTypeInfo _osTypeInfo);
        DataLayerResult DeleteOsTypeInfoByOsTypeId(int _osTypeId);
        DataLayerResult GetLoadPicByHostIp(string _hostIp);
        DataLayerResult GetOperationById(int operId);
        DataLayerResult GetAllRoleInfo();
        DataLayerResult BatchExecuteCommand(string _command, List<int> hostIdList);
        DataLayerResult BatchUploadFile(byte[] byfile, string _fileName, List<int> hostIdList, string remotePath);
    }


}
