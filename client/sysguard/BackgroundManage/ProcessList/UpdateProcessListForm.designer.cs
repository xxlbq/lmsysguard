namespace Sysguard.BackgroundManage.ProcessList
{
    partial class UpdateProcessListForm
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
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.label7 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.code = new System.Windows.Forms.TextBox();
            this.describe = new System.Windows.Forms.TextBox();
            this.handleProcess = new System.Windows.Forms.TextBox();
            this.confirmProcess = new System.Windows.Forms.TextBox();
            this.reason = new System.Windows.Forms.TextBox();
            this.resolveMethod = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(95, 311);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 1;
            this.button1.Text = "确定";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.commit);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(384, 311);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 1;
            this.button2.Text = "取消";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.cancel);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(93, 20);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(53, 12);
            this.label7.TabIndex = 2;
            this.label7.Text = "错误编号";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(93, 57);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 12);
            this.label2.TabIndex = 3;
            this.label2.Text = "错误描述";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(93, 158);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(53, 12);
            this.label3.TabIndex = 4;
            this.label3.Text = "处理手顺";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(93, 194);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(53, 12);
            this.label4.TabIndex = 5;
            this.label4.Text = "确认手顺";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(93, 234);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(53, 12);
            this.label5.TabIndex = 6;
            this.label5.Text = "错误原因";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(93, 268);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(53, 12);
            this.label6.TabIndex = 7;
            this.label6.Text = "解决方式";
            // 
            // code
            // 
            this.code.Location = new System.Drawing.Point(237, 20);
            this.code.Name = "code";
            this.code.Size = new System.Drawing.Size(100, 21);
            this.code.TabIndex = 8;
            // 
            // describe
            // 
            this.describe.Location = new System.Drawing.Point(237, 57);
            this.describe.Multiline = true;
            this.describe.Name = "describe";
            this.describe.Size = new System.Drawing.Size(222, 88);
            this.describe.TabIndex = 9;
            // 
            // handleProcess
            // 
            this.handleProcess.Location = new System.Drawing.Point(237, 158);
            this.handleProcess.Name = "handleProcess";
            this.handleProcess.Size = new System.Drawing.Size(100, 21);
            this.handleProcess.TabIndex = 10;
            // 
            // confirmProcess
            // 
            this.confirmProcess.Location = new System.Drawing.Point(237, 194);
            this.confirmProcess.Name = "confirmProcess";
            this.confirmProcess.Size = new System.Drawing.Size(100, 21);
            this.confirmProcess.TabIndex = 11;
            // 
            // reason
            // 
            this.reason.Location = new System.Drawing.Point(237, 225);
            this.reason.Name = "reason";
            this.reason.Size = new System.Drawing.Size(100, 21);
            this.reason.TabIndex = 12;
            // 
            // resolveMethod
            // 
            this.resolveMethod.Location = new System.Drawing.Point(237, 259);
            this.resolveMethod.Name = "resolveMethod";
            this.resolveMethod.Size = new System.Drawing.Size(100, 21);
            this.resolveMethod.TabIndex = 13;
            // 
            // UpdateProcessListForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(485, 347);
            this.Controls.Add(this.resolveMethod);
            this.Controls.Add(this.reason);
            this.Controls.Add(this.confirmProcess);
            this.Controls.Add(this.handleProcess);
            this.Controls.Add(this.describe);
            this.Controls.Add(this.code);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Name = "UpdateProcessListForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "手顺修改";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox code;
        private System.Windows.Forms.TextBox describe;
        private System.Windows.Forms.TextBox handleProcess;
        private System.Windows.Forms.TextBox confirmProcess;
        private System.Windows.Forms.TextBox reason;
        private System.Windows.Forms.TextBox resolveMethod;
    }
}