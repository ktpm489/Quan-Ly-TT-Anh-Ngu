/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.dto;

/**
 *
 * @author XuanVinh
 */
public class NhanVienDTO {
    private String manhanvien;
    private String hoten;
    private String mahucvu;
    private String taikhoan;
    
    public String getMaNhanVien(){
        return this.manhanvien;
    }
    
    public String getMaChucVu(){
        return this.mahucvu;
    }
    
    public String getHoTen(){
        return this.hoten;
    }
    
    public String getTaiKhoan(){
        return this.taikhoan;
    }
    
    public void setMaNhanVien(String manhanvien){
         this.manhanvien = manhanvien;
    }
    
    public void setMaChucVu(String machucvu){
         this.mahucvu = machucvu;
    }
    
    public void setHoTen(String hoten){
         this.hoten = hoten;
    }
    
    public void setTaiKhoan(String taikhoan){
        this.taikhoan = taikhoan;
    }
    
    
}
