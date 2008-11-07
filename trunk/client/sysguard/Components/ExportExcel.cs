using System;
using System.Collections.Generic;
using System.Text;
using System.Data;
using System.Windows.Forms;

namespace sysguard.Components
{
    class ExportExcel
    {
        public void GenExcel(DataGridView gridView)
        {
            // Create application
            Excel.Application excel = new Excel.Application();

            if (excel == null)
            {
                MessageBox.Show("ERROR: EXCEL could not be started!");
                return;
            }

            // Add 1 workbook with 1 sheet
            Excel.Workbook workbook =
            excel.Workbooks.Add(Excel.XlWBATemplate.xlWBATWorksheet);
            Excel.Worksheet workSheet =
            (Excel.Worksheet)workbook.ActiveSheet;

            // Add column headers
            for (int columnIndex = 0; columnIndex < gridView.Columns.Count;
            columnIndex++)
            {
                workSheet.Cells[1, columnIndex + 1] =
                gridView.Columns[columnIndex].HeaderText;
                ((Excel.Range)(workSheet.Cells[1, columnIndex + 1])).Font.Bold
                = true;
            }

            // Add data rows
            for (int rowIndex = 0; rowIndex < gridView.Rows.Count; rowIndex++)
            {
                for (int columnIndex = 0; columnIndex < gridView.Columns.Count;
                columnIndex++)
                {
                    workSheet.Cells[rowIndex + 2, columnIndex + 1] =
                    gridView.Rows[rowIndex].Cells[columnIndex].Value;
                   
                }
            }

            // Autofit
            workSheet.Columns.AutoFit();

            // Show
            excel.Visible = true;

            // Clean up
            excel = null;
            workbook = null;
            workSheet = null;
            GC.Collect();
        }
    }
}
