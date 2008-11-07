using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddOsTypeInfoState
{
    class AddOsTypeInfoUnKnownFailureState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.UnknownFailure;
        }
    }
}
