/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.connection.DataBase;
import qlttanhngu.dto.PhanQuyenDTO;

/**
 *
 * @author XuanVinh
 */
public class PhanQuyenDAO extends DataBase {

    public PhanQuyenDAO() throws Exception {
        super();
    }

    //Lấy danh sách các quyền của một user
    public Vector<PhanQuyenDTO> GetListAuthorizationOfUser(String mahocvien) {
        Vector<PhanQuyenDTO> lstQuyen = new Vector<PhanQuyenDTO>();

        CallableStatement callableStatement = null;
        CallableStatement callableStatement1 = null;

        PhanQuyenDTO phanQuyenDTO = null;
        ResultSet result = null;
        ResultSet result1 = null;

        try {
            callableStatement = getConnection().prepareCall("{call LayDanhSachQuyenTheoMa(?)}");
            callableStatement.setString(1, mahocvien);
            result = this.executeQuery(getConnection(), callableStatement);

            while (result.next()) {
                phanQuyenDTO = new PhanQuyenDTO();
                phanQuyenDTO.setMaQuyen(result.getString(1));

                //lấy tên quyền theo mã quyền
                callableStatement1 = getConnection().prepareCall("{call LayTenQuyenTheoMa(?)}");
                callableStatement1.setString(1, result.getString(1));
                result1 = this.executeQuery(getConnection(), callableStatement1);

                while (result1.next()) {
                    phanQuyenDTO.setTenQuyen(result1.getString(1));
                }

                lstQuyen.add(phanQuyenDTO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstQuyen;
    }

    //lấy danh sách các quyền hiện có    
    public Vector<PhanQuyenDTO> GetListAuthorization() {
        Vector<PhanQuyenDTO> lstTenLop = new Vector<PhanQuyenDTO>();
        PhanQuyenDTO phanQuyenDTO = null;
        ResultSet result = null;

        try {

            result = this.executeQuery("{call LayDanhSachQuyen()}");

            while (result.next()) {
                phanQuyenDTO = new PhanQuyenDTO();

                phanQuyenDTO.setMaQuyen(result.getString(1));
                phanQuyenDTO.setTenQuyen(result.getString(2));

                lstTenLop.add(phanQuyenDTO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstTenLop;
    }

    //thêm một quyền hạn mới
    public boolean InsertAuthorization(String maquyen, String manhanvien) {
        int result = 0;
        CallableStatement callableStatement = null;

        try {
            callableStatement = getConnection().prepareCall("{call ThemQuyenMoi(?,?)}");
            callableStatement.setString(1, maquyen);          
            callableStatement.setString(2, manhanvien);
            
            result = this.executeQueryUpdate(this.getConnection(),callableStatement);
            
            if(result != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhanQuyenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Xoa một quyền hạn mới
    public boolean DeleteAuthorization(String maquyen, String manhanvien) {
        int result = 0;
        CallableStatement callableStatement = null;

        try {
            callableStatement = getConnection().prepareCall("{call XoaQuyen(?,?)}");
            callableStatement.setString(1, manhanvien);           
            callableStatement.setString(2, maquyen);
            
            result = this.executeQueryUpdate(this.getConnection(),callableStatement);
            
            if(result != 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhanQuyenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
