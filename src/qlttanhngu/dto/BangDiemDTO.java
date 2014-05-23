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
    private String maKiThi;
    private Double diem;
    
    public String getMaBangDiem(){
        return this.maBangDiem;
    }
    
    public String getMaHocVien(){
        return this.maHocVien;
    }
    
    public String getMaKiThi(){
        return this.maKiThi;
    }
    
    public Double getDiem(){
        return this.diem;
    }
    
    public void setMaBangDiem(String maBangDiem){
        this.maBangDiem = maBangDiem;
    }
    
    public void setMaHocVien(String maHocVien){
        this.maHocVien = maHocVien;
    }
    
    public void setMaKiThi(String maKiThi){
        this.maKiThi = maKiThi;
    }
    
    public void setDiem(Double diem){
        this.diem = diem;
    }
}
