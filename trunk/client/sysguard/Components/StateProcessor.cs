using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Components
{
    public class StateProcessor
    {

        private IDictionary<string, IStateManager> stateManagerCache;

        public IDictionary<string, IStateManager> StateManagerCache
        {
            set {
                stateManagerCache = value;
            }
            get {
                return stateManagerCache;
            }
        }
        public DataLayerResult MakeDataLayerResult<T>(IDataLayer m_DataLayer, T response)
        {
            if (response == null)
            {
                return DataLayerResult.AuthenticationFailure;
            }
            
            IStateManager stateManager=stateManagerCache[response.GetType().Name];
            int stateCode = (int)(response.GetType().GetProperty("returnCode").GetValue(response,null));
            IState state = stateManager.MakeState(stateCode);

            return state.DoResponse(m_DataLayer,response);
        }

    }
}
