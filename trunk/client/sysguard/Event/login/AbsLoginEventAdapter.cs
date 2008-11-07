using System;
using System.Collections.Generic;
using System.Collections;
using System.Text;
using System.Windows.Forms;
using Sysguard.BackgroundManage;
using System.Threading;
using sysguard;
using sysguard.Components;
using sysguard.Properties;

namespace sysguard.Event.login
{
    public enum FocusFlags { NONE = 0, FocusName = 1, FocusPwd = 2 };

    abstract public  class AbsLoginEventAdapter
    {
        protected static readonly char[] pwdseparators ={ Settings.Default.pwdseparator };
        protected static readonly char[] nameandpwdseparators ={ Settings.Default.nameandpwdseparator };

        private FormLogin loginForm;
         
        public FormLogin LoginForm
        {
            set
            {
                this.loginForm = value;
            }

            get
            {
                return this.loginForm;
            }
        }
        private IDataLayer dataLayer;

        public IDataLayer DataLayer
        {
            set
            {
                this.dataLayer = value;
            }
            get
            {
                return this.dataLayer;
            }
        }

        private IDictionary<FocusFlags, ILoginButtonClickHelper> loginClickHelper=new Dictionary<FocusFlags, ILoginButtonClickHelper>();

        public IDictionary<FocusFlags, ILoginButtonClickHelper> LoginClickHelper
        {
            set
            {
                this.loginClickHelper = value;
            }
            get
            {

                return this.loginClickHelper;
            }
        }



        public void btnOK_Click(object sender, EventArgs e)
        {
            Button but = (Button)sender;
            FocusFlags focusFlag = this.validing();
            ILoginButtonClickHelper helper = this.loginClickHelper[focusFlag];
            helper.executeLogin(this);


        }

        public void FormLogin_FormClosing(object sender, FormClosingEventArgs e)
        {
            DialogResult dr = MessageBox.Show("确认退出吗？", "操作确认", MessageBoxButtons.YesNo);
            if (dr == DialogResult.Yes)
            {
                systemClose();
            }
            else
            {
                e.Cancel = true;
            }
        }

        public void btncancel_Click(object sender, EventArgs e)
        {
            this.loginForm.UserNameText = string.Empty;
            this.loginForm.UserPwdText = string.Empty;

        }

        public void FormLogin_Load(object sender, EventArgs e)
        {


            this.loginForm.UserNameBoxSelectAll();
            this.loginForm.UserNameBoxFocus();


            if (Settings.Default.rememberLogin)
            {
                loadNameAndPwd();

            }
            else
            {

                unRememberLogin();
            }
        }


        public void btnlogin_MouseEnter(object sender, EventArgs e)
        {
            Button btnlogin = (Button)sender;
            btnlogin.BackColor = System.Drawing.SystemColors.ControlDark;
        }

        public void btnlogin_MouseLeave(object sender, EventArgs e)
        {
            Button btnlogin = (Button)sender;
            btnlogin.BackColor = System.Drawing.SystemColors.Control;
        }

        public void btncancel_MouseEnter(object sender, EventArgs e)
        {
            Button btncancel = (Button)sender;
            btncancel.BackColor = System.Drawing.SystemColors.ControlDark;
        }

        public void btncancel_MouseLeave(object sender, EventArgs e)
        {
            Button btncancel = (Button)sender;
            btncancel.BackColor = System.Drawing.SystemColors.Control;
        }


        public void usernamebox_SelectedValueChanged(object sender, EventArgs e)
        {
            ComboBox box = (ComboBox)sender;
            string username = box.Text;
            string password = changedPwd(username);
            this.loginForm.UserPwdText = password;
        }



        protected void systemClose()
        {
            System.Environment.Exit(0);

        }

        protected abstract string changedPwd(string username);
        protected abstract void unRememberLogin();
        protected abstract FocusFlags validing();
        protected abstract void loadNameAndPwd();


    }
}
