/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author DuyLuu
 */
public class LopHocDTO {
    private String maLop;
    private String maNhanVien;
    private String maPhong;
    private String maChuongTrinhHoc;
    private String maKhoaHoc;
    private String tenLop;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private Double hocPhi;
    
    public String getMaLop() {
        return maLop;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getMaChuongTrinhHoc() {
        return maChuongTrinhHoc;
    }

    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getNgayBatDau() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.ngayBatDau);
    }
    
    public java.sql.Date getNgayBatDauUpdate(){ 
       //java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDateNgayBatDau = new java.sql.Date(this.ngayBatDau.getTime());
      return sqlDateNgayBatDau;
        //return java.sql.Date(this.namSinh);
   }
    
    public String getNgayKetThuc() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.ngayKetThuc);
    }
    
    public java.sql.Date getNgayKetThucUpdate(){
        java.sql.Date sqlDateNgayKetThuc = new java.sql.Date(this.ngayKetThuc.getTime());
        return sqlDateNgayKetThuc;
    }
    
    public Double getHocPhi() {
        return hocPhi;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setMaChuongTrinhHoc(String maChuongTrinhHoc) {
        this.maChuongTrinhHoc = maChuongTrinhHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public void setHocPhi(Double hocPhi) {
        this.hocPhi = hocPhi;
    }
    
    
}
