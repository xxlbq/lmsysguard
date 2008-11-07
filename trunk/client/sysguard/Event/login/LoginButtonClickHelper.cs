using System;
using System.Collections.Generic;
using System.Collections;
using System.Text;
using System.Windows.Forms;
using Sysguard.BackgroundManage;
using System.Threading;
using sysguard;
using sysguard.Components;
using sysguard.Properties;


namespace sysguard.Event.login
{
    class LoginButtonClickHelper : ILoginButtonClickHelper
    {
        private static readonly char[] separators ={Settings.Default.pwdseparator};
        public void executeLogin(AbsLoginEventAdapter adapter)
        {
            adapter.LoginForm.BtnloginCursor = Cursors.WaitCursor;
            DataLayerResult result = adapter.DataLayer.Login(adapter.LoginForm.UserNameText, adapter.LoginForm.UserPwdText);
            adapter.LoginForm.BtnloginCursor = Cursors.Arrow;


            if (result == DataLayerResult.Success)
            {
                if (adapter.LoginForm.RememberChecked)
                {

                    if (string.IsNullOrEmpty(Settings.Default.userNameList))
                    {
                        Settings.Default.userNameList = adapter.LoginForm.UserNameText;
                    }
                    else
                    {
                        string[] usernameArray = Settings.Default.userNameList.Split(separators);
                        int n = 0;
                        for (int i = 0; i < usernameArray.Length; i++)
                        {
                            if (usernameArray[i].Equals(adapter.LoginForm.UserNameText))
                            {
                                n++;
                                break;
                            }
                        }
                        if (n == 0)
                        {
                            Settings.Default.userNameList += Settings.Default.pwdseparator + adapter.LoginForm.UserNameText;
                        }

                    }
                    //System.Configuration.SettingsProperty property = new System.Configuration.SettingsProperty(loginForm.UserNameText);
                    //property.PropertyType = Type.GetType("string");
                    //System.Configuration.SettingsPropertyValue propertyValue = new System.Configuration.SettingsPropertyValue(property);
                    //propertyValue.PropertyValue = DataProtection.ProtectData(loginForm.UserPwdText, "Sysguard");


                    //Settings.Default.PropertyValues.Add(propertyValue);
                    if (string.IsNullOrEmpty(Settings.Default.passwords))
                    {

                        Settings.Default.passwords = adapter.LoginForm.UserNameText + Settings.Default.nameandpwdseparator + DataProtection.ProtectData(adapter.LoginForm.UserPwdText, "Sysguard");
                    }
                    else
                    {

                        Settings.Default.passwords += Settings.Default.pwdseparator + adapter.LoginForm.UserNameText + Settings.Default.nameandpwdseparator + DataProtection.ProtectData(adapter.LoginForm.UserPwdText, "Sysguard");
                    }


                    Settings.Default.rememberLogin = adapter.LoginForm.RememberChecked;
                    Settings.Default.Save();



                }
                adapter.LoginForm.DialogResult = DialogResult.OK;
                adapter.LoginForm.FormClosing -= new System.Windows.Forms.FormClosingEventHandler(adapter.FormLogin_FormClosing);
                adapter.LoginForm.Close();
            }
            else if (result == DataLayerResult.LoginUserNameUnknown)
            {
                MessageBox.Show("帐号不存在,请重新输入！");
                adapter.LoginForm.UserNameBoxFocus();
                adapter.LoginForm.DialogResult = DialogResult.None;
            }
            else if (result == DataLayerResult.LoginPasswordUnfit)
            {
                MessageBox.Show("密码无效,请重新输入！");
                adapter.LoginForm.UserPwdTextFocus();
                adapter.LoginForm.DialogResult = DialogResult.None;
            }
            

        }
    }
}
