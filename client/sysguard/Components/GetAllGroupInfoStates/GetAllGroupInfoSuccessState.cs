using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.GetAllGroupInfoStates
{
    class GetAllGroupInfoSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            dataLayer.GroupInfoList.Clear();
            GetAllGroupInfoResponse res = (GetAllGroupInfoResponse)response;
            if (res.allGroupInfo != null)
            {
                GroupInfo[] groupInfoArray = res.allGroupInfo;
                for (int i = 0; i < groupInfoArray.Length; i++)
                {
                    dataLayer.GroupInfoList.Add(groupInfoArray[i].groupId, groupInfoArray[i]);
                }
            }
            return DataLayerResult.Success;
        }
    }
}
