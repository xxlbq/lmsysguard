using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllOsTypeInfoState
{
    class GetAllOsTypeInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new GetAllOsTypeInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new GetAllOsTypeInfoNoLogInState();
            }
            
            if (stateCode == 3)
            {
                state = new GetAllOsTypeInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
