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
    public partial class MyModifyGroup : Form
    {
        private int group_id;

        private IDataLayer dataLayer;
        private GroupInfo groupControl;

        public MyModifyGroup(GroupInfo _groupControl)
        {
            this.groupControl = _groupControl;
            InitializeComponent();
        }
        private void GetData()
        {
            dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllGroupInfo();

            DataLayerResult result2 = dataLayer.GetAllOsTypeInfo();

            if (result == DataLayerResult.Success && result2 == DataLayerResult.Success)
            {
                SysguardWS.GroupInfo info = dataLayer.GroupInfoList[group_id];

                if (info != null)
                {
                    this.textBox1.Text = info.groupName;

                    this.textBox2.Text = info.description;

                    foreach (SysguardWS.OsTypeInfo info_os in dataLayer.OsTypeInfoList.Values)
                    {
                        this.comboBox1.Items.Add(info_os.osName);
                        if (info_os.osId == info.osId)
                        {

                            this.comboBox1.SelectedItem = info_os.osName;
                        }
                    }

                }



            }
        }
        public DialogResult ShowDialog(int groupid)
        {
            group_id = groupid;

            GetData();

            return ShowDialog();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //名称
            if (this.textBox1.Text.Trim().Equals(""))
            {
                MessageBox.Show("名称不能为空！");
                return;
            }

            //描述
            if (this.textBox2.Text.Trim().Equals(""))
            {
                MessageBox.Show("描述不能为空！");
                return;
            }
            //操作系统
            if (this.comboBox1.SelectedIndex < 0)
            {
                MessageBox.Show("请选择操作系统！");
                return;
            }
            //ostype
            sysguard.SysguardWS.GroupInfo groupInfo = new sysguard.SysguardWS.GroupInfo();

            DataLayerResult result = dataLayer.GetAllOsTypeInfo();

            int osid = -1;

            foreach (sysguard.SysguardWS.OsTypeInfo info in dataLayer.OsTypeInfoList.Values)
            {
                if (this.comboBox1.Text.Equals(info.osName))
                {
                    osid = info.osId;

                    break;

                }
            }

            if (osid < 0)
            {
                MessageBox.Show("请选择操作系统！");
                return;
            }
            else
            {
                groupInfo.osId = osid;
            }

            //
            groupInfo.groupId = group_id;
            groupInfo.groupName = this.textBox1.Text;
            groupInfo.description = this.textBox2.Text;

            DataLayerResult result2 = dataLayer.ModifyGroupInf(groupInfo);
            if (result2 == DataLayerResult.Success)
            {
                DialogResult resultDialo= MessageBox.Show("群组修改成功,是否退出?","修改成功!",MessageBoxButtons.YesNo);

                if (resultDialo == DialogResult.Yes)
                {
                    this.DialogResult = DialogResult.OK;
                    this.Dispose();
                }
                else {
                    groupControl.Flush();
                    GetData();
                }
            }
            

        }

        private void button2_Click(object sender, EventArgs e)
        {
            GetData();

        }
    }
}