/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.bo;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.dao.KhoaHocDAO;
import qlttanhngu.dto.KhoaHocDTO;

/**
 *
 * @author EvilZ
 */
public class KhoaHocBO {
    KhoaHocDAO khoahocdao;
    
    public KhoaHocBO() throws Exception{
        khoahocdao = new KhoaHocDAO();
    }
    
    public List<KhoaHocDTO> loadListKhoaHoc() throws Exception{
        try {
            return khoahocdao.loadListKhoaHoc();
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            khoahocdao.closeConnection();
        }
        return null;  
    }
    
    public boolean addKhoaHoc(KhoaHocDTO khoahoc) throws Exception{
        try{
        if(khoahocdao.addKhoaHoc(khoahoc))
            return true;
        }catch(Exception e){
            
        }finally{
            khoahocdao.closeConnection();
        }
        
        return false;
    }
    
    public boolean deleteKhoaHoc(KhoaHocDTO khoahocdto ) throws Exception{
        try{
        if(khoahocdao.deleteKhoaHoc(khoahocdto))
            return true;
        }catch(Exception e){
            
        }finally{
            khoahocdao.closeConnection();
        }
        return false;
    }
    
     public List<String> layKhoaHoc() throws SQLException, Exception{
        try {
            return khoahocdao.layKhoaHoc();
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            khoahocdao.closeConnection();
        }
        return null; 
    }
}
