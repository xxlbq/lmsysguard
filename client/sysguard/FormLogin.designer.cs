namespace sysguard
{
    partial class FormLogin
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormLogin));
            this.panel1 = new System.Windows.Forms.Panel();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.usernamebox = new System.Windows.Forms.ComboBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.userpwd = new System.Windows.Forms.TextBox();
            this.cbRemember = new System.Windows.Forms.CheckBox();
            this.btnlogin = new GaryPerkin.UserControls.Buttons.RoundButton();
            this.btncancel = new GaryPerkin.UserControls.Buttons.RoundButton();
            this.label3 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.White;
            this.panel1.Controls.Add(this.pictureBox1);
            this.panel1.Location = new System.Drawing.Point(1, 2);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(362, 67);
            this.panel1.TabIndex = 10;
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackColor = System.Drawing.Color.White;
            this.pictureBox1.Image = global::sysguard.Properties.Resources.logou;
            this.pictureBox1.Location = new System.Drawing.Point(0, 0);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(362, 67);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 8;
            this.pictureBox1.TabStop = false;
            // 
            // usernamebox
            // 
            this.usernamebox.FormattingEnabled = true;
            this.usernamebox.Location = new System.Drawing.Point(94, 90);
            this.usernamebox.Name = "usernamebox";
            this.usernamebox.Size = new System.Drawing.Size(217, 20);
            this.usernamebox.TabIndex = 11;
            // 
            // label2
            // 
            this.label2.BackColor = System.Drawing.SystemColors.Control;
            this.label2.Location = new System.Drawing.Point(31, 130);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(57, 21);
            this.label2.TabIndex = 14;
            this.label2.Text = "密码：";
            this.label2.TextAlign = System.Drawing.ContentAlignment.TopRight;
            // 
            // label1
            // 
            this.label1.BackColor = System.Drawing.SystemColors.Control;
            this.label1.Location = new System.Drawing.Point(31, 90);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(57, 18);
            this.label1.TabIndex = 13;
            this.label1.Text = "用户名：";
            this.label1.TextAlign = System.Drawing.ContentAlignment.TopRight;
            // 
            // userpwd
            // 
            this.userpwd.Location = new System.Drawing.Point(94, 127);
            this.userpwd.Name = "userpwd";
            this.userpwd.Size = new System.Drawing.Size(217, 21);
            this.userpwd.TabIndex = 12;
            this.userpwd.UseSystemPasswordChar = true;
            // 
            // cbRemember
            // 
            this.cbRemember.Location = new System.Drawing.Point(94, 158);
            this.cbRemember.Name = "cbRemember";
            this.cbRemember.Size = new System.Drawing.Size(175, 24);
            this.cbRemember.TabIndex = 15;
            this.cbRemember.Text = "保存密码";
            this.cbRemember.UseVisualStyleBackColor = true;
            // 
            // btnlogin
            // 
            this.btnlogin.BevelDepth = 6;
            this.btnlogin.Dome = true;
            this.btnlogin.Location = new System.Drawing.Point(80, 197);
            this.btnlogin.Name = "btnlogin";
            this.btnlogin.RecessDepth = 0;
            this.btnlogin.Size = new System.Drawing.Size(102, 37);
            this.btnlogin.TabIndex = 17;
            this.btnlogin.Text = "登陆";
            this.btnlogin.UseVisualStyleBackColor = true;
            // 
            // btncancel
            // 
            this.btncancel.BevelDepth = 6;
            this.btncancel.Dome = true;
            this.btncancel.Location = new System.Drawing.Point(188, 197);
            this.btncancel.Name = "btncancel";
            this.btncancel.RecessDepth = 0;
            this.btncancel.Size = new System.Drawing.Size(102, 37);
            this.btncancel.TabIndex = 18;
            this.btncancel.Text = "重置";
            this.btncancel.UseVisualStyleBackColor = true;
            
            // 
            // label3
            // 
            this.label3.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label3.Location = new System.Drawing.Point(2, 184);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(361, 2);
            this.label3.TabIndex = 19;
            // 
            // FormLogin
            // 
            this.AcceptButton = this.btnlogin;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Control;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(360, 243);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.btncancel);
            this.Controls.Add(this.btnlogin);
            this.Controls.Add(this.cbRemember);
            this.Controls.Add(this.usernamebox);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.userpwd);
            this.Controls.Add(this.panel1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "FormLogin";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Sysguard - 用户登录";
            this.panel1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.CheckBox cbRemember;
        internal System.Windows.Forms.ComboBox usernamebox;
        internal System.Windows.Forms.TextBox userpwd;
        private GaryPerkin.UserControls.Buttons.RoundButton btnlogin;
        private GaryPerkin.UserControls.Buttons.RoundButton btncancel;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label3;
    }
}