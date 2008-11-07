using System;
using System.Collections.Generic;
using System.Windows.Forms;
using sysguard.Components;
using sysguard.Event.login;


using sysguard.x;
using Spring.Context;
using Spring.Context.Support;

namespace sysguard
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        public static void Main()
        {



            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Spalsh spalsh = new Spalsh();
            
            spalsh.ShowSpalsh();
            if (spalsh.DialogResult.Equals(DialogResult.OK))
            {
                
                AbsLoginEventAdapter loginEventAdapter = (AbsLoginEventAdapter)sysguard.Properties.Settings.Default.Context["loginEventAdapter"];
                FormLogin login = new FormLogin(loginEventAdapter);
                login.ShowDialog();
                if (login.DialogResult.Equals(DialogResult.OK)) //登陆成功才显示主窗口
                {
                    MainForm main = new MainForm();
                    sysguard.Properties.Settings.Default.Context.Add("main", main);
                    Application.Run(main);

                }

            }

        }
    }
}