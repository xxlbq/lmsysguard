using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyLogInfoState
{
    class ModifyLogInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0) {
                state= new ModifyLogInfoSucessState();
            }
            if (stateCode == 1) {
                state = new ModifyLogInfoNoLoginState();
            }
            if (stateCode == 3) {
                state = new ModifyLogInfoUnknownFailureState();
            }
            return state;
        }
    }
}
