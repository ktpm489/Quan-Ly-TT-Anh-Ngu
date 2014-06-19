/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;

import Assest.StoreSave;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.BienLaiHocPhiDTO;
import qlttanhngu.dto.DangKiDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author MinhVu020
 */
public class BienLaiHocPhiDAO extends DataBase{
    
    public BienLaiHocPhiDAO() throws Exception{
        super();     
    }
//    
//    public BienLaiHocPhiDTO loadThongTin(String mahv) throws Exception {
//        BienLaiHocPhiDTO lstHV = new BienLaiHocPhiDTO();
//        ResultSet resultSet = null;
//        
//        resultSet = this.executeQuery("{call LayThongTinHocPhi(?)}");
//        try {
//                
//                lstHV.setTienThu(resultSet.getLong(1));
//                lstHV.setTienConLai(resultSet.getLong(2));           
//        } catch (SQLException ex) {
//            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            this.closeConnection();
//        }
//        return lstHV;
//    }
  
   public Vector<String> GetListMaLop(){
       Vector<String> dataTenChungChi = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachMaLop()}");
            while(resultSet.next()){
                dataTenChungChi.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dataTenChungChi;
   }
   
    public Vector<String> GetListMaNhanVien(){
       Vector<String> dataTenChungChi = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachMaNhanVien()}");
            while(resultSet.next()){
                dataTenChungChi.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dataTenChungChi;
   }
     
       public boolean isHocVienExit(String mahv)  {
            ResultSet c = null;
            //StoreSave storeSave = new StoreSave();
            CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call KiemTraMaHocVien(?)}");              
            callableStatement.setString(1, mahv);
            
            c = this.executeQuery(this.getConnection(), callableStatement);
            
            if(c != null && c.next()){
             
             return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
       
    public boolean isHocVienThuocLop(String malop, String mahv)  {
            ResultSet c = null;
            CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call KiemTraHocVienCoThuocLop(?,?)}");              
            callableStatement.setString(1, malop);
            callableStatement.setString(1, mahv);
            
            c = this.executeQuery(this.getConnection(), callableStatement);
            
            if(c != null && c.next()){ 
             return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
   
   public boolean AddBienLaiHocPhi(BienLaiHocPhiDTO hpdto)
   {
        
       int resultSet = 0;
       CallableStatement callableStatement = null;
       int count = 0;
        try {
            //Lay so hoc vien da co
            ResultSet rs = this.executeQuery("{call LaySoBienLaiHocPhi()}");
             while (rs.next()) {
                 count = rs.getInt(1)+1;
             }
            callableStatement = this.getConnection().prepareCall("{call ThemBienLaiHocPhi(?,?,?,?,?,?,?,?)}");
            //tao ma theo so TT
            callableStatement.setString(1, "BLHP"+count);
            callableStatement.setString(2, hpdto.getMaNhanVien());
            callableStatement.setString(3, hpdto.getMaLop());
            callableStatement.setString(4,hpdto.getMaHocVien());
            callableStatement.setDate(5, hpdto.getNgayLapBienLai());
            callableStatement.setDouble(6, hpdto.getTongTien());
            callableStatement.setDouble(7, hpdto.getTienThu());
            callableStatement.setDouble(8, hpdto.getTienConLai());
            
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   
   }

      public Double GetHocPhiTheoLop(String malop){
       Double hocphi = 0.0;
       ResultSet resultSet = null;
       CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call LayHocPhiTheoMaLop(?)}");              
            callableStatement.setString(1, malop);
            
            resultSet = this.executeQuery(this.getConnection(), callableStatement);           
            if(resultSet != null && resultSet.next()){ 
             hocphi = resultSet.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return hocphi;
   }
      
      
      
      public DefaultTableModel GetThongTinHocPhi(String mahv){
       DefaultTableModel hocphi  = null;
       ResultSet resultSet = null;
       CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call LayThongTinHocPhi(?)}");              
            callableStatement.setString(1, mahv);
            
            hocphi = this.executeQuery_Table(this.getConnection(), callableStatement);
            
        } catch (SQLException ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return hocphi;
   }
      
       public boolean UpdateTinhTrangHocPhi(String mahv){
       int resultSet = 0;
       CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call CapNhatTinhTrangDongHocPhi(?)}");
            callableStatement.setString(1, mahv);
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger( BienLaiHocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   }
}


