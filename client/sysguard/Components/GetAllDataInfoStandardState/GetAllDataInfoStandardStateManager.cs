using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllDataInfoStandardState
{
    class GetAllDataInfoStandardStateManager:IStateManager
    {
        public IState MakeState(int stateCode) {
            IState state = null;
            if (stateCode == 0) {
                state = new GetAllDataInfoStandardSuccessState();
            }
            if (stateCode == 1) {
                state = new GetAllDataInfoStandardNoLogInState();
            }
            if (stateCode == 3) {
                state = new GetAllDataInfoStandardUnKnownFailureState();
            }
            return state;
        }
    }
}
