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
import qlttanhngu.dao.DangKiDAO;
import qlttanhngu.dao.HocVienDAO;
import qlttanhngu.dto.DangKiDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author MinhVu020
 */
public class DangKiBO {
      private DangKiDAO dangkidao;
   
    public DangKiBO() throws Exception{
        dangkidao = new  DangKiDAO();
    }
     public DefaultTableModel LoadListHocVien() throws Exception{
        try {
            return dangkidao.loadListHocVien();
        } catch (Exception ex) {
            Logger.getLogger(DangKiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dangkidao.closeConnection();
        }
        return null;
            
    }
    
    public boolean AddHocVien(DangKiDTO dangkidto) throws Exception{
        try{
        if(dangkidao.AddHocVien(dangkidto))
            return true;
        }catch(Exception e){
            
        }finally{
            dangkidao.closeConnection();
        }
        
        return false;
    }
    
      public boolean UpdateHocVien(DangKiDTO dangkidto, String mahv) throws Exception{
        try{
        if(dangkidao.UpdateHocVien(dangkidto, mahv))
            return true;
        }catch(Exception e){
            
        }finally{
            dangkidao.closeConnection();
        }
        
        return false;
    }
    
     public boolean AddThongTinDangKi(DangKiDTO dangkidto) throws Exception{
        try{
        if(dangkidao.AddThongTinDangKi(dangkidto))
            return true;
        }catch(Exception e){
            
        }finally{
            dangkidao.closeConnection();
        }
        
        return false;
    }
     
       public boolean UpdateThongTinDangKi(DangKiDTO dangkidto, String mahv) throws Exception{
        try{
        if(dangkidao.UpdateThongTinDangKi(dangkidto, mahv))
            return true;
        }catch(Exception e){
            
        }finally{
            dangkidao.closeConnection();
        }
        
        return false;
    }
    
    // trả về danh sách tên các chứng chỉ
    public Vector<String> GetListTrinhDo() throws Exception{
        try {
            return dangkidao.GetListTrinhDo();
        } catch (Exception ex) {
            Logger.getLogger(DangKiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dangkidao.closeConnection();
        }
        return null;
            
    }
    
     // trả về danh sách ca hoc
    public Vector<String> GetListMaCa() throws Exception{
        try {
            return dangkidao.GetListMaCa();
        } catch (Exception ex) {
            Logger.getLogger(DangKiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dangkidao.closeConnection();
        }
        return null;
            
    }
    
       // trả về danh sách ca hoc
    public Vector<String> GetListMaNgay() throws Exception{
        try {
            return dangkidao.GetListMaNgay();
        } catch (Exception ex) {
            Logger.getLogger(DangKiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dangkidao.closeConnection();
        }
        return null;
            
    }
    
    // CAc ham tim kiem
      public DefaultTableModel TimKiemHocVienTheoMa(String ma) throws Exception{
        try {
            return dangkidao.TimHocVienTheoMa(ma);
        } catch (Exception ex) {
            Logger.getLogger(DangKiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dangkidao.closeConnection();
        }
        return null;
            
    }
      
        public DefaultTableModel TimKiemHocVienTheoCMND(String cmnd) throws Exception{
        try {
            return dangkidao.TimHocVienTheoCMND(cmnd);
        } catch (Exception ex) {
            Logger.getLogger(DangKiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dangkidao.closeConnection();
        }
        return null;
            
    }
        
     public DefaultTableModel TimKiemHocVien(String ma,String cmnd) throws Exception{
        try{
            return dangkidao.TimHocVien(ma,cmnd);
        } catch (Exception ex) {
            Logger.getLogger(DangKiBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dangkidao.closeConnection();
        }
        return null;
            
    }
    
//   public String GetMaChungChiTheoTen(String name) throws Exception{
//        try {
//            return dangkidao.GetMaChungChiTheoTen(name);
//            
//        } catch (Exception ex) {
//            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            dangkidao.closeConnection();
//        }
//       return "";
//   }
//   
//   public String GetTenChungChiTheoMa(String ma) throws Exception{
//        try {
//            return dangkidao.GetTenChungChiTheoMa(ma);
//            
//        } catch (Exception ex) {
//            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            dangkidao.closeConnection();
//        }
//       return "";
//   }
    
}
