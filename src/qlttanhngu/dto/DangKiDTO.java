/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MinhVu020
 */
public class DangKiDTO {
    // <editor-fold defaultstate="null" desc="Properties">

    private Date namSinh;
    private Date ngayDangKi;
    private String maHocVien;
    private String tenHocVien;
    private String cmnd;
    private String ngheNghiep;
    private String diaChi;
    private String email;
    private boolean tinhTrangHoc;
    private boolean trangThai;
    private String tenTinhTrangHoc;
    private String tenTrangThai;
    private int soDienThoai;
    private boolean gioiTinh;
    private String tenGioiTinh;
    private String maNgay;
    private String maCa;
    private String trinhDoToiThieu;
    private String trinhDoMuonHoc;
    private String trinhDoDuocHoc;
    // </editor-fold>

    // <editor-fold defaultstate="" desc="Get propertise of HocVienDTO">
    public String getNamSinh() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return sdf.format(this.namSinh);
    }

    public java.sql.Date getNamSinhUpdate() {
        //java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(this.namSinh.getTime());
        return sqlDate;
    }

    public java.sql.Date getNgayDangKi() {
        //java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(this.ngayDangKi.getTime());
        return sqlDate;
    }

    public String getMaHocVien() {
        return this.maHocVien;
    }

    public String getTenHocVien() {
        return this.tenHocVien;
    }

    public String getCmnd() {
        return this.cmnd;
    }

    public String getNgheNghiep() {
        return this.ngheNghiep;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTenTinhTrangHoc() {

        return this.tenTinhTrangHoc;
    }

    public Boolean getTinhTrangHoc() {
            return this.tinhTrangHoc;
       
    }

    public String getTenTrangThai() {

        return this.tenTrangThai;
    }

    public Boolean getTrangThai() {
       
            return this.trangThai;
      
    }

    public int getSoDienThoai() {
        return this.soDienThoai;
    }

    public String getMaNgay() {
        return this.maNgay;
    }

    public String getMaCa() {
        return this.maCa;
    }

    public Boolean getGioiTinh(String str) {
        if (str.equals("Nam")) {
            return true;
        }
        if (str.equals("Nữ")) {
            return false;
        }
        return false;
    }

    public String getTenGioiTinh() {
        if (this.gioiTinh) {
            this.tenGioiTinh = "Nam";
            return this.tenGioiTinh;
        } else {
            this.tenGioiTinh = "Nữ";
            return this.tenGioiTinh;
        }
    }

    public String getTrinhDoToiThieu() {
        return this.trinhDoToiThieu;
    }

    public String getTrinhDoMuonHoc() {
        return this.trinhDoMuonHoc;
    }

    public String getTrinhDoDuocHoc() {
        return this.trinhDoDuocHoc;
    }

    // </editor-fold>
    // <editor-fold defaultstate="" desc="Set valuables">
    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public void setNgayDangKi(Date ngayDk) {
        this.ngayDangKi = ngayDk;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public void setTenHocVien(String tenHocVien) {
        this.tenHocVien = tenHocVien;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTenTinhTrangHoc(String str) {
        this.tenTinhTrangHoc = str;
    }

    public void setTinhTrangHoc() {

        if (getTenTinhTrangHoc().equals("Tiềm Năng")) { 
            this.tinhTrangHoc = false;
        } else if (getTenTinhTrangHoc().equals("Chính Thức")){
             this.tinhTrangHoc = true;
        }
    }

    public void setTenTrangThai(String str) {
        this.tenTrangThai = str;
    }


    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setGioiTinh(String str) {

        this.tenGioiTinh = str;

    }

    public void setGioiTinh2() {
        if( this.tenGioiTinh.equals("Nam"))
        {
           this.gioiTinh = true;
        }
         if( this.tenGioiTinh.equals("Nữ"))
        {
           this.gioiTinh = false;
        }
    }

    public void setMaNgay(String str) {
        this.maNgay = str;
    }

    public void setMaCa(String str) {
        this.maCa = str;
    }

    public void setTrinhDoToiThieu(String str) {
        this.trinhDoToiThieu = str;
    }

    public void setTrinhDoMuonHoc(String str) {
        this.trinhDoMuonHoc = str;
    }

    public void setTrinhDoDuocHoc(String str) {
        this.trinhDoDuocHoc = str;
    }
}
