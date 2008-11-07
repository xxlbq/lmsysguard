using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;

namespace sysguard.Components
{
   public interface IState
    {
       
       DataLayerResult DoResponse(IDataLayer dataLayer, Object response);
    }
}
