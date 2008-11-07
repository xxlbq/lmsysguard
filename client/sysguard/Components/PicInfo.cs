using System;
using System.Collections.Generic;
using System.Text;
using System.Drawing;
using System.IO;

namespace sysguard.Components
{
    public class PicInfo
    {
        private string hostIp;
        public string HostIp
        {
            get
            {
                return this.hostIp;
            }
            set
            {
                this.hostIp = value;
            }
        }
        private string fileType;

        public string FileType
        {
            set
            {
                fileType = value;
            }
            get
            {

                return fileType;
            }

        }
        private byte[] dayLoadAveragePic;
        public byte[] DayLoadAveragePic
        {
            get
            {
                return this.dayLoadAveragePic;
            }
            set
            {
                this.dayLoadAveragePic = value;
            }
        }

        private byte[] monthLoadAveragePic;
        public byte[] MonthLoadAveragePic
        {
            get
            {
                return this.monthLoadAveragePic;
            }
            set
            {
                this.monthLoadAveragePic = value;
            }
        }

        private byte[] yearLoadAveragePic;
        public byte[] YearLoadAveragePic
        {
            get
            {
                return this.yearLoadAveragePic;
            }
            set
            {
                this.yearLoadAveragePic = value;
            }
        }

        public Image getYearLoadAverageImage()
        {
            MemoryStream stream = new MemoryStream(this.yearLoadAveragePic);
            Image yearLoadAverageImage = Image.FromStream(stream);
            return yearLoadAverageImage;
        }

        public Image getMonthLoadAverageImage()
        {
            MemoryStream stream = new MemoryStream(this.monthLoadAveragePic);
            Image monthLoadAverageImage = Image.FromStream(stream);
            return monthLoadAverageImage;
        }

        public Image getDayLoadAverageImage()
        {
            MemoryStream stream = new MemoryStream(this.dayLoadAveragePic);
            Image dayLoadAverageImage = Image.FromStream(stream);
            return dayLoadAverageImage;
        }
    }
}
