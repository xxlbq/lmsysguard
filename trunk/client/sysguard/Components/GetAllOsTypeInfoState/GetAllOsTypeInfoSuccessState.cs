using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;

namespace sysguard.Components.GetAllOsTypeInfoState
{
    class GetAllOsTypeInfoSuccessState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response) {
            GetAllOsTypeInfoResponse res = (GetAllOsTypeInfoResponse)response;

            dataLayer.OsTypeInfoList.Clear();
            if (res.allOsType != null)
            {
                OsTypeInfo[] osTypeInfoArray = res.allOsType;
                for (int i = 0; i < osTypeInfoArray.Length; i++)
                {
                    dataLayer.OsTypeInfoList.Add(osTypeInfoArray[i].osId, osTypeInfoArray[i]);
                }
            }
            return DataLayerResult.Success;
        }
    }
}
