/*
 * To change this template, choose Tools | Templates
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
import qlttanhngu.dto.LopHocDTO;

/**
 *
 * @author DuyLuu
 */
public class LopHocDAO extends DataBase{
    public LopHocDAO() throws Exception{
        super();
    }
    
    public List<LopHocDTO> LoadListLopHoc() throws Exception{
        List<LopHocDTO> listLH = new ArrayList<LopHocDTO>();
        LopHocDTO lh = null;
        ResultSet resultSet = null;
        int i = 0;
        resultSet = this.executeQuery("{call LayDanhSachLopHoc()}");
        try{
            while(resultSet.next()){
                lh = new LopHocDTO();
                lh.setMaLop(resultSet.getString(1));
                lh.setMaNhanVien(resultSet.getString(2));
                lh.setMaPhong(resultSet.getString(3));
                lh.setMaChuongTrinhHoc(resultSet.getString(4));
                lh.setMaKhoaHoc(resultSet.getString(5));
                lh.setTenLop(resultSet.getString(6));
                lh.setNgayBatDau(resultSet.getDate(7));
                lh.setNgayKetThuc(resultSet.getDate(8));
                lh.setHocPhi(resultSet.getDouble(9));
                
                listLH.add(lh);
                i++;
            }
                
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return listLH;    
    }
    
    public List<LopHocDTO> LoadListLopHocTheoMaLop(String maLop) throws Exception{
        List<LopHocDTO> listLH = new ArrayList<LopHocDTO>();
        LopHocDTO lh = null;
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        int i = 0;
        callableStatement = this.getConnection().prepareCall("{call LayDanhSachLopTheoMaLop(?)}");
        callableStatement.setString(1,maLop);
        resultSet = this.executeQuery(this.getConnection(), callableStatement);
        try{
            while(resultSet.next()){
                lh = new LopHocDTO();
                lh.setMaLop(resultSet.getString(1));
                lh.setMaNhanVien(resultSet.getString(2));
                lh.setMaPhong(resultSet.getString(3));
                lh.setMaChuongTrinhHoc(resultSet.getString(4));
                lh.setMaKhoaHoc(resultSet.getString(5));
                lh.setTenLop(resultSet.getString(6));    
                listLH.add(lh);
                i++;
            }
                
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return listLH;    
    }
    
    public List<LopHocDTO> LoadListLopHocTheoTenLop(String tenLop) throws Exception{
        List<LopHocDTO> listLH = new ArrayList<LopHocDTO>();
        LopHocDTO lh = null;
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;
        int i = 0;
        callableStatement = this.getConnection().prepareCall("{call LayDanhSachLopTheoTenLop(?)}");
        callableStatement.setString(1,tenLop);
        resultSet = this.executeQuery(this.getConnection(), callableStatement);
        try{
            while(resultSet.next()){
                lh = new LopHocDTO();
                lh.setMaLop(resultSet.getString(1));
                lh.setMaNhanVien(resultSet.getString(2));
                lh.setMaPhong(resultSet.getString(3));
                lh.setMaChuongTrinhHoc(resultSet.getString(4));
                lh.setMaKhoaHoc(resultSet.getString(5));
                lh.setTenLop(resultSet.getString(6));    
                listLH.add(lh);
                i++;
            }
                
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return listLH;    
    }
    
    public boolean ThemLopHoc(LopHocDTO lophocdto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try{
            callableStatement = this.getConnection().prepareCall("{call ThemLopHoc(?,?,?,?,?,?,?,?,?)}");
            callableStatement.setString(1, lophocdto.getMaLop());
            callableStatement.setString(2, lophocdto.getMaNhanVien());
            callableStatement.setString(3, lophocdto.getMaPhong());
            callableStatement.setString(4, lophocdto.getMaChuongTrinhHoc());
            callableStatement.setString(5, lophocdto.getMaKhoaHoc());
            callableStatement.setString(6, lophocdto.getTenLop());
            callableStatement.setString(7, lophocdto.getNgayBatDau());
            callableStatement.setString(8, lophocdto.getNgayKetThuc());
            callableStatement.setDouble(9, lophocdto.getHocPhi());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean CapNhatLopHoc(LopHocDTO lophocdto){
        int resultSet = 0;
        CallableStatement callableStatement = null;
        try{
            callableStatement = this.getConnection().prepareCall("{call CapNhatLopHoc(?,?,?,?,?,?,?,?,?)}");
            callableStatement.setString(1, lophocdto.getMaLop());
            callableStatement.setString(2, lophocdto.getMaNhanVien());
            callableStatement.setString(3, lophocdto.getMaPhong());
            callableStatement.setString(4, lophocdto.getMaChuongTrinhHoc());
            callableStatement.setString(5, lophocdto.getMaKhoaHoc());
            callableStatement.setString(6, lophocdto.getTenLop());
            callableStatement.setString(7, lophocdto.getNgayBatDau());
            callableStatement.setString(8, lophocdto.getNgayKetThuc());
            callableStatement.setDouble(9, lophocdto.getHocPhi());
            
            resultSet = this.executeQueryUpdate(this.getConnection(), callableStatement);
            if(resultSet != 0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean XoaLopHoc(String maLop){
        CallableStatement callableStatement = null;
        int resultSet = 0;
        try{
            callableStatement = this.getConnection().prepareCall("{call XoaLopHoc(?)}");
            callableStatement.setString(1, maLop);
            resultSet = this.executeQueryUpdate(this.getConnection(),callableStatement);
            if(resultSet!=0)
                return true;
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    
    }
    
    public List<LopHocDTO> SearchLopHoc(String tuKhoa) throws Exception{
        List<LopHocDTO> ListLH = new ArrayList<LopHocDTO>();
        CallableStatement callableStatement = null;
        LopHocDTO lh = null;
        ResultSet resultSet = null;
        int i = 0;
        callableStatement = getConnection().prepareCall("{call TimKiemLopHoc(?)}");
        callableStatement.setString(1, tuKhoa);
        resultSet = this.executeQuery(getConnection(),callableStatement);
        try{
            while(resultSet.next()){
                lh = new LopHocDTO();
                
                lh.setMaLop(resultSet.getString(1));
                lh.setMaNhanVien(resultSet.getString(2));
                lh.setMaPhong(resultSet.getString(3));
                lh.setMaChuongTrinhHoc(resultSet.getString(4));
                lh.setMaKhoaHoc(resultSet.getString(5));
                lh.setTenLop(resultSet.getString(6));
                lh.setNgayBatDau(resultSet.getDate(7));
                lh.setNgayKetThuc(resultSet.getDate(8));
                lh.setHocPhi(resultSet.getDouble(9));
                
                ListLH.add(lh);
                i++;
            }
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.closeConnection();
        }
        return ListLH;
    }
    
    public HashMap<String, String> GetListChuongTrinhHoc(){
        HashMap<String, String> hashMapChuongTrinhHoc = new HashMap<String, String>();
        ResultSet resultSet = null;
        
        try{
            resultSet = this.executeQuery("{call LayDanhSachTrinhDo()}");
            while(resultSet.next()){
                hashMapChuongTrinhHoc.put(resultSet.getString(1), resultSet.getString(2));
            }
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hashMapChuongTrinhHoc;
    }
    
    public HashMap<String, String> GetListKhoaHoc(){
        HashMap<String, String> hashMapKhoaHoc = new HashMap<String, String>();
        ResultSet resultSet = null;
        
        try{
            resultSet = this.executeQuery("{call LayDanhSachKhoaHoc()}");
            while(resultSet.next()){
                hashMapKhoaHoc.put(resultSet.getString(1), resultSet.getString(2));
            }
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hashMapKhoaHoc;
    }
    
    public HashMap<String, String> GetListGiangVien(){
        HashMap<String, String> hashMapGiangVien = new HashMap<String, String>();
        ResultSet resultSet = null;
        
        try{
            resultSet = this.executeQuery("{call LayDanhSachGiangVien()}");
            while(resultSet.next()){
                hashMapGiangVien.put(resultSet.getString(1), resultSet.getString(2));
            }
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hashMapGiangVien;
    }
    
    public HashMap<String, String> GetListPhongHoc(){
        HashMap<String, String> hashMapPhongHoc = new HashMap<String, String>();
        ResultSet resultSet = null;
        
        try{
            resultSet = this.executeQuery("{call LayDanhSachPhongHoc()}");
            while(resultSet.next()){
                hashMapPhongHoc.put(resultSet.getString(1), resultSet.getString(2));
            }
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hashMapPhongHoc;
    }
    
    public HashMap<String, String> GetListLopHoc(){
        HashMap<String, String> hashMapLopHoc = new HashMap<String, String>();
        ResultSet resultSet = null;
        
        try{
            resultSet = this.executeQuery("{call LayDanhSachTenLop()}");
            while(resultSet.next()){
                hashMapLopHoc.put(resultSet.getString(1), resultSet.getString(2));
            }
        }catch(SQLException ex){
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hashMapLopHoc;
    }
}
