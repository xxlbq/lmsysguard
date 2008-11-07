using System;
using System.Collections.Generic;
using System.Text;

using NUnit.Framework;
using sysguard.Components;
using sysguard.Components.LoginState;
using sysguard.Components.GetAllLogInfoState;
using sysguard.Components.ModifyLogInfoState;
using sysguard.Components.GetAllUserInfoState;
using sysguard.Components.ModifyUserInfoState;
using sysguard.Components.AddUserState;
using sysguard.Components.GetAllHostInfoState;
using sysguard.Components.ModifyHostInfo;
using sysguard.Components.DeleteUserByUserIdState;
using sysguard.Components.DeleteHostByHostIdState;
using sysguard.Components.AddHostState;
using sysguard.Components.GetAllSystemInfoState;
using sysguard.Components.GetAllDataInfoStandardState;
using sysguard.Components.GetAllGroupInfoStates;
using sysguard.Components.AddGroupState;
using sysguard.Components.ModifyGroupInfState;
using sysguard.Components.DeleteGroupByGroupIdState;
using sysguard.Components.GetAllOperationInfoState;
using sysguard.Components.ModifyOperationInfoState;
using sysguard.Components.AddOperationInfoState;
using sysguard.Components.DeleteOperationInfoByOperationIdState;
using sysguard.Components.LogoutState;
using sysguard.Components.GetAllOsTypeInfoState;
using sysguard.Components.ModifyOsTypeInfoState;
using sysguard.Components.AddOsTypeInfoState;
using sysguard.Components.DeleteOsTypeInfoByOsTypeIdState;
using sysguard.Components.GetLoadPicByHostIpState;
using System.IO;
using sysguard.SysguardWS;

using System.Drawing;
using Spring.Context;
using Spring.Context.Support;

namespace sysguard.Test
{
    [TestFixture]
    public class TestDataLayer
    {
        private IDataLayer dataLayer = null;

        [SetUp]
        protected void SetUp()
        {
            IApplicationContext ctx = ContextRegistry.GetContext();

            dataLayer = (IDataLayer)ctx.GetObject("m_dataLayer");
            sysguard.Properties.Settings.Default.Context.Add("conn", ConnState.None);
        }
        [Test]
        public void login()
        {
            DataLayerResult result = dataLayer.Login("info", "livedoor");
            Assert.AreEqual(result, DataLayerResult.Success);
            UserInfo info = dataLayer.User;

        }
        [Test]
        public void getAllLogInfo()
        {
            login();
            DataLayerResult resultLogInfo = dataLayer.GetAllLogInfo();
            Assert.AreEqual(resultLogInfo, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.LogInfoList.Count, 0);
            logou();

        }

        [Test]
        public void modifyLogInfo()
        {
            login();
            DataLayerResult resultLogInfo = dataLayer.GetAllLogInfo();
            Assert.AreEqual(resultLogInfo, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.LogInfoList.Count, 0);
            int key = 0;
            foreach (int k in dataLayer.LogInfoList.Keys)
            {
                key = k;
                break;
            }

            LogInfo loginfo = dataLayer.LogInfoList[key];
            loginfo.level = "DEBUG";

            DataLayerResult resultModifyLoginfo = dataLayer.ModifyLogInfo(loginfo);
            Assert.AreEqual(resultModifyLoginfo, DataLayerResult.Success);
            logou();

        }

        [Test]
        public void getAllUserInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllUserInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.UserInfoList.Count, 0);

            logou();

        }

        [Test]
        public void modifyUserInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllUserInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.UserInfoList.Count, 0);
            int userid = 0;
            foreach (int k in dataLayer.UserInfoList.Keys)
            {
                userid = k;
                break;
            }
            UserInfo userInfo = dataLayer.UserInfoList[userid];
            userInfo.name = "aaa";
            DataLayerResult modifyResult = dataLayer.ModifyUserInfo(userInfo, "livedoor");
            Assert.AreEqual(modifyResult, DataLayerResult.Success);
            logou();
        }

        [Test]
        public void addUser()
        {
            login();
            UserInfo user = new UserInfo();
            user.description = "test";
            user.inputTime = DateTime.Today;
            //user.inputTimeSpecified = true;
            user.lastLoginTime = DateTime.Today;
            //user.lastLoginTimeSpecified = true;
            user.mail = "test@livedoor.cn";
            user.msn = "test@hotmail.com";
            user.name = "test";
            user.online = 1;
            user.passwd = "test";
            user.realName = "test";
            user.roleId = 1;
            user.skype = "livedoor";
            user.updateTime = DateTime.Today;
            user.validate = 0;

            DataLayerResult result = dataLayer.AddUser(user);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();

        }

        [Test]
        public void getAllHostInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllHostInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.HostInfoList.Count, 0);
            logou();
        }

        [Test]
        public void modifyHostInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllHostInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.HostInfoList.Count, 0);

            int hostid = 0;
            foreach (int k in dataLayer.HostInfoList.Keys)
            {
                hostid = k;
                break;
            }
            HostInfo info = dataLayer.HostInfoList[hostid];
            info.hostName = "host_test";

            DataLayerResult modifyResult = dataLayer.ModifyHostInfo(info);
            Assert.AreEqual(modifyResult, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void deleteUserByUserId()
        {
            login();
            DataLayerResult result = dataLayer.DeleteUserByUserId(2);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void deleteHostByHostId()
        {
            login();
            DataLayerResult result = dataLayer.DeleteHostByHostId(2);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void addHost()
        {
            login();
            HostInfo host = new HostInfo();
            host.description = "hosttest";
            host.diskpartition = "test";
            host.groupId = 1;
            host.hostName = "testhost";
            host.inputTime = DateTime.Today;
            //host.rrdStatus = 0;
            host.updateTime = DateTime.Today;
            //host.uptime = 1;
            host.validate = 0;
            DataLayerResult result = dataLayer.AddHost(host, "root", "avagdsgsgs");
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void getAllSysteInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllSystemInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.SystemInfoList.Count, 0);
            logou();
        }

        [Test]
        public void getAllDataInfoStandard()
        {
            login();
            DataLayerResult result = dataLayer.GetAllDataInfoStandard();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.DataInfoStandardList.Count, 0);
            logou();
        }
        [Test]
        public void getAllGroupInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllGroupInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.GroupInfoList.Count, 0);
            logou();
        }
        [Test]
        public void addGroup()
        {
            login();
            GroupInfo info = new GroupInfo();
            info.description = "group";
            info.groupName = "testgroup";
            info.inputTime = DateTime.Today;
            //info.osType = "test";

            DataLayerResult result = dataLayer.AddGroup(info);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void modifyGroupInf()
        {
            login();
            DataLayerResult result = dataLayer.GetAllGroupInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.GroupInfoList.Count, 0);
            int groupid = 0;
            foreach (int k in dataLayer.GroupInfoList.Keys)
            {
                groupid = k;
            }
            GroupInfo info = dataLayer.GroupInfoList[groupid];
            info.groupName = "aaaa";
            DataLayerResult modifyResult = dataLayer.ModifyGroupInf(info);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void deleteGroupByGroupId()
        {
            login();
            DataLayerResult result = dataLayer.DeleteGroupByGroupId(2);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void getAllOperationInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllOperationInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.OperationInfoList.Count, 0);

            logou();
        }

        [Test]
        public void modifyOperationInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllOperationInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.OperationInfoList.Count, 0);
            int operid = 0;
            foreach (int k in dataLayer.OperationInfoList.Keys)
            {
                operid = k;
            }
            OperationInfo info = dataLayer.OperationInfoList[operid];
            //info.operationDesc = "test";
            DataLayerResult modifyResult = dataLayer.ModifyOperationInfo(info);
            Assert.AreEqual(modifyResult, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void addOperationInfo()
        {
            login();
            OperationInfo info = new OperationInfo();
            //info.dealPattern = "test";
            //info.dealStatus = "2";
            //info.dealStep = "test";
            //info.inputTime = DateTime.Today;
            //info.operationDesc = "test";
            //info.operType = "aa";
            //info.opserId = 1;
            //info.userId = 22;
            DataLayerResult result = dataLayer.AddOperationInfo(info);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void deleteOperationInfoByOperationId()
        {
            login();
            DataLayerResult result = dataLayer.DeleteOperationInfoByOperationId(2);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void logou()
        {
            DataLayerResult result = dataLayer.Logout("info");
            Assert.AreEqual(result, DataLayerResult.Success);
        }
        [Test]
        public void getAllOsTypeInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllOsTypeInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.OsTypeInfoList.Count, 0);
            logou();
        }
        [Test]
        public void modifyOsTypeInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllOsTypeInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(dataLayer.OsTypeInfoList.Count, 0);
            int osId = 0;
            foreach (int k in dataLayer.OsTypeInfoList.Keys)
            {
                osId = k;
            }
            OsTypeInfo info = dataLayer.OsTypeInfoList[osId];
            info.description = "testaaa";
            DataLayerResult modifyResult = dataLayer.ModifyOsTypeInfo(info);
            Assert.AreEqual(modifyResult, DataLayerResult.Success);
            logou();

        }
        [Test]
        public void addOsTypeInfo()
        {
            login();
            OsTypeInfo info = new OsTypeInfo();
            info.description = "test";
            info.inputTime = DateTime.Today;
            info.osId = 1;
            info.osName = "test";
            DataLayerResult result = dataLayer.AddOsTypeInfo(info);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void deleteOsTypeInfoByOsTypeId()
        {
            login();
            DataLayerResult result = dataLayer.DeleteOsTypeInfoByOsTypeId(2);
            Assert.AreEqual(result, DataLayerResult.Success);
            logou();
        }
        [Test]
        public void getLoadPicByHostIp()
        {
            login();
            DataLayerResult result = dataLayer.GetLoadPicByHostIp("127.0.0.1");
            Assert.AreEqual(result, DataLayerResult.Success);
            PicInfo info = dataLayer.PicInfoMap["127.0.0.1"];
            Assert.IsNotNull(info);
            Assert.IsNotNull(info.DayLoadAveragePic);
            Assert.IsNotNull(info.MonthLoadAveragePic);
            Assert.IsNotNull(info.YearLoadAveragePic);
            Assert.AreEqual(info.HostIp, "127.0.0.1");
            string dayFileName = @"D:\dayfile" + "." + info.FileType;
            string monthFileName = @"D:\monthfile" + "." + info.FileType;
            string yearFileName = @"D:\yearfile" + "." + info.FileType;

            Image dayImage = info.getDayLoadAverageImage();
            dayImage.Save(dayFileName);

            Image monthImage = info.getMonthLoadAverageImage();
            monthImage.Save(monthFileName);

            Image yearImage = info.getYearLoadAverageImage();
            yearImage.Save(yearFileName);

            logou();
        }
        [Test]
        public void GetOperationById()
        {
            login();
            DataLayerResult result = dataLayer.GetOperationById(0);
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreEqual(true, dataLayer.OperationInfoList.ContainsKey(0));
            logou();
        }

        [Test]
        public void GetAllRoleInfo()
        {
            login();
            DataLayerResult result = dataLayer.GetAllRoleInfo();
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(0, dataLayer.RoleInfoList.Count);
            logou();
        }

        [Test]
        public void BatchExecuteCommand()
        {
            login();
            List<int> hostIdList = new List<int>();
            hostIdList.Add(38);
            DataLayerResult result = dataLayer.BatchExecuteCommand("cd /home", hostIdList);
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(0, dataLayer.ExecuteResultList.Count);
            logou();
        }

        [Test]
        public void BatchUploadFile()
        {
            login();
            byte[] byfile = File.ReadAllBytes(@"D:\logs\data.txt");
            string fileName = "data.txt";
            List<int> hostIdList = new List<int>();
            hostIdList.Add(38);
            string removePath = "/home";

            DataLayerResult result = dataLayer.BatchUploadFile(byfile, fileName, hostIdList, removePath);
            Assert.AreEqual(result, DataLayerResult.Success);
            Assert.AreNotEqual(0, dataLayer.UploadResultList.Count);
            logou();
        }
    }
}
