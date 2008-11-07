using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.LoginState
{
   public class LoginStateManager : IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new LoginSucessState();
            }
            if (stateCode == 1)
            {
                state = new LoginUserNameUnknownState();
            }
            if (stateCode == 2)
            {
                state = new LoginPasswordUnfitState();
            }
            if (stateCode == 3)
            {
                state = new LoginUnknownFailureState();
            }
            return state;
        }
    }
}
