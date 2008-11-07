using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllOperationInfoState
{
    class GetAllOperationInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new GetAllOperationInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new GetAllOperationInfoNoLogInState();
            }
        
            if (stateCode == 3)
            {
                state = new GetAllOperationInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
