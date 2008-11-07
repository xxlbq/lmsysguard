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

    public partial class InsertUserForm : UserFormBase
    {

        public InsertUserForm()
        {
            InitializeComponent();
            this.name.Focus();
            this.role.SelectedIndex = 0;
        }

        private bool insertUser(User user)
        {
            OutObject.outVO(user,"insertUser");

            try
            {
                /*
                * invoke webservice interface
                * 
                * 
                */
            }
            catch
            {

            }
            finally
            {

            }

            return true;
        }

        private void InitializeComponent()
        {
            this.SuspendLayout();
            // 
            // InsertUserForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.ClientSize = new System.Drawing.Size(400, 457);
            this.Name = "InsertUserForm";
            this.Text = "添加用户";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        protected override void commit(object sender, EventArgs e)
        {
            if (verifyCommitedInfo())
            {
                return;
            }
            User user = new User();

            user.NameProperty = name.Text;
            user.PasswordProperty = password.Text;
            user.RealNameProperty = realName.Text;
            user.MailProperty = mail.Text;
            user.RoleProperty = Convert.ToInt32(role.SelectedIndex);

            string message;

            if (this.insertUser(user))
            {
                message = "添加用户成功!是否继续?";
            }
            else
            {
                message = "添加用户失败!是否继续?";
            }

            // Displays the MessageBox.

            DialogResult result = MessageBox.Show(this, message, "", MessageBoxButtons.YesNo,
                 MessageBoxIcon.Question, MessageBoxDefaultButton.Button1,
                 MessageBoxOptions.RightAlign);

            if (result == DialogResult.Yes)
            {
                reset();


            }
            else
            {
                cancel(sender, e);
            }
        }

        protected override void cancel(object sender, EventArgs e)
        {
            Close();
        }

       
        


    }
}