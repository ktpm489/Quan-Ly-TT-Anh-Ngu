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
public class DanhSachThiDTO {
    
    private String mahocvien;
    private String tenhocvien;  
    private String makythi;
    private Double ketquathixeplop;

    public String getTenhocvien() {
        return tenhocvien;
    }

    public void setTenhocvien(String tenhocvien) {
        this.tenhocvien = tenhocvien;
    }
    
    public String getMahocvien() {
        return mahocvien;
    }

    public void setMahocvien(String mahocvien) {
        this.mahocvien = mahocvien;
    }

    public String getMakythi() {
        return makythi;
    }

    public void setMakythi(String makythi) {
        this.makythi = makythi;
    }

    public Double getKetquathixeplop() {
        return ketquathixeplop;
    }

    public void setKetquathixeplop(Double ketquathixeplopx) {
        this.ketquathixeplop = ketquathixeplopx;
    }
    
}
