/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.dao.DanhSachThiDAO;
import qlttanhngu.dto.DanhSachThiDTO;

/**
 *
 * @author XuanVinh
 */
public class DanhSachThiBO {

    private DanhSachThiDAO danhSachThiDAO;

    public DanhSachThiBO() throws Exception {
        danhSachThiDAO = new DanhSachThiDAO();
    }

    public List<DanhSachThiDTO> GetListDiemThiXepLop(String maphong, String makythi) throws Exception {
        try {
            return danhSachThiDAO.GetListHocVieninPhongThi(maphong,makythi);
        } catch (Exception ex) {

        } finally {
            danhSachThiDAO.closeConnection();
        }
        return null;
    }

    public boolean UpdateDiemThiXepLop(DanhSachThiDTO danhSachThiDTO) throws Exception {
        try {
            if (danhSachThiDAO.UpdateDiemThiXepLop(danhSachThiDTO)) {
                return true;
            }
        } catch (Exception e) {
        } finally {
            danhSachThiDAO.closeConnection();
        }

        return false;
    }

    public HashMap<String, String> GetListDeThi() throws Exception {
        try {
            return danhSachThiDAO.GetListDeThi();
        } catch (Exception e) {

        } finally {
            danhSachThiDAO.closeConnection();
        }

        return null;
    }

    public List<DanhSachThiDTO> GetListDiemThiXepLopBy(String maphong, String matrinhdo) throws Exception {
        try {
            return danhSachThiDAO.GetListDiemThiXepLopBy(maphong, matrinhdo);
        } catch (Exception ex) {

        } finally {
            danhSachThiDAO.closeConnection();
        }
        return null;
    }

    public String GetMaTrinhDoByHocVien(String name) throws Exception {
        try {
            return danhSachThiDAO.GetMaTrinhDoByHocVien(name);

        } catch (Exception ex) {
            Logger.getLogger(HocVienBO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            danhSachThiDAO.closeConnection();
        }
        return "";
    }

}
