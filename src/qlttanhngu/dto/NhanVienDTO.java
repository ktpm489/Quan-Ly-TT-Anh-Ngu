/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

import java.text.SimpleDateFormat;

/**
 *
 * @author DuyLuu
 */
public class NhanVienDTO {

    
    
   private String maNhanVien;
   private String maChucVu;
   private String hoTen;
   private boolean gioiTinh;
   private String quocTich;
   private String trinhDo;
   private String soDienThoai;
   private String diaChi;
   private String taiKhoan;
   private String matKhau;
   private String namSinh;
   
   public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Boolean getGioiTinh() {
       return gioiTinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }
    
    public String getNamSinh(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
        return sdf.format(this.namSinh);
    }
    
    
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public void setNamSinh(String namSinh){
        this.namSinh = namSinh;
    }
}
