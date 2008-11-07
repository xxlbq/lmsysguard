using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Threading;
using sysguard.Components;
using sysguard.Event.login;
using System.Reflection;
using System.Diagnostics;
using sysguard.x;
using Spring.Context;
using Spring.Context.Support;
using sysguard.Properties;
namespace sysguard
{
    public partial class Spalsh : Form
    {
        private Bitmap m_bmp;
        public Spalsh()
        {
            InitializeComponent();
            m_bmp = Resources.Spalsh;
            m_bmp.MakeTransparent(Color.White);
            this.Width = m_bmp.Width;
            this.Height = m_bmp.Height;

            this.labelProductName.Text = AssemblyProduct;
            this.labelVersion.Text = String.Format("�汾 {0}", AssemblyVersion);
            this.labelCopyright.Text = AssemblyCopyright;
            this.labelCompanyName.Text = AssemblyCompany;
        }
        public void ShowSpalsh()
        {

            this.ShowDialog();

        }

        public string AssemblyVersion
        {
            get
            {
                return Assembly.GetExecutingAssembly().GetName().Version.ToString();
            }
        }

        public string AssemblyDescription
        {
            get
            {
                // ��ȡ�˳��򼯵����� Description ����
                object[] attributes = Assembly.GetExecutingAssembly().GetCustomAttributes(typeof(AssemblyDescriptionAttribute), false);
                // ��� Description ���Բ����ڣ��򷵻�һ�����ַ���
                if (attributes.Length == 0)
                    return "";
                // ����� Description ���ԣ��򷵻ظ����Ե�ֵ
                return ((AssemblyDescriptionAttribute)attributes[0]).Description;
            }
        }

        public string AssemblyProduct
        {
            get
            {
                // ��ȡ�˳����ϵ����� Product ����
                object[] attributes = Assembly.GetExecutingAssembly().GetCustomAttributes(typeof(AssemblyProductAttribute), false);
                // ��� Product ���Բ����ڣ��򷵻�һ�����ַ���
                if (attributes.Length == 0)
                    return "";
                // ����� Product ���ԣ��򷵻ظ����Ե�ֵ
                return ((AssemblyProductAttribute)attributes[0]).Product;
            }
        }

        public string AssemblyCopyright
        {
            get
            {
                // ��ȡ�˳����ϵ����� Copyright ����
                object[] attributes = Assembly.GetExecutingAssembly().GetCustomAttributes(typeof(AssemblyCopyrightAttribute), false);
                // ��� Copyright ���Բ����ڣ��򷵻�һ�����ַ���
                if (attributes.Length == 0)
                    return "";
                // ����� Copyright ���ԣ��򷵻ظ����Ե�ֵ
                return ((AssemblyCopyrightAttribute)attributes[0]).Copyright;
            }
        }

        public string AssemblyCompany
        {
            get
            {
                // ��ȡ�˳����ϵ����� Company ����
                object[] attributes = Assembly.GetExecutingAssembly().GetCustomAttributes(typeof(AssemblyCompanyAttribute), false);
                // ��� Company ���Բ����ڣ��򷵻�һ�����ַ���
                if (attributes.Length == 0)
                    return "";
                // ����� Company ���ԣ��򷵻ظ����Ե�ֵ
                return ((AssemblyCompanyAttribute)attributes[0]).Company;
            }
        }

        private void Spalsh_Paint(object sender, PaintEventArgs e)
        {

            e.Graphics.DrawImage(m_bmp, 0, 0);
        }

        private void Spalsh_Shown(object sender, EventArgs e)
        {
           
            LoadSysConfigDelegate loadConfig = new LoadSysConfigDelegate(loadResource);
            loadConfig.BeginInvoke(null, null);
        }

        private void loadResource()
        {
            ShowProgressResDelegate show = new ShowProgressResDelegate(ShowProgressRes);
            string info = "��ʼ��  .....";
            this.BeginInvoke(show, new object[] { info });
            Thread.Sleep(50);
            string info1 = "���� Application config .....";
            IApplicationContext ctx = ContextRegistry.GetContext();
            this.BeginInvoke(show, new object[] { info1});
            Thread.Sleep(100);
           
            string info2= "���� Web Service ����   .....";
            IDataLayer dataLayer = (IDataLayer)ctx.GetObject("myServiceObject");
            AbsLoginEventAdapter loginEventAdapter = (AbsLoginEventAdapter)ctx.GetObject("loginEventAdapter");
            IConnectionStateManager connStateManager = (IConnectionStateManager)ctx.GetObject("connStateManager");
            this.BeginInvoke(show, new object[] { info2 });
            Thread.Sleep(100);
            string info3 = "�����������  .....";
            this.BeginInvoke(show, new object[] { info3 });
            Thread.Sleep(100);
            sysguard.Properties.Settings.Default.Context.Add("datalayer", dataLayer);
            sysguard.Properties.Settings.Default.Context.Add("connStateManager", connStateManager);
            sysguard.Properties.Settings.Default.Context.Add("conn", ConnState.None);
            sysguard.Properties.Settings.Default.Context.Add("loginEventAdapter", loginEventAdapter);
            this.DialogResult = DialogResult.OK;
            CloseDelegate close = new CloseDelegate(InternalCloseSplash);
            this.BeginInvoke(close,null);
          
        }

       public void InternalCloseSplash()
        {

            this.Close();
            this.Dispose();

        }
        private void ShowProgressRes(string info)
        {   
                loadSysLabel.Text = string.Empty;
                loadSysLabel.Text = info;       
            
        }
        private delegate void LoadSysConfigDelegate();
        private delegate void ShowProgressResDelegate(string info);
        private delegate void CloseDelegate();
    }
}