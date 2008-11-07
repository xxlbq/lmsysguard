using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddHostState
{
    class AddHostStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0) {
                state = new AddHostSuccessState();
            }
            if (stateCode == 1) {
                state = new AddHostNoLogInState();
            }
            if (stateCode == 2) {
                state = new AddHostHostIPAlreadyExistState();
            }
            if (stateCode == 3) {
                state = new AddHostUnKnownFailureState();
            }
            if (stateCode == 4) {
                state = new AddHostHostNameAlreadyExistState();
            }
            if (stateCode == 5) {
                state = new AddHostHostUserNameOrPwdErrorState();
            }
            return state;
        }
    }
}
