using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using sysguard;
using sysguard.Event.login;
using sysguard.Properties;
using sysguard.Components;
namespace sysguard
{
    public partial class FormLogin : Form
    {
        public bool RememberChecked
        {
            set
            {
                this.cbRemember.Checked = value;
            }
            get
            {
                return this.cbRemember.Checked;
            }

        }

        public string UserNameText
        {
            set
            {
                this.usernamebox.Text = value;
            }
            get
            {
                return this.usernamebox.Text;
            }
        }

        public ComboBox.ObjectCollection UserNameBoxItems
        {

            get
            {
                return this.usernamebox.Items;
            }

        }

        public object UserNameBoxSelectedItem
        {
            set
            {
                this.usernamebox.SelectedItem = value;
            }

            get
            {
                return this.usernamebox.SelectedItem;
            }
        }

        public string UserPwdText
        {
            set
            {
                this.userpwd.Text = value;
            }
            get
            {
                return this.userpwd.Text;
            }
        }

        public Cursor BtnloginCursor {
            set {
                this.btnlogin.Cursor = value;
            }
            get {
                return this.btnlogin.Cursor;
            }
        }

        public bool UserNameBoxFocus()
        {

            return this.usernamebox.Focus();
        }

        public void UserNameBoxSelectAll() {
            this.usernamebox.SelectAll();
        }

        public bool UserPwdTextFocus()
        {
            return this.userpwd.Focus();
        }

        public FormLogin(AbsLoginEventAdapter loginEventAdapter)
        {

            InitializeComponent();
            loginEventAdapter.LoginForm = this;
            this.btnlogin.Click += new EventHandler(loginEventAdapter.btnOK_Click);
            this.btnlogin.MouseEnter += new EventHandler(loginEventAdapter.btnlogin_MouseEnter);
            this.btnlogin.MouseLeave+=new EventHandler(loginEventAdapter.btnlogin_MouseLeave);
            
            this.btncancel.Click += new EventHandler(loginEventAdapter.btncancel_Click);
            this.btncancel.MouseEnter += new EventHandler(loginEventAdapter.btncancel_MouseEnter);
            this.btncancel.MouseLeave += new EventHandler(loginEventAdapter.btncancel_MouseLeave);

            this.FormClosing += new FormClosingEventHandler(loginEventAdapter.FormLogin_FormClosing);
            this.Load += new EventHandler(loginEventAdapter.FormLogin_Load);

            this.usernamebox.SelectedValueChanged += new EventHandler(loginEventAdapter.usernamebox_SelectedValueChanged);

        }

       

      

        



    }
}