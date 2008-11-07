using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.BatchExecuteCommandState
{
    class BatchExecuteCommandStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0)
            {
                state = new BatchExecuteCommandSuccessState();
            }
            if (stateCode == 1)
            {
                state = new BatchExecuteCommandNoLoginState();
            }
            if (stateCode == 2) {
                state = new BatchExecuteCommandLoginHostErrorState();
            }
            if (stateCode == 3)
            {
                state = new BatchExecuteCommandUnknownFailureState();
            }

            return state;
        
        }
    }
}
