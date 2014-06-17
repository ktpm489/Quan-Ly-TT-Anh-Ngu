/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.util.HashMap;
import java.util.List;
import qlttanhngu.dao.DanhSachThiDAO;
import qlttanhngu.dao.XepLopThiThuDAO;
import qlttanhngu.dto.DanhSachThiDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XuanVinh
 */
public class XepLopThiThuBO {

    private XepLopThiThuDAO xepLopThiThuDAO;

    public XepLopThiThuBO() throws Exception {
        xepLopThiThuDAO = new XepLopThiThuDAO();
    }

    public List<HocVienDTO> GetListHocVienTiemNang(String matrinhdo) throws Exception {
        try {
            return xepLopThiThuDAO.GetListHocVienTiemNang(matrinhdo);
        } catch (Exception ex) {

        } finally {
            xepLopThiThuDAO.closeConnection();
        }
        return null;
    }
    
     public List<DanhSachThiDTO> GetListHocVieninPhongThi(String maphong, String makythi) throws Exception {
        try {
            return xepLopThiThuDAO.GetListHocVieninPhongThi(maphong, makythi);
        } catch (Exception ex) {

        } finally {
            xepLopThiThuDAO.closeConnection();
        }
        return null;
    }
    
      public boolean InsertHocVien(DanhSachThiDTO danhSachThiDTO) throws Exception {
        try {
            if (xepLopThiThuDAO.InsertHocVien(danhSachThiDTO)) {
                return true;
            }
        } catch (Exception e) {
        } finally {
            xepLopThiThuDAO.closeConnection();
        }

        return false;
    }
      
       public HashMap<String, String> GetListPhong(String makythi) throws Exception {
        try {
            return xepLopThiThuDAO.GetListPhong(makythi);
        } catch (Exception e) {

        } finally {
            xepLopThiThuDAO.closeConnection();
        }

        return null;
    }
}
