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
import qlttanhngu.dto.TrinhDoDTO;

/**
 *
 * @author EvilZ
 */
public class TrinhDoDAO extends DataBase{
    
    public TrinhDoDAO() throws Exception{
        super();
    }
    
    public List<TrinhDoDTO> loadListTrinhDo() throws Exception {
        List<TrinhDoDTO> lstTD = new ArrayList<TrinhDoDTO>();
        TrinhDoDTO trinhdo_dto = null;
        ResultSet resultSet = null;
        int i = 0;
        
        resultSet = this.executeQuery("{call LayDanhSachTrinhDo()}");
        try {
            while(resultSet.next()){
                trinhdo_dto = new TrinhDoDTO();
                trinhdo_dto.setMaTrinhDo(resultSet.getString(1));
                trinhdo_dto.setTenTrinhDo(resultSet.getString(2));
                trinhdo_dto.setTenTrinhDoTienQuyet(resultSet.getString(3));
                lstTD.add(trinhdo_dto);
                i++;
            }    
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return lstTD;
    }
    
    public List<String> layTenTrinhDo() throws Exception {
        List<String> lstTD = new ArrayList<String>();
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        int i = 0;
        callableStatement = getConnection().prepareCall("{call LayTenTrinhDo()}");
        resultSet = this.executeQuery(this.getConnection(), callableStatement);
        while(resultSet.next()){
            String temp = resultSet.getString(1);
            lstTD.add(temp);
        };
        return lstTD;
    }
    
    public boolean themTrinhDo(TrinhDoDTO trinhdodto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call "
                    + "ThemTrinhDo(?,?)}");
            callableStatement.setString(1, trinhdodto.getTenTrinhDo());
            callableStatement.setString(2, trinhdodto.getTenTrinhDoTienQuyet());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(TrinhDoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    public boolean xoaTrinhDo(TrinhDoDTO trinhdodto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call "
                    + "XoaTrinhDo(?)}");
            callableStatement.setString(1, trinhdodto.getMaTrinhDo());
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(TrinhDoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    public List<String> layTenTrinhDoTienQuyet() throws Exception {
        List<String> lstTD = new ArrayList<String>();
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        int i = 0;
        callableStatement = getConnection().prepareCall("{call LayTenTrinhDoTienQuyet()}");
        resultSet = this.executeQuery(this.getConnection(), callableStatement);
        while(resultSet.next()){
            String temp = resultSet.getString(1);
            lstTD.add(temp);
        };
        return lstTD;
    }
}
