using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddUserState
{
    class AddUserStateManager : IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new AddUserSuccessState();
            }
            if (stateCode == 1)
            {
                state = new AddUserNoLoginState();
            }
            if (stateCode == 2) {
                state = new AddUserUserNameAlreadyExist();
            }
            if (stateCode == 3)
            {
                state = new AddUserUnknownFailureState();
            }
            return state;
        }
    }
}
