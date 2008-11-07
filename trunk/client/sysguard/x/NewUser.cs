using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using sysguard.SysguardWS;
using sysguard.Components;
using sysguard.Properties;
using Sysguard.BackgroundManage;
namespace sysguard.x
{
    public partial class NewUser : UserBase
    {
        private UserInfo userControl;

        
       

        public NewUser(UserInfo _userControl)
        {
            this.userControl = _userControl;
            InitializeComponent();
            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
            DataLayerResult result = dataLayer.GetAllRoleInfo();
            if (result == DataLayerResult.Success)
            {
                List<RoleInfo> authors = new List<RoleInfo>(dataLayer.RoleInfoList.Count);
                authors.AddRange(dataLayer.RoleInfoList.Values);
                this.roleComboBox.DataSource = authors;
                this.roleComboBox.DisplayMember = "name";
                this.roleComboBox.ValueMember = "roleId";
            }

        }

        private void commitButton_Click_1(object sender, EventArgs e)
        {

            if (string.IsNullOrEmpty(this.userNameTextBox.Text))
            {
                MessageBox.Show("请填写用户名!");
                this.userNameTextBox.Focus();
                return;
            }
            if (!VerifyUtil.VerifyName(this.userNameTextBox.Text))
            {
                MessageBox.Show("用户名格式不正确请重新输入!,正确的格式应该是长度4-10,可以是数字或英文字母.");
                this.userNameTextBox.Text = string.Empty;
                this.userNameTextBox.Focus();
                return;
            }
            string userName = this.userNameTextBox.Text;


            if (string.IsNullOrEmpty(this.newPasswdTextBox.Text))
            {
                MessageBox.Show("请填写新密码!");
                this.newPasswdTextBox.Focus();
                return;
            }
            if (!VerifyUtil.VerifyPwd(this.newPasswdTextBox.Text))
            {
                MessageBox.Show("新密码格式不正确请重新输入!,正确的格式应该是长度6-20,可以是数字或英文字母.");
                this.newPasswdTextBox.Text = string.Empty;
                this.newPasswdTextBox.Focus();
                return;
            }
            string newPasswd = this.newPasswdTextBox.Text;
            if (string.IsNullOrEmpty(this.verifyTextBox.Text))
            {
                MessageBox.Show("请填写确认密码!");
                this.verifyTextBox.Focus();
                return;
            }
            string verifyPasswd = this.verifyTextBox.Text;

            if (string.IsNullOrEmpty(mailTextBox.Text))
            {
                MessageBox.Show("请填写邮件地址!");
                this.mailTextBox.Focus();
                return;
            }
            string mail = this.mailTextBox.Text;

            if (!VerifyUtil.VerifyMailInput(mail))
            {

                MessageBox.Show("邮件地址格式错误,请填写正确的邮件地址!");
                this.mailTextBox.Focus();
                return;
            }
            if (string.IsNullOrEmpty(roleComboBox.Text))
            {
                MessageBox.Show("请选择角色!");
                this.roleComboBox.Focus();
                return;
            }
            int roleID = (int)this.roleComboBox.SelectedValue;

            if (newPasswd != verifyPasswd)
            {
                MessageBox.Show("两次输入的密码不符,请重新输入!");
                this.newPasswdTextBox.Text = string.Empty;
                this.verifyTextBox.Text = string.Empty;
                this.newPasswdTextBox.Focus();

            }
            else
            {
                IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
                SysguardWS.UserInfo info = new sysguard.SysguardWS.UserInfo();
                RoleInfo aa = new RoleInfo();

                info.name = userName;
                info.realName = realNameTextBox.Text;
                info.passwd = newPasswd;
                info.mail = mail;
                info.msn = this.msnTextBox.Text;
                info.skype = this.skypeTextBox.Text;
                info.roleId = roleID;

                info.inputTime = DateTime.Today;
                info.inputTimeSpecified = true;

                this.cancelButton.Enabled = false;
                DataLayerResult result = dataLayer.AddUser(info);
                if (result == DataLayerResult.Success)
                {


                    DialogResult dialoResult = MessageBox.Show("添加成功是否退出?", "是否退出", MessageBoxButtons.YesNo);

                    if (dialoResult == DialogResult.Yes)
                    {
                        this.DialogResult = DialogResult.OK;

                        this.Close();
                    }
                    else
                    {
                       
                        userControl.Flush();
                        
                        this.reset();
                        this.cancelButton.Enabled = true;
                    }
                }
                else
                {
                    MessageBox.Show("用户名存在不能添加!", "添加失败", MessageBoxButtons.OK);
                    this.Close();

                }


            }
        }

        private void cancelButton_Click_1(object sender, EventArgs e)
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