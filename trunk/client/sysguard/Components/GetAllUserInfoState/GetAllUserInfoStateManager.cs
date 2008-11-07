using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllUserInfoState
{
    class GetAllUserInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0) {
                state = new GetAllUserInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new GetAllUserInfoNoLoginState();
            }
            if (stateCode == 3)
            {
                state = new GetAllUserInfoUnknownFailureState();
            }
            return state;
        }
    }
}
