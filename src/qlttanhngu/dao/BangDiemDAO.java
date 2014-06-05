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

    public List<HocVienDTO> GetListHocVienInBangDiem() {
        List<HocVienDTO> lstHV = new ArrayList<HocVienDTO>();
        HocVienDTO hocviendto = null;
        ResultSet result = null;

        //lấy danh sách học viên 
        result = this.executeQuery("{call ...................}");
        try {
            while (result.next()) {
                hocviendto = new HocVienDTO();

                hocviendto.setMaHocVien(result.getString(1));
                hocviendto.setTenHocVien(result.getString(2));
                hocviendto.setEmail(result.getString(3));

                lstHV.add(hocviendto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstHV;
    }

    public Vector<String> GetListTenLopHocHocVien() {
        Vector<String> lstTenLop = new Vector<String>();
      //  CallableStatement callableStatement = null;
        ResultSet result = null;

        try {
          //  callableStatement = getConnection().prepareCall("{LayDanhSachTenLopHoc()}");
          //  callableStatement.setString(1, mahocvien);
            result = this.executeQuery("{call LayDanhSachTenLopHoc()}");

            while (result.next()) {
                lstTenLop.add(result.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstTenLop;
    }

    public List<BangDiemDTO> GetListBangDiemHocVien(String mahv) {
        List<BangDiemDTO> lstBangDiem = new ArrayList<>();
        BangDiemDTO bangDiemDTO = null;
        CallableStatement callableStatement = null;
        ResultSet result = null;

        try {
            callableStatement = getConnection().prepareCall("{call ...............(?)}");
            callableStatement.setString(1, mahv);

            result = this.executeQuery(getConnection(), callableStatement);

            while (result.next()) {
                bangDiemDTO = new BangDiemDTO();

                bangDiemDTO.setMaBangDiem(result.getString(1));
                bangDiemDTO.setMaKiThi(result.getString(2));
                bangDiemDTO.setMaHocVien(result.getString(3));
                bangDiemDTO.setDiem(result.getDouble(4));

                lstBangDiem.add(bangDiemDTO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstBangDiem;
    }

    public Boolean UpdateBangDienHocVien(String mabangdiem, String mahocvien, String makythi, Double diem) {
        int result = 0;
        CallableStatement callableStatement = null;
        try {

            callableStatement = getConnection().prepareCall("{call ....................(?,?,?,?)}");
            callableStatement.setString(1, mabangdiem);
            callableStatement.setString(2, makythi);
            callableStatement.setString(3, mahocvien);
            callableStatement.setDouble(4, diem);

            result = this.executeQueryUpdate(getConnection(), callableStatement);
            if (result != 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public Boolean DeleteBangDiemOfHocVien(String mahocvien) {
        int result = 0;
        CallableStatement callableStatement = null;

        try {
            callableStatement = getConnection().prepareCall("{call .................(?)}");
            callableStatement.setString(1, mahocvien);

            result = this.executeQueryUpdate(getConnection(), callableStatement);
            if (result != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String GetMaKyThiTheoTen(String tenkythi) throws SQLException {
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;

        try {
            callableStatement = getConnection().prepareCall("{call .............(?)}");
            callableStatement.setString(1, tenkythi);
            resultSet = this.executeQuery(getConnection(), callableStatement);

            while (resultSet.next()) {
                return resultSet.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    public Vector<String> GetListMaHocVienChinhThuc() {

        Vector<String> lstmahocvien = new Vector<>();
        CallableStatement callableStatement = null;
        ResultSet result = null;
        try {
            callableStatement  = getConnection().prepareCall("{call LayDachDachMaHocVien(?)}");
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

    public String GetTenHocVienByMaHocVien(String mahocvien) {
        ResultSet result = null;
        CallableStatement callableStatement = null;
        
        try {
            callableStatement = getConnection().prepareCall("{call ....(?)}");
            callableStatement.setString(1, mahocvien);
            result = this.executeQuery(this.getConnection(),callableStatement);
            
            while(result.next()){
             return result.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

}
