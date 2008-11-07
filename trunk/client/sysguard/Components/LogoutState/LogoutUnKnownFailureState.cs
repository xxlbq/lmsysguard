using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.LogoutState
{
    class LogoutUnKnownFailureState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.UnknownFailure;
        }
    }
}
