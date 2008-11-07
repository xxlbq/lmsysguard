using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.LoginState
{
    class LoginSucessState:IState 
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response) 
        {
            LoginResponse res = (LoginResponse)response;
            dataLayer.User = res.userInfo;
            return DataLayerResult.Success;
        }
    }
}
