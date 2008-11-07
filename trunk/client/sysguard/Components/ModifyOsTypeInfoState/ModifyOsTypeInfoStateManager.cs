using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.ModifyOsTypeInfoState
{
    class ModifyOsTypeInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new ModifyOsTypeInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new ModifyOsTypeInfoNoLogInState();
            }

            if (stateCode == 3)
            {
                state = new ModifyOsTypeInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
