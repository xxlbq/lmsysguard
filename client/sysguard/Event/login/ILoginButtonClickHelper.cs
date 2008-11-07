using System;
using System.Collections.Generic;
using System.Text;

namespace sysguard.Event.login
{
    public interface ILoginButtonClickHelper
    {
         void executeLogin(AbsLoginEventAdapter adapter);
    }
}
