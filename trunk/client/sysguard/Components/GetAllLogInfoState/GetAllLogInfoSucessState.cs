using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.GetAllLogInfoState
{
    class GetAllLogInfoSucessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            GetAllLogInfoResponse res = (GetAllLogInfoResponse)response;
            dataLayer.LogInfoList.Clear();
            if (res.allLogInfo != null)
            {
                LogInfo[] logInfoArray = res.allLogInfo;
                for (int i = 0; i < logInfoArray.Length; i++)
                    dataLayer.LogInfoList.Add(logInfoArray[i].applogId, logInfoArray[i]);
            }
            return DataLayerResult.Success;
        }
    }
}
