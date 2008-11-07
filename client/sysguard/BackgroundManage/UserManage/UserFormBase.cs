using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace Sysguard.BackgroundManage.UserManage
{
    public partial class UserFormBase : Form
    {
        public UserFormBase()
        {
            InitializeComponent();
        }

        protected void reset()
        {

            name.Text = "";
            password.Text = "";
            confirmPassword.Text = "";
            realName.Text = "";
            mail.Text = "";
            role.SelectedIndex = 0;
            this.name.Focus();


        }
        protected bool verifyCommitedInfo()
        {
            if (VerifyUtil.IsEmpty(name.Text))
            {
                MessageBox.Show("请输入用户名称！", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.name.Focus();
                return true;
            }
            if (VerifyUtil.IsEmpty(this.realName.Text))
            {
                MessageBox.Show("请输入真实姓名！", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.realName.Focus();
                return true;
            }

            if (this.password.Text.Length < 6)
            {
                MessageBox.Show(this, "密码不能为空，且最小长度为6位！", "", MessageBoxButtons.OK,
              MessageBoxIcon.Error, MessageBoxDefaultButton.Button1,
              MessageBoxOptions.RightAlign);
                this.password.Focus();
                return true;
            }
            if (!this.password.Text.Equals(this.confirmPassword.Text))
            {

                MessageBox.Show("两次输入的密码不一致！", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.password.Focus();
                return true;
            }
            if (VerifyUtil.IsEmpty(this.mail.Text))
            {
                MessageBox.Show("邮件地址不能为空！", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.mail.Focus();
                return true;
            }

            if (!VerifyUtil.VerifyInput(this.name.Text))
            {
                MessageBox.Show(this, "用户名" + VerifyUtil.NameLimitInfo, "", MessageBoxButtons.OK,
               MessageBoxIcon.Error, MessageBoxDefaultButton.Button1,
               MessageBoxOptions.RightAlign);
                this.name.Focus();
                return true;
            }

            if (!VerifyUtil.VerifyMailInput(this.mail.Text))
            {
                MessageBox.Show(this, VerifyUtil.MailLimitInfo, "", MessageBoxButtons.OK,
               MessageBoxIcon.Error, MessageBoxDefaultButton.Button1,
               MessageBoxOptions.RightAlign);
                this.mail.Focus();
                return true;
            }
            return false;

        }

        protected virtual void commit(object sender, EventArgs e)
        {
            return;
        }

        protected virtual  void cancel(object sender, EventArgs e)
        {
            return;
        }
    }
}