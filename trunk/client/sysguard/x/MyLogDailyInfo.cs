using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using sysguard.Components;
using sysguard.Properties;
using sysguard.SysguardWS;

namespace sysguard.x
{
    public enum LogState { None = 4, Handled = 0, Processing = 1, OnHand = 2, };
    public partial class MyLogDailyInfo : Form
    {
        private LogState logState;
        private LogInfo info;
        private DailyInfo dailyControl;

        public MyLogDailyInfo(DailyInfo _dailyControl)
        {
            this.dailyControl = _dailyControl;
            InitializeComponent();
        }
        public void ShowDialg(DataGridViewRow dgvr)
        {

            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
            long logId = long.Parse(dgvr.Cells[1].Value.ToString());
            info = dataLayer.LogInfoList[logId];

            FullData(dataLayer);


            //if (info.operId == 0)
            //{
            //    this.operButton.Enabled = false;
            //}

            this.ShowDialog();
        }

        private void FullData(IDataLayer dataLayer)
        {
            this.hostIPLabel.Text = info.hostIp;
            this.logIDLabel.Text = info.applogId.ToString();
            this.logLevelLabel.Text = info.level;
            this.logCreateTimeLabel.Text = info.logTime.ToString(Settings.Default.dateFormat);
            logState = LogStateHandle(info.logStatus);
            this.logInfoLabel.Text = info.logContent;
            this.logClassNameLabel.Text = info.className;
            this.logThreadNameLabel.Text = info.threadName;
            this.logLineTextBox.Text = info.logLine;

            if (logState == LogState.Handled)
            {
                this.solveResultTextBox.Enabled = false;
                this.solveDescTextBox.Enabled = false;
                this.solveBeginButton.Enabled = false;
                this.solveEndButton.Enabled = false;
                this.cancelButton.Enabled = true;
                this.solveResultTextBox.Text = info.solveResult;
                this.solveDescTextBox.Text = info.solveDesc;
            }
            else if (logState == LogState.OnHand)
            {
                this.solveResultTextBox.Enabled = false;
                this.solveDescTextBox.Enabled = false;
                this.solveBeginButton.Enabled = true;
                this.solveEndButton.Enabled = false;
                this.cancelButton.Enabled = false;

            }
            else if (logState == LogState.Processing)
            {
               
                if (info.userId == dataLayer.User.userId)
                {
                    solveBeginButton.Enabled = false;
                    this.solveResultTextBox.Enabled = true;
                    this.solveResultTextBox.Text = string.Empty;
                    this.solveResultTextBox.Text = info.solveResult;
                    this.solveDescTextBox.Enabled = true;
                    this.solveDescTextBox.Text = string.Empty;
                    this.solveDescTextBox.Text = info.solveDesc;
                    solveEndButton.Enabled = true;
                }
                else
                {
                    solveBeginButton.Enabled = false;
                    this.solveResultTextBox.Enabled = false;
                    this.solveDescTextBox.Enabled = false;
                    this.solveEndButton.Enabled = false;
                }

            }
        }

        private LogState LogStateHandle(int logState)
        {
            LogState state = LogState.None;
            switch (logState)
            {
                case 0:
                    this.logStateLabel.Text = "已处理";
                    state = LogState.Handled;
                    break;
                case 1:
                    this.logStateLabel.Text = "处理中...";
                    state = LogState.Processing;
                    break;
                case 2:
                    this.logStateLabel.Text = "未处理";
                    state = LogState.OnHand;
                    break;
                default:
                    this.logStateLabel.Text = "未知状态";
                    break;
            }
            return state;

        }

        private void solveBeginButton_Click(object sender, EventArgs e)
        {

            MouseEventArgs even = (MouseEventArgs)e;

            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
            this.userLabel.Text += dataLayer.User.name;
            DateTime solveTime = DateTime.Now;
            this.solveTimeLabel.Text += solveTime.ToString(Settings.Default.dateFormat);

            logState = LogStateHandle(1);
            int test = (int)logState;
            info.userId = dataLayer.User.userId;
            info.solveTime = solveTime;
            info.logStatus = (int)logState;

            DataLayerResult result = dataLayer.ModifyLogInfo(info);
            if (result == DataLayerResult.Success)
            {
                this.cancelButton.Enabled = true;
                
                FullData(dataLayer);
            }

           
        }

        private void cancelButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }



        private void solveEndButton_Click(object sender, EventArgs e)
        {
            Button bt = (Button)sender;
            MouseEventArgs even = (MouseEventArgs)e;
            if (string.IsNullOrEmpty(this.solveResultTextBox.Text))
            {
                MessageBox.Show("请输入对应结果!");
                this.solveResultTextBox.Focus();
            }
            if (string.IsNullOrEmpty(this.solveDescTextBox.Text))
            {
                MessageBox.Show("请输入对应描述!");
                this.solveDescTextBox.Focus();
            }
            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
            logState = LogStateHandle(0);

            int test = (int)logState;

            info.logStatus = (int)logState;
            info.solveResult = this.solveResultTextBox.Text;
            info.solveDesc = this.solveDescTextBox.Text;
            DataLayerResult result = dataLayer.ModifyLogInfo(info);


            if (result == DataLayerResult.Success)
            {
                bt.Enabled = false;
                
                DialogResult dr = MessageBox.Show("对应完毕,是否关闭?", "操作确认", MessageBoxButtons.YesNo);
                if (dr == DialogResult.Yes)
                {
                    this.DialogResult = DialogResult.OK;
                    this.Close();
                }
                else {
                    dailyControl.Flush();
                    bt.Enabled = false;
                }

            }
          
           
        }
    }
}