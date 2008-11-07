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
                MessageBox.Show("�������û����ƣ�", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.name.Focus();
                return true;
            }
            if (VerifyUtil.IsEmpty(this.realName.Text))
            {
                MessageBox.Show("��������ʵ������", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.realName.Focus();
                return true;
            }

            if (this.password.Text.Length < 6)
            {
                MessageBox.Show(this, "���벻��Ϊ�գ�����С����Ϊ6λ��", "", MessageBoxButtons.OK,
              MessageBoxIcon.Error, MessageBoxDefaultButton.Button1,
              MessageBoxOptions.RightAlign);
                this.password.Focus();
                return true;
            }
            if (!this.password.Text.Equals(this.confirmPassword.Text))
            {

                MessageBox.Show("������������벻һ�£�", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.password.Focus();
                return true;
            }
            if (VerifyUtil.IsEmpty(this.mail.Text))
            {
                MessageBox.Show("�ʼ���ַ����Ϊ�գ�", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.mail.Focus();
                return true;
            }

            if (!VerifyUtil.VerifyInput(this.name.Text))
            {
                MessageBox.Show(this, "�û���" + VerifyUtil.NameLimitInfo, "", MessageBoxButtons.OK,
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