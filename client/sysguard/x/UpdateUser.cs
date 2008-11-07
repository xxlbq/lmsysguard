using System;
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
    public partial class UpdateUser : sysguard.x.UserBase
    {
        private SysguardWS.UserInfo userInfo;
        private DataGridViewRow dgvr;
        private UserInfo userControl;
        public UpdateUser(UserInfo _userControl)
        {
            this.userControl = _userControl;
            InitializeComponent();

        }

        private void GetData()
        {
            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
            int userId = (int)dgvr.Cells[0].Value;
            userInfo = dataLayer.UserInfoList[userId];
            this.userNameTextBox.Text = userInfo.name;
            this.realNameTextBox.Text = userInfo.realName;
            this.mailTextBox.Text = userInfo.mail;
            this.msnTextBox.Text = userInfo.msn;
            this.skypeTextBox.Text = userInfo.skype;
            DataLayerResult result = dataLayer.GetAllRoleInfo();
            if (result == DataLayerResult.Success)
            {
                List<RoleInfo> authors = new List<RoleInfo>(dataLayer.RoleInfoList.Count);
                authors.AddRange(dataLayer.RoleInfoList.Values);
                this.roleComboBox.DataSource = authors;
                this.roleComboBox.DisplayMember = "name";
                this.roleComboBox.ValueMember = "roleId";
            }

            RoleInfo currRoleInfo = dataLayer.RoleInfoList[userInfo.roleId];

            this.roleComboBox.SelectedItem = currRoleInfo;

        }
        public void ShowDialg(DataGridViewRow dgvr)
        {
            this.dgvr = dgvr;

            GetData();

            this.ShowDialog();
        }

        private void commitButton_Click(object sender, EventArgs e)
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


            if (string.IsNullOrEmpty(this.oldPasswdTextBox.Text))
            {
                MessageBox.Show("请填写旧密码!");
                this.oldPasswdTextBox.Focus();
                return;
            }
            if (!VerifyUtil.VerifyPwd(this.oldPasswdTextBox.Text))
            {
                MessageBox.Show("旧密码格式不正确请重新输入!,正确的格式应该是长度6-20,可以是数字或英文字母.");
                this.oldPasswdTextBox.Text = string.Empty;
                this.oldPasswdTextBox.Focus();
                return;
            }
            string oldPasswd = this.oldPasswdTextBox.Text;

            string newPasswd = this.newPasswdTextBox.Text;


            string verifyPasswd = this.verifyTextBox.Text;

            if (!string.IsNullOrEmpty(newPasswd))
            {
                if (!VerifyUtil.VerifyPwd(newPasswd))
                {
                    MessageBox.Show("新密码格式不正确请重新输入!,正确的格式应该是长度6-20,可以是数字或英文字母.");
                    this.newPasswdTextBox.Text = string.Empty;
                    this.newPasswdTextBox.Focus();
                    return;
                }
                if (string.IsNullOrEmpty(verifyPasswd))
                {
                    MessageBox.Show("请填写确认密码!");
                    this.verifyTextBox.Focus();
                    return;
                }
            }
            else
            {
                newPasswd = oldPasswd;
                verifyPasswd = oldPasswd;
            }


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


                userInfo.name = userName;
                userInfo.realName = realNameTextBox.Text;
                userInfo.passwd = newPasswd;
                userInfo.mail = mail;
                userInfo.msn = this.msnTextBox.Text;
                userInfo.skype = this.skypeTextBox.Text;
                userInfo.roleId = roleID;
                userInfo.updateTime = DateTime.Now;
                userInfo.updateTimeSpecified = true;
  

                this.cancelButton.Enabled = false;
                DataLayerResult result = dataLayer.ModifyUserInfo(userInfo, oldPasswd);

                if (result == DataLayerResult.Success)
                {
                    

                    DialogResult dialoResult = MessageBox.Show("更新成功是否退出?", "是否退出", MessageBoxButtons.YesNo);
                    if (dialoResult == DialogResult.Yes)
                    {
                        this.DialogResult = DialogResult.OK;
                        this.Close();
                    }
                    else
                    {
                        this.cancelButton.Enabled = true;
                        userControl.Flush();
                    }
                }

                else if (result == DataLayerResult.OldPasswdError)
                {
                    MessageBox.Show("旧密码无效,请重新输入!");
                    this.oldPasswdTextBox.Text = string.Empty;
                    this.oldPasswdTextBox.Focus();
                }


            }
        }

        private void cancelButton_Click(object sender, EventArgs e)
        {
            GetData();
        }
    }
}

