using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.GetAllDataInfoStandardState
{
    class GetAllDataInfoStandardSuccessState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            dataLayer.DataInfoStandardList.Clear();
            GetAllDataInfoStandardResponse res = (GetAllDataInfoStandardResponse)response;
            if (res.allStandard != null)
            {
                DataInfoStandard[] dataInfoStandardArray = res.allStandard;
                for (int i = 0; i < dataInfoStandardArray.Length; i++)
                {
                    dataLayer.DataInfoStandardList.Add(dataInfoStandardArray[i].typeId, dataInfoStandardArray[i]);
                }
            }
            return DataLayerResult.Success;
        }
    }
}
