using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteOsTypeInfoByOsTypeIdState
{
    class DeleteOsTypeInfoByOsTypeIdUnKnownFailureState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.UnknownFailure;
        }
    }
}
