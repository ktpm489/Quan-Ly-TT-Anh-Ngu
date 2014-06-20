/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.dao;

import qlttanhngu.connection.DataBase;

/**
 *
 * @author EvilZ
 */
public class DeThiDAO extends DataBase{
    public DeThiDAO() throws Exception{
        super();
    }
//    public List<KhoaHocDTO> loadListKhoaHoc() throws Exception {
//        List<KhoaHocDTO> lstKH = new ArrayList<KhoaHocDTO>();
//        KhoaHocDTO khoahoc_dto = null;
//        ResultSet resultSet = null;
//        int i = 0;
//        
//        resultSet = this.executeQuery("{call LayDanhSachKhoaHoc()}");
//        try {
//            while(resultSet.next()){
//                khoahoc_dto = new KhoaHocDTO();
//                
//                khoahoc_dto.setMaKhoaHoc(resultSet.getString(1));
//                khoahoc_dto.setTenKhoaHoc(resultSet.getString(2));
//                khoahoc_dto.setNgayKhaiGiang(resultSet.getDate(3));
//                
//                lstKH.add(khoahoc_dto);
//                i++;
//            }    
//        } catch (SQLException ex) {
//            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            this.closeConnection();
//        }
//        return lstKH;
//    }
}
