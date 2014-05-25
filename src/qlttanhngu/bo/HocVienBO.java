/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.sql.SQLException;
import java.util.List;
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
    
    public boolean UpdateHocVien(HocVienDTO hocviendto){
        if(hocviendao.UpdateHocVien(hocviendto))
            return true;
        return false;
    }
    
}
