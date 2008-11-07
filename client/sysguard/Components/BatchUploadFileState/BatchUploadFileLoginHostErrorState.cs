using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.BatchUploadFileState
{
    class BatchUploadFileLoginHostErrorState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.LoginHostError;
        }
    }
}
