using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;

namespace Sysguard.BackgroundManage.UserManage
{
    public partial class UpdateUserForm : UserFormBase
    {

        public UpdateUserForm()
        {
            InitializeComponent();
           
        }

        public UpdateUserForm(User user)
        {

            InitializeComponent();
            initForm(user);
            this.name.Focus();
        }

        private void initForm(User user)
        {
            this.name.Text = user.NameProperty;
            this.realName.Text = user.RealNameProperty;
            this.mail.Text = user.MailProperty;
            this.role.SelectedIndex = user.RoleProperty;
        }
        protected override void commit(object sender, EventArgs e)
        {

            if (this.verifyCommitedInfo())
            {
                return;
            }
            User user = new User();
            user.NameProperty = this.name.Text;
            user.RealNameProperty = this.realName.Text;
            user.PasswordProperty = this.password.Text;
            user.MailProperty = this.mail.Text;
            user.RoleProperty = this.role.SelectedIndex;

            string message;

            if (this.updateUser(user))
            {
                message = "更新用户成功!";
            }
            else
            {
                message = "更新用户失败!";
            }

            string caption = "";
            MessageBoxButtons buttons = MessageBoxButtons.OK;
            DialogResult result;

            // Displays the MessageBox.

            result = MessageBox.Show(this, message, caption, buttons,
                MessageBoxIcon.Question, MessageBoxDefaultButton.Button1);
            cancel(sender, e);

        }
        private bool updateUser(User user)
        {

            OutObject.outVO(user, "updateUser");

            try
            {
                /*
                 * 
                 *invoke webservice interface 
                 * 
                 */
                return false;

            }
            catch (Exception)
            {
                return true;

            }
            finally
            {

            }

        }

        protected override void cancel(object sender, EventArgs e)
        {   
            this.Close();
        }

       

    }
}