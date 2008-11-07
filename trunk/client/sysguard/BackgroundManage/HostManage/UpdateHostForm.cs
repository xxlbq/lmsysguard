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
    public partial class UpdateHostForm : Form
    {
        public UpdateHostForm()
        {
            InitializeComponent();
        }
        
        public UpdateHostForm(Host host)
        {
            InitializeComponent();
            initData(host);
        }
        private void initData(Host host)
        {
            
            //this.ip.Text = host.IPProperty;
            //this.name.Text = host.NameProperty;
            this.describe.Text = host.DescribeProperty;
        }

        private void commit(object sender, EventArgs e)
        {
            Host host = new Host();
            //host.IPProperty = ;
            //host.NameProperty = name.Text;
            //host.DescribeProperty = describe.Text;
            /*
              * 
              *invoke webservice interface 
              * 
              */
            string message;

            if (this.updateHost(host))
            {
                message = "更新主机成功!";
            }
            else
            {
                message = "更新主机失败!";
            }

            string caption = "";
            MessageBoxButtons buttons = MessageBoxButtons.OK;
            DialogResult result;

            // Displays the MessageBox.

            result = MessageBox.Show(this, message, caption, buttons,
                MessageBoxIcon.Question, MessageBoxDefaultButton.Button1);
            cancel(sender, e);
        }
        private bool updateHost(Host host)
        {
            Debug.WriteLine("host ip=" + host.IPProperty, "insertHost");
            Debug.WriteLine("host name=" + host.NameProperty, "insertHost");
            Debug.WriteLine("host describe=" + host.DescribeProperty, "insertHost");
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


        private void cancel(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}