/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XUANVINHTD
 */
public class HocVienDAO extends DataBase{
    
    public HocVienDAO() throws Exception{
        super();     
    }
    
    public List<HocVienDTO> loadListHocVien() throws Exception {
        List<HocVienDTO> lstHV = new ArrayList<HocVienDTO>();
        HocVienDTO hv = null;
        ResultSet resultSet = null;
        
        resultSet = this.executeQuery("{call LayDanhSachHocVien()}");
        try {
            while(resultSet.next()){
                hv = new HocVienDTO();
                
                hv.setMaHocVien(resultSet.getString(1));
                hv.setTenHocVien(resultSet.getString(2));
                hv.setCmnd(resultSet.getString(3));
                hv.setNamSinh(resultSet.getDate(4));
                hv.setGioiTinh(resultSet.getBoolean(5));             
                hv.setNgheNghiep(resultSet.getString(6));
                hv.setSoDienThoai(resultSet.getString(7));
                hv.setDiaChi(resultSet.getString(8));
                hv.setEmail(resultSet.getString(9));
                hv.setSoLuongLienLac(resultSet.getInt(10));
                hv.setTinhTrangHoc(resultSet.getBoolean(11));
                
                lstHV.add(hv);
            }    
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return lstHV;
    }
    
   public boolean UpdateHocVien(HocVienDTO hocviendto){
       int resultSet = 0;
       CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call CapNhatHocVien(?,?,?,?,?,?,?,?,?,?,?)}");
            callableStatement.setString(1, hocviendto.getMaHocVien());
            callableStatement.setString(2, hocviendto.getTenHocVien());
            callableStatement.setString(3, hocviendto.getCmnd());
            callableStatement.setDate(4,hocviendto.getNamSinhUpdate());
            callableStatement.setBoolean(5, hocviendto.getGioiTinhUpdate());
            callableStatement.setString(6, hocviendto.getNgheNghiep());
            callableStatement.setString(7, hocviendto.getSoDienThoai());
            callableStatement.setString(8, hocviendto.getDiaChi());
            callableStatement.setString(9, hocviendto.getEmail());
            callableStatement.setInt(10, hocviendto.getSoLuongLienLac());
            callableStatement.setBoolean(11, hocviendto.getTinhTrangHocUpdate());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   }
  
   public Vector<String> GetListTenChungChi(){
       Vector<String> dataTenChungChi = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachTenChungChi()}");
            while(resultSet.next()){
                dataTenChungChi.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dataTenChungChi;
   }
   
   public String GetMaChungChiTheoTen(String name){
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call LayMaChungChiTheoTen(?)}");
                 callableStatement.setString(1, name);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   }
   
   public String GetTenChungChiTheoMa(String ma) throws Exception{
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call LayTenChungChiTheoMa(?)}");
                 callableStatement.setString(1, ma);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
       this.closeConnection();
   }
      return temp;
   }
   
    public List<HocVienDTO> SearchHocVien(String tukhoa) throws Exception {
        List<HocVienDTO> lstHV = new ArrayList<HocVienDTO>();
        CallableStatement callableStatement = null;
        HocVienDTO hv = null;
        ResultSet resultSet = null;
        int i = 0;
        callableStatement = getConnection().prepareCall("{call TimKiemHocVien(?)}");
        callableStatement.setString(1, tukhoa);
        resultSet = this.executeQuery(getConnection(), callableStatement);
        try {
            while(resultSet.next()){
                hv = new HocVienDTO();
                
                hv.setMaHocVien(resultSet.getString(1));
                hv.setTenHocVien(resultSet.getString(2));
                hv.setCmnd(resultSet.getString(3));
                hv.setNamSinh(resultSet.getDate(4));
                hv.setGioiTinh(resultSet.getBoolean(5));            
                hv.setNgheNghiep(resultSet.getString(6));
                hv.setSoDienThoai(resultSet.getString(7));
                hv.setDiaChi(resultSet.getString(8));
                hv.setEmail(resultSet.getString(9));
                hv.setSoLuongLienLac(resultSet.getInt(10));
                hv.setTinhTrangHoc(resultSet.getBoolean(11));
                
                lstHV.add(hv);
                i++;
            }    
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return lstHV;
    }
    
    public boolean DeleteHocVien(String mahocvien){
        int result = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = getConnection().prepareCall("{call XoaHocVien(?)}");
            callableStatement.setString(1, mahocvien);
            result = this.executeQueryUpdate(getConnection(), callableStatement);
            
            if(result != 0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
