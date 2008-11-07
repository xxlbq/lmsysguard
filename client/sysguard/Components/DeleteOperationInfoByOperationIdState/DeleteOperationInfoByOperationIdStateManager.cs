using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteOperationInfoByOperationIdState
{
    class DeleteOperationInfoByOperationIdStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new DeleteOperationInfoByOperationIdStateSuccessState();
            }
            if (stateCode == 1)
            {
                state = new DeleteOperationInfoByOperationIdStateNoLogInState();
            }
           
            if (stateCode == 3)
            {
                state = new DeleteOperationInfoByOperationIdStateUnKnownFailureState();
            }
            return state;
        }
    }
}
