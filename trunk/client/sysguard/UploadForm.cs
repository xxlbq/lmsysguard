using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.IO;


namespace sysguard
{
    public partial class UploadForm : Form
    {
        bool lv1_mdown = false;
        bool lv2_mdown = false;
        public UploadForm()
        {
            InitializeComponent();
         }

        private void UploadForm_Load(object sender, EventArgs e)
        {
            listView1.BeginUpdate();
            listView1.LargeImageList = imagesLarge;

            for (int i = 0; i < 10; i++)
            {
                ListViewItem listItem = new ListViewItem("ModelName" + i);
                listItem.ImageIndex = 0;

                listView1.Items.Add(listItem);
            }

            listView1.EndUpdate();

        }

        private void listView1_DragEnter(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent(DataFormats.Text))
                e.Effect = DragDropEffects.Copy;
            else
                e.Effect = DragDropEffects.None; 
        }

        private void listView1_DragDrop(object sender, DragEventArgs e)
        {
            string textBox1 = e.Data.GetData(DataFormats.Text).ToString();
            string[] items = textBox1.Split(',');
            listView1.Items.Add(new ListViewItem(items, 0));
            lv1_mdown = false;
            lv2_mdown = false;
        }

        private void listView2_DragDrop(object sender, DragEventArgs e)
        {
            string textBox1 = e.Data.GetData(DataFormats.Text).ToString();
            string[] items = textBox1.Split(',');
            listView2.Items.Add(new ListViewItem(items, 0));
            lv2_mdown = false;
            lv1_mdown = false;
        }

        private void listView2_DragEnter(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent(DataFormats.Text))
                e.Effect = DragDropEffects.Copy;
            else
                e.Effect = DragDropEffects.None;
        }

        private void listView1_MouseMove(object sender, System.Windows.Forms.MouseEventArgs e)
        {
            if (!lv1_mdown) return;
            if (e.Button == MouseButtons.Right) return;

            string str = GetItemText(listView1);
            if (str == "") return;

            listView1.DoDragDrop(str, DragDropEffects.Copy | DragDropEffects.Move);
        }

        private void listView2_MouseMove(object sender, System.Windows.Forms.MouseEventArgs e)
        {
            if (!lv2_mdown) return;
            if (e.Button == MouseButtons.Right) return;

            string str = GetItemText(listView2);
            if (str == "") return;

            listView2.DoDragDrop(str, DragDropEffects.Copy | DragDropEffects.Move);
        }

        private void listView1_MouseDown(object sender, System.Windows.Forms.MouseEventArgs e)
        {
            lv1_mdown = true;
        }

        private void listView2_MouseDown(object sender, System.Windows.Forms.MouseEventArgs e)
        {
            lv2_mdown = true;
        }

        public string GetItemText(ListView LVIEW)
        {
            int nTotalSelected = LVIEW.SelectedIndices.Count;
            if (nTotalSelected <= 0) return "";
            System.Collections.IEnumerator selCol = LVIEW.SelectedItems.GetEnumerator();
            selCol.MoveNext();
            ListViewItem lvi = (ListViewItem)selCol.Current;
            string mDir = "";
            for (int i = 0; i < lvi.SubItems.Count; i++)
                mDir += lvi.SubItems[i].Text + ",";

            mDir = mDir.Substring(0, mDir.Length - 1);
            return mDir;
        }

    }
}