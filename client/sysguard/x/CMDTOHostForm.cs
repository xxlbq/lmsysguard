using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using sysguard.SysguardWS;
using sysguard.Properties;
using sysguard.Components;

namespace sysguard.x
{
    public partial class CMDTOHostForm : Form
    {
        private List<int> hostIdList = new List<int>();
        private List<string> execResult = new List<string>();

        public List<int> HostIdList
        {
            get
            {
                return hostIdList;
            }
        }

        public List<string> ExecResult
        {

            get
            {
                return execResult;
            }
        }
        public CMDTOHostForm()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Button bt = (Button)sender;

            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
            bt.Cursor = Cursors.WaitCursor;
            DataLayerResult result = dataLayer.BatchExecuteCommand(this.textBox1.Text, hostIdList);
            bt.Cursor = Cursors.Arrow;

            if (result == DataLayerResult.Success) {
                this.execResult.AddRange(dataLayer.ExecuteResultList);
            }
           
            else if (result == DataLayerResult.LoginHostError)
            {
                this.execResult.Add("远处主机登陆密码错误请与管理者联系!");
            }
            
            this.DialogResult = DialogResult.OK;
        }
    }
}