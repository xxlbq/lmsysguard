using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddHostState
{
    class AddHostHostUserNameOrPwdErrorState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.HostUserNameOrPwdError;
        }
    }
}
