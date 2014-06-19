/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.bo.BienLaiHocPhiBO;
import qlttanhngu.bo.DangKiBO;
import qlttanhngu.bo.HocVienBO;
import qlttanhngu.dto.BienLaiHocPhiDTO;
import qlttanhngu.dto.DangKiDTO;
import qlttanhngu.dto.HocVienDTO;
import qlttanhngu.dto.UserAccountDTO;

/**
 *
 * @author MinhVu020
 */
public class BienLaiHocPhiController {
      private BienLaiHocPhiBO bienlaibo;
    
    public BienLaiHocPhiController () throws Exception{
        bienlaibo = new BienLaiHocPhiBO();
    }
    
//     public BienLaiHocPhiDTO loadThongTin(String mahv) throws Exception{
//        try {
//            return bienlaibo.loadThongTin(mahv);
//        } catch (SQLException ex) {
//            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
   

    public boolean AddBienLaiHocPhi(BienLaiHocPhiDTO bldto){
        try {
            if(bienlaibo.AddBienLaiHocPhi(bldto))
                return true;
        } catch (Exception ex) {
            Logger.getLogger(HocVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
      public DefaultComboBoxModel GetListMaNhanVien() throws Exception{
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(bienlaibo.GetListMaNhanVien());
        return defaultComboBox;
    }
           public DefaultComboBoxModel GetListMaLop() throws Exception{
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(bienlaibo.GetListMaLop());
        return defaultComboBox;
    }
           
     public DefaultTableModel GetThongTinHocPhi(String mahv) throws Exception{
        DefaultTableModel defaul = bienlaibo.GetThongTinHocPhi(mahv);
        return defaul;
    }
     
   public Double GetHocPhiTheoLop(String malop) throws Exception{
        Double hp = bienlaibo.GetHocPhiTheoLop(malop);
        return hp;
    }
           
   public boolean isHocVienExit(String ma) throws Exception{      
        if(bienlaibo.isHocVienExit(ma)) 
           return true;
        else
           return false;
    }
   
   public boolean isHocVienThuocLop(String lop, String hv) throws Exception{      
        if(bienlaibo.isHocVienThuocLop(lop, hv)) 
           return true;
        else
           return false;
    }
    
     public boolean UpdateTinhTrangHocPhi(String mahv){
        try {
            if(bienlaibo.UpdateTinhTrangHocPhi(mahv))
                return true;
        } catch (Exception ex) {
            Logger.getLogger(BienLaiHocPhiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
