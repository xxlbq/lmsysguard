namespace sysguard.x
{
    partial class MyUploadInfo
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            ExplorerControls.ExpComboItem expComboItem1 = new ExplorerControls.ExpComboItem();
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.Browser1 = new ExplorerControls.Browser();
            this.expListColumn1 = new ExplorerControls.ExpListColumn();
            this.expListColumn2 = new ExplorerControls.ExpListColumn();
            this.expListColumn3 = new ExplorerControls.ExpListColumn();
            this.expListColumn4 = new ExplorerControls.ExpListColumn();
            this.panel5 = new System.Windows.Forms.Panel();
            this.dockManager = new WeifenLuo.WinFormsUI.DockManager();
            this.panel1 = new System.Windows.Forms.Panel();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.panel3 = new System.Windows.Forms.Panel();
            this.flatButton6 = new ExplorerControls.FlatButton();
            this.panel2 = new System.Windows.Forms.Panel();
            this.flatButton3 = new ExplorerControls.FlatButton();
            this.flatButton1 = new ExplorerControls.FlatButton();
            this.flatButton5 = new ExplorerControls.FlatButton();
            this.flatButton2 = new ExplorerControls.FlatButton();
            this.flatButton4 = new ExplorerControls.FlatButton();
            this.toolTip1 = new System.Windows.Forms.ToolTip(this.components);
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            this.panel5.SuspendLayout();
            this.panel1.SuspendLayout();
            this.panel3.SuspendLayout();
            this.panel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Name = "splitContainer1";
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.Browser1);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.panel5);
            this.splitContainer1.Panel2.Controls.Add(this.panel1);
            this.splitContainer1.Size = new System.Drawing.Size(633, 504);
            this.splitContainer1.SplitterDistance = 295;
            this.splitContainer1.TabIndex = 0;
            // 
            // Browser1
            // 
            this.Browser1.Columns.AddRange(new ExplorerControls.ExpListColumn[] {
            this.expListColumn1,
            this.expListColumn2,
            this.expListColumn3,
            this.expListColumn4});
            this.Browser1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.Browser1.Location = new System.Drawing.Point(0, 0);
            this.Browser1.Name = "Browser1";
            this.Browser1.RootDirectory = ExplorerControls.ExpTree.StartDir.Desktop;
            this.Browser1.SelectedComboIndex = 1;
            this.Browser1.SelectedComboItem = expComboItem1;
            this.Browser1.Size = new System.Drawing.Size(295, 504);
            this.Browser1.StartUpDirectory = ExplorerControls.ExpTree.StartDir.MyDocuments;
            this.Browser1.TabIndex = 3;
            this.Browser1.TileSize = new System.Drawing.Size(200, 80);
            this.Browser1.View = ExplorerControls.ExpListView.Details;
            // 
            // expListColumn1
            // 
            this.expListColumn1.ColumnType = ExplorerControls.ExpListColumnType.Name;
            this.expListColumn1.Text = "名称";
            this.expListColumn1.Width = 130;
            // 
            // expListColumn2
            // 
            this.expListColumn2.ColumnType = ExplorerControls.ExpListColumnType.Size;
            this.expListColumn2.Text = "大小";
            this.expListColumn2.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            this.expListColumn2.Width = 50;
            // 
            // expListColumn3
            // 
            this.expListColumn3.ColumnType = ExplorerControls.ExpListColumnType.Type;
            this.expListColumn3.Text = "类型";
            this.expListColumn3.Width = 90;
            // 
            // expListColumn4
            // 
            this.expListColumn4.ColumnType = ExplorerControls.ExpListColumnType.Modified;
            this.expListColumn4.Text = "修改时间";
            this.expListColumn4.Width = 85;
            // 
            // panel5
            // 
            this.panel5.Controls.Add(this.dockManager);
            this.panel5.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel5.Location = new System.Drawing.Point(0, 27);
            this.panel5.Name = "panel5";
            this.panel5.Size = new System.Drawing.Size(334, 477);
            this.panel5.TabIndex = 9;
            // 
            // dockManager
            // 
            this.dockManager.ActiveAutoHideContent = null;
            this.dockManager.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dockManager.Location = new System.Drawing.Point(0, 0);
            this.dockManager.Name = "dockManager";
            this.dockManager.Size = new System.Drawing.Size(334, 477);
            this.dockManager.TabIndex = 0;
            this.dockManager.ContentRemoved += new WeifenLuo.WinFormsUI.DockManager.ContentEventHandler(this.dockManager_ContentRemoved);
            this.dockManager.ActiveDocumentChanged += new System.EventHandler(this.dockManager_ActiveDocumentChanged);
            this.dockManager.ContentAdded += new WeifenLuo.WinFormsUI.DockManager.ContentEventHandler(this.dockManager_ContentAdded);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.textBox1);
            this.panel1.Controls.Add(this.panel3);
            this.panel1.Controls.Add(this.panel2);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(334, 27);
            this.panel1.TabIndex = 7;
            this.panel1.TabStop = true;
            // 
            // textBox1
            // 
            this.textBox1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.textBox1.Location = new System.Drawing.Point(27, 0);
            this.textBox1.Multiline = true;
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(138, 27);
            this.textBox1.TabIndex = 9;
            this.toolTip1.SetToolTip(this.textBox1, "输入上传目录路径");
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.flatButton6);
            this.panel3.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel3.Location = new System.Drawing.Point(0, 0);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(27, 27);
            this.panel3.TabIndex = 8;
            // 
            // flatButton6
            // 
            this.flatButton6.Dock = System.Windows.Forms.DockStyle.Fill;
            this.flatButton6.Image = global::sysguard.Properties.Resources.Executable;
            this.flatButton6.Location = new System.Drawing.Point(0, 0);
            this.flatButton6.Name = "flatButton6";
            this.flatButton6.Size = new System.Drawing.Size(27, 27);
            this.flatButton6.TabIndex = 0;
            this.toolTip1.SetToolTip(this.flatButton6, "执行命令");
            this.flatButton6.UseVisualStyleBackColor = true;
            this.flatButton6.Click += new System.EventHandler(this.flatButton6_Click);
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.flatButton3);
            this.panel2.Controls.Add(this.flatButton1);
            this.panel2.Controls.Add(this.flatButton5);
            this.panel2.Controls.Add(this.flatButton2);
            this.panel2.Controls.Add(this.flatButton4);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel2.Location = new System.Drawing.Point(165, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(169, 27);
            this.panel2.TabIndex = 6;
            this.panel2.TabStop = true;
            // 
            // flatButton3
            // 
            this.flatButton3.Image = global::sysguard.Properties.Resources.list;
            this.flatButton3.Location = new System.Drawing.Point(42, 3);
            this.flatButton3.Name = "flatButton3";
            this.flatButton3.Size = new System.Drawing.Size(30, 22);
            this.flatButton3.TabIndex = 3;
            this.toolTip1.SetToolTip(this.flatButton3, "上传视图");
            this.flatButton3.UseVisualStyleBackColor = true;
            this.flatButton3.Click += new System.EventHandler(this.flatButton3_Click);
            // 
            // flatButton1
            // 
            this.flatButton1.BackgroundImage = global::sysguard.Properties.Resources.m_toolStripButtonParent_Image;
            this.flatButton1.Image = global::sysguard.Properties.Resources.m_toolStripButtonParent_Image;
            this.flatButton1.Location = new System.Drawing.Point(140, 3);
            this.flatButton1.Name = "flatButton1";
            this.flatButton1.Size = new System.Drawing.Size(30, 22);
            this.flatButton1.TabIndex = 1;
            this.toolTip1.SetToolTip(this.flatButton1, "上传");
            this.flatButton1.UseVisualStyleBackColor = true;
            this.flatButton1.Click += new System.EventHandler(this.flatButton1_Click);
            // 
            // flatButton5
            // 
            this.flatButton5.Image = global::sysguard.Properties.Resources.m_toolStripButtonReload_Image;
            this.flatButton5.Location = new System.Drawing.Point(109, 3);
            this.flatButton5.Name = "flatButton5";
            this.flatButton5.Size = new System.Drawing.Size(32, 22);
            this.flatButton5.TabIndex = 5;
            this.toolTip1.SetToolTip(this.flatButton5, "刷新");
            this.flatButton5.UseVisualStyleBackColor = true;
            // 
            // flatButton2
            // 
            this.flatButton2.AccessibleDescription = "";
            this.flatButton2.Image = global::sysguard.Properties.Resources.m_toolStripButtonHome_Image;
            this.flatButton2.Location = new System.Drawing.Point(6, 3);
            this.flatButton2.Name = "flatButton2";
            this.flatButton2.Size = new System.Drawing.Size(30, 22);
            this.flatButton2.TabIndex = 2;
            this.toolTip1.SetToolTip(this.flatButton2, "主目录");
            this.flatButton2.UseVisualStyleBackColor = true;
            // 
            // flatButton4
            // 
            this.flatButton4.Image = global::sysguard.Properties.Resources.OutputWindow2;
            this.flatButton4.Location = new System.Drawing.Point(81, 2);
            this.flatButton4.Name = "flatButton4";
            this.flatButton4.Size = new System.Drawing.Size(25, 22);
            this.flatButton4.TabIndex = 4;
            this.toolTip1.SetToolTip(this.flatButton4, "输出窗口");
            this.flatButton4.UseVisualStyleBackColor = true;
            this.flatButton4.Click += new System.EventHandler(this.flatButton4_Click);
            // 
            // MyUploadInfo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(633, 504);
            this.Controls.Add(this.splitContainer1);
            this.IsMdiContainer = true;
            this.Name = "MyUploadInfo";
            this.Text = "上传文件";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.MyUploadInfo_FormClosing);
            this.Load += new System.EventHandler(this.MyUploadInfo_Load);
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            this.splitContainer1.ResumeLayout(false);
            this.panel5.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel2.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.SplitContainer splitContainer1;
        internal ExplorerControls.Browser Browser1;
        private ExplorerControls.ExpListColumn expListColumn1;
        private ExplorerControls.ExpListColumn expListColumn2;
        private ExplorerControls.ExpListColumn expListColumn3;
        private ExplorerControls.ExpListColumn expListColumn4;
        private ExplorerControls.FlatButton flatButton1;
        private ExplorerControls.FlatButton flatButton2;
        private ExplorerControls.FlatButton flatButton5;
        private ExplorerControls.FlatButton flatButton4;
        private ExplorerControls.FlatButton flatButton3;
        private System.Windows.Forms.Panel panel1;
        internal System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.ToolTip toolTip1;
        private System.Windows.Forms.TextBox textBox1;
        private ExplorerControls.FlatButton flatButton6;
        private System.Windows.Forms.Panel panel5;
        private WeifenLuo.WinFormsUI.DockManager dockManager;

    }
}