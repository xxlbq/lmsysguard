using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.GetLoadPicByHostIpState
{
    class GetLoadPicByHostIpStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new GetLoadPicByHostIpSuccessState();
            }
            if (stateCode == 1)
            {
                state = new GetLoadPicByHostIpNoLogInState();
            }
            if (stateCode == 2) {
                state = new GetLoadPicByHostIpPicNotFountState();
            }
            if (stateCode == 3)
            {
                state = new GetLoadPicByHostIpUnKnownFailureState();
            }
            if (stateCode == 4)
            {
                state = new GetLoadPicByHostIpIOExceptionState();
            }
            return state;
        }
    }
}
