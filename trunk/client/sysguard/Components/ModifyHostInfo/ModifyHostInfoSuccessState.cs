using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyHostInfo
{
    class ModifyHostInfoSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.Success;
        }
    }
}
