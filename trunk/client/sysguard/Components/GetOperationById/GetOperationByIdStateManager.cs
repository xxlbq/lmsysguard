using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetOperationById
{
    class GetOperationByIdStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new GetOperationByIdSuccessState();
            }
            if (stateCode == 1)
            {
                state = new GetOperationByIdNoLoginState();
            }
            if (stateCode == 3)
            {
                state = new GetOperationByIdUnknownFailureState();
            }
            return state;
        }
    }
}
