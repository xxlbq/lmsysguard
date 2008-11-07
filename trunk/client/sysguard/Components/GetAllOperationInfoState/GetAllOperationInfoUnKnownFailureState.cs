using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllOperationInfoState
{
    class GetAllOperationInfoUnKnownFailureState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.UnknownFailure;
        }
    }
}
