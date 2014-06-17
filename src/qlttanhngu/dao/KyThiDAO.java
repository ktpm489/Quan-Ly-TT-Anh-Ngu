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
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.KyThiDTO;

/**
 *
 * @author XuanVinh
 */
public class KyThiDAO extends DataBase {

    public KyThiDAO() throws Exception {
        super();
    }

    //lấy danh sách kỳ thi load lên bảng
    public List<KyThiDTO> GetListKyThi() {
        List<KyThiDTO> lstKythi = new ArrayList<KyThiDTO>();
        KyThiDTO kythi = null;
        ResultSet result = null;

        //lấy danh sách học viên 
        result = this.executeQuery("{call LayDanhSachKyThi()}");
        try {
            while (result.next()) {
                kythi = new KyThiDTO();

                kythi.setMakythi(result.getString(1));
                kythi.setTenkythi(result.getString(2));
                kythi.setTenphong(result.getString(3));
                kythi.setNgaythi(result.getDate(4));

                lstKythi.add(kythi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstKythi;
    }

    //cập nhật thông tin kỳ thi
    public Boolean UpdateKyThi(KyThiDTO kyThiDTO) {
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call CapNhatKyThi(?,?,?,?)}");
            callableStatement.setString(1, kyThiDTO.getMakythi());
            callableStatement.setString(2, kyThiDTO.getTenkythi());
            callableStatement.setString(3, kyThiDTO.getMaphong());
            callableStatement.setDate(4, kyThiDTO.getNgayThiUpdate());

            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if (resultSet != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KyThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //thêm mới kỳ thi
    public Boolean InsertKyThi(KyThiDTO kyThiDTO) {
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call ThemKythi(?,?,?,?)}");
            callableStatement.setString(1, kyThiDTO.getMakythi());
            callableStatement.setString(3, kyThiDTO.getMaphong());
            callableStatement.setString(2, kyThiDTO.getTenkythi());           
            callableStatement.setDate(4, kyThiDTO.getNgayThiUpdate());

            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if (resultSet != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KyThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //lấy danh sách phòng học và mã
    public HashMap<String, String> GetListPhongThi() {
        HashMap<String, String> hashMapphong = new HashMap<String, String>();
        ResultSet result = null;

        try {

            result = this.executeQuery("{call LayDanhSachTenMaPhong()}");

            while (result.next()) {
                hashMapphong.put(result.getString(1), result.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hashMapphong;
    }

    //dếm số dữ liệu trong bảng ky thi   
    public Integer GetCountMakyThi() {
        Integer temp = 0;
        ResultSet resultSet = null;
        try {
            resultSet = this.executeQuery("{call DemMaKyThi()}");
            while (resultSet.next()) {
                temp = resultSet.getInt(1);
            };
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
}
