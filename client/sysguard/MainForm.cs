using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Drawing.Printing;
using Sysguard.BackgroundManage.HostGroupManage;
using Sysguard.BackgroundManage.HostManage;
using Sysguard.BackgroundManage.ProcessList;
using Sysguard.BackgroundManage.UserManage;
using System.Net;
using sysguard.Components;
using System.Collections;
using sysguard.Properties;
using sysguard.SysguardWS;


namespace sysguard
{
    enum Manage : int
    {
        USER, HOST, GROUP, PROCESSLIST
    }
    public partial class MainForm : Form
    {

        /// <summary>
        /// 当前用户控件
        /// </summary>
        private sysguard.x.ExplainInfo explainInfo;
        private sysguard.x.UploadInfo uploadInfo;
        private sysguard.x.SystemInfo systemInfo;
        private sysguard.x.DailyInfo dailyInfo;
        private sysguard.x.UserInfo userInfo;
        private sysguard.x.GroupInfo groupInfo;
        private sysguard.x.HostInfo hostInfo;

        private UserControl current = null;

        private Form currentOpenChildForm;

        private bool PRINT = false;

        public Form CurrentOpenChildForm
        {
            set { currentOpenChildForm = value; }
            get { return currentOpenChildForm; }
        }
        //
        private DataGridViewPrinter MyDataGridViewPrinter;
        //
        private System.EventHandler NewEvent;
        private System.EventHandler DeleteEvent;
        //

        private int displayFormType;

        public int DisplayFormTypeProperty
        {
            get { return displayFormType; }
            set { displayFormType = value; }
        }

        public MainForm()
        {
            InitializeComponent();

            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            sysguard.SysguardWS.UserInfo user = dataLayer.User;

            if (user.roleId == 2)
            {
                this.SetTheEnable(false);
            }

        }

        private void UserControlShow(UserControl s)
        {
            if (this.current != null)
            {
                current.Dispose();
            }

            this.current = s;

            this.splitContainer1.Panel2.Controls.Add(current);
            // 
            // systemInfo1
            // 
            current.Dock = System.Windows.Forms.DockStyle.Fill;
            current.Location = new System.Drawing.Point(0, 0);
            current.Name = current.Name;
            current.Size = new System.Drawing.Size(445, 344);
            current.Visible = true;

        }

        private void putDataGridViewData(Array result)
        {
            /*
            for (int i = 0; i < result.Length; i++)
            {
                this.dataGridView1.Rows.Add();
                // this.dataGridView1.Rows[i].Cells[0].Value = i + 1;
                for (int j = 0; j < this.dataGridView1.Columns.Count; j++)
                {
                    this.dataGridView1.Rows[i].Cells[j].Value = ((Array)result.GetValue(i)).GetValue(j);

                }
            }
             */
        }

        private void changePwdTaskItem_Click(object sender, EventArgs e)
        {
            //系统信息
            systemInfo = new sysguard.x.SystemInfo();
            systemInfo.init(this);
            UserControlShow(systemInfo);

            /*
            this.dataGridView1.Columns.Clear();
            object[] hearders = new object[] {
            "IP",
            "CPU",
            "内存",
            "平均负载",
             "磁盘使用",
            "响应时间"};
            DataGridViewTextBoxColumn Column1 = new DataGridViewTextBoxColumn();
            Column1.HeaderText = "IP";
            dataGridView1.Columns.Add(Column1);

            DataGridViewProgressColumn Column2 = new DataGridViewProgressColumn();
            Column2.HeaderText = "CPU";
            dataGridView1.Columns.Add(Column2);

            DataGridViewProgressColumn Column3 = new DataGridViewProgressColumn();
            Column3.HeaderText = "内存";
            dataGridView1.Columns.Add(Column3);

            DataGridViewProgressColumn Column4 = new DataGridViewProgressColumn();
            Column4.HeaderText = "平均负载";
            dataGridView1.Columns.Add(Column4);

            DataGridViewProgressColumn Column5 = new DataGridViewProgressColumn();
            Column5.HeaderText = "磁盘使用";
            dataGridView1.Columns.Add(Column5);

            DataGridViewTextBoxColumn Column6 = new DataGridViewTextBoxColumn();
            Column6.HeaderText = "IP";
            dataGridView1.Columns.Add(Column6);


            //this.dataGridView1.Columns.Clear();
            toolStripCmbFind.Items.Clear();
            //Array result = new Array[] { new string[] { "aaa", "bbb", "ccc", "ddd", "eee", "ffff" }, new string[] { "aaa", "bbb", "ccc", "aaa", "bbb", "ffff" }, new string[] { "aaa", "bbb", "ccc", "aaa", "bbb", "ffff" }, new string[] { "aaa", "bbb", "ccc", "aaa", "bbb", "ffff" }, new string[] { "aaa", "bbb", "ccc", "aaa", "bbb", "ffff" }, new string[] { "aaa", "bbb", "ccc", "aaa", "bbb", "ffff" }, new string[] { "aaa", "bbb", "ccc", "aaa", "bbb", "ffff" } };
            //设置cookie
            CookieContainer cookieContainer = new CookieContainer();
            
            SysguardWS.sysguard service = new SysguardWS.sysguard();
            service.CookieContainer = cookieContainer;


            //登录
            SysguardWS.LoginRequest loginReq = new SysguardWS.LoginRequest();
            loginReq.username = "info";
            loginReq.password = "livedoor";
            SysguardWS.LoginResponse loginResp = service.Login(loginReq);


            //获取全部系统信息
            SysguardWS.GetAllSystemInfoRequest req = new SysguardWS.GetAllSystemInfoRequest();
            SysguardWS.GetAllSystemInfoResponse resp = service.GetAllSystemInfo(req);
            SysguardWS.SystemInfo[] sysInfo = resp.allSysInfo;
            toolStripCmbFind.ComboBox.Items.AddRange(hearders);

            this.statusStrip1.Items["toolStripStatusLabel1"].Text = "系统信息";
            //putDataGridViewColumn(hearders);

            for (int i = 0; i < sysInfo.Length; i++)
            {
                this.dataGridView1.Rows.Add();

                this.dataGridView1.Rows[i].Cells[0].Value = sysInfo[i].hostIp;
                this.dataGridView1.Rows[i].Cells[1].Value = sysInfo[i].cpu;
                this.dataGridView1.Rows[i].Cells[2].Value = sysInfo[i].memory;
                this.dataGridView1.Rows[i].Cells[3].Value = sysInfo[i].load;
                this.dataGridView1.Rows[i].Cells[4].Value = sysInfo[i].disk;
                this.dataGridView1.Rows[i].Cells[5].Value = sysInfo[i].responseTime;

            }

            */

        }

        private void putDataGridViewColumn(Array columns)
        {
            /*
            for (int i = 0; i < columns.Length; i++)
            {
                DataGridViewTextBoxColumn Column1 = new DataGridViewTextBoxColumn();
                Column1.HeaderText = columns.GetValue(i).ToString();
                dataGridView1.Columns.Add(Column1);
            }
            */
        }

        private void taskItem5_Click(object sender, EventArgs e)
        {

            uploadInfo = new sysguard.x.UploadInfo();
            uploadInfo.init(this);
            UserControlShow(uploadInfo);
            /*
            UploadForm upload = new UploadForm();
            upload.ShowDialog();
             */
        }

        private void MainForm_FormClosing(object sender, FormClosingEventArgs e)
        {


            DialogResult dr = MessageBox.Show("确认退出吗？", "操作确认", MessageBoxButtons.YesNo);
            if (dr == DialogResult.Yes)
            {
                IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
                DataLayerResult result = dataLayer.Logout(dataLayer.User.name);
                if (result == DataLayerResult.Success)
                {
                    trayIcon.Visible = false;
                    System.Environment.Exit(0);
                }

            }
            else
            {
                e.Cancel = true;
            }

        }

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DialogResult dr = MessageBox.Show("确认退出吗？", "操作确认", MessageBoxButtons.YesNo);
            if (dr == DialogResult.Yes)
            {
                IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
                DataLayerResult result = dataLayer.Logout(dataLayer.User.name);
                if (result == DataLayerResult.Success)
                {
                    trayIcon.Visible = false;
                    System.Environment.Exit(0);
                }
            }
        }

        private void logInfoTaskItem_Click(object sender, EventArgs e)
        {
            //日志信息
            dailyInfo = new sysguard.x.DailyInfo();
            dailyInfo.init(this);
            UserControlShow(dailyInfo);
            /*
            object[] hearders = new object[] {
             * 
            "IP",
            "日志ID",
            "日志",
            "等级",
            "状态",
            "时间"};
            this.dataGridView1.Columns.Clear();
            toolStripCmbFind.Items.Clear();
            Array result = new Array[] { new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" } };
            toolStripCmbFind.ComboBox.Items.AddRange(hearders);

            this.statusStrip1.Items["toolStripStatusLabel1"].Text = "系统信息";
            putDataGridViewColumn(hearders);

            putDataGridViewData(result);
             */
        }

        private void taskItem1_Click(object sender, EventArgs e)
        {
            //用户管理
            userInfo = new sysguard.x.UserInfo();
            userInfo.init(this);
            UserControlShow(userInfo);
            /*
            object[] hearders = new object[] {
            "用户ID",
            "全名",
            "描述",
            "角色",
            "创建时间"};
            this.dataGridView1.Columns.Clear();
            toolStripCmbFind.Items.Clear();
            Array result = new Array[] { new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" } };
            toolStripCmbFind.ComboBox.Items.AddRange(hearders);

            this.statusStrip1.Items["toolStripStatusLabel1"].Text = "用户管理";
            putDataGridViewColumn(hearders);

            putDataGridViewData(result);
            this.DisplayFormTypeProperty = (int)Manage.USER;
            */
        }

        private void taskItem2_Click(object sender, EventArgs e)
        {
            //主机管理
            hostInfo = new sysguard.x.HostInfo();
            hostInfo.init(this);
            UserControlShow(hostInfo);
            /*
            object[] hearders = new object[] {
            "主机ID",
            "IP",
            "名称",
            "默认分区",
            "描述",
            "角色",
            "创建时间"};
            this.dataGridView1.Columns.Clear();
            toolStripCmbFind.Items.Clear();
            Array result = new Array[] { new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg" } };
            toolStripCmbFind.ComboBox.Items.AddRange(hearders);

            this.statusStrip1.Items["toolStripStatusLabel1"].Text = "主机管理";
            putDataGridViewColumn(hearders);

            putDataGridViewData(result);
            this.DisplayFormTypeProperty = (int)Manage.HOST;
             */

        }

        private void taskItem3_Click(object sender, EventArgs e)
        {
            //群组管理
            groupInfo = new sysguard.x.GroupInfo();
            groupInfo.init(this);
            UserControlShow(groupInfo);

            /*
            object[] hearders = new object[] {
            "组ID",
            "名称",
            "描述",
            "创建时间"};
            this.dataGridView1.Columns.Clear();
            toolStripCmbFind.Items.Clear();
            Array result = new Array[] { new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff" } };
            toolStripCmbFind.ComboBox.Items.AddRange(hearders);

            this.statusStrip1.Items["toolStripStatusLabel1"].Text = "群组管理";
            putDataGridViewColumn(hearders);

            putDataGridViewData(result);
            this.DisplayFormTypeProperty = (int)Manage.GROUP;
            */
        }

        private void taskItem4_Click(object sender, EventArgs e)
        {

            //手顺管理
            explainInfo = new sysguard.x.ExplainInfo();
            explainInfo.init(this);
            UserControlShow(explainInfo);
            /*
            object[] hearders = new object[] {
            "错误编号",
            "错误描述","处理手顺","确认手顺","错误原因","解决方式","operateid",
            "到达时间"};
            this.dataGridView1.Columns.Clear();
            toolStripCmbFind.Items.Clear();
            Array result = new Array[] { new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg", "hhhhhh", "iiiiiii" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg", "hhhhhh", "iiiiiii" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg", "hhhhhh", "iiiiiii" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg", "hhhhhh", "iiiiiii" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg", "hhhhhh", "iiiiiii" }, new string[] { "aaa", "bbb", "ccc", "ddd", "eeee", "fffff", "ggggg", "hhhhhh", "iiiiiii" } };
            toolStripCmbFind.ComboBox.Items.AddRange(hearders);

            this.statusStrip1.Items["toolStripStatusLabel1"].Text = "手顺管理";
            putDataGridViewColumn(hearders);

            putDataGridViewData(result);
            this.DisplayFormTypeProperty = (int)Manage.PROCESSLIST;
            */
        }

        private DataGridView GetDataGridView()
        {
            String now = this.current.Name;

            switch (now)
            {

                case "DailyInfo":
                    return dailyInfo.GetDataGridView();

                case "ExplainInfo":
                    return explainInfo.GetDataGridView();

                case "GroupInfo":
                    return groupInfo.GetDataGridView();

                case "HostInfo":
                    return hostInfo.GetDataGridView();

                case "SystemInfo":
                    return systemInfo.GetDataGridView();

                case "UserInfo":
                    return userInfo.GetDataGridView();

                case "UploadInfo":
                    return null;

                default:
                    return null;
            }

        }
        private void toolStripButton1_Click(object sender, EventArgs e)
        {

            sysguard.Components.ExportExcel excel = new sysguard.Components.ExportExcel();

            DataGridView dgv = GetDataGridView();

            if (dgv != null)
            {
                excel.GenExcel(dgv);
            }

        }
        /*
        private bool SetupThePrinting()
        {

            DataGridView dgv = GetDataGridView();

            if (dgv != null)
            {
                //PrintDialog MyPrintDialog = new PrintDialog();
                printDialog1.AllowCurrentPage = false;
                printDialog1.AllowPrintToFile = false;
                printDialog1.AllowSelection = false;
                printDialog1.AllowSomePages = false;
                printDialog1.PrintToFile = false;
                printDialog1.ShowHelp = false;
                printDialog1.ShowNetwork = false;

                if (printDialog1.ShowDialog() != DialogResult.OK)
                    return false;

                MyPrintDocument.DocumentName = dgv.Name;
                MyPrintDocument.PrinterSettings = printDialog1.PrinterSettings;
                MyPrintDocument.DefaultPageSettings = printDialog1.PrinterSettings.DefaultPageSettings;
                MyPrintDocument.DefaultPageSettings.Margins = new Margins(40, 40, 40, 40);

                if (MessageBox.Show("Do you want the report to be centered on the page", "InvoiceManager - Center on Page", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)

                    MyDataGridViewPrinter = new DataGridViewPrinter(dgv, MyPrintDocument, true, true, "Customers", new Font("SimSun", 18, FontStyle.Bold, GraphicsUnit.Point), Color.Black, true);
                else

                    MyDataGridViewPrinter = new DataGridViewPrinter(dgv, MyPrintDocument, false, true, "Customers", new Font("SimSun", 18, FontStyle.Bold, GraphicsUnit.Point), Color.Black, true);


            }
            else
            {
                SetPrintEnabled(false);
            }

            return true;
        }
       
        private void printToolStripButton_Click(object sender, EventArgs e)
        {
            if (SetupThePrinting())
            {
                
                MyPrintDocument.Print();
            }
        }
         */

        //private void dataGridView1_CellDoubleClick(object sender, DataGridViewCellEventArgs e)
        //{
        //    ShowFluxForm form = new ShowFluxForm();
        //    form.ShowDialog();
        //}
        //
        
        private void MyPrintDocument_PrintPage(object sender, PrintPageEventArgs e)
        {
           
            bool more = MyDataGridViewPrinter.DrawDataGridView(e.Graphics);

            if (more == true)

                e.HasMorePages = true;


        }

        private void taskItem6_Click(object sender, EventArgs e)
        {

        }

        private void toolStripMenuItemAdd_Click(object sender, EventArgs e)
        {
            Form f;
            switch (this.DisplayFormTypeProperty)
            {
                case (int)Manage.USER:
                    f = new InsertUserForm();
                    break;
                case (int)Manage.HOST:
                    f = new InsertHostForm();
                    break;
                case (int)Manage.GROUP:
                    f = new InsertGroupForm();
                    break;
                case (int)Manage.PROCESSLIST:
                    f = new InsertProcessListForm();
                    break;
                default:
                    f = new InsertUserForm();
                    break;
            }
            f.ShowDialog();
        }

        private void toolStripMenuItemUpdate_Click(object sender, EventArgs e)
        {
            Form f;
            switch (this.DisplayFormTypeProperty)
            {
                case (int)Manage.USER:
                    f = new UpdateUserForm();
                    break;
                case (int)Manage.HOST:
                    f = new UpdateHostForm();
                    break;
                case (int)Manage.GROUP:
                    f = new UpdateGroupForm();
                    break;
                case (int)Manage.PROCESSLIST:
                    f = new UpdateProcessListForm();
                    break;
                default:
                    f = new UpdateUserForm();
                    break;
            }
            f.ShowDialog();
        }

        private void toolStripMenuItemDelete_Click(object sender, EventArgs e)
        {

        }

        private void copyToolStripButton_Click(object sender, EventArgs e)
        {
            DataGridView dgv = GetDataGridView();
            StringBuilder sb = new StringBuilder();
            
            for (int i = dgv.SelectedRows.Count - 1; i >= 0; i--)
            {
                DataGridViewRow row = dgv.SelectedRows[i];
                for (int j = 0; j < row.Cells.Count; j++)
                {
                    sb.Append(row.Cells[j].Value + "\t");
                }
                sb.Append("\r\n");

            }

            Clipboard.SetDataObject(sb.ToString());

        }

        private void MainForm_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.C && e.Control)
            {
                copyToolStripButton_Click(null, null);
            }
        }

        private void findToolStripButton_Click(object sender, EventArgs e)
        {


            if (toolStripCmbFind.Selected)
            {
                int column = toolStripCmbFind.SelectedIndex;
                MessageBox.Show(column.ToString());
                /*
                 for (int i = 0; i < dataGridView1.Rows.Count; i++)
                 {
                     DataGridViewRow row = dataGridView1.Rows[i];
                     if (!row.Cells[column].Value.ToString().Contains(toolStripTxtFind.Text))
                     {
                         dataGridView1.Rows.RemoveAt(i);
                     }
                 }
                 */
            }

        }

        //设置excel的控件显示
        public void SetExcelEnabled(bool ok)
        {
            toolStripButton1.Enabled = ok;
            ToolStripMenuItem1_Excel.Enabled = ok;

        }
        //设置状态拦信息
        public void SetStatus(string status)
        {
            this.toolStripStatusLabel1.Text = status;
        }
        //设置打印控件的显示
        public void SetPrintEnabled(bool ok)
        {
            this.PrintToolStripButton.Enabled = ok;
            this.Print_ToolStripMenuItem.Enabled = ok;

            //
            this.PrintView_ToolStripMenuItem.Enabled = ok;
            this.PrintView_ToolStripButton.Enabled = ok;

        }

        private void MainForm_Load(object sender, EventArgs e)
        {
            this.trayIcon.Icon = sysguard.Properties.Resources.SysguardOnline;
            IConnectionStateManager connStateManager = (IConnectionStateManager)sysguard.Properties.Settings.Default.Context["connStateManager"];
            connStateManager.TrayIcon = this.trayIcon;
            trayIcon.Visible = true;
        }

        private void MainForm_Resize(object sender, EventArgs e)
        {
            if (WindowState == FormWindowState.Minimized)
            {
                this.ShowInTaskbar = false;
            }
        }

        private void ShowMainToolStripMenuItem_Click(object sender, EventArgs e)
        {
            WindowState = FormWindowState.Normal;
        }

        private void ExitToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            DialogResult dr = MessageBox.Show("确认退出吗？", "操作确认", MessageBoxButtons.YesNo);
            if (dr == DialogResult.Yes)
            {
                //call xml-rpc logout
                trayIcon.Visible = false;
                System.Environment.Exit(0);

            }

        }
        //菜单打印
        private void Print_ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //PrintView_ToolStripMenuItem_Click(sender, e);
           
            DataGridView dgv = GetDataGridView();

            if (dgv != null)
            {

                PrintDialog MyPrintDialog = new PrintDialog();
                
                
                dgv.Refresh();

                if (MyPrintDialog.ShowDialog() == DialogResult.OK)
                {

                    MyPrintDocument.DefaultPageSettings = MyPrintDialog.PrinterSettings.DefaultPageSettings;

                    MyDataGridViewPrinter = new DataGridViewPrinter(dgv, MyPrintDocument, true, true, dgv.Name, new Font("SimSun", 18, FontStyle.Bold, GraphicsUnit.Point), Color.Black, true);

                    MyPrintDocument.Print();
                }
            }
       

        }
        //工具打印
        private void PrintToolStripButton_Click(object sender, EventArgs e)
        {
            //DataGridView dgv = GetDataGridView();
            Print_ToolStripMenuItem_Click(sender, e);
            /*
            if (dgv != null)
            {
                MyDataGridViewPrinter = new DataGridViewPrinter(dgv, MyPrintDocument, true, true, dgv.Name, new Font("SimSun", 18, FontStyle.Bold, GraphicsUnit.Point), Color.Black, true);
                MyPrintDocument.DocumentName = dgv.Name;

                MyPrintDocument.Print();
            }
            */

        }
        //打印预览
        private void PrintView_ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataGridView dgv = GetDataGridView();

            if (dgv != null)
            {

                MyDataGridViewPrinter = new DataGridViewPrinter(dgv, MyPrintDocument, true, true, dgv.Name, new Font("SimSun", 18, FontStyle.Bold, GraphicsUnit.Point), Color.Black, true);
                this.printPreviewDialog1.Document = MyPrintDocument;
                if (this.printPreviewDialog1.ShowDialog() == DialogResult.Cancel)
                {
                    this.PRINT = false;
                }
            }

        }
        //新建按钮显示
        public void SetNewClick(System.EventHandler eve)
        {
            if (eve == null)
            {
                this.NewNode_ToolStripButton.Enabled = false;
                this.NewNode_ToolStripMenuItem.Enabled = false;
                if (this.NewEvent != null)
                {
                    this.NewNode_ToolStripMenuItem.Click -= this.NewEvent;
                    this.NewNode_ToolStripButton.Click -= this.NewEvent;
                }
            }
            else
            {

                this.NewNode_ToolStripButton.Enabled = true;
                this.NewNode_ToolStripMenuItem.Enabled = true;

                if (this.NewEvent != null)
                {
                    this.NewNode_ToolStripMenuItem.Click -= this.NewEvent;
                    this.NewNode_ToolStripButton.Click -= this.NewEvent;
                }

                this.NewNode_ToolStripButton.Click += eve;
                this.NewNode_ToolStripMenuItem.Click += eve;

                this.NewEvent = eve;

            }
        }
        //拷贝按钮显示
        public void SetCopyEnable(bool ok)
        {
            this.Copy_ToolStripButton.Enabled = ok;
            this.Copy_ToolStripMenuItem1.Enabled = ok;
        }

        //删除按钮显示
        public void SetDeleteClick(System.EventHandler eve)
        {
            if (eve == null)
            {
                this.Delete_ToolStripButton.Enabled = false;
                this.Delete_ToolStripMenuItem.Enabled = false;
                if (this.DeleteEvent != null)
                {
                    this.Delete_ToolStripMenuItem.Click -= this.DeleteEvent;
                    this.Delete_ToolStripButton.Click -= this.DeleteEvent;
                }
            }
            else
            {

                this.Delete_ToolStripButton.Enabled = true;
                this.Delete_ToolStripMenuItem.Enabled = true;

                if (this.DeleteEvent != null)
                {
                    this.Delete_ToolStripMenuItem.Click -= this.DeleteEvent;
                    this.Delete_ToolStripButton.Click -= this.DeleteEvent;
                }


                this.Delete_ToolStripButton.Click += eve;
                this.Delete_ToolStripMenuItem.Click += eve;

                this.DeleteEvent = eve;

            }

        }
        //设置查找数据
        public void SetSearch(string[] s)
        {
            toolStripCmbFind.Items.Clear();

            if (s != null)
            {
                for (int i = 0; i < s.Length; i++)
                {
                    toolStripCmbFind.Items.Add(s[i]);
                }
            }

        }


        private void SelectedIndexChanged(object sender, EventArgs e)
        {
            if (!this.toolStripTxtFind.Text.Trim().Equals(""))
            {
                this.findToolStripButton.Enabled = true;
            }
            else
            {
                this.findToolStripButton.Enabled = false;
            }
        }

        private void TextChanged(object sender, EventArgs e)
        {

        }

        private void trayIcon_MouseDoubleClick(object sender, MouseEventArgs e)
        {
            WindowState = FormWindowState.Normal;
        }
        //设置功能操作的权限
        public void SetTheEnable(bool ok)
        {
            this.pictureTasksExpando.Visible = ok;
            this.expando2.Visible = ok;

            this.taskItem2.Dispose();
            this.taskItem3.Dispose();
        }

        private void BeginPrint(object sender, PrintEventArgs e)
        {
            if (PRINT == false)
            {

                MyDataGridViewPrinter.SetPages();
            }
        }

        private void 关于ToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            AboutBox aboutBox = new AboutBox();
            aboutBox.ShowDialog();
        }
     
    }

}
