using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddHostState
{
    class AddHostSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.Success;
        }
    }
}
