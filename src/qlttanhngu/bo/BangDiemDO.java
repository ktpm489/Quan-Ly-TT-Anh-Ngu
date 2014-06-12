/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import qlttanhngu.dao.BangDiemDAO;
import qlttanhngu.dto.BangDiemDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XuanVinh
 */
public class BangDiemDO {

    private BangDiemDAO bangdiemdao;

    public BangDiemDO() throws Exception {
        bangdiemdao = new BangDiemDAO();
    }

    public List<HocVienDTO> GetListHocVienInBangDiem() throws Exception {
        try {
            return bangdiemdao.GetListHocVienInBangDiem();
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }

    public List<HocVienDTO> SearchHocVienInBangDiem(String ma, String ten) throws Exception {
        try {
            return bangdiemdao.SearchHocVienInBangDiem(ma, ten);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }

    public List<HocVienDTO> GetListHocVienInLopHoc(String malop) throws Exception {
        try {
            return bangdiemdao.GetListHocVienInLopHoc(malop);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }

    public Vector<String> GetListTenLopHocVien(String makhoa) throws Exception {
        try {
            return bangdiemdao.GetListTenLopHocVien(makhoa);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }
    
     //lấy danh sách khóa học hiện tại đang và đã học
    public HashMap<String, String> GetListKhoaHocVien() throws Exception{
         try {
            return bangdiemdao.GetListKhoaHocVien();
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }

    public List<BangDiemDTO> GetListBangDiemHocVien(String mahocvien) throws Exception {
        try {
            return bangdiemdao.GetListBangDiemHocVien(mahocvien);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }
        return null;
    }

    public Boolean UpdateBangDiemHocVien(String mahocvien, String malop, Double diem) throws Exception {
        try {
            return bangdiemdao.UpdateBangDienHocVien(mahocvien, malop, diem);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return false;
    }

    //Kiểm tra xem học viên có dượdc cập nhật diểm hay không ?
    public Boolean CheckUpdateScore(String mahocvien, String malop, Date date) throws Exception {
        try {
            return bangdiemdao.CheckUpdateScore(mahocvien, malop, date);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return false;
    }

    public String GetTenHocVienByMaHV(String mahocvien) throws Exception {
        try {
            return bangdiemdao.GetTenHocVienByMaHV(mahocvien);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return "";
    }

    public String GetMaLopByTenLop(String tenlop, String mahv) throws Exception {
        try {
            return bangdiemdao.GetMaLopByTenLop(tenlop, mahv);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return "";
    }

    public Double GetDiemHocVien(String mahocvien, String malop) throws Exception {
        try {
            return bangdiemdao.GetDiemHocVien(mahocvien, malop);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return 0.0;
    }

    public Vector<String> GetListMaHocVien() throws Exception {
        try {
            return bangdiemdao.GetListMaHocVienChinhThuc();
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }

    public Vector<String> GetListLopOfHocVien(String mahocvien) throws Exception {
        try {
            return bangdiemdao.GetListLopOfHocVien(mahocvien);
        } catch (Exception e) {

        } finally {
            bangdiemdao.closeConnection();
        }

        return null;
    }

}
