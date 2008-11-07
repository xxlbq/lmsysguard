using System;
using System.Collections;
using System.Collections.Generic;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Windows.Forms;
using System.Resources;
using System.Reflection;
using System.ComponentModel;
using System.Runtime.InteropServices;
using WeifenLuo.WinFormsUI;
using ExplorerControls;
using System.IO;
using sysguard.SysguardWS;
using sysguard.Properties;
using sysguard.Components;

namespace sysguard.x
{
    public partial class MyUploadInfo : Form
    {
        private List<int> hostIdList = new List<int>();
        private DummyOutputWindow m_outputWindow = new DummyOutputWindow();
        private DummyFileUpLoadViewList dummyFile = new DummyFileUpLoadViewList();


        public List<int> HostIdList
        {
            get
            {
                return hostIdList;
            }
        }
        public MyUploadInfo()
        {
            InitializeComponent();
        }
        /*
                private void ListView_DragDrop(object sender, DragEventArgs e)
                {
                    e.Effect = DragDropEffects.Move;
                }

                private void ListView_DragEnter(object sender, DragEventArgs e)
                {
                    e.Effect = DragDropEffects.Move;
                }
        */

        private Content GetContentFromPersistString(string persistString)
        {
            if (persistString == typeof(DummyOutputWindow).ToString())
                return m_outputWindow;
            else if (persistString == typeof(DummyFileUpLoadViewList).ToString())
                return dummyFile;
            //else if (persistString == typeof(CMDForm).ToString())
            //    return cmd;
            else
                return null;

        }

        private void MyUploadInfo_Load(object sender, EventArgs e)
        {
            string configFile = Path.Combine(Path.GetDirectoryName(Application.ExecutablePath), "DockManager.config");
            if (File.Exists(configFile))
                dockManager.LoadFromXml(configFile, new GetContentCallback(GetContentFromPersistString));
        }

        private void MyUploadInfo_FormClosing(object sender, FormClosingEventArgs e)
        {
            string configFile = Path.Combine(Path.GetDirectoryName(Application.ExecutablePath), "DockManager.config");
            dockManager.SaveAsXml(configFile);
        }

        private void flatButton3_Click(object sender, EventArgs e)
        {

            if (dummyFile == null)
            {
                dummyFile = new DummyFileUpLoadViewList();
            }
            dummyFile.Show(dockManager);
        }

        private void flatButton4_Click(object sender, EventArgs e)
        {
            if (m_outputWindow == null)
            {
                m_outputWindow = new DummyOutputWindow();
            }
            try
            {
                m_outputWindow.Show(dockManager);
            }
            catch (Exception ex)
            {

                MessageBox.Show(ex.Message);
            }

        }

        private void dockManager_ActiveDocumentChanged(object sender, EventArgs e)
        {

        }

        private void dockManager_ContentRemoved(object sender, ContentEventArgs e)
        {

        }

        private void dockManager_ContentAdded(object sender, ContentEventArgs e)
        {

        }

        private void flatButton6_Click(object sender, EventArgs e)
        {
            CMDTOHostForm cmd = new CMDTOHostForm();
            cmd.HostIdList.AddRange(this.hostIdList);
            DialogResult result = cmd.ShowDialog();
            if (result == DialogResult.OK)
            {
                cmd.Close();
            }
            this.m_outputWindow.OutputInfo = string.Empty;
            foreach (string output in cmd.ExecResult)
            {
                this.m_outputWindow.OutputInfo += output.Replace("\n", "\r\n");
            }
            this.m_outputWindow.Show(dockManager);
        }

        private void flatButton1_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(this.textBox1.Text))
            {
                DialogResult dialo = MessageBox.Show("请输入文件路径然后在按上传按钮!", "请输入文件路径", MessageBoxButtons.OKCancel);
                if (dialo == DialogResult.OK)
                {
                    this.textBox1.Focus();
                }
                return;
            }
            dummyFile.ExpList1.FullRowSelect = true;
            ExpList.ExpListItemCollection items = dummyFile.ExpList1.Items;
            if (items.Count == 0)
            {
                DialogResult dialo = MessageBox.Show("请选择文件然后在按上传按钮!", "请选择文件", MessageBoxButtons.OKCancel);
                if (dialo == DialogResult.OK)
                {
                    this.Browser1.Focus();
                }
                return;
            }

            foreach (ExpListItem item in items)
            {
                CShItem itm = item.CShItem;
                List<MeUpLoadInfo> l = GetUpLoadInfoList(itm.Path);

                IDataLayer dataLayer = (IDataLayer)Settings.Default.Context["datalayer"];
                this.m_outputWindow.OutputInfo = string.Empty;
                foreach (MeUpLoadInfo meUpLoadInfo in l)
                {
                    foreach (FileInfo file in meUpLoadInfo.FileInfos)
                    {

                        DataLayerResult result = dataLayer.BatchUploadFile(File.ReadAllBytes(file.FullName), file.Name, this.hostIdList, meUpLoadInfo.RemovePath);
                        if (result == DataLayerResult.Success)
                        {
                            foreach (string output in dataLayer.UploadResultList)
                            {
                                this.m_outputWindow.OutputInfo += output + "\r\n";
                            }
                        }
                      
                        else if(result==DataLayerResult.LoginHostError)
                        {
                            this.m_outputWindow.OutputInfo += "远程主机登陆名或密码错误请与管理员联系!" + "\r\n";
                        }
                        m_outputWindow.Show(dockManager);
                    }
                }
            }

        }

        private List<MeUpLoadInfo> GetUpLoadInfoList(string path)
        {
            List<MeUpLoadInfo> l = new List<MeUpLoadInfo>();

            if (File.Exists(path))
            {
                MeUpLoadInfo meUpLoadInfo = new MeUpLoadInfo();
                meUpLoadInfo.RemovePath = this.textBox1.Text;
                meUpLoadInfo.FileInfos.Add(new FileInfo(path));
                l.Add(meUpLoadInfo);
            }
            else if (Directory.Exists(path))
            {
                string[] files = Directory.GetFiles(path);
                for (int i = 0; i < files.Length; i++)
                {
                    MeUpLoadInfo meUpLoadInfo = new MeUpLoadInfo();
                    if (this.textBox1.Text[(this.textBox1.Text.Length - 1)].Equals("/"))
                    {
                        meUpLoadInfo.RemovePath = this.textBox1.Text + new DirectoryInfo(path).Name;
                    }
                    else
                    {
                        meUpLoadInfo.RemovePath = this.textBox1.Text + "/" + new DirectoryInfo(path).Name;
                    }

                    FileInfo fl = new FileInfo(files[i]);
                    meUpLoadInfo.FileInfos.Add(fl);
                    l.Add(meUpLoadInfo);
                }
                string[] dirs = Directory.GetDirectories(path);
                for (int i = 0; i < dirs.Length; i++)
                {
                    l.AddRange(this.GetUpLoadInfoList(dirs[i]));
                }

            }
            return l;
        }




    }
}