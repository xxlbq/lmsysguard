using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteOperationInfoByOperationIdState
{
    class DeleteOperationInfoByOperationIdStateUnKnownFailureState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.UnknownFailure;
        }
    }
}
