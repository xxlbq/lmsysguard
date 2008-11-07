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



namespace sysguard.x
{
    public partial class SystemInfo : UserControl
    {
        private MainForm mainForm;
        
        public SystemInfo()
        {
            InitializeComponent();

            GetData();
            
        }
        public void init(MainForm m)
        {
            mainForm = m;
            mainForm.SetExcelEnabled(true);
            mainForm.SetStatus("系统信息");
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
        public DataGridView GetDataGridView()
        {
            return this.dataGridView1;
        }

        public IDictionary<string,SysguardWS.SystemInfo> GetSystemInfo()
        {
            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllSystemInfo();

            if (result == DataLayerResult.Success)
            {
                return dataLayer.SystemInfoList;
            }
                return null;
        }

        private void GetData()
        {

            IDictionary<string, SysguardWS.SystemInfo> sys = GetSystemInfo();

            if(sys!= null)
            {
                
                foreach (SysguardWS.SystemInfo info in sys.Values)
                {
                    int i = this.dataGridView1.Rows.Add();

                    DataGridViewRow dgvr = dataGridView1.Rows[i];

                    dgvr.Cells[0].Value = info.hostIp;

                    dgvr.Cells[1].Value = info.cpu;

                    dgvr.Cells[2].Value = info.responseTime;

                    dgvr.Cells[3].Value = info.memory;

                    dgvr.Cells[4].Value = info.diskStatus;

                    dgvr.Cells[5].Value = info.loadStatus;

                }

            }
        }
    
        private void CellMouse_DoubleClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            
            if (e.RowIndex >= 0)
            {
                MySystemInfo mySys = new MySystemInfo();
                mainForm.CurrentOpenChildForm = mySys;
                mySys.ShowDialg(this.dataGridView1.Rows[e.RowIndex]);
            }
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            this.dataGridView1.Rows.Clear();
            this.GetData();
        }

    
    }
}
