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
    public partial class ExplainInfo : UserControl
    {
        private MainForm mainForm;
        private IDataLayer dataLayer;

        public void init(MainForm m)
        {
            mainForm = m;
            mainForm.SetExcelEnabled(true);
            mainForm.SetStatus("手顺管理");
            mainForm.SetPrintEnabled(true);
            mainForm.SetCopyEnable(true);
            //
            mainForm.SetNewClick(new System.EventHandler(this.NewExplainToolStripMenuItem_Click));
            mainForm.SetDeleteClick(new System.EventHandler(this.DeleteExplainToolStripMenuItem_Click));
            //
            string[] s = new string[dataGridView1.ColumnCount];
            for (int i = 0; i < s.Length; i++)
            {
                s[i] = dataGridView1.Columns[i].HeaderText;
            }
            mainForm.SetSearch(s);
        }
        public ExplainInfo()
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

            DataLayerResult result = dataLayer.GetAllOperationInfo();

            if (result == DataLayerResult.Success)
            {

                foreach (SysguardWS.OperationInfo info in dataLayer.OperationInfoList.Values)
                {
                    int i = this.dataGridView1.Rows.Add();

                    DataGridViewRow dgvr = dataGridView1.Rows[i];
                    
                    dgvr.Cells[0].Value = info.operId;

                    dgvr.Cells[1].Value = info.errorDesp;

                    dgvr.Cells[2].Value = info.operContent;

                    dgvr.Cells[3].Value = info.userId;

                    dgvr.Cells[4].Value = info.inputTime;

                }

            }
        }

        private void NewExplainToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MyNewExplain newExplain = new MyNewExplain(this);
            mainForm.CurrentOpenChildForm = newExplain;
            if (newExplain.ShowDialog() == DialogResult.OK)
            {
                Flush();
            }
        }

        private void ModifyExplainToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if(dataGridView1.SelectedRows.Count == 1){
                MyModifyExplain modifyExplain = new MyModifyExplain(this);
                mainForm.CurrentOpenChildForm = modifyExplain;
                if (modifyExplain.ShowDialog((int)dataGridView1.SelectedRows[0].Cells[0].Value) == DialogResult.OK)
                {
                    Flush();
                }
            }else{
                MessageBox.Show("选择并且只能选择一行。");
            }
        }

        private void DeleteExplainToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("你确认删除所选的这些手顺吗？", "删除手顺", MessageBoxButtons.YesNo) == DialogResult.Yes)
            {
                DataLayerResult result = DataLayerResult.None;
                foreach (DataGridViewRow row in dataGridView1.SelectedRows)
                {
                    result = dataLayer.DeleteOperationInfoByOperationId((int)dataGridView1[0, row.Index].Value);

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

        private void CellMouseDoubleClick(object sender, DataGridViewCellEventArgs e)
        {
            this.ModifyExplainToolStripMenuItem_Click(sender, e);
        }

    }
}
