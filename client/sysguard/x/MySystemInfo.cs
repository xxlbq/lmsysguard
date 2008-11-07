using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using sysguard.Components;
using sysguard.Properties;

namespace sysguard.x
{
    public partial class MySystemInfo : Form
    {
        public MySystemInfo()
        {
            InitializeComponent();
        }
        public void ShowDialg(DataGridViewRow dgvr)
        {
            string hostIp = dgvr.Cells[0].Value.ToString();

            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
            DataLayerResult result = dataLayer.GetLoadPicByHostIp(hostIp);

            if (result == DataLayerResult.Success)
            {
                PictureBox dayLoadAverageImageBox = new PictureBox();
                PictureBox monthLoadAverageImageBox = new PictureBox();
                PictureBox yearLoadAverageImageBox = new PictureBox();
                ((System.ComponentModel.ISupportInitialize)(dayLoadAverageImageBox)).BeginInit();
                ((System.ComponentModel.ISupportInitialize)(monthLoadAverageImageBox)).BeginInit();
                ((System.ComponentModel.ISupportInitialize)(yearLoadAverageImageBox)).BeginInit();

                //dayLoadAverageImageBox
                dayLoadAverageImageBox.Image = dataLayer.PicInfoMap[hostIp].getDayLoadAverageImage();
                dayLoadAverageImageBox.Size = new System.Drawing.Size(dataLayer.PicInfoMap[hostIp].getDayLoadAverageImage().Size.Width, dataLayer.PicInfoMap[hostIp].getDayLoadAverageImage().Size.Height);
                dayLoadAverageImageBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
                dayLoadAverageImageBox.Location = new System.Drawing.Point(0, 2);
                dayLoadAverageImageBox.Name = "dayLoadAverageImageBox";
                dayLoadAverageImageBox.TabIndex = 0;
                dayLoadAverageImageBox.TabStop = false;
                //monthLoadAverageImageBox
                monthLoadAverageImageBox.Image = dataLayer.PicInfoMap[hostIp].getMonthLoadAverageImage();
                monthLoadAverageImageBox.Size = new System.Drawing.Size(dataLayer.PicInfoMap[hostIp].getMonthLoadAverageImage().Size.Width, dataLayer.PicInfoMap[hostIp].getMonthLoadAverageImage().Size.Height);
                monthLoadAverageImageBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
                monthLoadAverageImageBox.Location = new System.Drawing.Point(0, dayLoadAverageImageBox.Size.Height);
                monthLoadAverageImageBox.Name = "monthLoadAverageImageBox";
                monthLoadAverageImageBox.TabIndex = 1;
                monthLoadAverageImageBox.TabStop = false;
                //yearLoadAverageImageBox
                yearLoadAverageImageBox.Image = dataLayer.PicInfoMap[hostIp].getYearLoadAverageImage();
                yearLoadAverageImageBox.Size = new System.Drawing.Size(dataLayer.PicInfoMap[hostIp].getYearLoadAverageImage().Size.Width, dataLayer.PicInfoMap[hostIp].getYearLoadAverageImage().Size.Height);
                yearLoadAverageImageBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
                yearLoadAverageImageBox.Location = new System.Drawing.Point(0, dayLoadAverageImageBox.Size.Height + monthLoadAverageImageBox.Size.Height);
                yearLoadAverageImageBox.Name = "yearLoadAverageImageBox";
                yearLoadAverageImageBox.TabIndex = 2;
                yearLoadAverageImageBox.TabStop = false;
                //array sort
                int[] widths ={ dayLoadAverageImageBox.Size.Width, monthLoadAverageImageBox.Size.Width, yearLoadAverageImageBox.Size.Width };
                Array.Sort(widths);
                //MySystemInfo Form
                this.ClientSize = new System.Drawing.Size(widths[widths.Length-1], yearLoadAverageImageBox.Size.Height + monthLoadAverageImageBox.Size.Height + dayLoadAverageImageBox.Size.Height);
                this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
                this.Controls.Add(yearLoadAverageImageBox);
                this.Controls.Add(monthLoadAverageImageBox);
                this.Controls.Add(dayLoadAverageImageBox);
                ((System.ComponentModel.ISupportInitialize)(dayLoadAverageImageBox)).EndInit();
                ((System.ComponentModel.ISupportInitialize)(monthLoadAverageImageBox)).EndInit();
                ((System.ComponentModel.ISupportInitialize)(yearLoadAverageImageBox)).EndInit();

                this.ShowDialog();
            }
            else if (result == DataLayerResult.PicNotFount) {
                MessageBox.Show("图片无法找到,请联系管理员!", "图片无法找到",MessageBoxButtons.OK);
                this.Close();
            }
            else if (result == DataLayerResult.IOException) {
                MessageBox.Show("读取图片错误,请联系管理员!", "读取图片错误", MessageBoxButtons.OK);
                this.Close();
            }
            
        
        }

      
    }
        
}