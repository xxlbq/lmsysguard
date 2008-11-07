using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;

namespace sysguard.Components.GetAllSystemInfoState
{
    class GetAllSystemInfoSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            dataLayer.SystemInfoList.Clear();
            GetAllSystemInfoResponse res = (GetAllSystemInfoResponse)response;
            if (res.allSysInfo != null)
            {
                SystemInfo[] systemInfoArray = res.allSysInfo;
                for (int i = 0; i < systemInfoArray.Length; i++)
                {
                    dataLayer.SystemInfoList.Add(systemInfoArray[i].hostIp, systemInfoArray[i]);
                }
            }
            return DataLayerResult.Success;
        }
    }
}
