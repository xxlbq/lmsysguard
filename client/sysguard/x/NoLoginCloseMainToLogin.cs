using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;

namespace sysguard.x
{
    class NoLoginCloseMainToLogin
    {

        public static void CloseMainToLogin()
        {
            DialogResult res = MessageBox.Show("��½״̬ʧЧ�����µ�½!", "��½ʧЧ", MessageBoxButtons.OK);
            if (res == DialogResult.OK)
            {
                Process myProcess = Process.GetCurrentProcess();
                
                Process.Start("sysguard");
                myProcess.Kill();
                
            }


        }
    }
}
