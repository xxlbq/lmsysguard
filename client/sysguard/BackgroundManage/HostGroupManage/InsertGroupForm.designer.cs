namespace Sysguard.BackgroundManage.HostGroupManage
{
    partial class InsertGroupForm
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.name = new System.Windows.Forms.TextBox();
            this.describe = new System.Windows.Forms.TextBox();
            this.commitBtn = new System.Windows.Forms.Button();
            this.cancelBtn = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.OSType = new System.Windows.Forms.ComboBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(47, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "群组名称";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(47, 182);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(29, 12);
            this.label2.TabIndex = 0;
            this.label2.Text = "描述";
            // 
            // name
            // 
            this.name.Location = new System.Drawing.Point(149, 31);
            this.name.MaxLength = 16;
            this.name.Name = "name";
            this.name.Size = new System.Drawing.Size(283, 21);
            this.name.TabIndex = 1;
            // 
            // describe
            // 
            this.describe.Location = new System.Drawing.Point(149, 117);
            this.describe.MaxLength = 50;
            this.describe.Multiline = true;
            this.describe.Name = "describe";
            this.describe.Size = new System.Drawing.Size(283, 156);
            this.describe.TabIndex = 3;
            // 
            // commitBtn
            // 
            this.commitBtn.Location = new System.Drawing.Point(49, 287);
            this.commitBtn.Name = "commitBtn";
            this.commitBtn.Size = new System.Drawing.Size(75, 23);
            this.commitBtn.TabIndex = 4;
            this.commitBtn.Text = "确定";
            this.commitBtn.UseVisualStyleBackColor = true;
            this.commitBtn.Click += new System.EventHandler(this.commit);
            // 
            // cancelBtn
            // 
            this.cancelBtn.DialogResult = System.Windows.Forms.DialogResult.Cancel;
            this.cancelBtn.Location = new System.Drawing.Point(357, 287);
            this.cancelBtn.Name = "cancelBtn";
            this.cancelBtn.Size = new System.Drawing.Size(75, 23);
            this.cancelBtn.TabIndex = 5;
            this.cancelBtn.Text = "取消";
            this.cancelBtn.UseVisualStyleBackColor = true;
            this.cancelBtn.Click += new System.EventHandler(this.cancel);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(47, 76);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(77, 12);
            this.label3.TabIndex = 5;
            this.label3.Text = "操作系统类型";
            // 
            // OSType
            // 
            this.OSType.FormattingEnabled = true;
            this.OSType.Items.AddRange(new object[] {
            "Solaris",
            "AIX",
            "RedHat Linux"});
            this.OSType.Location = new System.Drawing.Point(149, 73);
            this.OSType.Name = "OSType";
            this.OSType.Size = new System.Drawing.Size(136, 20);
            this.OSType.TabIndex = 2;
            // 
            // InsertGroupForm
            // 
            this.AcceptButton = this.commitBtn;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.CancelButton = this.cancelBtn;
            this.ClientSize = new System.Drawing.Size(455, 347);
            this.Controls.Add(this.OSType);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.cancelBtn);
            this.Controls.Add(this.commitBtn);
            this.Controls.Add(this.describe);
            this.Controls.Add(this.name);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "InsertGroupForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "添加群组";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox name;
        private System.Windows.Forms.TextBox describe;
        private System.Windows.Forms.Button commitBtn;
        private System.Windows.Forms.Button cancelBtn;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.ComboBox OSType;
    }
}