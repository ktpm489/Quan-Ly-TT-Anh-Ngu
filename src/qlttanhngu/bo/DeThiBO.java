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
import qlttanhngu.dao.DeThiDAO;
import qlttanhngu.dto.DeThiDTO;

/**
 *
 * @author EvilZ
 */
public class DeThiBO {
    DeThiDAO dethidao;
    
    public DeThiBO() throws Exception{
        dethidao = new DeThiDAO();
    }
    
    public List<DeThiDTO> loadListDeThi() throws Exception {
        try {
            return dethidao.loadListDeThi();
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dethidao.closeConnection();
        }
        return null;
    }
    
    public boolean addDeThi(DeThiDTO dethidto) throws Exception{
         try{
            if(dethidao.addDeThi(dethidto)){
                return true;
            }
        }
        catch(Exception ex){
            
        }
        finally{
            dethidao.closeConnection();
        }
        return false;
    }
    
    
}
