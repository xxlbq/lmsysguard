using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;

namespace sysguard.Components.BatchUploadFileState
{
    class BatchUploadFileSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            BatchUploadFileResponse res = (BatchUploadFileResponse)response;
            dataLayer.UploadResultList.Clear();
            for (int i = 0; i < res.uploadResults.Length; i++)
            {
                dataLayer.UploadResultList.Add(res.uploadResults[i]);

            }

            return DataLayerResult.Success;

        }
    }
}
