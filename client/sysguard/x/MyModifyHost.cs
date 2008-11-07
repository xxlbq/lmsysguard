using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using sysguard.Components;
using sysguard.Properties;
using sysguard.SysguardWS;

namespace sysguard.x
{
    public partial class MyModifyHost : Form
    {
        private int host_id;
        private IDataLayer dataLayer;
        private HostInfo hostControl;
        public MyModifyHost(HostInfo _hostControl)
        {
            this.hostControl = _hostControl;
            InitializeComponent();

        }
        private void GetData()
        {
            dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllHostInfo();

            DataLayerResult result2 = dataLayer.GetAllGroupInfo();

            if (result == DataLayerResult.Success && result2 == DataLayerResult.Success)
            {
                SysguardWS.HostInfo info = null;

                foreach (SysguardWS.HostInfo info2 in dataLayer.HostInfoList.Values)
                {
                    if (info2.hostId == host_id)
                    {
                        info = info2;
                        break;
                    }
                }

                if (info != null)
                {

                    this.ipAddressControl1.Text = info.hostIp;
                    this.textBox1.Text = info.hostName;
                    this.textBox7.Text = info.diskpartition;
                    this.textBox8.Text = info.description;


                    foreach (SysguardWS.GroupInfo info_group in dataLayer.GroupInfoList.Values)
                    {
                        int index = this.comboBox1.Items.Add(info_group.groupName);
                        if (info.groupId == info_group.groupId)
                        {
                            this.comboBox1.SelectedItem = info_group.groupName;
                        }
                    }


                }

            }
        }
        public DialogResult ShowDialog(int hostid)
        {
            host_id = hostid;

            GetData();

            return this.ShowDialog();

        }

        private void button1_Click(object sender, EventArgs e)
        {

            sysguard.SysguardWS.HostInfo host = new sysguard.SysguardWS.HostInfo();

            DataLayerResult result = dataLayer.GetAllGroupInfo();

            int group_id = -1;

            if (result == DataLayerResult.Success)
            {
                foreach (SysguardWS.GroupInfo info in dataLayer.GroupInfoList.Values)
                {
                    if (this.comboBox1.Text.Equals(info.groupName))
                    {
                        group_id = info.groupId;
                        break;
                    }
                }
            }

            if (group_id >= 0)
            {
                host.groupId = group_id;

            }
            else
            {
                MessageBox.Show("请选择组！");
                return;
            }
            //ＩＰ
            string[] ip = ipAddressControl1.Text.Split(new char[] { '.' });

            for (int i = 0; i < ip.Length; i++)
            {
                if (ip[i].Equals(""))
                {
                    MessageBox.Show("IP地址不可以空！");
                    return;
                }
            }
            //主机名
            if (this.textBox1.Text.Trim().Equals(""))
            {
                MessageBox.Show("请输入主机名！");
                return;
            }
            //分区
            if (this.textBox7.Text.Trim().Equals(""))
            {
                MessageBox.Show("分区不能为空！");
                return;
            }

            //

            host.hostId = host_id;
            host.hostIp = this.ipAddressControl1.Text;
            host.hostName = this.textBox1.Text;
            host.description = this.textBox8.Text;
            host.diskpartition = this.textBox7.Text;

            DataLayerResult result2 = dataLayer.ModifyHostInfo(host);

            if (result2 == DataLayerResult.Success)
            {
              DialogResult resultDialo=  MessageBox.Show("修改主机信息成功是否退出?","修改成功!",MessageBoxButtons.YesNo);

              if (resultDialo == DialogResult.Yes)
              {
                  this.DialogResult = DialogResult.OK;
                  this.Dispose();
              }
              else {
                  hostControl.Flush();
              }
            }


        }

        private void button2_Click(object sender, EventArgs e)
        {
            GetData();
        }


    }
}