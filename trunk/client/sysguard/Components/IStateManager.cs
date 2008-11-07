using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components
{
   public interface IStateManager
    {
        IState MakeState(int stateCode);
    }
}
