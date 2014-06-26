/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

/**
 *
 * @author DuyLuu
 */
public class CTHocVienDTO {
    private String maLop;
    private String maHocVien;
    private String tenHocVien;
    private boolean tinhTrang;

    public String getMaLop() {
        return maLop;
    }

    public String getMaHocVien() {
        return maHocVien;
    }


    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTenHocVien() {
        return tenHocVien;
    }

    public void setTenHocVien(String tenHocVien) {
        this.tenHocVien = tenHocVien;
    }
    
}
