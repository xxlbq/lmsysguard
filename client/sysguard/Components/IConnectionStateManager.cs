using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Forms;
namespace sysguard.Components
{
    public interface IConnectionStateManager
    {
        NotifyIcon TrayIcon { set;get; }
        void Connection();
        void ConnectionFail();
    }
}
