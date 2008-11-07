using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.BatchUploadFileState
{
    class BatchUploadFileNoLoginState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            return DataLayerResult.NoLogin;
        }
    }
}
