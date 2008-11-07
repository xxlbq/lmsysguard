using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.LogoutState
{
    class LogoutStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new LogoutSuccessState();
            }
            if (stateCode == 1)
            {
                state = new LogoutNoLogInState();
            }
          
            if (stateCode == 3)
            {
                state = new LogoutUnKnownFailureState();
            }
            return state;
        }
    }
}
