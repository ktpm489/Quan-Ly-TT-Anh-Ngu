/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.dao.LopHocDAO;
import qlttanhngu.dto.LopHocDTO;


/**
 *
 * @author DuyLuu
 */
public class LopHocBO {
    private LopHocDAO lophocdao;
    public LopHocBO() throws Exception{
        lophocdao = new LopHocDAO();
    }
    public List<LopHocDTO> LoadListLopHoc() throws Exception{
        try{
            return lophocdao.LoadListLopHoc();
        }catch(SQLException ex){
            Logger.getLogger(LopHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            lophocdao.closeConnection();
        }
        return null;
    }
    
    public List<LopHocDTO> LoadListLopHocTheoMaLop(String maLop) throws Exception{
        try{
            return lophocdao.LoadListLopHocTheoMaLop(maLop);
        }catch(SQLException ex){
            Logger.getLogger(LopHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            lophocdao.closeConnection();
        }
        return null;
    }
    
    public List<LopHocDTO> LoadListLopHocTheoTenLop(String tenLop) throws Exception{
        try{
            return lophocdao.LoadListLopHocTheoTenLop(tenLop);
        }catch(SQLException ex){
            Logger.getLogger(LopHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            lophocdao.closeConnection();
        }
        return null;
    }
    
    public boolean ThemLopHoc(LopHocDTO lophocdto) throws Exception{
        try{
            if(lophocdao.ThemLopHoc(lophocdto))
                return true;
        //}//catch(SQLException ex){
           // Logger.getLogger(LopHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            lophocdao.closeConnection();
        }
        return false;
    }
    
    public boolean CapNhatLopHoc(LopHocDTO lophocdto) throws Exception{
        try{
            if(lophocdao.CapNhatLopHoc(lophocdto))
                return true;
        }finally{
            lophocdao.closeConnection();
        }
        return false;
    }
    
    public boolean XoaLopHoc(String maLop) throws Exception{
        try{
            if(lophocdao.XoaLopHoc(maLop))
                return true;
        }finally{
            lophocdao.closeConnection();
        }
        return false;
    }
    
    public List<LopHocDTO> SearchLopHoc(String tuKhoa) throws Exception{
        try{
             return lophocdao.SearchLopHoc(tuKhoa);
        }catch(SQLException ex)
        {
            Logger.getLogger(LopHocBO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            lophocdao.closeConnection();
        }
        return null;
    }
    
    
    public HashMap<String, Integer> GetListSoLuongHocVienTrongPhong(){
        return lophocdao.GetListSoLuongHocVienTrongPhong();
    }
    public HashMap<String, String> GetListChuongTrinhHoc(){
        return lophocdao.GetListChuongTrinhHoc();
    }
    public HashMap<String, String> GetListKhoaHoc(){
        return lophocdao.GetListKhoaHoc();
    }
    public HashMap<String, String> GetListGiangVien(){
        return lophocdao.GetListGiangVien();
    }
    public HashMap<String, String> GetListPhongHoc(){
        return lophocdao.GetListPhongHoc();
    }
    public HashMap<String, String> GetListLopHoc(){
        return lophocdao.GetListLopHoc();
    }
    public int MaLop(){
        return lophocdao.MaLop();
    }
}
