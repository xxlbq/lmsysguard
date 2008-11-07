using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.GetAllUserInfoState
{
    class GetAllUserInfoSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            GetAllUserInfoResponse res = (GetAllUserInfoResponse)response;
            dataLayer.UserInfoList.Clear();
            if (res.allUserInfo != null)
            {
                UserInfo[] userInfoArray = res.allUserInfo;
                for (int i = 0; i < userInfoArray.Length; i++)
                    dataLayer.UserInfoList.Add(userInfoArray[i].userId, userInfoArray[i]);
            }
            return DataLayerResult.Success;
        }
    }
}
