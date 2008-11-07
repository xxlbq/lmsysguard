using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Forms;
namespace sysguard.Event.login
{
    class UserNameBoxFocusHelper:ILoginButtonClickHelper
    {
        public void executeLogin(AbsLoginEventAdapter adapter) {
            MessageBox.Show("用户名或密码不能为空!", "sysguard errors:", MessageBoxButtons.OK, MessageBoxIcon.Error);
            adapter.LoginForm.UserNameBoxFocus();
        }
    }
}
