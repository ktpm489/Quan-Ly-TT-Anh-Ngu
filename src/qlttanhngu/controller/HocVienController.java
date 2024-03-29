/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.HocVienBO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XUANVINHTD
 */
public class HocVienController {
    private HocVienBO hocvienbo;
    
    public HocVienController() throws Exception{
        hocvienbo = new HocVienBO();
    }
   
    public DefaultTableModel LoadListHocVien() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Mã học viên", "Họ tên", "CMND", "Năm sinh","Giới tính","Nghề nghiệp","Số điện thoại","Địa chỉ","Email","Số lượng liên lạc","Tình trạng học"
    });       
        List<HocVienDTO> tempHocVien = hocvienbo.LoadListHocVien();
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempHocVien.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempHocVien.get(i).getMaHocVien());
            rowData.add(tempHocVien.get(i).getTenHocVien());
            rowData.add(tempHocVien.get(i).getCmnd());
            rowData.add(tempHocVien.get(i).getNamSinh());
            rowData.add(tempHocVien.get(i).getGioiTinh());
           // rowData.add(new HocVienBO().GetTenChungChiTheoMa(tempHocVien.get(i).getMaChungChi()));
            rowData.add(tempHocVien.get(i).getNgheNghiep());
            rowData.add(tempHocVien.get(i).getSoDienThoai());
            rowData.add(tempHocVien.get(i).getDiaChi());
            rowData.add(tempHocVien.get(i).getEmail());
            rowData.add(tempHocVien.get(i).getSoLuongLienLac());
            rowData.add(tempHocVien.get(i).getTinhTrangHoc());
            
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
    
    public boolean UpdateHocVien(HocVienDTO hocviendto){
        try {
            if(hocvienbo.UpdateHocVien(hocviendto))
                return true;
        } catch (Exception ex) {
            Logger.getLogger(HocVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public DefaultComboBoxModel GetListTenChungChi() throws Exception{
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(hocvienbo.GetListTenChungChi());
        return defaultComboBox;
    }
    
    public String GetMaChungChiTheoTen(String name) throws Exception{
        return hocvienbo.GetMaChungChiTheoTen(name);
    }
    
     //Trả về danh sách các học viên được tìm kiếm theo từ khóa.
    public DefaultTableModel SearchHocVien(String tukhoa) throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Mã học viên", "Họ tên", "CMND", "Năm sinh","Giới tính","Nghề nghiệp","Số điện thoại","Địa chỉ","Email","Số lượng liên lạc","Tình trạng học"
    });       
        List<HocVienDTO> tempHocVien = hocvienbo.SearchHocVien(tukhoa);
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempHocVien.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempHocVien.get(i).getMaHocVien());
            rowData.add(tempHocVien.get(i).getTenHocVien());
            rowData.add(tempHocVien.get(i).getCmnd());
            rowData.add(tempHocVien.get(i).getNamSinh());
            rowData.add(tempHocVien.get(i).getGioiTinh());
            rowData.add(tempHocVien.get(i).getNgheNghiep());
            rowData.add(tempHocVien.get(i).getSoDienThoai());
            rowData.add(tempHocVien.get(i).getDiaChi());
            rowData.add(tempHocVien.get(i).getEmail());
            rowData.add(tempHocVien.get(i).getSoLuongLienLac());
            rowData.add(tempHocVien.get(i).getTinhTrangHoc());
            
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
    
    public Boolean DeleteHocVien(String mahocvien) throws Exception{
        return hocvienbo.DeleteHocVien(mahocvien);      
    }
}
