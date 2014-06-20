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
import qlttanhngu.dto.ChuongTrinhHocDTO;
import qlttanhngu.dto.PhongHocDTO;

/**
 *
 * @author MinhVu020
 */
public class ChuongTrinhHocBO {
    
     private ChuongTrinhHocDAO chuongTrinhHocdao;
   
    public ChuongTrinhHocBO() throws Exception{
        chuongTrinhHocdao = new  ChuongTrinhHocDAO();
    }
    
       public List<ChuongTrinhHocDTO> GetChuongTrinhHoc() throws Exception{
        try {
            return chuongTrinhHocdao.GetChuongTrinhHoc();
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            chuongTrinhHocdao.closeConnection();
        }
        return null;    
    }
     
      public Vector<String> GetListTrinhDo() throws Exception{
        try {
            return  chuongTrinhHocdao.GetListTrinhDo();
        } catch (Exception ex) {
            Logger.getLogger(ChuongTrinhHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             chuongTrinhHocdao.closeConnection();
        }
        return null;
            
    }
      
       public boolean AddChuongTrinhHoc(ChuongTrinhHocDTO dto) throws Exception{
        try{
        if(chuongTrinhHocdao.AddChuongTrinhHoc(dto))
            return true;
        }catch(Exception e){
            
        }finally{
            chuongTrinhHocdao.closeConnection();
        }       
        return false;
    }
       
  public String GetMaTrinhDoTheoTen(String name) throws Exception{
        try {
            return chuongTrinhHocdao.GetMaTrinhDoTheoTen(name);
            
        } catch (Exception ex) {
            Logger.getLogger(ChuongTrinhHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            chuongTrinhHocdao.closeConnection();
        }
       return "";
   }
      public String GetTenTrinhDoTheoMa(String ma) throws Exception{
        try {
            return chuongTrinhHocdao.GetTenTrinhDoTheoMa(ma);
            
        } catch (Exception ex) {
            Logger.getLogger(ChuongTrinhHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            chuongTrinhHocdao.closeConnection();
        }
       return "";
   }
       
    public boolean UpdateChuongTrinhHoc(String mact, String matd, Double hp) throws Exception{
        try{
        if( chuongTrinhHocdao.UpdateChuongTrinhHoc(mact,matd,hp) )
            return true;
        }catch(Exception e){
            
        }finally{
            chuongTrinhHocdao.closeConnection();
        }
        
        return false;
    }
}
