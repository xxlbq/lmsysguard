using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;

namespace Sysguard.BackgroundManage.HostManage
{
    public partial class InsertHostForm : Form
    {
        private Host host;
        public InsertHostForm()
        {
            InitializeComponent();
        }
       

        private void commit(object sender, EventArgs e)
        {
            host = new Host();
            host.IPProperty = this.ipAddressControl.Text;
          
            host.DescribeProperty = describe.Text;


            string message;

            if (this.insertHost(host))
            {
                message = "添加主机成功!是否继续?";
            }
            else
            {
                message = "添加主机失败!是否继续?";
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
        private bool insertHost(Host host)
        {
            Debug.WriteLine("host ip=" + host.IPProperty, "insertHost");
            Debug.WriteLine("host name=" + host.NameProperty, "insertHost");
            Debug.WriteLine("host describe=" + host.DescribeProperty, "insertHost");

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
            ipAddressControl.Text = "";
            describe.Text = "";

        }
    }
}