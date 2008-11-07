using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetLoadPicByHostIpState
{
    class GetLoadPicByHostIpIOExceptionState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.IOException;
        }
    }
}
