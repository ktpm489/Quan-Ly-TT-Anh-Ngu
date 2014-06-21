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
    
//    public List<DangKiDTO> loadListHocVien() throws Exception {
//        List<DangKiDTO> lstHV = new ArrayList<DangKiDTO>();
//        DangKiDTO hv = null;
//        ResultSet resultSet = null;
//        int i = 0;
//        CallableStatement callableStatement = null;
//        
//        resultSet = this.executeQuery("{call LayDanhSachHocVien2()}");
//        try {
//            while(resultSet.next()){
//                hv = new DangKiDTO();
//                
//                hv.setMaHocVien(resultSet.getString(1));
//                hv.setTenHocVien(resultSet.getString(2));
//                hv.setCmnd(resultSet.getString(3));
//                hv.setNamSinh(resultSet.getDate(4));
//                hv.setGioiTinh2(resultSet.getBoolean(5));
//              
//                hv.setNgheNghiep(resultSet.getString(6));
//                hv.setSoDienThoai(resultSet.getInt(7));
//                hv.setDiaChi(resultSet.getString(8));
//                hv.setEmail(resultSet.getString(9));
//                
//                lstHV.add(hv);
//                i++;
//            }    
//        } catch (SQLException ex) {
//            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            this.closeConnection();
//        }
//        return lstHV;
//    }
//    
    
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
   
    public Vector<String> GetListMaCa(){
       Vector<String> dataTenChungChi = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachMaCa()}");
            while(resultSet.next()){
                dataTenChungChi.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dataTenChungChi;
   }
    
      public Vector<String> GetListMaNgay(){
       Vector<String> dataTenChungChi = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachMaNgay()}");
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
            callableStatement.setString(1, "HV"+count);
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
            callableStatement.setString(4,"HV"+ count);
            callableStatement.setBoolean(5, dkdto.getTrangThai());
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
            callableStatement = this.getConnection().prepareCall("{call UpdateThongTinDangKi(?,?,?,?,?,?,?,?,?)}");
            //tao ma theo so TT
            callableStatement.setDate(1, dkdto.getNgayDangKi());
            callableStatement.setString(2, dkdto.getMaNgay());
            callableStatement.setString(3, dkdto.getMaCa());
            callableStatement.setString(4,mahv);
            callableStatement.setBoolean(5, dkdto.getTrangThai());
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
}

