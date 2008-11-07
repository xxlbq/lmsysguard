using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyUserInfoState
{
    class ModifyUserInfoStateManager : IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new ModifyUserInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new ModifyUserInfoNoLoginState();
            }
            if (stateCode == 2) {
                state = new ModifyUserInfoOldPasswdErrorState();
            }
            if (stateCode == 3)
            {
                state = new ModifyUserInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
