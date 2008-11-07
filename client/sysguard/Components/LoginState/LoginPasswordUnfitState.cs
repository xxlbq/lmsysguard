using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;

namespace sysguard.Components.LoginState
{
    class LoginPasswordUnfitState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response){
            return DataLayerResult.LoginPasswordUnfit;
        }
    }
}
