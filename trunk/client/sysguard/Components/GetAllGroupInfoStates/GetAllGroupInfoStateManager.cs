using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllGroupInfoStates
{
    class GetAllGroupInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new GetAllGroupInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new GetAllGroupInfoNoLogInState();
            }
            if (stateCode == 3)
            {
                state = new GetAllGroupInfoUnKnownFailureState();
            }
            return state;
        }

    }
}
