/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.CaVaNgayDTO;
import qlttanhngu.dto.NhanVienDTO;

/**
 *
 * @author DuyLuu
 */
public class CaVaNgayDAO extends DataBase {
   public CaVaNgayDAO() throws Exception{
       super();
   } 
   public List<CaVaNgayDTO> LoadListNgay(){
        List<CaVaNgayDTO> lstNgay = new ArrayList<CaVaNgayDTO>();
        CaVaNgayDTO ngay = null;
        ResultSet resultSet = null;
        int i = 0;
        
        resultSet = this.executeQuery("{call LayDanhSachNgay() }");
        try{
            while(resultSet.next()){
                ngay = new CaVaNgayDTO();
                ngay.setMaNgay(resultSet.getString(1));
                ngay.setDanhSachNgay(resultSet.getString(2));
                
                lstNgay.add(ngay);
                i++;
            }
        }
        catch(SQLException ex){
            Logger.getLogger(CaVaNgayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                this.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(CaVaNgayDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstNgay;
    }
   
   public List<CaVaNgayDTO> LoadListCa(){
        List<CaVaNgayDTO> lstCa = new ArrayList<CaVaNgayDTO>();
        CaVaNgayDTO ca = null;
        ResultSet resultSet = null;
        int i = 0;
        
        resultSet = this.executeQuery("{call LayDanhSachCaHoc() }");
        try{
            while(resultSet.next()){
                ca = new CaVaNgayDTO();
                ca.setMaCa(resultSet.getString(1));
                ca.setBuoi(resultSet.getString(2));
                ca.setGioBatDau(resultSet.getInt(3));
                ca.setGioKetThuc(resultSet.getInt(3));
                lstCa.add(ca);
                i++;
            }
        }
        catch(SQLException ex){
            Logger.getLogger(CaVaNgayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                this.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(CaVaNgayDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstCa;
    }
   
   public boolean ThemNgay(CaVaNgayDTO cavangaydto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try{
            callableStatement = this.getConnection().prepareCall("{call ThemNgay(?,?)}");
            callableStatement.setString(1, cavangaydto.getMaNgay());
            callableStatement.setString(2, cavangaydto.getDanhSachNgay());
            
            //callableStatement.setString(7, nhanviendto.getSoDienThoai());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(CaVaNgayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
   public boolean ThemCa(CaVaNgayDTO cavangaydto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try{
            
            callableStatement = this.getConnection().prepareCall("{call ThemCa(?,?,?,?)}");
            callableStatement.setString(1, cavangaydto.getMaCa());
            callableStatement.setString(2, cavangaydto.getBuoi());
            callableStatement.setInt(3, cavangaydto.getGioBatDau());
            callableStatement.setInt(4, cavangaydto.getGioKetThuc());
            //callableStatement.setString(7, nhanviendto.getSoDienThoai());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(CaVaNgayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
   
   public int MaNgay(){
        int kq = 0;
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call DemSoNgay()}");
            resultSet = this.executeQuery(this.getConnection(), callableStatement);
            while(resultSet.next()){
            kq = resultSet.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CaVaNgayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
        
        
    }
}
