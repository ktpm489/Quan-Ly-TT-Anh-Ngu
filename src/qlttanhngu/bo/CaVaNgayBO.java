/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.dao.CaVaNgayDAO;
import qlttanhngu.dto.CaVaNgayDTO;

/**
 *
 * @author DuyLuu
 */
public class CaVaNgayBO {
    private CaVaNgayDAO cavangaydao ;
    public  CaVaNgayBO() throws Exception{
        cavangaydao = new CaVaNgayDAO();
    }
    
    public List<CaVaNgayDTO> LoadListNgay(){
        
        try {
            return cavangaydao.LoadListNgay();
            
        } catch (Exception ex) {
            Logger.getLogger(CaVaNgayBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                cavangaydao.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(CaVaNgayBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public List<CaVaNgayDTO> LoadListCa(){
        
        try {
            return cavangaydao.LoadListCa();
            
        } catch (Exception ex) {
            Logger.getLogger(CaVaNgayBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                cavangaydao.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(CaVaNgayBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public boolean ThemNgay(CaVaNgayDTO cavangaydto){
        try {
            if(cavangaydao.ThemNgay(cavangaydto))
                return true;
            cavangaydao.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(CaVaNgayBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean ThemCa(CaVaNgayDTO cavangaydto){
        try {
            if(cavangaydao.ThemCa(cavangaydto))
                return true;
            cavangaydao.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(CaVaNgayBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int MaNgay(){
        return cavangaydao.MaNgay();
    }
}
