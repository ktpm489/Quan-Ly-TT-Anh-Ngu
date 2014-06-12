/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.util.Vector;
import qlttanhngu.dao.PhanQuyenDAO;
import qlttanhngu.dto.PhanQuyenDTO;

/**
 *
 * @author XuanVinh
 */
public class PhanQuyenDO {

    private PhanQuyenDAO phanQuyenDAO;

    public PhanQuyenDO() throws Exception {
        phanQuyenDAO = new PhanQuyenDAO();
    }

    public Vector<PhanQuyenDTO> GetListAuthorizationOfUser(String mahocvien) throws Exception {
        try {
            return phanQuyenDAO.GetListAuthorizationOfUser(mahocvien);
        } catch (Exception e) {

        } finally {
            phanQuyenDAO.closeConnection();
        }
        return null;
    }

    public Vector<PhanQuyenDTO> GetListAuthorization() throws Exception {
        try {
            return phanQuyenDAO.GetListAuthorization();
        } catch (Exception e) {

        } finally {
            phanQuyenDAO.closeConnection();
        }
        return null;
    }

    public  boolean InsertAuthorization(String maquyen,String manhanvien) throws Exception {
        try {
            return phanQuyenDAO.InsertAuthorization(maquyen, manhanvien);
        } catch (Exception e) {

        } finally {
            phanQuyenDAO.closeConnection();
        }
        return false;
    }
    
    public boolean DeleteAuthorization(String maquyen, String mahocvien) throws Exception{
         try {
            return phanQuyenDAO.DeleteAuthorization(mahocvien,maquyen);
        } catch (Exception e) {

        } finally {
            phanQuyenDAO.closeConnection();
        }
        return false;
    }
}
