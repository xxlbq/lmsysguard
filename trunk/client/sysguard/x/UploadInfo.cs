using System;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Text;
using System.Windows.Forms;
using System.Resources;
using sysguard.Components;
using sysguard.Properties;
using sysguard.SysguardWS;

namespace sysguard.x
{
    public partial class UploadInfo : UserControl
    {
        private MainForm mainForm;
        public void init(MainForm m)
        {
            this.mainForm = m;
            mainForm.SetExcelEnabled(false);
            mainForm.SetStatus("批量上传");
            mainForm.SetPrintEnabled(false);
            mainForm.SetSearch(null);
            mainForm.SetCopyEnable(false);
            mainForm.SetNewClick(null);
            mainForm.SetDeleteClick(null);
        }
        public UploadInfo()
        {

            InitializeComponent();
            loadHost();
        }

        private void loadHost()
        {

            IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];

            DataLayerResult result = dataLayer.GetAllHostInfo();
            if (result == DataLayerResult.Success)
            {

                IDictionary<int, SysguardWS.HostInfo> hostInfoMap = dataLayer.HostInfoList;

                foreach (SysguardWS.HostInfo host in hostInfoMap.Values)
                {
                    ListViewItem listItem = new ListViewItem(host.hostName);
                    listItem.ImageIndex = 0;
                    listItem.Tag = host;
                    listView1.Items.Add(listItem);
                }

            }



        }

        private void toolStripMenuItem2_Click(object sender, EventArgs e)
        {
            this.listView1.View = View.SmallIcon;
        }

        private void abcToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.listView1.View = View.LargeIcon;
        }

        private void toolStripMenuItem4_Click(object sender, EventArgs e)
        {
            this.listView1.View = View.Details;
        }

        private void toolStripMenuItem5_Click(object sender, EventArgs e)
        {
            this.listView1.View = View.Tile;
        }

        private void toolStripMenuItem3_Click(object sender, EventArgs e)
        {
            this.listView1.View = View.List;
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {

            IEnumerator w = listView1.SelectedItems.GetEnumerator();
            while (w.MoveNext())
            {
                ListViewItem q = (ListViewItem)w.Current;
                listView1.Items.Remove(q);
                listView2.Items.Add(q);
            }

        }

        private void toolStripMenuItem1_Click(object sender, EventArgs e)
        {
            listView2.View = View.SmallIcon;
        }

        private void toolStripMenuItem6_Click(object sender, EventArgs e)
        {
            listView2.View = View.LargeIcon;
        }

        private void toolStripMenuItem7_Click(object sender, EventArgs e)
        {
            listView2.View = View.List;
        }

        private void toolStripMenuItem8_Click(object sender, EventArgs e)
        {
            listView2.View = View.Details;
        }

        private void toolStripMenuItem9_Click(object sender, EventArgs e)
        {
            listView2.View = View.Tile;
        }

        private void toolStripButton2_Click(object sender, EventArgs e)
        {
            IEnumerator w = listView2.SelectedItems.GetEnumerator();
            while (w.MoveNext())
            {
                ListViewItem q = (ListViewItem)w.Current;
                listView2.Items.Remove(q);
                listView1.Items.Add(q);
            }
        }



        private void listView2_DragEnter(object sender, DragEventArgs e)
        {

            e.Effect = DragDropEffects.Move;

        }

        private void listView1_ItemDrag(object sender, ItemDragEventArgs e)
        {
            IEnumerator w = listView1.SelectedItems.GetEnumerator();

            ListViewItem q = new ListViewItem();

            while (w.MoveNext())
            {

                q = (ListViewItem)w.Current;

                DoDragDrop(q, DragDropEffects.Move);

            }

        }

        private void listView2_DragDrop(object sender, DragEventArgs e)
        {
            ListViewItem s = new ListViewItem();

            s = (ListViewItem)e.Data.GetData(s.GetType());

            listView1.Items.Remove(s);

            listView2.Items.Add(s);
        }

        private void toolStripButton3_Click(object sender, EventArgs e)
        {
            if (listView2.Items.Count == 0)
            {

                DialogResult dialo = MessageBox.Show("请选择上传列表!", "选择上传列表", MessageBoxButtons.OKCancel);
                if (dialo == DialogResult.OK)
                {
                    listView1.Focus();
                }
                return;
            }
            MyUploadInfo up = new MyUploadInfo();
            mainForm.CurrentOpenChildForm = up;
            foreach (ListViewItem item in listView2.Items)
            {
                SysguardWS.HostInfo hostinfo = (SysguardWS.HostInfo)item.Tag;
                up.HostIdList.Add(hostinfo.hostId);
            }
            up.Show();
        }

        private void listView2_ItemDrag(object sender, ItemDragEventArgs e)
        {
            IEnumerator w = listView2.SelectedItems.GetEnumerator();

            ListViewItem q = new ListViewItem();

            while (w.MoveNext())
            {

                q = (ListViewItem)w.Current;

                DoDragDrop(q, DragDropEffects.Move);

            }
        }

        private void listView1_DragDrop(object sender, DragEventArgs e)
        {
            ListViewItem s = new ListViewItem();

            s = (ListViewItem)e.Data.GetData(s.GetType());

            listView2.Items.Remove(s);

            listView1.Items.Add(s);
        }

        private void listView1_DragEnter(object sender, DragEventArgs e)
        {
            e.Effect = DragDropEffects.Move;
        }
    }
}
