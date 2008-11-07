using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components.DeleteOsTypeInfoByOsTypeIdState
{
    class DeleteOsTypeInfoByOsTypeIdStateManager:IStateManager
    {
        public IState MakeState(int stateCode)
        {
            IState state = null;
            if (stateCode == 0)
            {
                state = new DeleteOsTypeInfoByOsTypeIdSuccessState();
            }
            if (stateCode == 1)
            {
                state = new DeleteOsTypeInfoByOsTypeIdNoLogInState();
            }

            if (stateCode == 3)
            {
                state = new DeleteOsTypeInfoByOsTypeIdUnKnownFailureState();
            }
            return state;
        }
    }
}
