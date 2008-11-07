using System;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Text;
using System.Windows.Forms;
using sysguard.Components;
using sysguard.Properties;
using sysguard.SysguardWS;


namespace sysguard.x
{
    public partial class HostInfo : UserControl
    {
        private MainForm mainForm;
        private IDataLayer dataLayer;
        public void init(MainForm m)
        {
            mainForm = m;
            mainForm.SetExcelEnabled(true);
            mainForm.SetStatus("主机管理");
            mainForm.SetPrintEnabled(true);
            mainForm.SetCopyEnable(true);
            //
            mainForm.SetNewClick(new System.EventHandler(NewToolStripMenuItem_Click));
            mainForm.SetDeleteClick(new System.EventHandler(DeleteToolStripMenuItem_Click));
            //
            string[] s = new string[dataGridView1.ColumnCount];
            for (int i = 0; i < s.Length; i++)
            {
                s[i] = dataGridView1.Columns[i].HeaderText;
            }
            mainForm.SetSearch(s);
        }
        public HostInfo()
        {
            InitializeComponent();
            GetData();
        }
        public DataGridView GetDataGridView()
        {
            return this.dataGridView1;
        }
        private void GetData()
        {
            dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllHostInfo();

            DataLayerResult result2 = dataLayer.GetAllGroupInfo();

            if (result2 == DataLayerResult.Success)
            {


                if (result == DataLayerResult.Success)
                {

                    foreach (SysguardWS.HostInfo info in dataLayer.HostInfoList.Values)
                    {

                        int i = dataGridView1.Rows.Add();

                        DataGridViewRow dgvr = dataGridView1.Rows[i];

                        dgvr.Cells[0].Value = info.hostId;

                        dgvr.Cells[1].Value = info.hostName;

                        dgvr.Cells[2].Value = info.hostIp;
                        if (dataLayer.GroupInfoList.Keys.Contains(info.groupId))
                        {
                            dgvr.Cells[3].Value = dataLayer.GroupInfoList[info.groupId].groupName;
                        }
                        dgvr.Cells[4].Value = info.description;

                        dgvr.Cells[5].Value = info.diskpartition;

                    }
                }
            }
        }

        private void NewToolStripMenuItem_Click(object sender, EventArgs e)
        {

            MyNewHost newHost = new MyNewHost(this);
            mainForm.CurrentOpenChildForm = newHost;
            if (newHost.ShowDialog() == DialogResult.OK)
            {
                Flush();
            }

        }

        private void ModifyToolStripMenuItem_Click(object sender, EventArgs e)
        {


            if (dataGridView1.SelectedRows.Count == 1)
            {

                MyModifyHost modifyHost = new MyModifyHost(this);
                mainForm.CurrentOpenChildForm = modifyHost;
                if (modifyHost.ShowDialog((int)dataGridView1.SelectedRows[0].Cells[0].Value) == DialogResult.OK)
                {
                    Flush();
                }
            }
            else
            {
                MessageBox.Show("选择并且只能选择一行。");
            }

        }

        private void DeleteToolStripMenuItem_Click(object sender, EventArgs e)
        {

            if (MessageBox.Show("你确认删除所选的这些主机吗？", "删除主机", MessageBoxButtons.YesNo) == DialogResult.Yes)
            {
                DataLayerResult result = DataLayerResult.None;

                foreach (DataGridViewRow row in dataGridView1.SelectedRows)
                {
                    result = dataLayer.DeleteHostByHostId((int)dataGridView1[0, row.Index].Value);

                    if (result != DataLayerResult.Success)
                    {
                        break;
                    }

                }

                Flush();

                if (result == DataLayerResult.Success)
                {
                    MessageBox.Show("成功删除！");
                }


            }


        }

        public void Flush()
        {
            this.dataGridView1.Rows.Clear();
            this.GetData();
            this.dataGridView1.Refresh();
        }

        private void CellMouseDoubleClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            this.ModifyToolStripMenuItem_Click(sender, e);
        }
    }
}
