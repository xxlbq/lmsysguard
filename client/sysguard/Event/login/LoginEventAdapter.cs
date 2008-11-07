using System;
using System.Collections.Generic;
using System.Text;
using Sysguard.BackgroundManage;
using sysguard.Properties;
using sysguard.Components;
namespace sysguard.Event.login
{
   public class LoginEventAdapter : AbsLoginEventAdapter
    {
       
       override protected FocusFlags validing()
        {

            string username = this.LoginForm.UserNameText;
            string pwd = this.LoginForm.UserPwdText;

            if (VerifyUtil.IsEmpty(username))
            {
                return FocusFlags.FocusName;
            }
            if (VerifyUtil.IsEmpty(pwd))
            {

                return FocusFlags.FocusPwd;
            }

            return FocusFlags.NONE;
        }

       override protected void unRememberLogin()
        {
            this.LoginForm.UserNameText = "<<请输入您的用户名>>";
        }

       override protected void loadNameAndPwd()
        {
            string usernames = Settings.Default.userNameList;
            string[] usernameArray = usernames.Split(pwdseparators);

            foreach (string username in usernameArray)
            {
                this.LoginForm.UserNameBoxItems.Add(username);
            }

            this.LoginForm.UserNameBoxSelectedItem = this.LoginForm.UserNameBoxItems[0];
            string password = DataProtection.UnprotectData((string)Settings.Default.Context[this.LoginForm.UserNameText]);
            this.LoginForm.UserPwdText = password;
            this.LoginForm.RememberChecked = true;
        }

       override protected string changedPwd(string username)
        {
            string passwords = Settings.Default.passwords;
            string[] passwordArrays = passwords.Split(pwdseparators);
            for (int i = 0; i < passwordArrays.Length; i++)
            {
                string[] keyvalue = passwordArrays[i].Split(nameandpwdseparators);
                if (!Settings.Default.Context.ContainsKey(keyvalue[0]))
                {
                    Settings.Default.Context.Add(keyvalue[0], keyvalue[1]);
                }

            }
            string password = DataProtection.UnprotectData((string)Settings.Default.Context[username]);
            return password;
        }

    }
}
