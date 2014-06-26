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
import qlttanhngu.dto.BienLaiHocPhiDTO;
import qlttanhngu.dto.ChuongTrinhHocDTO;
import qlttanhngu.dto.PhongHocDTO;

/**
 *
 * @author MinhVu020
 */
public class ChuongTrinhHocDAO extends DataBase{
    
    public ChuongTrinhHocDAO() throws Exception{
        super();     
    }
    
     public List<ChuongTrinhHocDTO> GetChuongTrinhHoc() throws Exception {
        List<ChuongTrinhHocDTO> lstPH = new ArrayList<ChuongTrinhHocDTO>();
        ChuongTrinhHocDTO ph = null;
        ResultSet resultSet = null;
        int i = 0;
        CallableStatement callableStatement = null;
        
        resultSet = this.executeQuery("{call LayDanhSachChuongTrinhHoc()}");
        try {
            while(resultSet.next()){
                ph = new ChuongTrinhHocDTO();
                
                ph.setMaChuongTrinhHoc(resultSet.getString(1));
                ph.setMaTrinhDo(resultSet.getString(2));
                ph.setHocPhi(resultSet.getDouble(3));

                lstPH.add(ph);
                i++;
            }    
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return lstPH;
    }
    
     public Vector<String> GetListTrinhDo(){
       Vector<String> datatt = new Vector<String>();
       ResultSet resultSet = null;
       
       
        try {
            resultSet = this.executeQuery("{call LayDanhSachTrinhDo()}");
            while(resultSet.next()){
                datatt.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return datatt;
   }
     
      public String GetMaTrinhDoTheoTen(String name){
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call LayMaTrinhDoTheoTen(?)}");
                 callableStatement.setString(1, name);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(ChuongTrinhHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   }
  
    public String GetTenTrinhDoTheoMa(String ma){
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
                Logger.getLogger(ChuongTrinhHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   }
  
   
   public boolean AddChuongTrinhHoc(ChuongTrinhHocDTO dto)
   {
        
       int resultSet = 0;
       CallableStatement callableStatement = null;
       int count = 0;
        try {
            //Lay so hoc vien da co
            ResultSet rs = this.executeQuery("{call CountChuongTrinhHoc()}");
             while (rs.next()) {
                 count = rs.getInt(1)+1;
             }
            callableStatement = this.getConnection().prepareCall("{call ThemChuongTrinhHoc(?,?,?)}");
            //tao ma theo so TT
            callableStatement.setString(1, "CTH000000"+count);
            callableStatement.setString(2, dto.getMaTrinhDo());
            callableStatement.setDouble(3, dto.getHocPhi());
                
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(ChuongTrinhHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   
   }
  
       public boolean UpdateChuongTrinhHoc(String macth, String matd, Double hocphi){
       int resultSet = 0;
       CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call UpdateChuongTrinhHoc(?,?,?)}");
            callableStatement.setString(1, macth);
             callableStatement.setString(2, matd);
              callableStatement.setDouble(3, hocphi);
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
           if(resultSet != 0)
               return true;
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
   }
}



