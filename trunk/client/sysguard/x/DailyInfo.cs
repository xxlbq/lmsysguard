using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Text;
using System.Windows.Forms;
using sysguard.Components;
using sysguard.Properties;
using sysguard.SysguardWS;
using sysguard.Event;

namespace sysguard.x
{
    public partial class DailyInfo : UserControl
    {
        private MainForm mainForm;

        public MainForm MainForm {
            get { return mainForm; }
        }
        public void init(MainForm m)
        {
            mainForm = m;
            mainForm.SetExcelEnabled(true);
            mainForm.SetStatus("日志信息");
            mainForm.SetPrintEnabled(true);
            mainForm.SetCopyEnable(true);
            mainForm.SetNewClick(null);
            mainForm.SetDeleteClick(null);
            //
            string[] s = new string[dataGridView1.ColumnCount];
            for (int i = 0; i < s.Length; i++)
            {
                s[i] = dataGridView1.Columns[i].HeaderText;
            }
            mainForm.SetSearch(s);
            this.timer1.Start();
        }
        public DailyInfo()
        {
            InitializeComponent();
            GetData();
        }
        private void GetData()
        {
            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllLogInfo();

            if (result == DataLayerResult.Success)
            {

                foreach (SysguardWS.LogInfo info in dataLayer.LogInfoList.Values)
                {
                    int i = this.dataGridView1.Rows.Add();

                    DataGridViewRow dgvr = dataGridView1.Rows[i];

                    dgvr.Cells[0].Value = info.hostIp;

                    dgvr.Cells[1].Value = info.applogId;

                    dgvr.Cells[2].Value = info.logContent;

                    dgvr.Cells[3].Value = info.level;

                    string s = "";

                    switch (info.logStatus)
                    {
                        case 0:
                            s = "已处理";
                            break;
                        case 1:
                            s = "处理中";
                            break;
                        case 2:
                            s = "未处理";
                            break;
                    }

                    dgvr.Cells[4].Value = s;

                    dgvr.Cells[5].Value = info.logTime;
                }

            }
        }

        public DataGridView GetDataGridView()
        {
            return this.dataGridView1;
        }

        private void CellMouse_DoubleClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                //MyLogDailyInfo myLog = new MyLogDailyInfo();

                //myLog.ShowDialg(this.dataGridView1.Rows[e.RowIndex]);
                LogInfoListAdapter adapter = new LogInfoListAdapter();
                adapter.ShowMyLogDailyInfoForm(this, this.dataGridView1.Rows[e.RowIndex]);
            }
        }

        public void Flush() {
            this.dataGridView1.Rows.Clear();
            GetData();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            this.dataGridView1.Rows.Clear();
            this.GetData();
        }

    }
}
