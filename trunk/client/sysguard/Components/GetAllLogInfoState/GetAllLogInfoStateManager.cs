using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllLogInfoState
{
    class GetAllLogInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0) {
                state = new GetAllLogInfoSucessState();
            }
            if (stateCode == 1) {
                state = new GetAllLogInfoNoLoginState();
            }
            if (stateCode == 3) {
                state = new GetAllLogInfoUnknownFailureState();
            }
            return state;
        }
    }
}
