using System;
using System.Collections.Generic;
using System.Text;
using sysguard.x;
using System.Windows.Forms;

namespace sysguard.Event
{
    class LogInfoListAdapter
    {
        public void ShowMyLogDailyInfoForm(DailyInfo dailyInfo, DataGridViewRow dgvr)
        {
            MyLogDailyInfo myLog = new MyLogDailyInfo(dailyInfo);
            dailyInfo.MainForm.CurrentOpenChildForm = myLog;
            myLog.ShowDialg(dgvr);
            if (myLog.DialogResult.Equals(DialogResult.OK)) {
                dailyInfo.Flush();
            }
        }
    }
}
