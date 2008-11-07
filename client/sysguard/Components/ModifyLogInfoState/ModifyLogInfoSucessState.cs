using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.ModifyLogInfoState
{
    class ModifyLogInfoSucessState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response) {
            return DataLayerResult.Success;
        }
    }
}
