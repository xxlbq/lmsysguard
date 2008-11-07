using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.BatchUploadFileState
{
    class BatchUploadFileStateManager : IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new BatchUploadFileSuccessState();
            }
            if (stateCode == 1)
            {
                state = new BatchUploadFileNoLoginState();
            }
            if (stateCode == 2)
            {
                state = new BatchUploadFileLoginHostErrorState();
            }
            if (stateCode == 3)
            {
                state = new BatchUploadFileUnknownFailureState();
            }

            return state;

        }
    }
}
