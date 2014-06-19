/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import qlttanhngu.dto.KhoaHocDTO;


/**
 *
 * @author EvilZ
 */
public class KhoaHocDAO extends DataBase {
    
    public KhoaHocDAO() throws Exception{
        super();
    }
    
    public List<KhoaHocDTO> loadListKhoaHoc() throws Exception {
        List<KhoaHocDTO> lstKH = new ArrayList<KhoaHocDTO>();
        KhoaHocDTO khoahoc_dto = null;
        ResultSet resultSet = null;
        int i = 0;
        
        resultSet = this.executeQuery("{call LayDanhSachKhoaHoc()}");
        try {
            while(resultSet.next()){
                khoahoc_dto = new KhoaHocDTO();
                
                khoahoc_dto.setMaKhoaHoc(resultSet.getString(1));
                khoahoc_dto.setTenKhoaHoc(resultSet.getString(2));
                khoahoc_dto.setNgayKhaiGiang(resultSet.getDate(3));
                
                lstKH.add(khoahoc_dto);
                i++;
            }    
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return lstKH;
    }
    
    public boolean addKhoaHoc(KhoaHocDTO khoahocdto){
        int resultSet = 0;
       CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call "
                    + "ThemKhoaHoc(?,?,?)}");
            callableStatement.setString(1, khoahocdto.getMaKhoaHoc());
            callableStatement.setString(2, khoahocdto.getTenKhoaHoc());
            callableStatement.setDate(3, khoahocdto.getNgayKhaiGiang());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    public boolean deleteKhoaHoc(KhoaHocDTO khoahocdto ){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call "
                    + "XoaKhoaHoc(?)}");
            callableStatement.setString(1, khoahocdto.getMaKhoaHoc());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
}

