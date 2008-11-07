using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddUserState
{
    class AddUserUserNameAlreadyExist:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response) {
            return DataLayerResult.UserNameAlreadyExist;
        }
    }
}
