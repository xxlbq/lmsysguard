using System;
using System.Collections.Generic;
using System.Text;
using System.Reflection;

namespace Sysguard.BackgroundManage.UserManage
{
    public class User
    {
        private int id;
        private string name;
        private int role;
        private string password;
        private string mail;
        private string realName;
        private int online;
        private int validate;
        private string updateTime;
        private string lastLogonTime;

        public string UpdateTimeProperty
        {
            get { return updateTime; }
            set { updateTime = value; }
        }


        public int ValidateProperty
        {
            get { return validate; }
            set { validate = value; }
        }


        public int OnlineProperty
        {
            get { return online; }
            set { online = value; }
        }


        public string LastLogonTimeProperty
        {
            get { return lastLogonTime; }
            set { lastLogonTime = value; }
        }




        public int IDProperty
        {
            get { return id; }
            set { id = value; }
        }



        public string MailProperty
        {
            get { return mail; }
            set { mail = value; }
        }

        public string RealNameProperty
        {
            get { return realName; }
            set { realName = value; }
        }


        public string NameProperty
        {
            get { return name; }
            set { name = value; }
        }

        public int RoleProperty
        {
            get { return role; }
            set { role = value; }
        }

        public string PasswordProperty
        {
            get { return password; }
            set { password = value; }
        }

        public Object[] ToArray()
        {
            Object[] array = new object[3];

            array[0] = (Object)name;
            // array[1] = (Object)describe;

            switch (role)
            {
                case 0:
                    array[2] = "管理员";
                    break;
                case 1:
                    array[2] = "运营人员";
                    break;
                case 2:
                    array[2] = "手顺管理员";
                    break;

            }

            return array;

        }
       
    }
}
