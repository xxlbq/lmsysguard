using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllHostInfoState
{
    class GetAllHostInfoNoLogInState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.NoLogin;
        }
    }
}
