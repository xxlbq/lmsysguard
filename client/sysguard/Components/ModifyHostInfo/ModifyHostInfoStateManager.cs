using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyHostInfo
{
    class ModifyHostInfoStateManager : IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new ModifyHostInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new ModifyHostInfoNoLogInState();
            }
            if (stateCode == 3)
            {
                state = new ModifyHostInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
