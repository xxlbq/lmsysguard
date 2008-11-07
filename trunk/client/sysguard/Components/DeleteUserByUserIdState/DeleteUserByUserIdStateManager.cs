using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteUserByUserIdState
{
    class DeleteUserByUserIdStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0) {
                state = new DeleteUserByUserIdSuccessState();
            }
            if (stateCode == 1) {
                state = new DeleteUserByUserIdNoLogInState();
            }
            if (stateCode == 3) {
                state = new DeleteUserByUserIdUnKnownFailureState();
            }
            return state;
        }
    }
}
