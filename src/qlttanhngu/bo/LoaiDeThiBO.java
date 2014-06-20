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
import qlttanhngu.dao.LoaiDeThiDAO;
import qlttanhngu.dto.LoaiDeThiDTO;

/**
 *
 * @author EvilZ
 */
public class LoaiDeThiBO {
    LoaiDeThiDAO loaidtdao;

    public LoaiDeThiBO() throws Exception {
        loaidtdao = new LoaiDeThiDAO();
    }
    
    public List<LoaiDeThiDTO> loadListLoaiDeThi() throws Exception {
        try {
            return loaidtdao.loadListLoaiDeThi();
        } catch (SQLException ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            loaidtdao.closeConnection();
        }
        return null;  
    }
    
    public boolean addLoaiDeThi(LoaiDeThiDTO loaidethidto) throws Exception{
        try{
            if(loaidtdao.addLoaiDeThi(loaidethidto)){
                return true;
            }
        }
        catch(Exception ex){
            
        }
        finally{
            loaidtdao.closeConnection();
        }
        return false;
    }
    
    public boolean deleteLoaiDeThi(LoaiDeThiDTO loaidethidto) throws Exception{
        try{
            if(loaidtdao.deleteLoaiDeThi(loaidethidto)){
                return true;
            }
        }
        catch(Exception ex){
            
        }
        finally{
            loaidtdao.closeConnection();
        }
        return false;
    }
}
