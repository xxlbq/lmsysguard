namespace Sysguard.BackgroundManage.UserManage
{
    partial class UserFormBase
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
            this.mail = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.confirmPassword = new System.Windows.Forms.TextBox();
            this.password = new System.Windows.Forms.TextBox();
            this.password_text = new System.Windows.Forms.Label();
            this.button2 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.realName = new System.Windows.Forms.TextBox();
            this.name = new System.Windows.Forms.TextBox();
            this.role = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // mail
            // 
            this.mail.Location = new System.Drawing.Point(155, 199);
            this.mail.MaxLength = 50;
            this.mail.Name = "mail";
            this.mail.Size = new System.Drawing.Size(155, 21);
            this.mail.TabIndex = 17;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(83, 199);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(29, 12);
            this.label5.TabIndex = 24;
            this.label5.Text = "mail";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(81, 90);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(53, 12);
            this.label4.TabIndex = 23;
            this.label4.Text = "真实姓名";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(81, 167);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 12);
            this.label2.TabIndex = 21;
            this.label2.Text = "确认密码";
            // 
            // confirmPassword
            // 
            this.confirmPassword.Location = new System.Drawing.Point(155, 167);
            this.confirmPassword.MaxLength = 16;
            this.confirmPassword.Name = "confirmPassword";
            this.confirmPassword.Size = new System.Drawing.Size(155, 21);
            this.confirmPassword.TabIndex = 16;
            this.confirmPassword.UseSystemPasswordChar = true;
            this.confirmPassword.WordWrap = false;
            // 
            // password
            // 
            this.password.Location = new System.Drawing.Point(155, 127);
            this.password.MaxLength = 16;
            this.password.Name = "password";
            this.password.Size = new System.Drawing.Size(155, 21);
            this.password.TabIndex = 15;
            this.password.UseSystemPasswordChar = true;
            this.password.WordWrap = false;
            // 
            // password_text
            // 
            this.password_text.AutoSize = true;
            this.password_text.Location = new System.Drawing.Point(81, 127);
            this.password_text.Name = "password_text";
            this.password_text.Size = new System.Drawing.Size(29, 12);
            this.password_text.TabIndex = 18;
            this.password_text.Text = "密码";
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(259, 374);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 22;
            this.button2.Text = "取消";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.cancel);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(73, 374);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 20;
            this.button1.Text = "确定";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.commit);
            // 
            // realName
            // 
            this.realName.Location = new System.Drawing.Point(155, 91);
            this.realName.MaxLength = 20;
            this.realName.Name = "realName";
            this.realName.Size = new System.Drawing.Size(155, 21);
            this.realName.TabIndex = 14;
            // 
            // name
            // 
            this.name.Location = new System.Drawing.Point(155, 55);
            this.name.MaxLength = 20;
            this.name.Name = "name";
            this.name.Size = new System.Drawing.Size(155, 21);
            this.name.TabIndex = 13;
            // 
            // role
            // 
            this.role.FormattingEnabled = true;
            this.role.Items.AddRange(new object[] {
            "管理人员",
            "运营人员",
            "手顺管理员"});
            this.role.Location = new System.Drawing.Point(155, 333);
            this.role.Name = "role";
            this.role.Size = new System.Drawing.Size(155, 20);
            this.role.TabIndex = 19;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(83, 336);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(29, 12);
            this.label3.TabIndex = 11;
            this.label3.Text = "角色";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(81, 58);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(41, 12);
            this.label1.TabIndex = 12;
            this.label1.Text = "用户名";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(83, 247);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(23, 12);
            this.label6.TabIndex = 25;
            this.label6.Text = "msn";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(83, 281);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(35, 12);
            this.label7.TabIndex = 25;
            this.label7.Text = "skype";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(155, 247);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(155, 21);
            this.textBox1.TabIndex = 26;
            // 
            // textBox2
            // 
            this.textBox2.Location = new System.Drawing.Point(155, 281);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(155, 21);
            this.textBox2.TabIndex = 27;
            // 
            // UserFormBase
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(427, 450);
            this.Controls.Add(this.textBox2);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.mail);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.confirmPassword);
            this.Controls.Add(this.password);
            this.Controls.Add(this.password_text);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.realName);
            this.Controls.Add(this.name);
            this.Controls.Add(this.role);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label1);
            this.Name = "UserFormBase";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "UserFormBase";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        protected System.Windows.Forms.TextBox mail;
        protected System.Windows.Forms.Label label5;
        protected System.Windows.Forms.Label label4;
        protected System.Windows.Forms.Label label2;
        protected System.Windows.Forms.TextBox confirmPassword;
        protected System.Windows.Forms.TextBox password;
        protected System.Windows.Forms.Label password_text;
        protected System.Windows.Forms.Button button2;
        protected System.Windows.Forms.Button button1;
        protected System.Windows.Forms.TextBox realName;
        protected System.Windows.Forms.TextBox name;
        protected System.Windows.Forms.ComboBox role;
        protected System.Windows.Forms.Label label3;
        protected System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.TextBox textBox2;
    }
}