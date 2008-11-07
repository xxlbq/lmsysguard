using System;
using System.Collections.Generic;
using System.Text;

namespace Sysguard.BackgroundManage.HostManage
{
    public class Host
    {
        private string ip;

        public string IPProperty
        {
            get { return ip; }
            set { ip = value; }
        }
        private string name;

        public string NameProperty
        {
            get { return name; }
            set { name = value; }
        }
        private string describe;

        public string DescribeProperty
        {
            get { return describe; }
            set { describe = value; }
        }

        public Object[] ToArray()
        {
            Object[] array = new object[3];
            array[0] = (Object)ip;
            array[1] = (Object)name;
            array[2] = (Object)describe;
            return array;

        }
	
	
	
    }
}
