/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlttanhngu.dao.ChuongTrinhHocDAO;
import qlttanhngu.dao.PhongHocDAO;
import qlttanhngu.dto.ChuongTrinhHocDTO;
import qlttanhngu.dto.PhongHocDTO;

/**
 *
 * @author MinhVu020
 */
public class PhongHocBO {
      private PhongHocDAO phongHocdao;
   
    public PhongHocBO() throws Exception{
        phongHocdao = new  PhongHocDAO();
    }
     
        public List<PhongHocDTO> LoadListPhongHoc() throws Exception{
        try {
            return phongHocdao.GetDanhSachPhongHoc();
        } catch (SQLException ex) {
            Logger.getLogger(PhongHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            phongHocdao.closeConnection();
        }
        return null;    
    }
      
       public boolean AddPhongHoc(PhongHocDTO dto) throws Exception{
        try{
        if(phongHocdao.AddPhongHoc(dto))
            return true;
        }catch(Exception e){
            
        }finally{
            phongHocdao.closeConnection();
        }       
        return false;
    }
       
    public boolean UpdatePhongHoc(String map, String tenp, int soluong, String diachi) throws Exception{
        try{
        if( phongHocdao.UpdatePhongHoc(map, tenp, soluong, diachi) )
            return true;
        }catch(Exception e){
            
        }finally{
            phongHocdao.closeConnection();
        }     
        return false;
    }
}
