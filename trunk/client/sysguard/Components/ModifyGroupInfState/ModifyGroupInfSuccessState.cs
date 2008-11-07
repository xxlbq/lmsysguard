using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyGroupInfState
{
    class ModifyGroupInfSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.Success;
        }
    }
}
