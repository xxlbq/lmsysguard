using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyOsTypeInfoState
{
    class ModifyOsTypeInfoUnKnownFailureState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.UnknownFailure;
        }
    }
}
