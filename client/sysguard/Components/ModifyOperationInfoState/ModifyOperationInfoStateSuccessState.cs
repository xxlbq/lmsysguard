using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyOperationInfoState
{
    class ModifyOperationInfoStateSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.Success;
        }
    }
}
