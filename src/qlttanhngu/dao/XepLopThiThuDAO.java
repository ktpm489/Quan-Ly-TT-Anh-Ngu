/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.DanhSachThiDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XuanVinh
 */
public class XepLopThiThuDAO extends DataBase {

    public XepLopThiThuDAO() throws Exception {
        super();
    }

    //lấy danh sách điểm học viên load lên bảng theo  để thi (trinh do)
    public List<HocVienDTO> GetListHocVienTiemNang(String matrinhdo) {
        List<HocVienDTO> lstHVthi = new ArrayList<HocVienDTO>();
        CallableStatement callableStatement = null;
        HocVienDTO thi = null;
        ResultSet result = null;

        try {
            callableStatement = getConnection().prepareCall("{call LayDanhSachHocVienTimNangThiXepLop(?)}");
            callableStatement.setString(1, matrinhdo);
            //lấy danh sách học viên
            result = this.executeQuery(getConnection(), callableStatement);
            while (result.next()) {
                thi = new HocVienDTO();

                thi.setMaHocVien(result.getString(1));
                thi.setTenHocVien(result.getString(2));

                lstHVthi.add(thi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachThiDTO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstHVthi;
    }

    //lấy danh sách điểm học viên theo ma phong thi
    public List<DanhSachThiDTO> GetListHocVieninPhongThi(String maphong, String makythi) {
        List<DanhSachThiDTO> lstthi = new ArrayList<DanhSachThiDTO>();
        CallableStatement callableStatement = null;

        DanhSachThiDTO thi = null;
        ResultSet result = null;

        //lấy danh sách học viên 
        try {
            callableStatement = getConnection().prepareCall("{call LayDanhSachHocvienTrongPhong(?,?)}");
            callableStatement.setString(1, maphong);
            callableStatement.setString(2, makythi);

            result = this.executeQuery(getConnection(), callableStatement);
            while (result.next()) {
                thi = new DanhSachThiDTO();

                thi.setMahocvien(result.getString(1));
                thi.setTenhocvien(result.getString(2));

                lstthi.add(thi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachThiDTO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstthi;
    }

    //cập nhật thông tin danh sach kỳ thi
    public Boolean InsertHocVien(DanhSachThiDTO danhSachThiDTO) {
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call ThemHocVienVaoDanhSachThi(?,?)}");
            callableStatement.setString(1, danhSachThiDTO.getMakythi());
            callableStatement.setString(2, danhSachThiDTO.getMahocvien());

            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if (resultSet != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KyThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //delete thông tin danh sach kỳ thi
    public Boolean DeleteHocVien(DanhSachThiDTO danhSachThiDTO) {
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call XoaHocVienTrongDanhSachThi(?,?)}");
            callableStatement.setString(1, danhSachThiDTO.getMahocvien());
            callableStatement.setString(2, danhSachThiDTO.getMakythi());

            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if (resultSet != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KyThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //lấy danh sách tình độ và mã
    public HashMap<String, String> GetListPhong(String makythi) {
        HashMap<String, String> hashMapdethi = new HashMap<String, String>();
        CallableStatement callableStatement = null;
        ResultSet result = null;

        try {
            callableStatement = this.getConnection().prepareCall("{call LayDanhSachPhongTheoKyThi(?)}");
            callableStatement.setString(1, makythi);
            result = this.executeQuery(getConnection(), callableStatement);

            while (result.next()) {
                hashMapdethi.put(result.getString(1), result.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hashMapdethi;
    }

    //lấy số lượng người trong một phòng  
    public int GetCountSiSo(String maphong) {
        int temp = 0;
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        try {
            callableStatement = getConnection().prepareCall("{call LaySiSoPhong(?)}");
            callableStatement.setString(1, maphong);
            resultSet = this.executeQuery(getConnection(), callableStatement);

            while (resultSet.next()) {
                temp = resultSet.getInt(1);
            };
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    //kiểm tra ngày thi xem có thể xóa học viên trong phòng ko.
    public Boolean CheckDateOfKythi(String makythi) throws SQLException {
        Date temp = new Date();
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        try {
            callableStatement = getConnection().prepareCall("{call LayCuaKyThi(?)}");
            callableStatement.setString(1, makythi);
            resultSet = this.executeQuery(getConnection(), callableStatement);

            while (resultSet.next()) {
                if (temp.compareTo(resultSet.getDate(1)) > 0) {
                    return true;
                };
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
