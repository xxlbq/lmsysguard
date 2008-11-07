using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddGroupState
{
    class AddGroupStateManager:IStateManager
    {
        public IState MakeState(int stateCode) { 
            IState state = null;
            if (stateCode == 0) {
                state = new AddGroupSuccessState();
            }
            if (stateCode == 1) {
                state = new AddGroupNoLogInState();
            }
            if (stateCode == 2) {
                state = new AddGroupGroupNameAlreadyExistState();
            }
            if (stateCode == 3) {
                state = new AddGroupUnKnownFailureState();
            }
            return state;
        }
    }
}
