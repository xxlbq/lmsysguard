using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Text.RegularExpressions;
using System.Reflection;
namespace Sysguard.BackgroundManage
{
    public static class VerifyUtil
    {



        public static string NameLimitInfo = "�����ֻ�ܰ���Ӣ���ַ������ּ�\"_\"��\"-\"���ţ�";
        public static string MailLimitInfo = "�ʼ������ֻ�ܰ���Ӣ���ַ������ּ�\"_\"��\"-\"�ұ������\".\"��\"@\"���ţ�";


        public static bool IsEmpty(string str)
        {

            return str == null || str.Equals("");

        }


        public static bool IsNumber(string str)
        {
            try
            {
                int number = Convert.ToInt32(str);
                if (number >= 0 && number <= 9)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
            catch (Exception e)
            {

                Debug.WriteLine(e.Message, "IsNumber(string str)");

                return false;
            }


        }

        public static bool IsAlpha(string str)
        {
            try
            {
                char alpha = Convert.ToChar(str);
                if ((alpha >= 'A') && (alpha <= 'Z') || (alpha >= 'a') && (alpha <= 'z'))
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
            catch (InvalidCastException e)
            {

                Debug.WriteLine(e.Message, "IsAlpha(string str)");
                return false;
            }
            catch (Exception e)
            {

                Debug.WriteLine(e.Message, "IsAlpha(string str)");
                return false;
            }
        }

        public static bool VerifyName(string name)
        {
            string Regextest = @"^[a-zA-Z_0-9]{4,10}$";
            return Regex.IsMatch(name, Regextest);
        }

        public static bool VerifyPwd(string pwd) {
            string Regextest = @"^[a-zA-Z_0-9]{6,20}$";
            return Regex.IsMatch(pwd, Regextest);
        }
        public static bool VerifyInput(string str)
        {
            try
            {
                foreach (char a in str)
                {
                    string temp = Convert.ToString(a);
                    if (!(IsNumber(temp) || IsAlpha(temp) || temp.Equals("-") || temp.Equals("_")))
                    {
                        return false;
                    }

                }
                return true;

            }
            catch (Exception e)
            {

                Debug.WriteLine(e.Message, " VerifyInput(string str)");
                return false;
            }


        }
        public static bool VerifyMailInput(string str)
        {
            try
            {
                string Regextest = "^\\w[\\w-.]+@(([\\w-])+[.])+(\\w)+$";
                return Regex.IsMatch(str, Regextest);
            }
            catch (Exception e)
            {

                Debug.WriteLine(e.Message, " VerifyInput(string str)");
                return false;
            }


        }

        public static void RegexTest()
        {
            string Regextest = "028\\d{8}";
            string TestSHPhone = "021866666";
            string TestCDPhone = "028888888";
            Console.WriteLine("�Ƿ�ɶ��绰:" + Regex.IsMatch(TestCDPhone, Regextest));
            Console.WriteLine("�Ƿ�ɶ��绰:" + Regex.IsMatch(TestCDPhone, Regextest));
        }
    }


    public class OutObject
    {
        /// <summary>
        /// Debug ����VO�������������
        /// </summary>
        /// <param name="obj">������VO����</param>
        /// <param name="methodName">����outVO�ķ�����</param>
        public static void outVO(Object obj, string methodName)
        {

            Type type = obj.GetType();
            PropertyInfo[] infos = type.GetProperties();
            foreach (PropertyInfo temp in infos)
            {
                MethodInfo info = temp.GetGetMethod();
                Debug.Write(methodName + ":");
                Debug.Write(temp.Name + " =");
                Debug.WriteLine(info.Invoke(obj, null));

            }
        }
    }
}
