/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

/**
 *
 * @author XUANVINHTD
 */
public class BangDiemDTO {
    
    private String maBangDiem;
    private String maHocVien;
    private String TenHocVien;
    private String Malop;
    private String Tenlophoc;
    private Double diem;
    
    public String getMaBangDiem(){
        return this.maBangDiem;
    }
    
    public String getMaHocVien(){
        return this.maHocVien;
    }
    
    public String getTenHocVien(){
        return this.TenHocVien;
    }
    
    private String getMalop(){
        return this.Malop;
    }
    public String getTenlophoc(){
        return this.Tenlophoc;
    }
    
    public Double getDiem(){
        return this.diem;
    }
    
    public void setMaBangDiem(String maBangDiem){
        this.maBangDiem = maBangDiem;
    }
    
    public void setTenHocVien(String tenhocvien){
        this.TenHocVien = tenhocvien;
    }
    public void setMaHocVien(String maHocVien){
        this.maHocVien = maHocVien;
    }
    
    public void setMaLop(String malop){
        this.Malop = malop;
    }
    public void setTenlophoc(String tenlophoc){
        this.Tenlophoc = tenlophoc;
    }
    
    public void setDiem(Double diem){
        this.diem = diem;
    }
}
