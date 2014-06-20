/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.dao.BienLaiHocPhiDAO;
import qlttanhngu.dao.DangKiDAO;
import qlttanhngu.dto.BienLaiHocPhiDTO;
import qlttanhngu.dto.DangKiDTO;
import qlttanhngu.dto.HocVienDTO;
import qlttanhngu.dto.UserAccountDTO;

/**
 *
 * @author MinhVu020
 */
public class BienLaiHocPhiBO {
     private BienLaiHocPhiDAO bienlaidao;
   
    public BienLaiHocPhiBO() throws Exception{
        bienlaidao = new  BienLaiHocPhiDAO();
    }

//      public BienLaiHocPhiDTO loadThongTin(String mahv) throws Exception{
//        try {
//            return bienlaidao.loadThongTin(mahv);
//        } catch (SQLException ex) {
//            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            bienlaidao.closeConnection();
//        }
//        return null;    
//    }
   
     public Vector<String> GetListMaNhanVien() throws Exception{
        try {
            return bienlaidao.GetListMaNhanVien();           
        } catch (Exception ex) {
            Logger.getLogger(BienLaiHocPhiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bienlaidao.closeConnection();
        }
        return null;
            
    }
     
    public Double GetHocPhiTheoLop(String malop) throws Exception{
        try {
            return bienlaidao.GetHocPhiTheoLop(malop);
        } catch (Exception ex) {
            Logger.getLogger(BienLaiHocPhiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bienlaidao.closeConnection();
        }
        return null;
            
    }
       
     public DefaultTableModel GetThongTinHocPhi(String mahv) throws Exception{
        try {
            return bienlaidao.GetThongTinHocPhi(mahv);
        } catch (Exception ex) {
            Logger.getLogger(BienLaiHocPhiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bienlaidao.closeConnection();
        }
        return null;
            
    }
     
      public boolean isHocVienExit(String ma) throws Exception{
        try{
            return bienlaidao.isHocVienExit(ma);
        }catch(Exception e){
           return false;
        }finally{
            bienlaidao.closeConnection();
        }    
    }
      
        public boolean isHocVienThuocLop(String malop, String mahv) throws Exception{
        try{
            return bienlaidao.isHocVienThuocLop(malop, mahv);
        }catch(Exception e){
           return false;
        }finally{
            bienlaidao.closeConnection();
        }    
    }
     
         public Vector<String> GetListMaLop() throws Exception{
        try {
            return bienlaidao.GetListMaLop();           
        } catch (Exception ex) {
            Logger.getLogger(BienLaiHocPhiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bienlaidao.closeConnection();
        }
        return null;
            
    }
         
    public boolean AddBienLaiHocPhi(BienLaiHocPhiDTO bldto) throws Exception{
        try{
        if(bienlaidao.AddBienLaiHocPhi(bldto))
            return true;
        }catch(Exception e){
            
        }finally{
            bienlaidao.closeConnection();
        }       
        return false;
    }
    
     public boolean UpdateTinhTrangHocPhi(String mahv) throws Exception{
        try{
        if( bienlaidao.UpdateTinhTrangHocPhi(mahv)
                )
            return true;
        }catch(Exception e){
            
        }finally{
            bienlaidao.closeConnection();
        }
        
        return false;
    }
    
}
