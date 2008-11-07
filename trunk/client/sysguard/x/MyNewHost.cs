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
    public partial class MyNewHost : Form
    {
        private IDictionary<int,sysguard.SysguardWS.GroupInfo> groupInfo;
        private IDataLayer dataLayer;
        private HostInfo hostControl;

        public MyNewHost(HostInfo _hostControl)
        {
            this.hostControl = _hostControl;
            InitializeComponent();
            GetData();
        }
    
        private void GetData()
        {
            dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllGroupInfo();

            if (result == DataLayerResult.Success)
            {
                groupInfo = dataLayer.GroupInfoList;

                foreach (SysguardWS.GroupInfo info in groupInfo.Values)
                 {
                     this.comboBox1.Items.Add(info.groupName);
                 }
            }
            
        }

        private void button1_Click(object sender, EventArgs e)
        {

            //ip��ַ
            string[] ip = ipAddressControl1.Text.Split(new char[] { '.' });

            for (int i = 0; i < ip.Length; i++)
            {
                if (ip[i].Equals(""))
                {
                    MessageBox.Show("IP��ַ�����Կգ�");
                    return;
                }
            }
            //�û���
            string username = this.textBox2.Text.Trim();
           if (username.Equals(""))
            {
                MessageBox.Show("�û��������Կգ�");
                return;
            }
            else if (username.Length < 4)
            {
                MessageBox.Show("�û���������ڵ��ڣ����ַ���");
                return;
            }
          
            //����
            string password = this.textBox3.Text;

            string password2 = this.textBox4.Text;

            if (!password.Equals(password2))
            {
                MessageBox.Show("������������������ͬ��");
                return;

            }
            else if (password.Length < 6)
            {
                MessageBox.Show("���볤�ȱ�����ڵ��ڣ����ַ���");
                return;
            }
            //��
            int groupid = -1;
            if (comboBox1.SelectedIndex < 0)
            {
                MessageBox.Show("��ѡ���飡");
                return;
            }
            else
            {
                
                
                foreach (SysguardWS.GroupInfo info in groupInfo.Values)
                {
                    if (info.groupName.Equals(comboBox1.SelectedItem.ToString()))
                    {
                        groupid = info.groupId;
                        break;
                    }
                }
                if (groupid < 0)
                {
                    MessageBox.Show("δ�ҵ��飡");
                    return;
                }
            }
            //������

            if (this.textBox1.Text.Trim().Equals(""))
            {
                MessageBox.Show("��������������");
                return;
            }
            //����
            if (this.textBox7.Text.Trim().Equals(""))
            {
                MessageBox.Show("��������Ϊ�գ�");
                return;
            }

            //-------------------------
            
            sysguard.SysguardWS.HostInfo host = new sysguard.SysguardWS.HostInfo();

            host.description = this.textBox8.Text;
            host.diskpartition = this.textBox7.Text;
            host.groupId = groupid;
            host.hostIp = this.ipAddressControl1.Text;
            host.validate = 0;
            host.hostName = this.textBox1.Text;


            DataLayerResult result = dataLayer.AddHost(host,textBox2.Text,textBox3.Text);

            if (result == DataLayerResult.Success)
            {

               DialogResult resultdialo= MessageBox.Show("��������ɹ���","��ӳɹ�",MessageBoxButtons.YesNo);
               if (resultdialo == DialogResult.Yes)
               {
                   this.DialogResult = DialogResult.OK;

                   this.Dispose();
               }
               else {

                   reset();
                   hostControl.Flush();
               }

            }
            else if (result == DataLayerResult.HostIPAlreadyExist)
            {
                MessageBox.Show("����IP�Ѿ������޷���ӣ�", "�������ʧ��", MessageBoxButtons.OK);
                this.ipAddressControl1.Text = string.Empty;
                this.ipAddressControl1.Focus();
            }
            else if (result == DataLayerResult.HostNameAlreadyExist)
            {
                MessageBox.Show("�������Ѿ������޷���ӣ�", "�������ʧ��", MessageBoxButtons.OK);
                this.textBox1.Text = string.Empty;
                this.textBox1.Focus();
            }
            else if (result == DataLayerResult.HostUserNameOrPwdError)
            {
                MessageBox.Show("������½�������û�������������޷���ӣ�", "�������ʧ��", MessageBoxButtons.OK);
                this.textBox2.Text = string.Empty;
                this.textBox3.Text = string.Empty;
                this.textBox4.Text = string.Empty;
                this.textBox2.Focus();
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
                if (this.Controls[i].GetType().ToString().Equals("System.Windows.Forms.ComboBox"))
                {
                    this.Controls[i].Text = null;
                }

            }
        }
    }
}