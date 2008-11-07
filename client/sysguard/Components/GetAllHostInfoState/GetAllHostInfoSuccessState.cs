using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.GetAllHostInfoState
{
    class GetAllHostInfoSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            GetAllHostInfoResponse res = (GetAllHostInfoResponse)response;
            dataLayer.HostInfoList.Clear();
            if (res.allHostInfo != null)
            {
                HostInfo[] hostInfoArray = res.allHostInfo;
                for (int i = 0; i < hostInfoArray.Length; i++)
                {
                    dataLayer.HostInfoList.Add(hostInfoArray[i].hostId, hostInfoArray[i]);
                }
            }
            return DataLayerResult.Success;
        }
    }
}
