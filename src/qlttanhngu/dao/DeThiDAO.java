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
import qlttanhngu.dto.DeThiDTO;

/**
 *
 * @author EvilZ
 */
public class DeThiDAO extends DataBase{
     public DeThiDAO() throws Exception{
        super();
    }
    
    public List<DeThiDTO> loadListDeThi() throws Exception {
        List<DeThiDTO> lstDT = new ArrayList<DeThiDTO>();
        DeThiDTO dethidto = null;
        ResultSet resultSet = null;
        int i = 0;
        
        resultSet = this.executeQuery("{call LayDanhSachDeThi()}");
        try {
            while(resultSet.next()){
                dethidto = new DeThiDTO();
                dethidto.setMaDeThi(resultSet.getString(1));
                dethidto.setLoaiDeThi(resultSet.getString(2));
                dethidto.setTrinhDo(resultSet.getString(3));
                dethidto.setNgayCap(resultSet.getDate(4));
                lstDT.add(dethidto);
                i++;
            }    
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return lstDT;
    }
    
    public boolean addDeThi(DeThiDTO dethidto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call "
                    + "ThemDeThi(?,?,?)}");
            callableStatement.setString(1, dethidto.getLoaiDeThi());
            callableStatement.setString(2, dethidto.getTrinhDo());
            callableStatement.setDate(3, dethidto.getNgayCap());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiDeThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean deleteDeThi(DeThiDTO dethidto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call "
                    + "XoaDeThi(?)}");
            callableStatement.setString(1, dethidto.getMaDeThi());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiDeThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
