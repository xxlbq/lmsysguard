using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyOperationInfoState
{
    class ModifyOperationInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new ModifyOperationInfoStateSuccessState();
            }
            if (stateCode == 1)
            {
                state = new ModifyOperationInfoStateNoLogInState();
            }
           
            if (stateCode == 3)
            {
                state = new ModifyOperationInfoStateUnKnownFailureState();
            }
            return state;
        }
    }
}
