using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
namespace sysguard.Components
{
    class LogError
    {
        private const string c_EventSource = "Sysguard";
        private const string c_LogName = "Application";

        public static void Write(string errorMessage)
        {
            try
            {
                // the event source should be created during the installation process
                if (EventLog.SourceExists(c_EventSource))
                {
                    // write the message as an error
                    EventLog msg = new EventLog(c_LogName);
                    msg.Source = c_EventSource;
                    msg.WriteEntry(errorMessage, EventLogEntryType.Error);
                }
                else
                {
                    // try to create the event source for the next error (this requires admin rights)
                    EventLog.CreateEventSource(c_EventSource, c_LogName);
                }
            }
            catch
            { }
        }
    }
}
