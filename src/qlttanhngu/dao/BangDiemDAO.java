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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.BangDiemDTO;
import qlttanhngu.dto.HocVienDTO;

/**
 *
 * @author XuanVinh
 */
public class BangDiemDAO extends DataBase {

    public BangDiemDAO() throws Exception {
        super();
    }

    //lấy danh sách học viên để hiển thị trong frame bảng điểm
    public List<HocVienDTO> GetListHocVienInBangDiem() {
        List<HocVienDTO> lstHV = new ArrayList<HocVienDTO>();
        HocVienDTO hocviendto = null;
        ResultSet result = null;

        //lấy danh sách học viên 
        result = this.executeQuery("{call LayDanhSachHocVienBangDiem()}");
        try {
            while (result.next()) {
                hocviendto = new HocVienDTO();

                hocviendto.setMaHocVien(result.getString(1));
                hocviendto.setTenHocVien(result.getString(2));
                hocviendto.setGioiTinh(result.getBoolean(3));
                hocviendto.setSoDienThoai(result.getString(4));
                hocviendto.setEmail(result.getString(5));

                lstHV.add(hocviendto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstHV;
    }

    //Tìm kiếm học viên trong frame bảng điểm
    public List<HocVienDTO> SearchHocVienInBangDiem(String ma, String ten) {
        List<HocVienDTO> lstHV = new ArrayList<HocVienDTO>();
        HocVienDTO hocviendto = null;
        CallableStatement callableStatement = null;
        ResultSet result = null;

        //lấy danh sách học viên 
        try {
            callableStatement = getConnection().prepareCall("{call TraCuuHVTrongBangDiem(?,?)}");
            callableStatement.setString(1, ten);
            callableStatement.setString(2, ma);

            result = this.executeQuery(getConnection(), callableStatement);

            while (result.next()) {
                hocviendto = new HocVienDTO();

                hocviendto.setMaHocVien(result.getString(1));
                hocviendto.setTenHocVien(result.getString(2));
                hocviendto.setGioiTinh(result.getBoolean(3));
                hocviendto.setSoDienThoai(result.getString(4));
                hocviendto.setEmail(result.getString(5));

                lstHV.add(hocviendto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstHV;
    }

//    //lấy danh sách lớp học hiện tại đang và đã học
    public Vector<String> GetListTenLopHocVien(String makhoa) {
        Vector<String> lstTenLop = new Vector<String>();
        CallableStatement callableStatement = null;
        ResultSet result = null;

        try {
            callableStatement = getConnection().prepareCall("{LayDanhSachTenLopHoc(?)}");
            callableStatement.setString(1, makhoa);
            result = this.executeQuery(getConnection(), callableStatement);

            while (result.next()) {
                lstTenLop.add(result.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstTenLop;
    }

    //lấy danh sách khóa học hiện tại đang và đã học
    public HashMap<String, String> GetListKhoaHocVien() {
        HashMap<String,String> hashMapTenLop = new HashMap<String,String>();    
        ResultSet result = null;

        try {           
        
            result = this.executeQuery("{call LayDanhSachKhoaHoc()}");

            while (result.next()) {
                hashMapTenLop.put(result.getString(1), result.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hashMapTenLop;
    }

    //Lấy danh sách điểm của một học viên
    public List<BangDiemDTO> GetListBangDiemHocVien(String mahocvien) {
        List<BangDiemDTO> lstBangDiem = new ArrayList<>();
        CallableStatement callableStatement = null;
        BangDiemDTO bangDiemDTO = null;
        ResultSet result = null;

        try {
            callableStatement = getConnection().prepareCall("{call LayDanhSachBangDiemCuaHocVien(?)}");
            callableStatement.setString(1, mahocvien);
            result = this.executeQuery(getConnection(), callableStatement);

            while (result.next()) {
                bangDiemDTO = new BangDiemDTO();
                bangDiemDTO.setTenlophoc(result.getString(1));
                bangDiemDTO.setDiem(result.getDouble(2));

                lstBangDiem.add(bangDiemDTO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstBangDiem;
    }

    public Boolean UpdateBangDienHocVien(String mahocvien, String malop, Double diem) {
        int result = 0;
        CallableStatement callableStatement = null;
        try {

            callableStatement = getConnection().prepareCall("{call CapNhatDiemChoHocVien(?,?,?)}");
            callableStatement.setString(1, mahocvien);
            callableStatement.setString(2, malop);
            callableStatement.setDouble(3, diem);

            result = this.executeQueryUpdate(getConnection(), callableStatement);
            if (result != 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    //Kiểm tra xem học viên có dượdc cập nhật diểm hay không ?
    public Boolean CheckUpdateScore(String mahocvien, String malop, Date date) {
        ResultSet result = null;
        CallableStatement callableStatement = null;

        try {
            callableStatement = getConnection().prepareCall("{call KiemTraNgayCapNhatDiem(?,?)}");
            callableStatement.setString(1, mahocvien);
            callableStatement.setString(2, malop);

            result = this.executeQuery(getConnection(), callableStatement);

            // so sanh 2 ngay
            while (result.next()) {
                result.getDate(1);
                if (date.compareTo(result.getDate(1)) > 0) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    // lấy ra danh sách học viên nằm trong một lớp
    public List<HocVienDTO> GetListHocVienInLopHoc(String malop) {
        List<HocVienDTO> lstHV = new ArrayList<HocVienDTO>();
        HocVienDTO hocviendto = null;
        CallableStatement callableStatement = null;
        ResultSet result = null;

        try {
            callableStatement = getConnection().prepareCall("{call LayDSHVTrong1Lop(?)}");
            callableStatement.setString(1, malop);

            //lấy danh sách học viên 
            result = this.executeQuery(getConnection(), callableStatement);

            while (result.next()) {
                hocviendto = new HocVienDTO();

                hocviendto.setMaHocVien(result.getString(1));
                hocviendto.setTenHocVien(result.getString(2));
                hocviendto.setGioiTinh(result.getBoolean(3));
                hocviendto.setSoDienThoai(result.getString(4));
                hocviendto.setEmail(result.getString(5));

                lstHV.add(hocviendto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstHV;
    }

    public String GetTenHocVienByMaHV(String mahocvien) throws SQLException {
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;

        try {
            callableStatement = getConnection().prepareCall("{call TimKiemHocVien(?)}");
            callableStatement.setString(1, mahocvien);
            resultSet = this.executeQuery(getConnection(), callableStatement);

            while (resultSet.next()) {
                return resultSet.getString(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    public String GetMaLopByTenLop(String tenlop, String mahv) throws SQLException {
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;

        try {
            callableStatement = getConnection().prepareCall("{call LayMaLopTheoTen(?,?)}");
            callableStatement.setString(1, tenlop);
            callableStatement.setString(2, mahv);
            resultSet = this.executeQuery(getConnection(), callableStatement);

            while (resultSet.next()) {
                return resultSet.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    public Double GetDiemHocVien(String mahocvien, String malop) {
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;

        try {
            callableStatement = getConnection().prepareCall("{call LayDiemHocVien(?,?)}");
            callableStatement.setString(1, mahocvien);
            callableStatement.setString(2, malop);
            resultSet = this.executeQuery(getConnection(), callableStatement);

            while (resultSet.next()) {
                return resultSet.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }

    //lấy danh sách mã học viên chính thức để cập nhật điểm
    public Vector<String> GetListMaHocVienChinhThuc() {

        Vector<String> lstmahocvien = new Vector<>();
        CallableStatement callableStatement = null;
        ResultSet result = null;
        try {
            callableStatement = getConnection().prepareCall("{call LayDachDachMaHocVien(?)}");
            callableStatement.setBoolean(1, true);

            result = this.executeQuery(getConnection(), callableStatement);
            while (result.next()) {
                lstmahocvien.add(result.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstmahocvien;
    }

    //Lấy danh sách lớp mà học viên đó đã và đang học
    public Vector<String> GetListLopOfHocVien(String mahocvien) {

        Vector<String> lsttenlop = new Vector<>();
        CallableStatement callableStatement = null;
        ResultSet result = null;
        try {
            callableStatement = getConnection().prepareCall("{call LayDSLopHocTheoMaHV(?)}");
            callableStatement.setString(1, mahocvien);

            result = this.executeQuery(getConnection(), callableStatement);
            while (result.next()) {
                lsttenlop.add(result.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lsttenlop;
    }

}
