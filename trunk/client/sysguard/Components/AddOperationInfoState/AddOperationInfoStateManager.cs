using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddOperationInfoState
{
    class AddOperationInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new AddOperationInfoStateSuccessState();
            }
            if (stateCode == 1)
            {
                state = new AddOperationInfoStateNoLogInState();
            }
           
            if (stateCode == 3)
            {
                state = new AddOperationInfoStateUnKnownFailureState();
            }
            return state;
        }
    }
}
