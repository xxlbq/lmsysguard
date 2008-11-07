using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetAllHostInfoState
{
    class GetAllHostInfoStateManager : IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new GetAllHostInfoSuccessState();
            }
            if (stateCode == 1)
            {
                state = new GetAllHostInfoNoLogInState();
            }
            if (stateCode == 3)
            {
                state = new GetAllHostInfoUnKnownFailureState();
            }
            return state;
        }
    }
}
