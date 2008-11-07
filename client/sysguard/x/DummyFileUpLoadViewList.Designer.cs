namespace sysguard.x
{
    partial class DummyFileUpLoadViewList
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.expList1 = new ExplorerControls.ExpList();
            this.expListColumn1 = new ExplorerControls.ExpListColumn();
            this.expListColumn2 = new ExplorerControls.ExpListColumn();
            this.expListColumn3 = new ExplorerControls.ExpListColumn();
            this.expListColumn4 = new ExplorerControls.ExpListColumn();
            this.expListColumn5 = new ExplorerControls.ExpListColumn();
            this.expListColumn6 = new ExplorerControls.ExpListColumn();
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // expList1
            // 
            this.expList1.AllowColumnReorder = true;
            this.expList1.AllowDrop = true;
            this.expList1.Columns.AddRange(new ExplorerControls.ExpListColumn[] {
            this.expListColumn1,
            this.expListColumn2,
            this.expListColumn3,
            this.expListColumn4,
            this.expListColumn5,
            this.expListColumn6});
            this.expList1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.expList1.LabelEdit = true;
            this.expList1.Location = new System.Drawing.Point(0, 0);
            this.expList1.Name = "expList1";
            this.expList1.ShowItemToolTips = true;
            this.expList1.Size = new System.Drawing.Size(475, 273);
            this.expList1.TabIndex = 0;
            this.expList1.UseCompatibleStateImageBehavior = false;
            this.expList1.ViewStyle = ExplorerControls.ExpListView.Thumbnail;
            this.expList1.ItemsAdded += new ExplorerControls.ExpList.ItemsAddedEventHandler(this.expList1_ItemsAdded);
            // 
            // expListColumn1
            // 
            this.expListColumn1.ColumnType = ExplorerControls.ExpListColumnType.Name;
            this.expListColumn1.ExpList = this.expList1;
            this.expListColumn1.Text = "名称";
            this.expListColumn1.Width = 130;
            // 
            // expListColumn2
            // 
            this.expListColumn2.ColumnType = ExplorerControls.ExpListColumnType.Size;
            this.expListColumn2.ExpList = this.expList1;
            this.expListColumn2.Text = "大小";
            this.expListColumn2.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            this.expListColumn2.Width = 50;
            // 
            // expListColumn3
            // 
            this.expListColumn3.ColumnType = ExplorerControls.ExpListColumnType.Type;
            this.expListColumn3.ExpList = this.expList1;
            this.expListColumn3.Text = "类型";
            this.expListColumn3.Width = 90;
            // 
            // expListColumn4
            // 
            this.expListColumn4.ColumnType = ExplorerControls.ExpListColumnType.Modified;
            this.expListColumn4.ExpList = this.expList1;
            this.expListColumn4.Text = "修改日期";
            this.expListColumn4.Width = 85;
            // 
            // expListColumn5
            // 
            this.expListColumn5.ColumnType = ExplorerControls.ExpListColumnType.Created;
            this.expListColumn5.ExpList = this.expList1;
            this.expListColumn5.Text = "创建时间";
            this.expListColumn5.Width = 85;
            // 
            // expListColumn6
            // 
            this.expListColumn6.ColumnType = ExplorerControls.ExpListColumnType.Path;
            this.expListColumn6.ExpList = this.expList1;
            this.expListColumn6.Text = "路径";
            this.expListColumn6.Width = 185;
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.expList1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(475, 273);
            this.panel1.TabIndex = 1;
            // 
            // DummyFileUpLoadViewList
            // 
            this.AllowedStates = ((WeifenLuo.WinFormsUI.ContentStates)(((WeifenLuo.WinFormsUI.ContentStates.Float | WeifenLuo.WinFormsUI.ContentStates.DockTop)
                        | WeifenLuo.WinFormsUI.ContentStates.Document)));
            this.ClientSize = new System.Drawing.Size(475, 273);
            this.Controls.Add(this.panel1);
            this.HideOnClose = true;
            this.Name = "DummyFileUpLoadViewList";
            this.Text = "文件上传视图";
            this.panel1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private ExplorerControls.ExpList expList1;
        private System.Windows.Forms.Panel panel1;
        private ExplorerControls.ExpListColumn expListColumn1;
        private ExplorerControls.ExpListColumn expListColumn2;
        private ExplorerControls.ExpListColumn expListColumn3;
        private ExplorerControls.ExpListColumn expListColumn4;
        private ExplorerControls.ExpListColumn expListColumn5;
        private ExplorerControls.ExpListColumn expListColumn6;
    }
}
