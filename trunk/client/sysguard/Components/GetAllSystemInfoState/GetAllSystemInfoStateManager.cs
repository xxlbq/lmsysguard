using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllSystemInfoState
{
    class GetAllSystemInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0) {
                state = new GetAllSystemInfoSuccessState();
            }
            if (stateCode == 1) {
                state = new GetAllSystemInfoNoLogInState();
            }
            if (stateCode == 3) {
                state = new GetAllSystemInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
