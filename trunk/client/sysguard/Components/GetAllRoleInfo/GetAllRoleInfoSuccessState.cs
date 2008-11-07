using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.GetAllRoleInfo
{
    class GetAllRoleInfoSuccessState:IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response) {
            dataLayer.RoleInfoList.Clear();
            GetAllRoleInfoResponse res = (GetAllRoleInfoResponse)response;
            if (res.allRole != null)
            {
                RoleInfo[] roleInfoArray = res.allRole;
                for (int i = 0; i < roleInfoArray.Length; i++)
                {
                    dataLayer.RoleInfoList.Add(roleInfoArray[i].roleId, roleInfoArray[i]);
                }
            }
            return DataLayerResult.Success;
        }
    }
}
