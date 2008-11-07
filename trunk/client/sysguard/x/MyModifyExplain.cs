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
    public partial class MyModifyExplain : Form
    {
        private IDataLayer dataLayer;
        private int explain_id;

        private ExplainInfo explainControl;

        public MyModifyExplain(ExplainInfo _explainControl)
        {
            this.explainControl = _explainControl;
            InitializeComponent();
        }
        private void GetData()
        {
            dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
            DataLayerResult result = dataLayer.GetAllOperationInfo();
            if (result == DataLayerResult.Success)
            {
                SysguardWS.OperationInfo info = dataLayer.OperationInfoList[explain_id];

                this.textBox1.Text = info.errorDesp;
                this.textBox2.Text = info.operContent;
            }
        }
        public DialogResult ShowDialog(int explainId)
        {
            explain_id = explainId;
            this.GetData();
            return this.ShowDialog();
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
            //
            sysguard.SysguardWS.OperationInfo operationInfo = new sysguard.SysguardWS.OperationInfo();
            //
            sysguard.SysguardWS.UserInfo user = dataLayer.User;
            //
            operationInfo.operId = explain_id;
            operationInfo.errorDesp = this.textBox1.Text;
            operationInfo.operContent = this.textBox2.Text;
            operationInfo.userId = user.userId;

            DataLayerResult result2 = dataLayer.ModifyOperationInfo(operationInfo);

            if (result2 == DataLayerResult.Success)
            {
                DialogResult resultDialo = MessageBox.Show("��˳�޸ĳɹ�,�Ƿ��˳�?", "�޸ĳɹ�", MessageBoxButtons.YesNo);
                if (resultDialo == DialogResult.Yes)
                {
                    this.DialogResult = DialogResult.OK;
                    this.Dispose();
                }
                else
                {
                    explainControl.Flush();
                    GetData();
                }
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.GetData();
        }
    }
}