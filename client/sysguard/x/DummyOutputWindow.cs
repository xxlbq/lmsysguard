using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace sysguard.x
{
    public partial class DummyOutputWindow : WeifenLuo.WinFormsUI.Content
    {
        public DummyOutputWindow()
        {
            InitializeComponent();
            //comboBox.SelectedIndex = 0;

        }

        public string OutputInfo
        {
            get
            {
                return this.textBox1.Text;
            }
            set
            {
                this.textBox1.Text = value;
            }
        }

    }
}

