using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Forms;
namespace sysguard.Event.login
{
    class UserNameBoxFocusHelper:ILoginButtonClickHelper
    {
        public void executeLogin(AbsLoginEventAdapter adapter) {
            MessageBox.Show("�û��������벻��Ϊ��!", "sysguard errors:", MessageBoxButtons.OK, MessageBoxIcon.Error);
            adapter.LoginForm.UserNameBoxFocus();
        }
    }
}
