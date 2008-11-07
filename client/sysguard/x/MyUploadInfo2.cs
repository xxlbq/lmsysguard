using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Resources;
using System.Collections;
using System.IO;

namespace sysguard.x
{
    public partial class MyUploadInfo2 : Form
    {
        private System.Collections.IEnumerator myEnumerator;
        public const String LISTNAME = "uploadlistinfo.resourse";
        public MyUploadInfo2()
        {
            InitializeComponent();
        }
        public void ShowDialog(System.Collections.IEnumerator ie)
        {
            this.myEnumerator = ie;
            this.ShowDialog();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            List<ListViewItem> lvitem = new List<ListViewItem>();
            while (myEnumerator.MoveNext())
            {
                lvitem.Add((ListViewItem)myEnumerator.Current);
            }

            if (!File.Exists(LISTNAME))
            {
                ResourceWriter rw = new ResourceWriter(LISTNAME);

                rw.AddResource(textBox1.Text, lvitem);

                rw.Generate();

                rw.Close();
            }
            else
            {
                ResourceReader rr = new ResourceReader(LISTNAME);

                IDictionaryEnumerator ide = rr.GetEnumerator();

                Hashtable ht = new Hashtable();

                while (ide.MoveNext())
                {
                    ht.Add(ide.Key.ToString(), ide.Value);
                }

                rr.Close();

                ResourceWriter rw = new ResourceWriter(LISTNAME);

                rw.AddResource(textBox1.Text, lvitem);

                foreach (DictionaryEntry de in ht)
                {
                    rw.AddResource(de.Key.ToString(), de.Value);
                }

                rw.Generate();
          
                rw.Close();

            }


            this.Dispose();
        }
    }
}