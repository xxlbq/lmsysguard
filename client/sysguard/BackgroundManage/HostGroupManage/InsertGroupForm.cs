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
    public partial class InsertGroupForm : Form
    {
        public InsertGroupForm()
        {
            InitializeComponent();
            this.OSType.SelectedIndex = 0;
            this.name.Focus();
        }

      

        private bool insertGroup(Group group)
        {
            Debug.WriteLine("group name=" + group.NameProperty, "insertGroup");
            Debug.WriteLine("group describe=" + group.DescribeProperty, "insertGroup");
            Debug.WriteLine("group OSType=" + group.OSTypeProperty, "insertGroup");

            OutObject.outVO(group, "insertGroup");

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
        private void cancel(object sender, EventArgs e)
        {
           

        }
        private void reset()
        {

            name.Text = "";
            describe.Text = "";
            OSType.SelectedIndex = 0;
            this.name.Focus();

        }

        private void commit(object sender, EventArgs e)
        {
            if (VerifyUtil.IsEmpty(name.Text))
            {
                MessageBox.Show("������Ⱥ������", "", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            //if (!VerifyUtil.VerifyInput(this.name.Text))
            //{
            //    MessageBox.Show(this, "Ⱥ������" + VerifyUtil.NameLimitInfo, "", MessageBoxButtons.OK,
            //   MessageBoxIcon.Error, MessageBoxDefaultButton.Button1,
            //   MessageBoxOptions.RightAlign);
            //    this.name.Focus();
            //    return;
            //}

            Group group = new Group();
            group.NameProperty = name.Text;
            group.DescribeProperty = describe.Text;
            group.OSTypeProperty = OSType.SelectedIndex;

            string message;

            if (insertGroup(group))
            {
                message = "���Ⱥ��ɹ�!�Ƿ����?";
            }
            else
            {
                message = "���Ⱥ��ʧ��!�Ƿ����?";
            }


            DialogResult result = MessageBox.Show(this, message, "", MessageBoxButtons.YesNo,
                MessageBoxIcon.Question, MessageBoxDefaultButton.Button1,
                MessageBoxOptions.RightAlign);

            if (result == DialogResult.Yes)
            {
                this.reset();


            }
            else
            {
                cancel(sender, e);
            }
        }

    }
}