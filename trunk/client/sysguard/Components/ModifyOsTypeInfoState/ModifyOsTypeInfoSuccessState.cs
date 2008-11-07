using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyOsTypeInfoState
{
    class ModifyOsTypeInfoSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.Success;
        }
    }
}
