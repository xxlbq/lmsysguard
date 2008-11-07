using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;

namespace sysguard.Components.GetOperationById
{
    class GetOperationByIdSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {

            GetOperationByIdResponse res = (GetOperationByIdResponse)response;
            if (res.operationInfo != null)
                dataLayer.OperationInfoList.Add(res.operationInfo.operId, res.operationInfo);
            return DataLayerResult.Success;
        }
    }
}
