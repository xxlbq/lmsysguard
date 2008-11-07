using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetLoadPicByHostIpState
{
    class GetLoadPicByHostIpNoLogInState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.NoLogin;
        }
    }
}
