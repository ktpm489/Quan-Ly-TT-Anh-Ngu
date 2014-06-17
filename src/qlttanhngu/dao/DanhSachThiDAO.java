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
import qlttanhngu.dto.DanhSachThiDTO;

/**
 *
 * @author XuanVinh
 */
public class DanhSachThiDAO extends DataBase {
   
    public DanhSachThiDAO() throws Exception{
        super();
    }
     //lấy danh sách phòng học và mã co trong ky thi roi
   
      //lấy danh sách điểm học viên load lên bảng
    public List<DanhSachThiDTO> GetListDiemThiXepLop() {
        List<DanhSachThiDTO> lstthi = new ArrayList<DanhSachThiDTO>();
        DanhSachThiDTO thi = null;
        ResultSet result = null;

        //lấy danh sách học viên 
        result = this.executeQuery("{call .....()}");
        try {
            while (result.next()) {
                thi = new DanhSachThiDTO();

                thi.setMahocvien(result.getString(1));
                thi.setTenhocvien(result.getString(2));
                thi.setKetquathixeplop(result.getDouble(3));
                
                lstthi.add(thi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstthi;
    }
    
    //cập nhât điểm thi xếp lớp cho học viên tiềm năng
    public Boolean UpdateDiemThiXepLop(DanhSachThiDTO danhSachThiDTO){
         int resultSet = 0;
        CallableStatement callableStatement = null;
        try {
            callableStatement = this.getConnection().prepareCall("{call .....(?,?,?,?)}");
            callableStatement.setString(1, danhSachThiDTO.getMahocvien());
            callableStatement.setString(2, danhSachThiDTO.getTenhocvien());
            callableStatement.setDouble(3, danhSachThiDTO.getKetquathixeplop());         

            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if (resultSet != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KyThiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
     //lấy danh sách đề thi và mã
    public HashMap<String, String> GetListDeThi() {
        HashMap<String,String> hashMapdethi = new HashMap<String,String>();    
        ResultSet result = null;

        try {           
        
            result = this.executeQuery("{call LayDanhSachTrinhDo()}");

            while (result.next()) {
                hashMapdethi.put(result.getString(1), result.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hashMapdethi;
    }
    
       //lấy danh sách điểm học viên load lên bảng theo mã phòng thi và để thi
    public List<DanhSachThiDTO> GetListDiemThiXepLopBy(String maphong,String matrinhdo) {
        List<DanhSachThiDTO> lstthi = new ArrayList<DanhSachThiDTO>();
        DanhSachThiDTO thi = null;
        ResultSet result = null;

        //lấy danh sách học viên 
        result = this.executeQuery("{call .....()}");
        try {
            while (result.next()) {
                thi = new DanhSachThiDTO();

                thi.setMahocvien(result.getString(1));
                thi.setTenhocvien(result.getString(2));
                thi.setKetquathixeplop(result.getDouble(3));
                
                lstthi.add(thi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstthi;
    }
    
    //lấy mã tình độ theo đề thì   
     public String GetMaTrinhDoByDeThi(String madethi){
      String temp = "";
      CallableStatement callableStatement = null;
      ResultSet resultSet = null;  
            try {
                 callableStatement = getConnection().prepareCall("{call .......(?)}");
                 callableStatement.setString(1, madethi);
                resultSet = this.executeQuery(this.getConnection(), callableStatement);
                  while(resultSet.next()){
                 temp = resultSet.getString(1);
                  };
            } catch (SQLException ex) {
                Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }  
      return temp;
   } 
    
}
