using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;

namespace sysguard.Components.BatchExecuteCommandState
{
    class BatchExecuteCommandSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            BatchExecuteCommandResponse res = (BatchExecuteCommandResponse)response;
            dataLayer.ExecuteResultList.Clear();

            for (int i = 0; i < res.executeResults.Length; i++)
                dataLayer.ExecuteResultList.Add(res.executeResults[i]);

            return DataLayerResult.Success;
        }
    }
}
