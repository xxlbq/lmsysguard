namespace sysguard.x
{
    partial class UpdateUser
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
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.label5 = new System.Windows.Forms.Label();
            this.oldPasswdTextBox = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox7)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox5)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox6)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox4)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            this.SuspendLayout();
            // 
            // roleComboBox
            // 
            this.roleComboBox.Location = new System.Drawing.Point(152, 340);
            this.roleComboBox.Size = new System.Drawing.Size(239, 20);
            // 
            // skypeTextBox
            // 
            this.skypeTextBox.Location = new System.Drawing.Point(152, 299);
            this.skypeTextBox.Size = new System.Drawing.Size(239, 21);
            // 
            // msnTextBox
            // 
            this.msnTextBox.Location = new System.Drawing.Point(152, 254);
            this.msnTextBox.Size = new System.Drawing.Size(239, 21);
            // 
            // mailTextBox
            // 
            this.mailTextBox.Location = new System.Drawing.Point(152, 212);
            this.mailTextBox.Size = new System.Drawing.Size(239, 21);
            // 
            // realNameTextBox
            // 
            this.realNameTextBox.Size = new System.Drawing.Size(239, 21);
            // 
            // verifyTextBox
            // 
            this.verifyTextBox.Location = new System.Drawing.Point(152, 177);
            this.verifyTextBox.Size = new System.Drawing.Size(239, 21);
            this.verifyTextBox.UseSystemPasswordChar = true;
            // 
            // newPasswdTextBox
            // 
            this.newPasswdTextBox.Location = new System.Drawing.Point(152, 141);
            this.newPasswdTextBox.Size = new System.Drawing.Size(239, 21);
            this.newPasswdTextBox.UseSystemPasswordChar = true;
            // 
            // cancelButton
            // 
            this.cancelButton.Location = new System.Drawing.Point(232, 396);
            this.cancelButton.Click += new System.EventHandler(this.cancelButton_Click);
            // 
            // commitButton
            // 
            this.commitButton.Location = new System.Drawing.Point(103, 396);
            this.commitButton.Click += new System.EventHandler(this.commitButton_Click);
            // 
            // pictureBox5
            // 
            this.pictureBox5.Location = new System.Drawing.Point(49, 212);
            // 
            // pictureBox3
            // 
            this.pictureBox3.Location = new System.Drawing.Point(49, 141);
            this.pictureBox3.Visible = false;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Location = new System.Drawing.Point(49, 40);
            // 
            // label8
            // 
            this.label8.Location = new System.Drawing.Point(81, 299);
            // 
            // label7
            // 
            this.label7.Location = new System.Drawing.Point(81, 257);
            // 
            // label6
            // 
            this.label6.Location = new System.Drawing.Point(81, 212);
            // 
            // label3
            // 
            this.label3.Location = new System.Drawing.Point(81, 180);
            // 
            // label2
            // 
            this.label2.Location = new System.Drawing.Point(81, 141);
            // 
            // pictureBox6
            // 
            this.pictureBox6.Location = new System.Drawing.Point(49, 343);
            // 
            // label9
            // 
            this.label9.Location = new System.Drawing.Point(81, 343);
            // 
            // pictureBox4
            // 
            this.pictureBox4.Location = new System.Drawing.Point(49, 180);
            this.pictureBox4.Visible = false;
            // 
            // pictureBox2
            // 
            this.pictureBox2.BackgroundImage = global::sysguard.Properties.Resources.sphere1;
            this.pictureBox2.Location = new System.Drawing.Point(49, 110);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(27, 12);
            this.pictureBox2.TabIndex = 54;
            this.pictureBox2.TabStop = false;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(82, 110);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(53, 12);
            this.label5.TabIndex = 55;
            this.label5.Text = "旧密码：";
            // 
            // oldPasswdTextBox
            // 
            this.oldPasswdTextBox.Location = new System.Drawing.Point(152, 107);
            this.oldPasswdTextBox.Name = "oldPasswdTextBox";
            this.oldPasswdTextBox.Size = new System.Drawing.Size(239, 21);
            this.oldPasswdTextBox.TabIndex = 56;
            this.oldPasswdTextBox.UseSystemPasswordChar = true;
            // 
            // UpdateUser
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.ClientSize = new System.Drawing.Size(439, 433);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.oldPasswdTextBox);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "UpdateUser";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Controls.SetChildIndex(this.cancelButton, 0);
            this.Controls.SetChildIndex(this.commitButton, 0);
            this.Controls.SetChildIndex(this.oldPasswdTextBox, 0);
            this.Controls.SetChildIndex(this.label5, 0);
            this.Controls.SetChildIndex(this.pictureBox2, 0);
            this.Controls.SetChildIndex(this.pictureBox6, 0);
            this.Controls.SetChildIndex(this.pictureBox1, 0);
            this.Controls.SetChildIndex(this.label9, 0);
            this.Controls.SetChildIndex(this.label8, 0);
            this.Controls.SetChildIndex(this.label7, 0);
            this.Controls.SetChildIndex(this.label6, 0);
            this.Controls.SetChildIndex(this.label3, 0);
            this.Controls.SetChildIndex(this.label2, 0);
            this.Controls.SetChildIndex(this.pictureBox3, 0);
            this.Controls.SetChildIndex(this.pictureBox4, 0);
            this.Controls.SetChildIndex(this.userNameTextBox, 0);
            this.Controls.SetChildIndex(this.label1, 0);
            this.Controls.SetChildIndex(this.newPasswdTextBox, 0);
            this.Controls.SetChildIndex(this.verifyTextBox, 0);
            this.Controls.SetChildIndex(this.realNameTextBox, 0);
            this.Controls.SetChildIndex(this.label4, 0);
            this.Controls.SetChildIndex(this.mailTextBox, 0);
            this.Controls.SetChildIndex(this.msnTextBox, 0);
            this.Controls.SetChildIndex(this.skypeTextBox, 0);
            this.Controls.SetChildIndex(this.roleComboBox, 0);
            this.Controls.SetChildIndex(this.pictureBox5, 0);
            this.Controls.SetChildIndex(this.pictureBox7, 0);
            this.Controls.SetChildIndex(this.label10, 0);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox7)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox5)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox6)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox4)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox oldPasswdTextBox;
    }
}
