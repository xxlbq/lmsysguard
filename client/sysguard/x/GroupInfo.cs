using System;
using System.Collections.Generic;
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
    public partial class GroupInfo : UserControl
    {
        private MainForm mainForm;
        private IDataLayer dataLayer;
        public void init(MainForm m)
        {
            mainForm = m;
            mainForm.SetExcelEnabled(true);
            mainForm.SetStatus("群组管理");
            mainForm.SetPrintEnabled(true);
            mainForm.SetCopyEnable(true);
            //
            mainForm.SetNewClick(new System.EventHandler(this.NewGroupToolStripMenuItem_Click));
            mainForm.SetDeleteClick(new System.EventHandler(this.DeleteGroupToolStripMenuItem_Click));
            //
            string[] s = new string[dataGridView1.ColumnCount];
            for (int i = 0; i < s.Length; i++)
            {
                s[i] = dataGridView1.Columns[i].HeaderText;
            }
            mainForm.SetSearch(s);
        }
        public GroupInfo()
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

            DataLayerResult result = dataLayer.GetAllGroupInfo();

            if (result == DataLayerResult.Success)
            {

                foreach (SysguardWS.GroupInfo info in dataLayer.GroupInfoList.Values)
                {
                    int i = this.dataGridView1.Rows.Add();

                    DataGridViewRow dgvr = dataGridView1.Rows[i];

                    dgvr.Cells[0].Value = info.groupId;

                    dgvr.Cells[1].Value = info.groupName;

                    dgvr.Cells[2].Value = info.description;


                }

            }
        }


        private void NewGroupToolStripMenuItem_Click(object sender, EventArgs e)
        {

            MyNewGroup newGroup = new MyNewGroup(this);
            mainForm.CurrentOpenChildForm = newGroup;
            if (newGroup.ShowDialog() == DialogResult.OK)
            {
                Flush();
            }


        }

        private void ModifyGroupToolStripMenuItem_Click(object sender, EventArgs e)
        {

            if (dataGridView1.SelectedRows.Count == 1)
            {
                MyModifyGroup modifyGroup = new MyModifyGroup(this);
                mainForm.CurrentOpenChildForm = modifyGroup;
                if (modifyGroup.ShowDialog((int)dataGridView1.SelectedRows[0].Cells[0].Value) == DialogResult.OK)
                {
                    Flush();
                }
            }
            else
            {
                MessageBox.Show("选择并且只能选择一行。");
            }



        }

        private void DeleteGroupToolStripMenuItem_Click(object sender, EventArgs e)
        {


            if (MessageBox.Show("你确认删除所选的这些群组吗？", "删除群组", MessageBoxButtons.YesNo) == DialogResult.Yes)
            {
                DataLayerResult result = DataLayerResult.None;

                foreach (DataGridViewRow row in dataGridView1.SelectedRows)
                {
                    result = dataLayer.DeleteGroupByGroupId((int)dataGridView1[0, row.Index].Value);

                    if (result != DataLayerResult.Success)
                    {
                        break;
                    }

                }

                Flush();

                if (result == DataLayerResult.Success)
                {
                    MessageBox.Show("成功删除！", "删除成功", MessageBoxButtons.OK);
                }
                else if (result == DataLayerResult.GroupISRefNoDelete)
                {
                    MessageBox.Show("由于有引用关系存在所以不能删除！", "删除失败", MessageBoxButtons.OK);
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
            this.ModifyGroupToolStripMenuItem_Click(sender, e);
        }

    }
}
