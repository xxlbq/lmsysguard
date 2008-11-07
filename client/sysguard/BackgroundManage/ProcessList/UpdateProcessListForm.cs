using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;

namespace Sysguard.BackgroundManage.ProcessList
{
    public partial class UpdateProcessListForm : Form
    {
        private Error error;
        public UpdateProcessListForm()
        {
            InitializeComponent();
        }

        public UpdateProcessListForm(Error error)
        {
            InitializeComponent();
            initData(error);
        }
        private void initData(Error error)
        {
           
            this.code.Text = error.CodeProperty;
            this.describe.Text = error.DescribeProperty;
            this.handleProcess.Text = error.HandleProcessProperty;
            this.confirmProcess.Text = error.ConfirmProcessProperty;
            this.reason.Text = error.ReasonProperty;
            this.resolveMethod.Text = error.ResolveMethodProperty;

        }


        private void cancel(object sender, EventArgs e)
        {
            this.Close();
        }

        private void commit(object sender, EventArgs e)
        {

            error = new Error();
            error.CodeProperty = code.Text;
            error.DescribeProperty = describe.Text;
            error.HandleProcessProperty = handleProcess.Text;
            error.ConfirmProcessProperty = confirmProcess.Text;
            error.ReasonProperty = reason.Text;
            error.ResolveMethodProperty = resolveMethod.Text;
            /*
             * 
             *invoke webservice interface 
             * 
             */
            string message;

            if (this.updateProcessList(error))
            {
                message = "更新手顺成功!";
            }
            else
            {
                message = "更新手顺失败!";
            }

            string caption = "";
            MessageBoxButtons buttons = MessageBoxButtons.OK;
            DialogResult result;

            // Displays the MessageBox.

            result = MessageBox.Show(this, message, caption, buttons,
                MessageBoxIcon.Question, MessageBoxDefaultButton.Button1);
            cancel(sender, e);

        }

        private bool updateProcessList(Error error)
        {
            Debug.WriteLine("error name=" + error.CodeProperty, "insertError");
            Debug.WriteLine("error describe=" + error.DescribeProperty, "insertError");
            Debug.WriteLine("error handleProcess=" + error.HandleProcessProperty, "insertError");
            Debug.WriteLine("error confirmProcess=" + error.ConfirmProcessProperty, "insertError");
            Debug.WriteLine("error reason=" + error.ReasonProperty, "insertError");
            Debug.WriteLine("error resolveMethod=" + error.ResolveMethodProperty, "insertError");
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