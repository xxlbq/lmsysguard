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
    public partial class MyNewGroup : Form
    {
        private IDictionary<int, sysguard.SysguardWS.OsTypeInfo> osTypeInfo;
        private IDataLayer dataLayer;
        private GroupInfo groupControl;
        public MyNewGroup(GroupInfo _groupControl)
        {
            this.groupControl = _groupControl;
            InitializeComponent();
            GetData();
        }
        private void GetData()
        {
            dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllOsTypeInfo();

            if (result == DataLayerResult.Success)
            {
                osTypeInfo = dataLayer.OsTypeInfoList;

                foreach (SysguardWS.OsTypeInfo info in osTypeInfo.Values)
                {
                    this.comboBox1.Items.Add(info.osName);
                }
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            reset();
        }

        private void reset()
        {
            this.textBox1.Text = "";
            this.textBox2.Text = "";
            this.comboBox1.Text = "";
            this.comboBox1.SelectedIndex = -1;
        }

        private void button1_Click(object sender, EventArgs e)
        {


            //����
            if (textBox1.Text.Trim().Equals(""))
            {
                MessageBox.Show("���Ʋ�����Ϊ�գ�");
                return;
            }
            //����ϵͳ
            int osid = -1;

            if (comboBox1.SelectedIndex >= 0)
            {

                foreach (SysguardWS.OsTypeInfo info in osTypeInfo.Values)
                {
                    if (info.osName.Equals(comboBox1.SelectedItem.ToString()))
                    {
                        osid = info.osId;
                        break;
                    }
                }
                if (osid < 0)
                {
                    MessageBox.Show("δ�ҵ�����ϵͳ��");
                    return;
                }
            }
            else
            {
                MessageBox.Show("��ѡ�����ϵͳ��");
                return;
            }
            sysguard.SysguardWS.GroupInfo group = new sysguard.SysguardWS.GroupInfo();
            group.description = this.textBox2.Text;
            group.groupName = this.textBox1.Text;
            group.inputTime = DateTime.Today;
            group.osId = osid;

            DataLayerResult result = dataLayer.AddGroup(group);

            if (result == DataLayerResult.Success)
            {
                DialogResult resultDialo= MessageBox.Show("Ⱥ����ӳɹ�,�Ƿ��˳�?","��ӳɹ�!",MessageBoxButtons.YesNo);
                if (resultDialo == DialogResult.Yes)
                {
                    this.DialogResult = DialogResult.OK;
                    this.Dispose();
                }
                else {
                    reset();
                    groupControl.Flush();
                }
            }
            else if (result == DataLayerResult.GroupNameAlreadyExist)
            {
                MessageBox.Show("Ⱥ�����Ѿ������޷���ӣ�", "���Ⱥ��ʧ��", MessageBoxButtons.OK);
                this.textBox1.Text = string.Empty;
                this.textBox1.Focus();
            }


        }
    }
}