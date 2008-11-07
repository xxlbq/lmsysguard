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
    public partial class InsertProcessListForm : Form
    {
        public InsertProcessListForm()
        {
            InitializeComponent();
        }


        private void commit(object sender, EventArgs e)
        {
            Error error = new Error();
            error.CodeProperty = code.Text;
            error.DescribeProperty = describe.Text;
            error.HandleProcessProperty = handleProcess.Text;
            error.ConfirmProcessProperty = confirmProcess.Text;
            error.ReasonProperty = reason.Text;
            error.ResolveMethodProperty = resolveMethod.Text;

            string message;

            if (this.insertError(error))
            {
                message = "添加手顺成功!是否继续?";
            }
            else
            {
                message = "添加手顺失败!是否继续?";
            }

            string caption = "";
            MessageBoxButtons buttons = MessageBoxButtons.YesNo;
            DialogResult result;

            // Displays the MessageBox.

            result = MessageBox.Show(this, message, caption, buttons,
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



        private void cancel(object sender, EventArgs e)
        {
            this.Close();
        }
        private bool insertError(Error error)
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

        private void reset()
        {
            code.Text = "";
            describe.Text = "";
            handleProcess.Text = "";
            confirmProcess.Text = "";
            reason.Text = "";
            resolveMethod.Text = "";

        }


    }
}