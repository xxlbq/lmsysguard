using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllRoleInfo
{
    class GetAllRoleInfoUnKnownFailureState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.UnknownFailure;
        }
    }
}
