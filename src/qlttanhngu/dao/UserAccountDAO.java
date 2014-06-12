/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;

import Assest.StoreSave;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;

/**
 *
 * @author XUANVINHTD
 */
public class UserAccountDAO extends DataBase{
    
    public UserAccountDAO() throws Exception {
        super();
    }
    
    public boolean isUserExit(String username, String password)  {
            ResultSet c = null;
            //StoreSave storeSave = new StoreSave();
            CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call KiemTraTaiKhoan(?, ?)}");              
            callableStatement.setString(1, username);
            callableStatement.setString(2, password);
            c = this.executeQuery(this.getConnection(), callableStatement);
            
            if(c != null && c.next()){
             StoreSave.accountNameSave = c.getString(1);
             StoreSave.userNamSave = c.getString(2);
             StoreSave.mahocvien = c.getString(3);
             StoreSave.machucvu = c.getString(4);
             return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    public boolean isChangePassWord(String username, String passwordold, String passwordnew){
        int result = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call DoiMatKhau(?, ?, ?)}");
            callableStatement.setString(1, username);
            callableStatement.setString(2, passwordold);
            callableStatement.setString(3,passwordnew);
            
            result = this.executeQueryUpdate(this.getConnection(), callableStatement);
            
            if(result != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
