/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.dao.KyThiDAO;
import qlttanhngu.dto.KyThiDTO;

/**
 *
 * @author XuanVinh
 */
public class KyThiBO {

    private KyThiDAO kyThiDAO;

    public KyThiBO() throws Exception {
        kyThiDAO = new KyThiDAO();
    }

    public List<KyThiDTO> LoadListKyThi() throws Exception {
        try {
            return kyThiDAO.GetListKyThi();
        } catch (Exception ex) {

        } finally {
            kyThiDAO.closeConnection();
        }
        return null;
    }

    public boolean UpdateKyThi(KyThiDTO kyThidto) throws Exception {
        try {
            if (kyThiDAO.UpdateKyThi(kyThidto)) {
                return true;
            }
        } catch (Exception e) {
        } finally {
            kyThiDAO.closeConnection();
        }

        return false;
    }
    
    public boolean InsertKyThi(KyThiDTO kyThidto) throws Exception {
        try {
            if (kyThiDAO.InsertKyThi(kyThidto)) {
                return true;
            }
        } catch (Exception e) {
        } finally {
            kyThiDAO.closeConnection();
        }

        return false;
    }
         
    public HashMap<String, String> GetListPhong() throws Exception{
         try {
            return kyThiDAO.GetListPhongThi();
        } catch (Exception e) {

        } finally {
            kyThiDAO.closeConnection();
        }

        return null;
    }
    
     public Integer GetCountMakyThi() throws Exception {
        try {
            return kyThiDAO.GetCountMakyThi();

        } catch (Exception ex) {
           
        } finally {
            kyThiDAO.closeConnection();
        }
        return null;
    }
}
