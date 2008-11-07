using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using ExplorerControls;
namespace sysguard.x
{
    public partial class DummyFileUpLoadViewList : WeifenLuo.WinFormsUI.Content
    {
        public DummyFileUpLoadViewList()
        {
            InitializeComponent();
        }

        public ExplorerControls.ExpList ExpList1
        {

            get
            {
                return expList1;
            }
        }

        private void expList1_ItemsAdded(object sender, ExplorerControls.ExpList.ExpListItemsAddedEventArgs e)
        {
            this.Cursor = Cursors.WaitCursor;
            //  ExpListItem itm=


            ArrayList existingItems = new ArrayList();

            ArrayList doubles = new ArrayList();

            foreach (ExpListItem itm in expList1.Items)
            {
                if (existingItems.IndexOf(itm.CShItem.Path) > -1)
                {
                    doubles.Add(itm);
                }
                existingItems.Add(itm.CShItem.Path);
            }
            foreach(ExpListItem itm in doubles){
                expList1.Items.Remove(itm);
            }
            this.Cursor = Cursors.Default;

        }


    }
}

