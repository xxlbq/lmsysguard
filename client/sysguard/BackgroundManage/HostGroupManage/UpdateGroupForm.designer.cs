namespace Sysguard.BackgroundManage.HostGroupManage
{
    partial class UpdateGroupForm
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
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.name = new System.Windows.Forms.TextBox();
            this.describe = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.OSType = new System.Windows.Forms.ComboBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(51, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "群组名称";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(51, 124);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(29, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "描述";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(53, 301);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 4;
            this.button1.Text = "确定";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.commit);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(308, 301);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 5;
            this.button2.Text = "取消";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.cancel);
            // 
            // name
            // 
            this.name.Location = new System.Drawing.Point(151, 31);
            this.name.MaxLength = 20;
            this.name.Name = "name";
            this.name.Size = new System.Drawing.Size(232, 21);
            this.name.TabIndex = 1;
            
            // 
            // describe
            // 
            this.describe.Location = new System.Drawing.Point(151, 124);
            this.describe.MaxLength = 50;
            this.describe.Multiline = true;
            this.describe.Name = "describe";
            this.describe.Size = new System.Drawing.Size(232, 145);
            this.describe.TabIndex = 3;
            
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(51, 82);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(77, 12);
            this.label3.TabIndex = 6;
            this.label3.Text = "操作系统类型";
            // 
            // OSType
            // 
            this.OSType.FormattingEnabled = true;
            this.OSType.Items.AddRange(new object[] {
            "Solaris",
            "AIX",
            "RedHat Linux"});
            this.OSType.Location = new System.Drawing.Point(151, 79);
            this.OSType.Name = "OSType";
            this.OSType.Size = new System.Drawing.Size(146, 20);
            this.OSType.TabIndex = 2;
            
            // 
            // UpdateGroupForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(435, 347);
            this.Controls.Add(this.OSType);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.describe);
            this.Controls.Add(this.name);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "UpdateGroupForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "群组修改";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.TextBox name;
        private System.Windows.Forms.TextBox describe;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.ComboBox OSType;
    }
}