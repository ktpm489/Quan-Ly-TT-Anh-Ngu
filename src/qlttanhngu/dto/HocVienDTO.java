/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

import java.text.SimpleDateFormat;
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
   private boolean tinhTrangHoc;
   private int soLuongLienLac;
   private String soDienThoai;
   private boolean gioiTinh;
   private String TenNghanhHoc;
   // </editor-fold>
   
   // <editor-fold defaultstate="" desc="Get propertise of HocVienDTO">
   public String getNamSinh(){
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");     
       return sdf.format(this.namSinh);
   }
   
   public java.sql.Date getNamSinhUpdate(){ 
       java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(this.namSinh.getTime());
      return sqlDate;
        //return java.sql.Date(this.namSinh);
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
       if(this.tinhTrangHoc)
           return "Chính Thức";
       else
           return "Tiềm Năng";
   }
   
    public boolean getTinhTrangHocUpdate(){
      return this.tinhTrangHoc;
   }
   
   public String getSoDienThoai(){
       return this.soDienThoai;
   }
   
   public Integer getSoLuongLienLac(){
       return this.soLuongLienLac;
   }
   
   public String getGioiTinh(){
       if(this.gioiTinh)
          return "Nam";
       else
           return "Nữ";
   }
   
    public boolean getGioiTinhUpdate(){
       return this.gioiTinh;     
   }
    
    public String getTenChungChi(){
        return TenNghanhHoc;
    }
   // </editor-fold>
   
   // <editor-fold defaultstate="" desc="Set valuables">
    
    public void setTenMaChungChi(String name){
        this.TenNghanhHoc = name;
    }
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
   
   public void setTinhTrangHoc(boolean tinhTrangHoc){
       this.tinhTrangHoc = tinhTrangHoc;
   }
   
   public void setSoLuongLienLac(int soLuongLienLac){
       this.soLuongLienLac = soLuongLienLac;
   }
   
   public void setSoDienThoai(String soDienThoai){
       this.soDienThoai = soDienThoai;
   }
   
   public void setGioiTinh(boolean gioitinh){
       this.gioiTinh = gioitinh;
   }
// </editor-fold>
}