/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import Assest.StoreSave;
import java.sql.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.DangKiBO;
import qlttanhngu.bo.HocVienBO;
import qlttanhngu.dto.DangKiDTO;
import qlttanhngu.gui.MessageBoxCustom;

/**
 *
 * @author MinhVu020
 */
public class DangKiController {

    private DangKiBO dangkibo;

    public DangKiController() throws Exception {
        dangkibo = new DangKiBO();
    }
     public DefaultTableModel LoadListHocVien() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
            "Mã học viên", "Họ tên", "CMND", "Năm sinh", "Giới tính",
            "Nghề nghiệp", "Số điện thoại", "Địa chỉ", "Email",
            "Ngày Đăng Kí","Mã Ngày","Mã Ca","Trạng Thái","Tình Trạng",
                "TĐ Tối Thiểu","TĐ Muốn Học","TĐ Được Học"});
        DefaultTableModel tableDefault1 = dangkibo.LoadListHocVien();
        // DangKiDTO
        Vector<Object> rowData;

        for (int i = 0; i < tableDefault1.getRowCount(); i++) {
            rowData = new Vector<>();
            rowData.add(tableDefault1.getValueAt(i, 0));
            rowData.add(tableDefault1.getValueAt(i, 1));
            rowData.add(tableDefault1.getValueAt(i, 2));
             rowData.add(tableDefault1.getValueAt(i,3));
            

            Object gt = tableDefault1.getValueAt(i, 4);
            String gt2 = null;
            if(gt.toString().equals("true"))
            {
                gt2 = "Nam";
            }
            if(gt.toString().equals("false")){
                 gt2 = "Nữ";
            }
            rowData.add(gt2);

            rowData.add(tableDefault1.getValueAt(i, 5));
            rowData.add(tableDefault1.getValueAt(i, 6));
            rowData.add(tableDefault1.getValueAt(i, 7));
            rowData.add(tableDefault1.getValueAt(i, 8));
            //--------------
            rowData.add(tableDefault1.getValueAt(i, 9));
            rowData.add(tableDefault1.getValueAt(i, 10));
            rowData.add(tableDefault1.getValueAt(i, 11));
            
            String gt3 = null;
            gt = tableDefault1.getValueAt(i, 12);
             if(gt.toString().equals("true"))
            {
                gt3 = "Đang Học";
            }
             if(gt.toString().equals("false")){
                 gt3 = "Không Học";
            }
            rowData.add(gt3);
           
            String gt4 = null;
            gt = tableDefault1.getValueAt(i, 13);
             if(gt.toString().equals("true"))
            {
                gt4 = "Chính Thức";
            }
            if(gt.toString().equals("false")){
                 gt4 = "Tiềm Năng";
            }
            rowData.add(gt4);
            
            rowData.add(tableDefault1.getValueAt(i, 14));
            rowData.add(tableDefault1.getValueAt(i, 15));
            rowData.add(tableDefault1.getValueAt(i, 16));
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }

    public boolean AddHocVien(DangKiDTO dkdto) {
        try {
            if (dangkibo.AddHocVien(dkdto)) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(DangKiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
      public boolean UpdateHocVien(DangKiDTO dkdto, String mahv) {
        try {
            if (dangkibo.UpdateHocVien(dkdto, mahv)) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(DangKiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
      

    public boolean AddThongTinDangKi(DangKiDTO dkdto) {
        try {
            if (dangkibo.AddThongTinDangKi(dkdto)) {
                return true;
            }
           
        
        } catch (Exception ex) {
            Logger.getLogger(DangKiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
        public boolean UpdateThongTinDangKi(DangKiDTO dkdto, String mahv) {
        try {
            if (dangkibo.UpdateThongTinDangKi(dkdto, mahv)) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(DangKiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public DefaultComboBoxModel GetListTrinhDo() throws Exception {
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(dangkibo.GetListTrinhDo());
        return defaultComboBox;
    }

    public DefaultComboBoxModel GetListMaCa() throws Exception {
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(dangkibo.GetListMaCa());
        return defaultComboBox;
    }

    public DefaultComboBoxModel GetListMaNgay() throws Exception {
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(dangkibo.GetListMaNgay());
        return defaultComboBox;
    }

    //tim kiem
     
    public DefaultTableModel TimKiemHocVien(String ma, String cmnd) throws Exception {
          DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
            "Mã học viên", "Họ tên", "CMND", "Năm sinh", "Giới tính",
            "Nghề nghiệp", "Số điện thoại", "Địa chỉ", "Email",
            "Ngày Đăng Kí","Mã Ngày","Mã Ca","Trạng Thái","Tình Trạng",
                "TĐ Tối Thiểu","TĐ Muốn Học","TĐ Được Học"});
        DefaultTableModel tableDefault1 = dangkibo.TimKiemHocVien(ma, cmnd);
        // DangKiDTO
        Vector<Object> rowData;

        for (int i = 0; i < tableDefault1.getRowCount(); i++) {
            rowData = new Vector<>();
            rowData.add(tableDefault1.getValueAt(i, 0));
            rowData.add(tableDefault1.getValueAt(i, 1));
            rowData.add(tableDefault1.getValueAt(i, 2));
            rowData.add(tableDefault1.getValueAt(i, 3));

            Object gt = tableDefault1.getValueAt(i, 4);
            String gt2 = null;
            if(gt.toString().equals("true"))
            {
                gt2 = "Nam";
            }
            if(gt.toString().equals("false")){
                 gt2 = "Nữ";
            }
            rowData.add(gt2);

            rowData.add(tableDefault1.getValueAt(i, 5));
            rowData.add(tableDefault1.getValueAt(i, 6));
            rowData.add(tableDefault1.getValueAt(i, 7));
            rowData.add(tableDefault1.getValueAt(i, 8));
            //--------------
            rowData.add(tableDefault1.getValueAt(i, 9));
            rowData.add(tableDefault1.getValueAt(i, 10));
            rowData.add(tableDefault1.getValueAt(i, 11));
            
            String gt3 = null;
            gt = tableDefault1.getValueAt(i, 12);
             if(gt.toString().equals("true"))
            {
                gt3 = "Đang Học";
            }
             if(gt.toString().equals("false")){
                 gt3 = "Không Học";
            }
            rowData.add(gt3);
           
            
            String gt4 = null;
            gt = tableDefault1.getValueAt(i, 13);
             if(gt.toString().equals("true"))
            {
                gt4 = "Chính Thức";
            }
            if(gt.toString().equals("false")){
                 gt4 = "Tiềm Năng";
            }
            rowData.add(gt4);
            
            rowData.add(tableDefault1.getValueAt(i, 14));
            rowData.add(tableDefault1.getValueAt(i, 15));
            rowData.add(tableDefault1.getValueAt(i, 16));
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }

    public DefaultTableModel TimKiemHocVienTheoMa(String ma) throws Exception {
        
        DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
            "Mã học viên", "Họ tên", "CMND", "Năm sinh", "Giới tính",
            "Nghề nghiệp", "Số điện thoại", "Địa chỉ", "Email",
            "Ngày Đăng Kí","Mã Ngày","Mã Ca","Trạng Thái","Tình Trạng",
                "TĐ Tối Thiểu","TĐ Muốn Học","TĐ Được Học"});
         DefaultTableModel tableDefault1 = dangkibo.TimKiemHocVienTheoMa(ma);
        // DangKiDTO
       Vector<Object> rowData;

        for (int i = 0; i < tableDefault1.getRowCount(); i++) {
            rowData = new Vector<>();
            rowData.add(tableDefault1.getValueAt(i, 0));
            rowData.add(tableDefault1.getValueAt(i, 1));
            rowData.add(tableDefault1.getValueAt(i, 2));
            rowData.add(tableDefault1.getValueAt(i, 3));

            Object gt = tableDefault1.getValueAt(i, 4);
            String gt2 = null;
            if(gt.toString().equals("true"))
            {
                gt2 = "Nam";
            }
            if(gt.toString().equals("false")){
                 gt2 = "Nữ";
            }
            rowData.add(gt2);

            rowData.add(tableDefault1.getValueAt(i, 5));
            rowData.add(tableDefault1.getValueAt(i, 6));
            rowData.add(tableDefault1.getValueAt(i, 7));
            rowData.add(tableDefault1.getValueAt(i, 8));
            //--------------
            rowData.add(tableDefault1.getValueAt(i, 9));
            rowData.add(tableDefault1.getValueAt(i, 10));
            rowData.add(tableDefault1.getValueAt(i, 11));
            
            String gt3 = null;
            gt = tableDefault1.getValueAt(i, 12);
             if(gt.toString().equals("true"))
            {
                gt3 = "Đang Học";
            }
             if(gt.toString().equals("false")){
                 gt3 = "Không Học";
            }
            rowData.add(gt3);
           
            
            String gt4 = null;
            gt = tableDefault1.getValueAt(i, 13);
             if(gt.toString().equals("true"))
            {
                gt4 = "Chính Thức";
            }
            if(gt.toString().equals("false")){
                 gt4 = "Tiềm Năng";
            }
            rowData.add(gt4);
            
            rowData.add(tableDefault1.getValueAt(i, 14));
            rowData.add(tableDefault1.getValueAt(i, 15));
            rowData.add(tableDefault1.getValueAt(i, 16));
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }

    public DefaultTableModel TimKiemHocVienTheoCMND(String cmnd) throws Exception {
      
        
         DefaultTableModel tableDefault = new DefaultTableModel(new Object[][]{},
                new String[]{
            "Mã học viên", "Họ tên", "CMND", "Năm sinh", "Giới tính",
            "Nghề nghiệp", "Số điện thoại", "Địa chỉ", "Email",
            "Ngày Đăng Kí","Mã Ngày","Mã Ca","Trạng Thái","Tình Trạng",
                "TĐ Tối Thiểu","TĐ Muốn Học","TĐ Được Học"});
       DefaultTableModel tableDefault1 = dangkibo.TimKiemHocVienTheoCMND(cmnd);
        // DangKiDTO
        Vector<Object> rowData;

        for (int i = 0; i < tableDefault1.getRowCount(); i++) {
            rowData = new Vector<>();
            rowData.add(tableDefault1.getValueAt(i, 0));
            rowData.add(tableDefault1.getValueAt(i, 1));
            rowData.add(tableDefault1.getValueAt(i, 2));
            rowData.add(tableDefault1.getValueAt(i, 3));

            Object gt = tableDefault1.getValueAt(i, 4);
            String gt2 = null;
            if(gt.toString().equals("true"))
            {
                gt2 = "Nam";
            }
            if(gt.toString().equals("false")){
                 gt2 = "Nữ";
            }
            rowData.add(gt2);

            rowData.add(tableDefault1.getValueAt(i, 5));
            rowData.add(tableDefault1.getValueAt(i, 6));
            rowData.add(tableDefault1.getValueAt(i, 7));
            rowData.add(tableDefault1.getValueAt(i, 8));
            //--------------
            rowData.add(tableDefault1.getValueAt(i, 9));
            rowData.add(tableDefault1.getValueAt(i, 10));
            rowData.add(tableDefault1.getValueAt(i, 11));
            
            String gt3 = null;
            gt = tableDefault1.getValueAt(i, 12);
             if(gt.toString().equals("true"))
            {
                gt3 = "Đang Học";
            }
             if(gt.toString().equals("false")){
                 gt3 = "Không Học";
            }
            rowData.add(gt3);
           
            
            String gt4 = null;
            gt = tableDefault1.getValueAt(i, 13);
             if(gt.toString().equals("true"))
            {
                gt4 = "Chính Thức";
            }
            if(gt.toString().equals("false")){
                 gt4 = "Tiềm Năng";
            }
            rowData.add(gt4);
            
            rowData.add(tableDefault1.getValueAt(i, 14));
            rowData.add(tableDefault1.getValueAt(i, 15));
            rowData.add(tableDefault1.getValueAt(i, 16));
            
            tableDefault.addRow(rowData);
        }
        return tableDefault;
    }
}
