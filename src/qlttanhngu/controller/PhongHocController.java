/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.ChuongTrinhHocBO;
import qlttanhngu.bo.PhongHocBO;
import qlttanhngu.dto.ChuongTrinhHocDTO;
import qlttanhngu.dto.PhongHocDTO;

/**
 *
 * @author MinhVu020
 */
public class PhongHocController {
    
       private PhongHocBO phocbo;
    
    public PhongHocController() throws Exception{
        phocbo = new PhongHocBO();
    }
    
  public DefaultTableModel GetPhongHoc() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Mã Phòng", "Tên Phòng", "Số Lượng", "Địa Chỉ" });       
        List<PhongHocDTO> tempHocVien = phocbo.LoadListPhongHoc();
       // DangKiDTO
        Vector<Object> rowData ;
        
        for(int i = 0; i < tempHocVien.size(); i++){
            rowData = new Vector<>();
            rowData.add(tempHocVien.get(i).getMaPhong());
            rowData.add(tempHocVien.get(i).getTenPhong());
            rowData.add(tempHocVien.get(i).getSoLuong());
            rowData.add(tempHocVien.get(i).getDiaChi());
  
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
        
     public boolean AddPhongHoc(PhongHocDTO phto){
        try {
            if(phocbo.AddPhongHoc(phto))
                return true;
        } catch (Exception ex) {
            Logger.getLogger(PhongHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
      
        public boolean UpdatePhongHoc(String map, String tenp, int soluong, String diachi){
        try {
            if(phocbo.UpdatePhongHoc(map,tenp, soluong, diachi))
                return true;
        } catch (Exception ex) {
            Logger.getLogger(PhongHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
