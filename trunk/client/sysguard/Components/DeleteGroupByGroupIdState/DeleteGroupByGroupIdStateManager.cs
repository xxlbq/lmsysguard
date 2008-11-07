using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteGroupByGroupIdState
{
    class DeleteGroupByGroupIdStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0)
            {
                state = new DeleteGroupByGroupIdSuccessState();
            }
            if (stateCode == 1)
            {
                state = new DeleteGroupByGroupIdNoLogInState();
            }

            if (stateCode == 2)
            {
                state = new DeleteGroupByGroupIdGroupISRefNoDeleteState();
            }
            if (stateCode == 3)
            {
                state = new DeleteGroupByGroupIdUnKnownFailureState();
            }
            return state;
        }

    }
}
