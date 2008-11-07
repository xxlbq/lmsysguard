using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllOsTypeInfoState
{
    class GetAllOsTypeInfoNoLogInState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.NoLogin;
        }
    }
}
