namespace Sysguard.BackgroundManage.ProcessList
{
    partial class InsertProcessListForm
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
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.code = new System.Windows.Forms.TextBox();
            this.describe = new System.Windows.Forms.TextBox();
            this.handleProcess = new System.Windows.Forms.TextBox();
            this.confirmProcess = new System.Windows.Forms.TextBox();
            this.reason = new System.Windows.Forms.TextBox();
            this.resolveMethod = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(92, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "错误编号";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(92, 56);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 12);
            this.label2.TabIndex = 0;
            this.label2.Text = "错误描述";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(92, 131);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(53, 12);
            this.label3.TabIndex = 0;
            this.label3.Text = "处理手顺";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(92, 167);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(53, 12);
            this.label4.TabIndex = 0;
            this.label4.Text = "确认手顺";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(92, 200);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(53, 12);
            this.label5.TabIndex = 0;
            this.label5.Text = "错误原因";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(92, 236);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(53, 12);
            this.label6.TabIndex = 0;
            this.label6.Text = "解决方式";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(94, 277);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 1;
            this.button1.Text = "确定";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.commit);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(383, 277);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 1;
            this.button2.Text = "取消";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.cancel);
            // 
            // code
            // 
            this.code.Location = new System.Drawing.Point(177, 18);
            this.code.Name = "code";
            this.code.Size = new System.Drawing.Size(100, 21);
            this.code.TabIndex = 2;
            // 
            // describe
            // 
            this.describe.Location = new System.Drawing.Point(177, 56);
            this.describe.Multiline = true;
            this.describe.Name = "describe";
            this.describe.Size = new System.Drawing.Size(281, 59);
            this.describe.TabIndex = 2;
            // 
            // handleProcess
            // 
            this.handleProcess.Location = new System.Drawing.Point(177, 131);
            this.handleProcess.Name = "handleProcess";
            this.handleProcess.Size = new System.Drawing.Size(100, 21);
            this.handleProcess.TabIndex = 2;
            // 
            // confirmProcess
            // 
            this.confirmProcess.Location = new System.Drawing.Point(177, 167);
            this.confirmProcess.Name = "confirmProcess";
            this.confirmProcess.Size = new System.Drawing.Size(100, 21);
            this.confirmProcess.TabIndex = 2;
            // 
            // reason
            // 
            this.reason.Location = new System.Drawing.Point(177, 200);
            this.reason.Name = "reason";
            this.reason.Size = new System.Drawing.Size(100, 21);
            this.reason.TabIndex = 2;
            // 
            // resolveMethod
            // 
            this.resolveMethod.Location = new System.Drawing.Point(177, 236);
            this.resolveMethod.Name = "resolveMethod";
            this.resolveMethod.Size = new System.Drawing.Size(100, 21);
            this.resolveMethod.TabIndex = 2;
            // 
            // InsertProcessListForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(490, 329);
            this.Controls.Add(this.resolveMethod);
            this.Controls.Add(this.reason);
            this.Controls.Add(this.confirmProcess);
            this.Controls.Add(this.handleProcess);
            this.Controls.Add(this.describe);
            this.Controls.Add(this.code);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "InsertProcessListForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "增加手顺";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.TextBox code;
        private System.Windows.Forms.TextBox describe;
        private System.Windows.Forms.TextBox handleProcess;
        private System.Windows.Forms.TextBox confirmProcess;
        private System.Windows.Forms.TextBox reason;
        private System.Windows.Forms.TextBox resolveMethod;
    }
}