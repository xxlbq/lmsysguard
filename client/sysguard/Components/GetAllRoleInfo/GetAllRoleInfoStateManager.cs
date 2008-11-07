using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllRoleInfo
{
    class GetAllRoleInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new GetAllRoleInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new GetAllRoleInfoNoLogInState();
            }
            if (stateCode == 3)
            {
                state = new GetAllRoleInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
