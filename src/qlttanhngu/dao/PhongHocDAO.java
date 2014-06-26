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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.ChuongTrinhHocDTO;
import qlttanhngu.dto.DangKiDTO;
import qlttanhngu.dto.PhongHocDTO;

/**
 *
 * @author MinhVu020
 */
public class PhongHocDAO extends DataBase{
    
    public PhongHocDAO() throws Exception
    {
        super();     
    }
     public List<PhongHocDTO> GetDanhSachPhongHoc() throws Exception {
        List<PhongHocDTO> lstPH = new ArrayList<PhongHocDTO>();
        PhongHocDTO ph = null;
        ResultSet resultSet = null;
        int i = 0;
        CallableStatement callableStatement = null;
        
        resultSet = this.executeQuery("{call LayDanhSachPhongHoc()}");
        try {
            while(resultSet.next()){
                ph = new PhongHocDTO();
                
                ph.setMaPhong(resultSet.getString(1));
                ph.setTenPhong(resultSet.getString(2));
                ph.setSoLuong(resultSet.getInt(3));
                ph.setDiaChi(resultSet.getString(4));
                
                lstPH.add(ph);
                i++;
            }    
        } catch (SQLException ex) {
            Logger.getLogger(PhongHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return lstPH;
    }
    
   
   public boolean AddPhongHoc(PhongHocDTO dto)
   {
        
       int resultSet = 0;
       CallableStatement callableStatement = null;
       int count = 0;
        try {
            //Lay so hoc vien da co
            ResultSet rs = this.executeQuery("{call CountPhongHoc()}");
             while (rs.next()) {
                 count = rs.getInt(1)+1;
             }
            callableStatement = this.getConnection().prepareCall("{call ThemPhongHoc(?,?,?,?)}");
            //tao ma theo so TT
            callableStatement.setString(1, "PH0000000"+count);
            callableStatement.setString(2, dto.getTenPhong());
            callableStatement.setInt(3, dto.getSoLuong());
            callableStatement.setString(4, dto.getDiaChi());
                
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhongHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(PhongHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   
   }
  
       public boolean UpdatePhongHoc(String map, String tenp, int soluong, String diachi){
       int resultSet = 0;
       CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call UpdatePhongHoc(?,?,?,?)}");
            callableStatement.setString(1, map);
             callableStatement.setString(2, tenp);
              callableStatement.setInt(3, soluong);
              callableStatement.setString(4, diachi);
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhongHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   }
}




