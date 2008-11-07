using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyGroupInfState
{
    class ModifyGroupInfUnKnownFailureState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.UnknownFailure;
        }
    }
}
