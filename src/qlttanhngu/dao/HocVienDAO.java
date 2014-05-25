/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
    
    public List<HocVienDTO> loadListHocVien() throws SQLException{
        List<HocVienDTO> lstHV = new ArrayList<HocVienDTO>();
        HocVienDTO hv = null;
        ResultSet resultSet = null;
        int i = 0;
        
        resultSet = this.executeQuery("{call LayDanhSachHocVien()}");
        
        while(resultSet.next()){
            hv = new HocVienDTO();
            
            hv.setMaHocVien(resultSet.getString(1));
            hv.setTenHocVien(resultSet.getString(2));
            hv.setCmnd(resultSet.getString(3));
            hv.setNamSinh(resultSet.getDate(4));
            hv.setGioiTinh(resultSet.getBoolean(5));
            hv.setMaChungChi(resultSet.getString(6));
            hv.setNgheNghiep(resultSet.getString(7));
            hv.setSoDienThoai(resultSet.getInt(8));
            hv.setDiaChi(resultSet.getString(9));
            hv.setEmail(resultSet.getString(10));
            hv.setSoLuongLienLac(resultSet.getInt(11));
            hv.setTinhTrangHoc(resultSet.getBoolean(12));
            
            lstHV.add(hv);
            i++;
        }    
        return lstHV;
    }
    
   public boolean UpdateHocVien(HocVienDTO hocviendto){
       ResultSet resultSet = null;
       CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{CapNhatHocVien(?,?,?,?,?,?,?,?,?,?,?,?)}");
            callableStatement.setString(1, hocviendto.getMaHocVien());
            callableStatement.setString(2, hocviendto.getTenHocVien());
            callableStatement.setString(3, hocviendto.getCmnd());
            callableStatement.setDate(4, hocviendto.getNamSinhUpdate());
            callableStatement.setBoolean(5, hocviendto.getGioiTinhUpdate());
            callableStatement.setString(6, hocviendto.getMaChungChi());
            callableStatement.setString(7, hocviendto.getNgheNghiep());
            callableStatement.setInt(8, hocviendto.getSoDienThoai());
            callableStatement.setString(9, hocviendto.getDiaChi());
            callableStatement.setString(10, hocviendto.getEmail());
            callableStatement.setInt(11, hocviendto.getSoLuongLienLac());
            callableStatement.setBoolean(12, hocviendto.getTinhTrangHocUpdate());
            
            this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != null && resultSet.next())
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   }
    
}
