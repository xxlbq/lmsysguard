using System;
using System.Collections.Generic;
using System.Text;

namespace Sysguard.BackgroundManage.HostGroupManage
{
    public class Group
    {
        private int id;

        public int IDProperty
        {
            get { return id; }
            set { id = value; }
        }

        private int OSType;

        public int OSTypeProperty
        {
            get { return OSType; }
            set { OSType = value; }
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



        //public Object[] ToArray()
        //{
        //    Object[] array = new object[3];

        //    array[0] = (Object)name;
        //    array[1] = (Object)describe;
        //    return array;

        //}


    }
}
