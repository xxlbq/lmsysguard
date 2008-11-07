using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyGroupInfState
{
    class ModifyGroupInfStateManager : IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0) {
                state = new ModifyGroupInfSuccessState();
            }
            if (stateCode == 1) {
                state = new ModifyGroupInfNoLogINState();
            }
            if (stateCode == 3) {
                state = new ModifyGroupInfUnKnownFailureState();
            }
            return state;

        }
    }
}
