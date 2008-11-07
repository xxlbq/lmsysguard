using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddOsTypeInfoState
{
    class AddOsTypeInfoNoLogInState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.NoLogin;
        }
    }
}
