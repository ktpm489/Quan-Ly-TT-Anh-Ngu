/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.QuyDinhDTO;

/**
 *
 * @author XuanVinh
 */
public class QuyDinhDAO extends DataBase{
    
    public QuyDinhDAO() throws Exception{
        super();
    }
    
    //lấy giá trị quy định theo tên 
    public QuyDinhDTO GetQuyDinh(String tenquydinh){
        QuyDinhDTO quyDinhBO1 = new QuyDinhDTO();
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try {
            callableStatement = getConnection().prepareCall("{call LayGiaTriQuyDinh(?)}");
            callableStatement.setString(1, tenquydinh);
            
            resultSet = this.executeQuery(getConnection(), callableStatement);
            
            while(resultSet.next()){              
                quyDinhBO1.setGiatri(resultSet.getDouble(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuyDinhDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return quyDinhBO1;
    }
    
    //cập nhật quy định
    public Boolean UpdateQuyDinh(QuyDinhDTO quyDinhDTO){
        
        CallableStatement callableStatement = null;
        int resultSet = 0;
        try {
            callableStatement = getConnection().prepareCall("{call CapNhatGiaTriQuyDinh(?,?)}");
            callableStatement.setString(1, quyDinhDTO.getTenthamso());
            callableStatement.setDouble(2, quyDinhDTO.getGiatri());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            
          if(resultSet != 0){
              return true;
          }
        } catch (SQLException ex) {
            Logger.getLogger(QuyDinhDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
