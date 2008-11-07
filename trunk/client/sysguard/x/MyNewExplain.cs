using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using sysguard.Components;
using sysguard.Properties;
using sysguard.SysguardWS;

namespace sysguard.x
{
    public partial class MyNewExplain : Form
    {
        private ExplainInfo explainControl;
        public MyNewExplain(ExplainInfo _explainControl)
        {
            this.explainControl = _explainControl;
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
           //������˳
            if (this.textBox1.Text.Trim().Equals(""))
            {
                MessageBox.Show("������˳����Ϊ�գ�");
                return;
            }
            //��������
            if (this.textBox2.Text.Trim().Equals(""))
            {
                MessageBox.Show("������������Ϊ�գ�");
                return;
            }

            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            sysguard.SysguardWS.OperationInfo operation = new sysguard.SysguardWS.OperationInfo();

            operation.errorDesp = this.textBox2.Text;

            operation.operContent = this.textBox1.Text;

            operation.inputTime = DateTime.Now;

            sysguard.SysguardWS.UserInfo user = dataLayer.User;

            operation.userId = user.userId;

            DataLayerResult result = dataLayer.AddOperationInfo(operation);

            if (result == DataLayerResult.Success)
            {
                DialogResult resultDialo= MessageBox.Show("�µ���˳��ӳɹ�,�Ƿ��˳�?", "��ӳɹ�!",MessageBoxButtons.YesNo);
                if (resultDialo == DialogResult.Yes)
                {
                    this.DialogResult = DialogResult.OK;
                    this.Dispose();
                }
                else {
                    reset();
                    explainControl.Flush();
                }
            }
            

        }

        private void button2_Click(object sender, EventArgs e)
        {
            reset();
           
        }

        private void reset()
        {
            for (int i = 0; i < this.Controls.Count; i++)
            {

                if (this.Controls[i].GetType().ToString().Equals("System.Windows.Forms.TextBox"))
                {
                    this.Controls[i].Text = null;
                }
            }
        }
    }
}