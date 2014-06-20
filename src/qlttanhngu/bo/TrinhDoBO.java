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
import qlttanhngu.dao.TrinhDoDAO;
import qlttanhngu.dto.TrinhDoDTO;

/**
 *
 * @author EvilZ
 */
public class TrinhDoBO {
    TrinhDoDAO trinhdodao;
    
    public TrinhDoBO() throws Exception{
        trinhdodao = new TrinhDoDAO();
    }
    
    public List<TrinhDoDTO> loadListTrinhDo() throws Exception {
        try {
            return trinhdodao.loadListTrinhDo();
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            trinhdodao.closeConnection();
        }
        return null; 
    }
    
    public List<String> layTenTrinhDo() throws Exception {
        try {
            return trinhdodao.layTenTrinhDo();
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            trinhdodao.closeConnection();
        }
        return null; 
    }
    
    public boolean themTrinhDo(TrinhDoDTO trinhdo) throws Exception{
        try{
            if(trinhdodao.themTrinhDo(trinhdo)){
                return true;
            }
        }
        catch(Exception ex){
            
        }
        finally{
            trinhdodao.closeConnection();
        }
        return false;
    }
    
    public boolean xoaTrinhDo(TrinhDoDTO trinhdo) throws Exception{
        try{
            if(trinhdodao.xoaTrinhDo(trinhdo)){
                return true;
            }
        }
        catch(Exception ex){
            
        }
        finally{
            trinhdodao.closeConnection();
        }
        return false;
    }
}
