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
    public partial class UserInfo : UserControl
    {
        private MainForm mainForm;
        private List<DataGridViewRow> dgvList = new List<DataGridViewRow>();

        private IDataLayer dataLayer;

        public void init(MainForm m)
        {
            mainForm = m;
            mainForm.SetExcelEnabled(true);
            mainForm.SetStatus("用户管理");
            mainForm.SetPrintEnabled(true);
            mainForm.SetCopyEnable(true);
            //
            mainForm.SetNewClick(new System.EventHandler(this.NewUser_Click));
            mainForm.SetDeleteClick(new System.EventHandler(this.DeleteUserToolStripMenuItem_Click));
            //
            string[] s = new string[dataGridView1.ColumnCount];
            for (int i = 0; i < s.Length; i++)
            {
                s[i] = dataGridView1.Columns[i].HeaderText;
            }
            mainForm.SetSearch(s);
        }

        public UserInfo()
        {
            InitializeComponent();
            GetData(this.dataGridView1);
        }
        public DataGridView GetDataGridView()
        {
            return this.dataGridView1;
        }
        private void GetData(DataGridView d)
        {
            dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllUserInfo();

            DataLayerResult result2 = dataLayer.GetAllRoleInfo();

            if (result == DataLayerResult.Success)
            {

                foreach (SysguardWS.UserInfo info in dataLayer.UserInfoList.Values)
                {

                    int i = d.Rows.Add();

                    DataGridViewRow dgvr = dataGridView1.Rows[i];

                    dgvr.Cells[0].Value = info.userId;

                    dgvr.Cells[1].Value = info.name;

                    //角色

                    dgvr.Cells[2].Value = dataLayer.RoleInfoList[info.roleId].name;

                    dgvr.Cells[3].Value = info.inputTime;

                }

            }
        }

        private void NewUser_Click(object sender, EventArgs e)
        {
            sysguard.SysguardWS.UserInfo user = dataLayer.User;

            if (user.roleId > 0)
            {
                MessageBox.Show("您没有用户管理的权限！");
            }
            else
            {
                NewUser newUser = new NewUser(this);
                mainForm.CurrentOpenChildForm = newUser;
                newUser.ShowDialog();
                if (newUser.DialogResult == DialogResult.OK)
                {
                    Flush();
                }

            }

        }

        private void DeleteUserToolStripMenuItem_Click(object sender, EventArgs e)
        {
            sysguard.SysguardWS.UserInfo user = dataLayer.User;

            if (user.roleId > 0)
            {
                MessageBox.Show("您没有用户管理的权限！");
            }
            else
            {
                //判断是否包含自己
                bool del = true;
                foreach (DataGridViewRow dgvrow in this.dataGridView1.SelectedRows)
                {
                    if (user.userId.ToString().Equals(dgvrow.Cells[0].Value.ToString()))
                    {
                        del = false;
                        break;
                    }
                }
                if (del)
                {
                    DialogResult result = MessageBox.Show("是否删除该用户?", "是否删除用户!", MessageBoxButtons.YesNo);
                    if (result == DialogResult.Yes)
                    {
                        dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

                        int success = 0;

                        foreach (DataGridViewRow dgvrow in this.dataGridView1.SelectedRows)
                        {
                            int userid = (int)dgvrow.Cells[0].Value;
                            DataLayerResult dataResult = dataLayer.DeleteUserByUserId(userid);
                            if (dataResult == DataLayerResult.Success)
                            {
                                success++;
                            }
                          
                        }
                        if (success == this.dataGridView1.SelectedRows.Count)
                        {
                            MessageBox.Show("删除成功!");
                            Flush();
                        }
                    }
                }
                else
                {
                    MessageBox.Show("删除的用户中包含自己，不能删除！");
                }
            }
        }

        private void ModifyUserToolStripMenuItem_Click(object sender, EventArgs e)
        {
            sysguard.SysguardWS.UserInfo user = dataLayer.User;
           
                UpdateUser updateUser = new UpdateUser(this);
                mainForm.CurrentOpenChildForm = updateUser;
                if (this.dataGridView1.SelectedRows.Count > 1)
                {
                    MessageBox.Show("只能选择一行修改!");
                }
                else if (this.dataGridView1.SelectedRows.Count == 1)
                {
                    if (user.roleId == 2 && (int)this.dataGridView1.SelectedRows[0].Cells[0].Value != user.userId )
                    {
                        MessageBox.Show("你只能更改自己的信息！");
                    }
                    else
                    {
                        updateUser.ShowDialg(this.dataGridView1.SelectedRows[0]);
                        if (updateUser.DialogResult == DialogResult.OK)
                        {
                            Flush();
                        }
                    }
                    
                }
                else
                {
                    MessageBox.Show("请选择一行然后在修改!");
                }
            
        }
        public void Flush()
        {
            this.dataGridView1.Rows.Clear();
            GetData(this.dataGridView1);
        }

        private void CellMouse_DoubleClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            this.ModifyUserToolStripMenuItem_Click(sender, e);
        }
    }
}
