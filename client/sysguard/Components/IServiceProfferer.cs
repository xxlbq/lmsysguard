using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components
{
    interface IServiceProfferer<T>
    {
        T service() ;
    }
}
