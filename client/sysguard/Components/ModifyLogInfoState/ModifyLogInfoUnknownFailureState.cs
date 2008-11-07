using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyLogInfoState
{
    class ModifyLogInfoUnknownFailureState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response) {
            return DataLayerResult.UnknownFailure;
        }
    }
}
