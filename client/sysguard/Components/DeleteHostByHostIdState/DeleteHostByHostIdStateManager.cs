using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteHostByHostIdState
{
    class DeleteHostByHostIdStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0) {
                state = new DeleteHostByHostIdSuccessState();
            }
            if (stateCode == 1) {
                state = new DeleteHostByHostIdNoLogInState();
            }
            if (stateCode == 3) {
                state = new DeleteHostByHostIdUnKnownFailuregInState();
            }
            return state;
        }
    }
}
