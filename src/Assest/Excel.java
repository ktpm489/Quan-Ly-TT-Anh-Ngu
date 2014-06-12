/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assest;

/**
 *
 * @author XuanVinh
 */
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JTable;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

//    public static void WriteListToExcelToListInBangDiem(String filename, String namesheet,String direction, JTable table) throws Exception {
//        Workbook workbook = null;
//
//        if (filename.endsWith("xlsx")) {
//            workbook = new XSSFWorkbook();
//        } else if (filename.endsWith("xls")) {
//            workbook = new HSSFWorkbook();
//        } else {
//            throw new Exception("invalid file name, should be xls or xlsx");
//        }
//
//        Sheet sheet = workbook.createSheet(namesheet);
//
//        for (int rowIndex = 0; rowIndex <= table.getRowCount(); rowIndex++) {
//            Row row = sheet.createRow(rowIndex);
//            Cell cell = row.createCell(0);
//            if (rowIndex == 0) {
//                cell.setCellValue(table.getColumnName(0));
//            } else {
//                cell.setCellValue(table.getValueAt(rowIndex - 1, 0).toString());
//            }
//
//            Cell cell1 = row.createCell(1);
//            if (rowIndex == 0) {
//                cell1.setCellValue(table.getColumnName(1));
//            } else {
//                cell1.setCellValue(table.getValueAt(rowIndex - 1 , 1).toString());
//            }
//        }
//        //Lưu file với tên và đường dẫn file
//        File file = new File(direction + "\\"+ filename);
//        FileOutputStream fos = new FileOutputStream(file);
//        workbook.write(fos);
//        fos.close();
//    }
}
