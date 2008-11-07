using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
using System.Net;
using System.Web.Services.Protocols;

namespace sysguard.Components
{
    public enum DataLayerResult
    {
        None = 0,
        Success = 1,
        ServiceFailure = 2,
        UnknownFailure = 3,
        ConnectionFailure = 4,
        AuthenticationFailure = 5,
        LoginUserNameUnknown = 6,
        LoginPasswordUnfit = 7,
        NoLogin = 8,
        UserNameAlreadyExist = 9,
        PicNotFount = 10,
        IOException = 11,
        HostIPAlreadyExist = 12,
        HostNameAlreadyExist = 13,
        HostUserNameOrPwdError = 14,
        GroupNameAlreadyExist = 15,
        OldPasswdError = 16,
        GroupISRefNoDelete = 17,
        LoginHostError = 18,
    }


    public class DataLayer : IDataLayer
    {
        private IServiceProfferer<SysguardWS.sysguard> serviceProfferer = new ServiceProfferer<SysguardWS.sysguard>();
        private SysguardWS.sysguard m_WsSysguard = null;
        private readonly int c_wsTimeout = 30000;//30 seconds
        private UserInfo currentUser = new UserInfo();
        private IDictionary<long, LogInfo> logInfoList = new Dictionary<long, LogInfo>();
        private IDictionary<int, UserInfo> userInfoList = new Dictionary<int, UserInfo>();
        private IDictionary<int, HostInfo> hostInfoList = new Dictionary<int, HostInfo>();
        private IDictionary<string, SystemInfo> systemInfoList = new Dictionary<string, SystemInfo>();
        private IDictionary<int, DataInfoStandard> dataInfoStandardList = new Dictionary<int, DataInfoStandard>();
        private IDictionary<int, GroupInfo> groupInfoList = new Dictionary<int, GroupInfo>();
        private IDictionary<int, OperationInfo> operationInfoList = new Dictionary<int, OperationInfo>();
        private IDictionary<int, OsTypeInfo> osTypeInfoList = new Dictionary<int, OsTypeInfo>();
        private IDictionary<string, PicInfo> picInfoMap = new Dictionary<string, PicInfo>();
        private IDictionary<int, RoleInfo> roleInfoList = new Dictionary<int, RoleInfo>();
        private IList<string> executeResultList = new List<string>();
        private IList<string> uploadResultList = new List<string>();

        private StateProcessor stateProcessor = null;
        private IConnectionStateManager connStateManager;

        public IConnectionStateManager ConnStateManager
        {
            set
            {
                connStateManager = value;
            }
            get
            {
                return connStateManager;
            }
        }
        public StateProcessor StateProcessor
        {
            set
            {
                stateProcessor = value;
            }
        }
        public UserInfo User
        {
            get
            {
                return currentUser;
            }
            set
            {
                currentUser = value;
            }
        }

        public IDictionary<long, LogInfo> LogInfoList
        {
            get
            {
                return logInfoList;
            }
            set
            {
                logInfoList = value;
            }
        }

        public IDictionary<int, UserInfo> UserInfoList
        {
            get
            {
                return userInfoList;
            }
            set
            {
                userInfoList = value;
            }
        }

        public IDictionary<int, HostInfo> HostInfoList
        {
            get
            {
                return hostInfoList;
            }
            set
            {
                hostInfoList = value;
            }
        }

        public IDictionary<string, SystemInfo> SystemInfoList
        {
            get
            {
                return systemInfoList;
            }
            set
            {
                systemInfoList = value;
            }
        }

        public IDictionary<int, DataInfoStandard> DataInfoStandardList
        {
            get
            {
                return dataInfoStandardList;
            }
            set
            {
                dataInfoStandardList = value;
            }
        }

        public IDictionary<int, GroupInfo> GroupInfoList
        {
            get
            {
                return groupInfoList;
            }
            set
            {
                groupInfoList = value;
            }
        }

        public IDictionary<int, OperationInfo> OperationInfoList
        {
            get
            {
                return operationInfoList;
            }
            set
            {
                operationInfoList = value;
            }
        }
        public IDictionary<int, OsTypeInfo> OsTypeInfoList
        {
            get
            {
                return osTypeInfoList;
            }
            set
            {
                osTypeInfoList = value;
            }
        }

        public IDictionary<string, PicInfo> PicInfoMap
        {
            get
            {
                return picInfoMap;
            }
            set
            {
                picInfoMap = value;
            }
        }

        public IDictionary<int, RoleInfo> RoleInfoList
        {
            get
            {
                return roleInfoList;
            }
            set
            {
                roleInfoList = value;
            }
        }

        public IList<string> ExecuteResultList
        {
            get
            {
                return executeResultList;
            }
            set
            {
                executeResultList = value;
            }
        }

        public IList<string> UploadResultList
        {
            get
            {
                return uploadResultList;
            }
            set
            {
                uploadResultList = value;
            }
        }

        public DataLayer()
        {
            currentUser.userId = -1;
            currentUser.mail = string.Empty;
            currentUser.msn = string.Empty;
            currentUser.name = string.Empty;
            currentUser.description = string.Empty;
            currentUser.online = -1;
            currentUser.realName = string.Empty;
            currentUser.roleId = -1;
            currentUser.skype = string.Empty;
            currentUser.updateTime = DateTime.Now;
            currentUser.inputTime = DateTime.Now;
            currentUser.lastLoginTime = DateTime.Now;
            currentUser.validate = -1;

            m_WsSysguard = serviceProfferer.service();
            m_WsSysguard.Timeout = c_wsTimeout;
        }

        #region Login
        public DataLayerResult Login(string userName, string userPassword)
        {

            currentUser.name = userName;
            LoginRequest req = new LoginRequest();
            req.username = userName;
            req.password = userPassword;
            LoginResponse res = null;
            try
            {
                res = m_WsSysguard.Login(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<LoginResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }





        }
        #endregion

        #region GetAllLogInfo
        public DataLayerResult GetAllLogInfo()
        {

            GetAllLogInfoRequest req = new GetAllLogInfoRequest();
            GetAllLogInfoResponse res = null;
            try
            {
                res = m_WsSysguard.GetAllLogInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllLogInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }


        }
        #endregion

        #region ModifyLogInfo
        public DataLayerResult ModifyLogInfo(LogInfo _logInfo)
        {
            ModifyLogInfoRequest req = new ModifyLogInfoRequest();
            req.logInfo = _logInfo;
            ModifyLogInfoResponse res = null;
            try
            {
                res = m_WsSysguard.ModifyLogInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<ModifyLogInfoResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetAllUserInfo
        public DataLayerResult GetAllUserInfo()
        {
            GetAllUserInfoRequest req = new GetAllUserInfoRequest();
            GetAllUserInfoResponse res = null;
            try
            {
                res = m_WsSysguard.GetAllUserInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllUserInfoResponse>(this, res);
            }
            catch (Exception ex)
            {
                return HandleException(ex);

            }

        }
        #endregion

        #region ModifyUserInfo
        public DataLayerResult ModifyUserInfo(UserInfo _userInfo, string password)
        {
            ModifyUserInfoRequest req = new ModifyUserInfoRequest();
            req.editUser = _userInfo;
            req.oldPassword = password;

            ModifyUserInfoResponse res = null;
            try
            {
                res = m_WsSysguard.ModifyUserInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<ModifyUserInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region AddUser
        public DataLayerResult AddUser(UserInfo _userInfo)
        {
            AddUserRequest req = new AddUserRequest();
            req.user = _userInfo;
            AddUserResponse res = null;

            try
            {
                res = m_WsSysguard.AddUser(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<AddUserResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetAllHostInfo
        public DataLayerResult GetAllHostInfo()
        {
            GetAllHostInfoRequest req = new GetAllHostInfoRequest();
            GetAllHostInfoResponse res = null;
            try
            {
                res = m_WsSysguard.GetAllHostInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllHostInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region ModifyHostInfo
        public DataLayerResult ModifyHostInfo(HostInfo _hostInfo)
        {
            ModifyHostInfoRequest req = new ModifyHostInfoRequest();
            req.hostInfo = _hostInfo;
            ModifyHostInfoResponse res = null;

            try
            {
                res = m_WsSysguard.ModifyHostInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<ModifyHostInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region DeleteUserByUserId
        public DataLayerResult DeleteUserByUserId(int _userId)
        {
            DeleteUserByUserIdRequest req = new DeleteUserByUserIdRequest();
            req.userId = _userId;
            DeleteUserByUserIdResponse res = null;
            try
            {
                res = m_WsSysguard.DeleteUserByUserId(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<DeleteUserByUserIdResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region DeleteHostByHostId
        public DataLayerResult DeleteHostByHostId(int _hostId)
        {
            DeleteHostByHostIdRequest req = new DeleteHostByHostIdRequest();
            req.hostId = _hostId;
            DeleteHostByHostIdResponse res = null;
            try
            {
                res = m_WsSysguard.DeleteHostByHostId(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<DeleteHostByHostIdResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region AddHost
        public DataLayerResult AddHost(HostInfo _hostInfo, string _loginName, string _loginPwd)
        {
            AddHostRequest req = new AddHostRequest();
            req.loginName = _loginName;
            req.loginPwd = _loginPwd;
            req.hostInfo = _hostInfo;
            AddHostResponse res = null;
            try
            {
                res = m_WsSysguard.AddHost(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<AddHostResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetAllSystemInfo
        public DataLayerResult GetAllSystemInfo()
        {
            GetAllSystemInfoRequest req = new GetAllSystemInfoRequest();
            GetAllSystemInfoResponse res = null;
            try
            {
                res = m_WsSysguard.GetAllSystemInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllSystemInfoResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetAllDataInfoStandard
        public DataLayerResult GetAllDataInfoStandard()
        {
            GetAllDataInfoStandardRequest req = new GetAllDataInfoStandardRequest();
            GetAllDataInfoStandardResponse res = null;
            try
            {
                res = m_WsSysguard.GetAllDataInfoStandard(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllDataInfoStandardResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetAllGroupInfo
        public DataLayerResult GetAllGroupInfo()
        {
            GetAllGroupInfoRequest req = new GetAllGroupInfoRequest();
            GetAllGroupInfoResponse res = null;
            try
            {
                res = m_WsSysguard.GetAllGroupInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllGroupInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region AddGroup
        public DataLayerResult AddGroup(GroupInfo _groupInfo)
        {
            AddGroupRequest req = new AddGroupRequest();
            req.groupInf = _groupInfo;
            AddGroupResponse res = null;
            try
            {
                res = m_WsSysguard.AddGroup(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<AddGroupResponse>(this, res);

            }
            catch (Exception ex)
            {
                return HandleException(ex);
            }

        }
        #endregion

        #region ModifyGroupInf
        public DataLayerResult ModifyGroupInf(GroupInfo _groupInfo)
        {
            ModifyGroupInfRequest req = new ModifyGroupInfRequest();
            req.groupInfo = _groupInfo;
            ModifyGroupInfResponse res = null;
            try
            {
                res = m_WsSysguard.ModifyGroupInf(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<ModifyGroupInfResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region DeleteGroupByGroupId
        public DataLayerResult DeleteGroupByGroupId(int _groupId)
        {
            DeleteGroupByGroupIdRequest req = new DeleteGroupByGroupIdRequest();
            req.groupId = _groupId;
            DeleteGroupByGroupIdResponse res = null;
            try
            {
                res = m_WsSysguard.DeleteGroupByGroupId(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<DeleteGroupByGroupIdResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetAllOperationInfo
        public DataLayerResult GetAllOperationInfo()
        {
            GetAllOperationRequest req = new GetAllOperationRequest();
            GetAllOperationResponse res = null;
            try
            {
                res = m_WsSysguard.GetAllOperation(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllOperationResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region ModifyOperationInfo
        public DataLayerResult ModifyOperationInfo(OperationInfo _operationInfo)
        {
            ModifyOperationInfoRequest req = new ModifyOperationInfoRequest();
            req.operationInfo = _operationInfo;
            ModifyOperationInfoResponse res = null;
            try
            {
                res = m_WsSysguard.ModifyOperationInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<ModifyOperationInfoResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }
        }
        #endregion

        #region AddOperationInfo
        public DataLayerResult AddOperationInfo(OperationInfo _operationInfo)
        {
            AddOperationInfoRequest req = new AddOperationInfoRequest();
            req.operationInfo = _operationInfo;
            AddOperationInfoResponse res = null;
            try
            {
                res = m_WsSysguard.AddOperationInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<AddOperationInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region DeleteOperationInfoByOperationId
        public DataLayerResult DeleteOperationInfoByOperationId(int _operationId)
        {
            DeleteOperationInfoByOperationIdRequest req = new DeleteOperationInfoByOperationIdRequest();
            req.operationId = _operationId;
            DeleteOperationInfoByOperationIdResponse res = null;
            try
            {
                res = m_WsSysguard.DeleteOperationInfoByOperationId(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<DeleteOperationInfoByOperationIdResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region Logout
        public DataLayerResult Logout(string _userName)
        {
            LogoutRequest req = new LogoutRequest();
            req.userName = _userName;
            LogoutResponse res = null;
            try
            {
                res = m_WsSysguard.Logout(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<LogoutResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetAllOsTypeInfo
        public DataLayerResult GetAllOsTypeInfo()
        {
            GetAllOsTypeInfoRequest req = new GetAllOsTypeInfoRequest();
            GetAllOsTypeInfoResponse res = null;
            try
            {
                res = m_WsSysguard.GetAllOsTypeInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllOsTypeInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region ModifyOsTypeInfo
        public DataLayerResult ModifyOsTypeInfo(OsTypeInfo _osTypeInfo)
        {
            ModifyOsTypeInfoRequest req = new ModifyOsTypeInfoRequest();
            req.osType = _osTypeInfo;
            ModifyOsTypeInfoResponse res = null;
            try
            {
                res = m_WsSysguard.ModifyOsTypeInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<ModifyOsTypeInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region AddOsTypeInfo
        public DataLayerResult AddOsTypeInfo(OsTypeInfo _osTypeInfo)
        {
            AddOsTypeInfoRequest req = new AddOsTypeInfoRequest();
            req.osType = _osTypeInfo;
            AddOsTypeInfoResponse res = null;
            try
            {
                res = m_WsSysguard.AddOsTypeInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<AddOsTypeInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region DeleteOsTypeInfoByOsTypeId
        public DataLayerResult DeleteOsTypeInfoByOsTypeId(int _osTypeId)
        {
            DeleteOsTypeInfoByOsTypeIdRequest req = new DeleteOsTypeInfoByOsTypeIdRequest();
            req.osTypeId = _osTypeId;
            DeleteOsTypeInfoByOsTypeIdResponse res = null;
            try
            {
                res = m_WsSysguard.DeleteOsTypeInfoByOsTypeId(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<DeleteOsTypeInfoByOsTypeIdResponse>(this, res);

            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetLoadPicByHostIp
        public DataLayerResult GetLoadPicByHostIp(string _hostIp)
        {
            GetLoadPicByHostIpRequest req = new GetLoadPicByHostIpRequest();
            req.hostIp = _hostIp;

            GetLoadPicByHostIpResponse res = null;
            try
            {
                res = m_WsSysguard.GetLoadPicByHostIp(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetLoadPicByHostIpResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region GetOperationById
        public DataLayerResult GetOperationById(int operId)
        {
            if (this.operationInfoList.ContainsKey(operId))
            {
                return DataLayerResult.Success;
            }

            GetOperationByIdRequest req = new GetOperationByIdRequest();
            req.operId = operId;
            GetOperationByIdResponse res = null;
            try
            {
                res = m_WsSysguard.GetOperationById(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetOperationByIdResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }
        }
        #endregion

        #region GetAllRoleInfo
        public DataLayerResult GetAllRoleInfo()
        {
            GetAllRoleInfoRequest req = new GetAllRoleInfoRequest();
            GetAllRoleInfoResponse res = null;

            try
            {
                res = m_WsSysguard.GetAllRoleInfo(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<GetAllRoleInfoResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }

        }
        #endregion

        #region BatchExecuteCommand
        public DataLayerResult BatchExecuteCommand(string _command, List<int> hostIdList)
        {
            BatchExecuteCommandRequest req = new BatchExecuteCommandRequest();
            req.command = _command;
            req.hostIds = hostIdList.ToArray();

            BatchExecuteCommandResponse res = null;

            try
            {
                res = m_WsSysguard.BatchExecuteCommand(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<BatchExecuteCommandResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }
        }
        #endregion

        #region BatchUploadFile
        public DataLayerResult BatchUploadFile(byte[] byfile, string _fileName, List<int> hostIdList, string remotePath)
        {
            BatchUploadFileRequest req = new BatchUploadFileRequest();
            req.file = byfile;
            req.fileName = _fileName;
            req.hostIds = hostIdList.ToArray();
            req.path = remotePath;

            BatchUploadFileResponse res = null;

            try
            {
                res = m_WsSysguard.BatchUploadFile(req);
                connStateManager.Connection();
                return stateProcessor.MakeDataLayerResult<BatchUploadFileResponse>(this, res);
            }
            catch (Exception ex)
            {

                return HandleException(ex);
            }
        }
        #endregion

        #region Helper Functions
        private DataLayerResult HandleException(Exception ex)
        {
            LogError.Write(ex.Message + System.Environment.NewLine + ex.StackTrace);
            connStateManager.ConnectionFail();
            if (ex is WebException)
                return DataLayerResult.ConnectionFailure;
            else if (ex is SoapException)
                return DataLayerResult.ServiceFailure;
            else
                return DataLayerResult.UnknownFailure;
        }
        #endregion



    }
}
