using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteHostByHostIdState
{
    class DeleteHostByHostIdNoLogInState : IState
    {

        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.NoLogin;
        }

    }
}
