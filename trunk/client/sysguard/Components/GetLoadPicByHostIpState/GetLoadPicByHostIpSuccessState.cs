using System;
using System.Collections.Generic;
using System.Text;
using sysguard.SysguardWS;
namespace sysguard.Components.GetLoadPicByHostIpState
{
    class GetLoadPicByHostIpSuccessState : IState
    {
        public DataLayerResult DoResponse(IDataLayer dataLayer, Object response)
        {
            GetLoadPicByHostIpResponse res = (GetLoadPicByHostIpResponse)response;

            if (!string.IsNullOrEmpty(res.hostIp) && !string.IsNullOrEmpty(res.fileType) && res.dayLoadAveragePic != null && res.monthLoadAveragePic!=null && res.yearLoadAveragePic!=null)
            {
                dataLayer.PicInfoMap.Remove(res.hostIp);
                PicInfo picInfo = new PicInfo();
                picInfo.HostIp = res.hostIp;
                picInfo.FileType = res.fileType;
                picInfo.DayLoadAveragePic = res.dayLoadAveragePic;
                picInfo.MonthLoadAveragePic = res.monthLoadAveragePic;
                picInfo.YearLoadAveragePic = res.yearLoadAveragePic;
                dataLayer.PicInfoMap.Add(res.hostIp, picInfo);
            }
            return DataLayerResult.Success;

        }
    }
}
