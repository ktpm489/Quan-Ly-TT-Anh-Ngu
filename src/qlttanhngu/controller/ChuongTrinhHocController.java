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
import qlttanhngu.bo.HocVienBO;
import qlttanhngu.dto.ChuongTrinhHocDTO;
import qlttanhngu.dto.PhongHocDTO;

/**
 *
 * @author MinhVu020
 */
public class ChuongTrinhHocController {
    
     private ChuongTrinhHocBO cthocbo;
    
    public ChuongTrinhHocController() throws Exception{
        cthocbo = new ChuongTrinhHocBO();
    }
    
     public DefaultTableModel GetChuongTrinhHoc() throws Exception {
        DefaultTableModel tableDefault = new DefaultTableModel( new Object [][] {},
    new String [] {
        "Mã Chương Trình Học", "Mã Trình Độ", "Học Phí(VND)" });       
        List<ChuongTrinhHocDTO> temp = cthocbo.GetChuongTrinhHoc();
       // DangKiDTO
        Vector<Object> rowData ;
        
        for(int i = 0; i < temp.size(); i++){
            rowData = new Vector<>();
            rowData.add(temp.get(i).getMaChuongTrinhHoc());
            rowData.add(temp.get(i).getMaTrinhDo());
            rowData.add(temp.get(i).getHocPhi());  
            tableDefault.addRow(rowData);
        }      
        return tableDefault;     
    }
    
        public DefaultComboBoxModel GetListTrinhDo() throws Exception{
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(cthocbo.GetListTrinhDo());
        return defaultComboBox;
    }
        
     public boolean AddChuongTrinhHoc(ChuongTrinhHocDTO cthto){
        try {
            if(cthocbo.AddChuongTrinhHoc(cthto))
                return true;
        } catch (Exception ex) {
            Logger.getLogger(ChuongTrinhHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
      public String GetMaTrinhDOTheoTen(String name) throws Exception{
        return cthocbo.GetMaTrinhDoTheoTen(name);
    }
      
   public String GetTenTrinhDoTheoMa(String ma) throws Exception{
        return cthocbo.GetTenTrinhDoTheoMa(ma);
    }
      
        public boolean UpdateChuongTrinhHoc(String macth, String mctd, Double hp){
        try {
            if(cthocbo.UpdateChuongTrinhHoc(macth,mctd, hp))
                return true;
        } catch (Exception ex) {
            Logger.getLogger(ChuongTrinhHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
