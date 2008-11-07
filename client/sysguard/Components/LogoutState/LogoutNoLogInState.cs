using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.LogoutState
{
    class LogoutNoLogInState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.NoLogin;
        }
    }
}
