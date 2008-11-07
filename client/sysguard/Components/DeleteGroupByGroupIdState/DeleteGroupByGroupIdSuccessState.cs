using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteGroupByGroupIdState
{
    class DeleteGroupByGroupIdSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.Success;
        }
    }
}
