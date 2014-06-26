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
import qlttanhngu.dto.DangKiDTO;
import qlttanhngu.dto.HocVienDTO;


/**
 *
 * @author MinhVu020
 */
public class DangKiDAO extends DataBase{
    
    public DangKiDAO() throws Exception{
        super();     
    }
    
     public DefaultTableModel loadListHocVien() throws Exception {
       
        DefaultTableModel table = null;
       
        try {
            table = this.executeQuery_Table("{call LayDanhSachHocVien2()}");
           
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return table;     
        
    }
    
    //Cac Ham Lay Thong Tin
  
   public Vector<String> GetListTrinhDo(){
       Vector<String> dataTenChungChi = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachTrinhDo()}");
            while(resultSet.next()){
                dataTenChungChi.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dataTenChungChi;
   }
   
    public Vector<String> GetListCaHoc(){
       Vector<String> dataTenChungChi = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachCaHoc()}");
            while(resultSet.next()){
                dataTenChungChi.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dataTenChungChi;
   }
    
      public Vector<String> GetListNgayHoc(){
       Vector<String> dataTenChungChi = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachNgayHoc()}");
            while(resultSet.next()){
                dataTenChungChi.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dataTenChungChi;
   }
   
      //Cac Ham them Hoc Vien
      
   public boolean AddHocVien(DangKiDTO dkdto)
   {
        
       int resultSet = 0;
       CallableStatement callableStatement = null;
       int count = 0;
        try {
            //Lay so hoc vien da co
            ResultSet rs = this.executeQuery("{call LayTongSoHocVien()}");
             while (rs.next()) {
                 count = rs.getInt(1)+1;
             }
            callableStatement = this.getConnection().prepareCall("{call ThemHocVien(?,?,?,?,?,?,?,?,?)}");
            //tao ma theo so TT
            callableStatement.setString(1, "HV0000000"+count);
            callableStatement.setString(2, dkdto.getTenHocVien());
            callableStatement.setString(3, dkdto.getCmnd());
            callableStatement.setDate(4,dkdto.getNamSinhUpdate());
            callableStatement.setBoolean(5, dkdto.getGioiTinh(dkdto.getTenGioiTinh()));
            callableStatement.setString(6, dkdto.getNgheNghiep());
            callableStatement.setInt(7, dkdto.getSoDienThoai());
            callableStatement.setString(8, dkdto.getDiaChi());
            callableStatement.setString(9, dkdto.getEmail());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ngat ket noi
        try {
            this.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   
   }
   
    public boolean AddThongTinDangKi(DangKiDTO dkdto)
   {
        
       int resultSet = 0;
       CallableStatement callableStatement = null;
        int count = 0;
        try {
           //Lay so hoc vien da co
             ResultSet rs = this.executeQuery("{call LayTongSoHocVienDangKi()}");
             while (rs.next()) {
                 count = rs.getInt(1)+1;
             }
           
            //them hoc vien
            callableStatement = this.getConnection().prepareCall("{call ThemThongTinDangKi(?,?,?,?,?,?,?,?,?)}");
            //tao ma theo so TT
            callableStatement.setDate(1, dkdto.getNgayDangKi());
            callableStatement.setString(2, dkdto.getMaNgay());
            callableStatement.setString(3, dkdto.getMaCa());
            callableStatement.setString(4,"HV0000000"+ count);
            callableStatement.setBoolean(5, false);
            callableStatement.setBoolean(6, dkdto.getTinhTrangHoc());
            
            callableStatement.setString(7, dkdto.getTrinhDoToiThieu());
            callableStatement.setString(8, dkdto.getTrinhDoMuonHoc());
            callableStatement.setString(9, dkdto.getTrinhDoDuocHoc());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   
   }
   
    // CAc ham tim kiem
    public DefaultTableModel TimHocVienTheoMa(String ma) throws Exception {
        DangKiDTO lstHV = new DangKiDTO();
        DefaultTableModel table = null;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call TimKiemHocVienTheoMa(?)}");
            callableStatement.setString(1, ma);
            table = this.executeQuery_Table(this.getConnection(), callableStatement);
           
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return table;     
        
    }
    
    public DefaultTableModel TimHocVienTheoCMND(String cmnd) throws Exception {
        DangKiDTO lstHV = new DangKiDTO();
        DefaultTableModel table = null;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call TimKiemHocVienTheoCMND(?)}");
            callableStatement.setString(1, cmnd);
            table = this.executeQuery_Table(this.getConnection(), callableStatement);
           
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return table;     
        
    }
    
     public DefaultTableModel TimHocVien(String ma, String cmnd) throws Exception {
        DangKiDTO lstHV = new DangKiDTO();
        DefaultTableModel table = null;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call TimKiemHocVien(?,?)}");
            callableStatement.setString(1, ma);
            callableStatement.setString(2, cmnd);
            table = this.executeQuery_Table(this.getConnection(), callableStatement);
           
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return table;     
        
    }
   
       public boolean UpdateHocVien(DangKiDTO dkdto, String mahv){
       int resultSet = 0;
       CallableStatement callableStatement = null;
       
        try {
           
            callableStatement = this.getConnection().prepareCall("{call UpdateHocVien(?,?,?,?,?,?,?,?,?)}");
            //tao ma theo so TT
            callableStatement.setString(1,mahv);
            callableStatement.setString(2, dkdto.getTenHocVien());
            callableStatement.setString(3, dkdto.getCmnd());
            callableStatement.setDate(4,dkdto.getNamSinhUpdate());
            callableStatement.setBoolean(5, dkdto.getGioiTinh(dkdto.getTenGioiTinh()));
            callableStatement.setString(6, dkdto.getNgheNghiep());
            callableStatement.setInt(7, dkdto.getSoDienThoai());
            callableStatement.setString(8, dkdto.getDiaChi());
            callableStatement.setString(9, dkdto.getEmail());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ngat ket noi
        try {
            this.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   }
       
     public boolean UpdateThongTinDangKi(DangKiDTO dkdto, String mahv){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        
        try {
           
            //them hoc vien
            callableStatement = this.getConnection().prepareCall("{call UpdateThongTinDangKi4(?,?,?,?,?,?,?,?)}");
            //tao ma theo so TT
            
            callableStatement.setString(1, dkdto.getMaNgay());
            callableStatement.setString(2, dkdto.getMaCa());
            callableStatement.setString(3,mahv);
            callableStatement.setBoolean(4, false);
            callableStatement.setBoolean(5, dkdto.getTinhTrangHoc());
            
            callableStatement.setString(6, dkdto.getTrinhDoToiThieu());
            callableStatement.setString(7, dkdto.getTrinhDoMuonHoc());
            callableStatement.setString(8, dkdto.getTrinhDoDuocHoc());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   }
     
      public String GetMaCaHocTheoTen(String ma){
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call LayMaCaHocTuTenCa(?)}");
                 callableStatement.setString(1, ma);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   }
        public String GetMaNgayHocTheoTen(String ma){
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call LayMaNgayHocTuTenNgay(?)}");
                 callableStatement.setString(1, ma);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   }
        
   public String GetNgayHocTheoMa(String ma){
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call LayTenNgayHocTheoMa(?)}");
                 callableStatement.setString(1, ma);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   }
    public String LayMaTrinhDoTheoTen(String ten){
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call LayMaTrinhDoTheoTen(?)}");
                 callableStatement.setString(1, ten);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   }
     public String LayTenTrinhDoTheoMa(String ma){
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call LayTenTrinhDoTheoMa(?)}");
                 callableStatement.setString(1, ma);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   }
  
}

