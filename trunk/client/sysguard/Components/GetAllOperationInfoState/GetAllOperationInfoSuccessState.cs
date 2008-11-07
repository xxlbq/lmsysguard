using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.GetAllOperationInfoState
{
    class GetAllOperationInfoSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {

            dataLayer.OperationInfoList.Clear();
            GetAllOperationResponse res = (GetAllOperationResponse)response;
            if (res.allOperations != null)
            {
                OperationInfo[] operationInfoArray = res.allOperations;
                for (int i = 0; i < operationInfoArray.Length; i++)
                {
                    dataLayer.OperationInfoList.Add(operationInfoArray[i].operId, operationInfoArray[i]);
                }
            }
            return DataLayerResult.Success;
        }
    }
}
