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
import qlttanhngu.dao.HocVienDAO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XUANVINHTD
 */
public class HocVienBO {
    
    private HocVienDAO hocviendao;
   
    public HocVienBO() throws Exception{
        hocviendao = new HocVienDAO();
    }
    
    public List<HocVienDTO> LoadListHocVien() throws Exception{
        try {
            return hocviendao.loadListHocVien();
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            hocviendao.closeConnection();
        }
        return null;    
    }
    
    public boolean UpdateHocVien(HocVienDTO hocviendto) throws Exception{
        try{
        if(hocviendao.UpdateHocVien(hocviendto))
            return true;
        }catch(Exception e){
            
        }finally{
            hocviendao.closeConnection();
        }
        
        return false;
    }
    
    // trả về danh sách tên các chứng chỉ
    public Vector<String> GetListTenChungChi() throws Exception{
        try {
            return hocviendao.GetListTenChungChi();           
        } catch (Exception ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            hocviendao.closeConnection();
        }
        return null;
            
    }
    
   public String GetMaChungChiTheoTen(String name) throws Exception{
        try {
            return hocviendao.GetMaChungChiTheoTen(name);
            
        } catch (Exception ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            hocviendao.closeConnection();
        }
       return "";
   }
   
   public String GetTenChungChiTheoMa(String ma) throws Exception{
        try {
            return hocviendao.GetTenChungChiTheoMa(ma);
            
        } catch (Exception ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            hocviendao.closeConnection();
        }
       return "";
   }
    
}
