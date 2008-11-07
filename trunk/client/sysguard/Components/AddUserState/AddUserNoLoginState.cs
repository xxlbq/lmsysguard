using System;
using System.Collections.Generic;
using System.Text;
using sysguard.x;
using sysguard.Properties;
namespace sysguard.Components.AddUserState
{
    class AddUserNoLoginState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
           
            return DataLayerResult.NoLogin;
        }
    }
}
