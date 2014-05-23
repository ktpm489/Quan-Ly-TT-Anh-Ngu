/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

import java.util.Date;

/**
 *
 * @author XUANVINHTD
 */
public class HocVienDTO {
    
   // <editor-fold defaultstate="null" desc="Properties">
   private Date namSinh; 
   private String maHocVien;
   private String tenHocVien;
   private String cmnd;  
   private String maChungChi;
   private String ngheNghiep;
   private String diaChi;
   private String email;
   private String tinhTrangHoc;
   private int soLuongLienLac;
   private int soDienThoai;
   private boolean gioiTinh;
   // </editor-fold>
   
   // <editor-fold defaultstate="" desc="Get propertise of HocVienDTO">
   public Date getNamSinh(){
       return this.namSinh;
   }
   
   public String getMaHocVien(){
       return this.maHocVien;
   }
   
   public String getTenHocVien(){
       return this.tenHocVien;
   }
   
   public String getCmnd(){
       return this.cmnd;
   }
   
   public String getMaChungChi(){
       return this.maChungChi;
   }
   
   public String getNgheNghiep(){
       return this.ngheNghiep;
   }
   
   public String getDiaChi(){
       return this.diaChi;
   }
   
   public String getEmail(){
       return this.email;
   }
   
   public String getTinhTrangHoc(){
       return this.tinhTrangHoc;
   }
   
   public int getSoDienThoai(){
       return this.soDienThoai;
   }
   
   public int getSoLuongLienLac(){
       return this.soLuongLienLac;
   }
   
   public Boolean getGioiTinh(){
       return this.gioiTinh;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="" desc="Set valuables">
   public void setNamSinh(Date namSinh){
       this.namSinh = namSinh;
   }
   
   public void setMaHocVien(String maHocVien){
       this.maHocVien = maHocVien;
   }
   
   public void setTenHocVien(String tenHocVien){
       this.tenHocVien = tenHocVien;
   }
   
   public void setCmnd(String cmnd){
       this.cmnd = cmnd;
   }
   
   public void setMaChungChi(String maChungChi){
       this.maChungChi = maChungChi;
   }
   
   public void setNgheNghiep(String ngheNghiep){
       this.ngheNghiep = ngheNghiep;
   }
   
   public void setDiaChi(String diaChi){
       this.diaChi = diaChi;
   }
   
   public void setEmail(String email){
       this.email = email;
   }
   
   public void setTinhTrangHoc(String tinhTrangHoc){
       this.tinhTrangHoc = tinhTrangHoc;
   }
   
   public void setSoLuongLienLac(int soLuongLienLac){
       this.soLuongLienLac = soLuongLienLac;
   }
   
   public void setSoDienThoai(int soDienThoai){
       this.soDienThoai = soDienThoai;
   }
   
   public void setGioiTinh(boolean gioitinh){
       this.gioiTinh = gioitinh;
   }
// </editor-fold>
}