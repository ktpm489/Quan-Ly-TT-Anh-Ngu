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
import qlttanhngu.dto.LoaiDeThiDTO;

/**
 *
 * @author EvilZ
 */
public class LoaiDeThiDAO extends DataBase{
    
    public LoaiDeThiDAO() throws Exception{
        super();
    }
    
    public List<LoaiDeThiDTO> loadListLoaiDeThi() throws Exception {
        List<LoaiDeThiDTO> lstLDT = new ArrayList<LoaiDeThiDTO>();
        LoaiDeThiDTO loaidethidto = null;
        ResultSet resultSet = null;
        int i = 0;
        
        resultSet = this.executeQuery("{call LayDanhSachLoaiDeThi()}");
        try {
            while(resultSet.next()){
                loaidethidto = new LoaiDeThiDTO();
                
                loaidethidto.setMaLoaiDeThi(resultSet.getString(1));
                loaidethidto.setTenLoaiDeThi(resultSet.getString(2));
                loaidethidto.setThoiLuongthi(resultSet.getInt(3));
                loaidethidto.setTenTrinhDo(resultSet.getString(4));
                
                lstLDT.add(loaidethidto);
                i++;
            }    
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return lstLDT;
    }
    
    public boolean addLoaiDeThi(LoaiDeThiDTO loaidethidto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call "
                    + "ThemLoaiDeThi(?,?,?)}");
            callableStatement.setString(1, loaidethidto.getTenLoaiDeThi());
            callableStatement.setInt(2, loaidethidto.getThoiLuongthi());
            callableStatement.setString(3, loaidethidto.getTenTrinhDo());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiDeThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean deleteLoaiDeThi(LoaiDeThiDTO loaidethidto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call "
                    + "XoaLoaiDeThi(?)}");
            callableStatement.setString(1, loaidethidto.getMaLoaiDeThi());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiDeThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<String> layLoaiDeThi(String tenTrinhDo) throws SQLException{
        List<String> lstLDT = new ArrayList<String>();
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        int i = 0;
        callableStatement = getConnection().prepareCall("{call LayTenLoaiDe(?)}");
        callableStatement.setString(1, tenTrinhDo);
        resultSet = this.executeQuery(this.getConnection(), callableStatement);
        while(resultSet.next()){
            String temp = resultSet.getString(1);
            lstLDT.add(temp);
        };
        return lstLDT;
    }
}
