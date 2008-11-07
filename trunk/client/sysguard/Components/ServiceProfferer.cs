using System;
using System.Collections.Generic;
using System.Text;
using System.Net;
using System.Reflection;

namespace sysguard.Components
{
    class ServiceProfferer<T> : IServiceProfferer<T> where T : new()
    {
        public T service()
        {
            T service = new T();
            Type type = service.GetType();
            PropertyInfo p2Info = type.GetProperty("CookieContainer");
            CookieContainer cookieContainer = new CookieContainer();
            p2Info.SetValue(service, cookieContainer, null);
            return service;
            
        }
    }
}
