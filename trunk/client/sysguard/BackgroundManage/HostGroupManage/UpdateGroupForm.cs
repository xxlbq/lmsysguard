using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;

namespace Sysguard.BackgroundManage.HostGroupManage
{
    public partial class UpdateGroupForm : Form
    {

        public UpdateGroupForm()
        {
            InitializeComponent();
        }
        public UpdateGroupForm(Group group)
        {
            InitializeComponent();
            initForm(group);
            this.name.Focus();
        }
        private void initForm(Group group)
        {

            this.name.Text = group.NameProperty;
            this.describe.Text = group.DescribeProperty;
            this.OSType.SelectedIndex = group.OSTypeProperty;
        }

        private void cancel(object sender, EventArgs e)
        {

            this.Close();
        }

        private void commit(object sender, EventArgs e)
        {

            if (VerifyUtil.IsEmpty(name.Text))
            {
                MessageBox.Show("请输入群组名称", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            //if (!VerifyUtil.VerifyInput(this.name.Text))
            //{
            //    MessageBox.Show(this, "群组名称" + VerifyUtil.NameLimitInfo, "", MessageBoxButtons.OK,
            //   MessageBoxIcon.Error, MessageBoxDefaultButton.Button1,
            //   MessageBoxOptions.RightAlign);
            //    this.name.Focus();
            //    return;
            //}

            Group group = new Group();
            group.NameProperty = this.name.Text;
            group.DescribeProperty = this.describe.Text;
            group.OSTypeProperty = this.OSType.SelectedIndex;
            string message;

            if (this.updateGroup(group))
            {
                message = "更新群组成功!";
            }
            else
            {
                message = "更新群组失败!";
            }

            string caption = "";
            MessageBoxButtons buttons = MessageBoxButtons.OK;
            DialogResult result;

            // Displays the MessageBox.

            result = MessageBox.Show(this, message, caption, buttons,
                MessageBoxIcon.Question, MessageBoxDefaultButton.Button1);
            cancel(sender, e);

        }
        private bool updateGroup(Group group)
        {
            OutObject.outVO(group, "updateGroup");
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

       

    }
}