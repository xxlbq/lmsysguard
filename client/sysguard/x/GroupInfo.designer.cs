namespace sysguard.x
{
    partial class GroupInfo
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

        #region Component Designer generated code

        /// <summary> 
        /// Required method for Designer support - do not modify 
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.Column1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.contextMenuStrip1 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.新建群组ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.群组修改ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.删除群组ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.contextMenuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AllowUserToAddRows = false;
            this.dataGridView1.AllowUserToDeleteRows = false;
            dataGridViewCellStyle1.BackColor = System.Drawing.Color.LemonChiffon;
            this.dataGridView1.AlternatingRowsDefaultCellStyle = dataGridViewCellStyle1;
            this.dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Column1,
            this.Column2,
            this.Column3});
            this.dataGridView1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridView1.Location = new System.Drawing.Point(0, 0);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.ReadOnly = true;
            this.dataGridView1.RowHeadersVisible = false;
            this.dataGridView1.RowTemplate.ContextMenuStrip = this.contextMenuStrip1;
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridView1.Size = new System.Drawing.Size(347, 72);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.CellMouseDoubleClick += new System.Windows.Forms.DataGridViewCellMouseEventHandler(this.CellMouseDoubleClick);
            // 
            // Column1
            // 
            this.Column1.HeaderText = "群ID";
            this.Column1.Name = "Column1";
            this.Column1.ReadOnly = true;
            // 
            // Column2
            // 
            this.Column2.HeaderText = "名称";
            this.Column2.Name = "Column2";
            this.Column2.ReadOnly = true;
            // 
            // Column3
            // 
            this.Column3.HeaderText = "描述";
            this.Column3.Name = "Column3";
            this.Column3.ReadOnly = true;
            // 
            // contextMenuStrip1
            // 
            this.contextMenuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.新建群组ToolStripMenuItem,
            this.群组修改ToolStripMenuItem,
            this.删除群组ToolStripMenuItem});
            this.contextMenuStrip1.Name = "contextMenuStrip1";
            this.contextMenuStrip1.Size = new System.Drawing.Size(119, 70);
            // 
            // 新建群组ToolStripMenuItem
            // 
            this.新建群组ToolStripMenuItem.Name = "新建群组ToolStripMenuItem";
            this.新建群组ToolStripMenuItem.Size = new System.Drawing.Size(118, 22);
            this.新建群组ToolStripMenuItem.Text = "新建群组";
            this.新建群组ToolStripMenuItem.Click += new System.EventHandler(this.NewGroupToolStripMenuItem_Click);
            // 
            // 群组修改ToolStripMenuItem
            // 
            this.群组修改ToolStripMenuItem.Name = "群组修改ToolStripMenuItem";
            this.群组修改ToolStripMenuItem.Size = new System.Drawing.Size(118, 22);
            this.群组修改ToolStripMenuItem.Text = "群组修改";
            this.群组修改ToolStripMenuItem.Click += new System.EventHandler(this.ModifyGroupToolStripMenuItem_Click);
            // 
            // 删除群组ToolStripMenuItem
            // 
            this.删除群组ToolStripMenuItem.Name = "删除群组ToolStripMenuItem";
            this.删除群组ToolStripMenuItem.Size = new System.Drawing.Size(118, 22);
            this.删除群组ToolStripMenuItem.Text = "删除群组";
            this.删除群组ToolStripMenuItem.Click += new System.EventHandler(this.DeleteGroupToolStripMenuItem_Click);
            // 
            // GroupInfo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.dataGridView1);
            this.Name = "GroupInfo";
            this.Size = new System.Drawing.Size(347, 72);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.contextMenuStrip1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column3;
        private System.Windows.Forms.ContextMenuStrip contextMenuStrip1;
        private System.Windows.Forms.ToolStripMenuItem 新建群组ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 群组修改ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 删除群组ToolStripMenuItem;

    }
}
