using System;
using System.Collections.Generic;
using System.Text;
using System.Reflection;

using Spring.Aop;
using AopAlliance.Intercept;
using sysguard.x;
using sysguard.Properties;
using System.Windows.Forms;
namespace sysguard.Components
{
    public class DataLayerReturnValueAfterAdvice : IAfterReturningAdvice
    {
        public void AfterReturning(
            object returnValue, MethodInfo method, object[] args, object target)
        {
            if (!method.Name.Equals("HandleException") && !method.Name.StartsWith("get") && !method.Name.StartsWith("set"))
            {
                string methodname = method.Name;
                DataLayerResult result = (DataLayerResult)returnValue;
                if (result == DataLayerResult.NoLogin)
                {
                    NoLoginCloseMainToLogin.CloseMainToLogin();
                    return;
                }
                if (result == DataLayerResult.UnknownFailure)
                {
                    MessageBox.Show("未知错误,请重试或与管理员联系!", "未知错误", MessageBoxButtons.OK);
                    CloseOpenForm();
                    return;
                }
                if (result == DataLayerResult.ConnectionFailure) {
                    MessageBox.Show("连接错误,请重试或与管理员联系!", "连接错误", MessageBoxButtons.OK);
                    CloseOpenForm();
                    return;
                }
                if (result == DataLayerResult.ServiceFailure) {
                    MessageBox.Show("服务错误,请重试或与管理员联系!", "服务错误", MessageBoxButtons.OK);
                    CloseOpenForm();
                    return;
                }
                if (result == DataLayerResult.AuthenticationFailure) {
                    MessageBox.Show("服务响应无效返回值为 NULL ,请重试或与管理员联系!", "服务响应无效", MessageBoxButtons.OK);
                    CloseOpenForm();
                    return;
                }
            }
        }

        private static void CloseOpenForm()
        {
            foreach (Form f in Application.OpenForms)
            {
                if (f.Enabled)
                {
                    f.Close();
                }
            }
        }
    }
}
