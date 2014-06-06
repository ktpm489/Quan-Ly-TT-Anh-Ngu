/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.BangDiemDO;
import qlttanhngu.dto.BangDiemDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XuanVinh
 */
public class BangDiemController {

    private BangDiemDO bangdiemdo;

    public BangDiemController() throws Exception {
        bangdiemdo = new BangDiemDO();
    }

    public DefaultTableModel GetListHocVienInBangDiem() throws Exception {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã Học Viên", "Tên Học Viên", "Giới tính","Số điện thoại","Email"
                });

        List<HocVienDTO> lsttemp = bangdiemdo.GetListHocVienInBangDiem();
        Vector<Object> rowData;

        for (int i = 0; i < lsttemp.size(); i++) {
            rowData = new Vector<>();

            rowData.add(lsttemp.get(i).getMaHocVien());
            rowData.add(lsttemp.get(i).getTenHocVien());
            rowData.add(lsttemp.get(i).getGioiTinh());
            rowData.add(lsttemp.get(i).getSoDienThoai());
            rowData.add(lsttemp.get(i).getEmail());

            defaultTableModel.addRow(rowData);
        }

        return defaultTableModel;
    }
    
     public DefaultTableModel SearchHocVienInBangDiem(String ma, String ten) throws Exception {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã Học Viên", "Tên Học Viên", "Giới tính","Số điện thoại","Email"
                });

        List<HocVienDTO> lsttemp = bangdiemdo.SearchHocVienInBangDiem(ma, ten);
        Vector<Object> rowData;

        for (int i = 0; i < lsttemp.size(); i++) {
            rowData = new Vector<>();

            rowData.add(lsttemp.get(i).getMaHocVien());
            rowData.add(lsttemp.get(i).getTenHocVien());
            rowData.add(lsttemp.get(i).getGioiTinh());
            rowData.add(lsttemp.get(i).getSoDienThoai());
            rowData.add(lsttemp.get(i).getEmail());

            defaultTableModel.addRow(rowData);
        }

        return defaultTableModel;
    }
     public DefaultTableModel GetListHocVienInLopHoc(String malop) throws Exception {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Mã Học Viên", "Tên Học Viên", "Giới tính","Số điện thoại","Email"
                });

        List<HocVienDTO> lsttemp = bangdiemdo.GetListHocVienInLopHoc(malop);
        Vector<Object> rowData;

        for (int i = 0; i < lsttemp.size(); i++) {
            rowData = new Vector<>();

            rowData.add(lsttemp.get(i).getMaHocVien());
            rowData.add(lsttemp.get(i).getTenHocVien());
            rowData.add(lsttemp.get(i).getGioiTinh());
            rowData.add(lsttemp.get(i).getSoDienThoai());
            rowData.add(lsttemp.get(i).getEmail());

            defaultTableModel.addRow(rowData);
        }

        return defaultTableModel;
    }

    public DefaultComboBoxModel GetListTenLopHocHocVien() {
        try {
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(bangdiemdo.GetListTenLopHocHocVien());
            return defaultComboBoxModel;
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    //danh sach lop hoc cua mot hoc vien
    public DefaultComboBoxModel GetListLopOfHocVien(String mahocvien) {
        try {
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(bangdiemdo.GetListLopOfHocVien(mahocvien));
            return defaultComboBoxModel;
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public DefaultTableModel GetListBangDiemHocVien( String mahocvien) {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[][]{},
                new String[]{"Tên Lớp", "Điểm Thi cuối khóa"});
        try {
            List<BangDiemDTO> tempBangDiem = bangdiemdo.GetListBangDiemHocVien(mahocvien);
            Vector<Object> rowData;

            for (int i = 0; i < tempBangDiem.size(); i++) {
                rowData = new Vector<>();
              
                rowData.add(tempBangDiem.get(i).getTenlophoc());
                rowData.add(tempBangDiem.get(i).getDiem());

                defaultTableModel.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return defaultTableModel;
    }
    
    public Boolean UpdateBangDiemHocVien(String mahocvien, String malop, Double diem){
        try {
            return bangdiemdo.UpdateBangDiemHocVien(mahocvien, malop, diem);
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
       
    public String GetTenHocVienByMaHV(String mahocvien){
        try {
            return bangdiemdo.GetTenHocVienByMaHV(mahocvien);
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
     public String GetMaLopByTenLop(String tenlop, String mahv){
        try {
            return bangdiemdo.GetMaLopByTenLop(tenlop, mahv);
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
     
      public Double GetDiemHocVien(String mahocvien, String malop){
        try {
            return bangdiemdo.GetDiemHocVien(mahocvien, malop);
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }
    
    public DefaultComboBoxModel GetMaHocVienChinhThuc(){
        DefaultComboBoxModel defaultComboBoxModel;
        try {
            defaultComboBoxModel = new DefaultComboBoxModel(bangdiemdo.GetListMaHocVien());
            return defaultComboBoxModel;
        } catch (Exception ex) {
            Logger.getLogger(BangDiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }   
}
