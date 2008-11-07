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

            //ip地址
            string[] ip = ipAddressControl1.Text.Split(new char[] { '.' });

            for (int i = 0; i < ip.Length; i++)
            {
                if (ip[i].Equals(""))
                {
                    MessageBox.Show("IP地址不可以空！");
                    return;
                }
            }
            //用户名
            string username = this.textBox2.Text.Trim();
           if (username.Equals(""))
            {
                MessageBox.Show("用户名不可以空！");
                return;
            }
            else if (username.Length < 4)
            {
                MessageBox.Show("用户名必须大于等于４个字符！");
                return;
            }
          
            //密码
            string password = this.textBox3.Text;

            string password2 = this.textBox4.Text;

            if (!password.Equals(password2))
            {
                MessageBox.Show("两次输入的密码必须相同！");
                return;

            }
            else if (password.Length < 6)
            {
                MessageBox.Show("密码长度必须大于等于６个字符！");
                return;
            }
            //组
            int groupid = -1;
            if (comboBox1.SelectedIndex < 0)
            {
                MessageBox.Show("请选择组！");
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
                    MessageBox.Show("未找到组！");
                    return;
                }
            }
            //主机名

            if (this.textBox1.Text.Trim().Equals(""))
            {
                MessageBox.Show("请输入主机名！");
                return;
            }
            //分区
            if (this.textBox7.Text.Trim().Equals(""))
            {
                MessageBox.Show("分区不能为空！");
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

               DialogResult resultdialo= MessageBox.Show("添加主机成功！","添加成功",MessageBoxButtons.YesNo);
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
                MessageBox.Show("主机IP已经存在无法添加！", "添加主机失败", MessageBoxButtons.OK);
                this.ipAddressControl1.Text = string.Empty;
                this.ipAddressControl1.Focus();
            }
            else if (result == DataLayerResult.HostNameAlreadyExist)
            {
                MessageBox.Show("主机名已经存在无法添加！", "添加主机失败", MessageBoxButtons.OK);
                this.textBox1.Text = string.Empty;
                this.textBox1.Focus();
            }
            else if (result == DataLayerResult.HostUserNameOrPwdError)
            {
                MessageBox.Show("用来登陆主机的用户名或密码错误无法添加！", "添加主机失败", MessageBoxButtons.OK);
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