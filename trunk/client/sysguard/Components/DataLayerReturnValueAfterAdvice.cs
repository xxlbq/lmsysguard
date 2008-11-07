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
                    MessageBox.Show("δ֪����,�����Ի������Ա��ϵ!", "δ֪����", MessageBoxButtons.OK);
                    CloseOpenForm();
                    return;
                }
                if (result == DataLayerResult.ConnectionFailure) {
                    MessageBox.Show("���Ӵ���,�����Ի������Ա��ϵ!", "���Ӵ���", MessageBoxButtons.OK);
                    CloseOpenForm();
                    return;
                }
                if (result == DataLayerResult.ServiceFailure) {
                    MessageBox.Show("�������,�����Ի������Ա��ϵ!", "�������", MessageBoxButtons.OK);
                    CloseOpenForm();
                    return;
                }
                if (result == DataLayerResult.AuthenticationFailure) {
                    MessageBox.Show("������Ӧ��Ч����ֵΪ NULL ,�����Ի������Ա��ϵ!", "������Ӧ��Ч", MessageBoxButtons.OK);
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
