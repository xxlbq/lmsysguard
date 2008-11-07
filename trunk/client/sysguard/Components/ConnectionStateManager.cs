using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Forms;
using sysguard.Properties;
namespace sysguard.Components
{
    public enum ConnState { None=0,ConnSuccess = 1, ConnFail = 2, }
    public class ConnectionStateManager : IConnectionStateManager
    {
        private NotifyIcon trayIcon;
        public NotifyIcon TrayIcon
        {
            set
            {
                trayIcon = value;
            }
            get
            {
                return trayIcon;
            }
        }

        public void Connection()
        {
            ConnState state=(ConnState)Settings.Default.Context["conn"];
            if (ConnState.ConnFail==state)
            {
                trayIcon.Icon = Resources.SysguardOnline;
                Settings.Default.Context.Remove("conn");
                Settings.Default.Context.Add("conn",ConnState.ConnSuccess);
            }
        }
        public void ConnectionFail()
        {
            if (trayIcon != null)
            {
                trayIcon.Icon = Resources.SysguardOffline;
                Settings.Default.Context.Remove("conn");
                Settings.Default.Context.Add("conn", ConnState.ConnFail);
            }
        }
    }
}
