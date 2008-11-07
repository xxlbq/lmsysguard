using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.AddOsTypeInfoState
{
    class AddOsTypeInfoStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new AddOsTypeInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new AddOsTypeInfoNoLogInState();
            }

            if (stateCode == 3)
            {
                state = new AddOsTypeInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
