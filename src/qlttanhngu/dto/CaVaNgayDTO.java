/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

/**
 *
 * @author DuyLuu
 */
public class CaVaNgayDTO {
    private String maCa;
    private String buoi;
    private int gioBatDau;
    private int gioKetThuc;
    
    private String maNgay;
    private String danhSachNgay;

    public String getMaCa() {
        return maCa;
    }

    public String getBuoi() {
        return buoi;
    }

    public int getGioBatDau() {
        return gioBatDau;
    }

    public int getGioKetThuc() {
        return gioKetThuc;
    }

    public String getMaNgay() {
        return maNgay;
    }

    public String getDanhSachNgay() {
        return danhSachNgay;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public void setBuoi(String buoi) {
        this.buoi = buoi;
    }

    public void setGioBatDau(int gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public void setGioKetThuc(int gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public void setMaNgay(String maNgay) {
        this.maNgay = maNgay;
    }

    public void setDanhSachNgay(String danhSachNgay) {
        this.danhSachNgay = danhSachNgay;
    }
    
    
}
