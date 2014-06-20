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
public class BienLaiHocPhiDTO {
     
   private Date ngayLapBienLai; 
   private String maBienLai;
    private String maHocVien;
   private String maLop;
   private String maNhanVien;  
   private Double tienThu ;
   private Double tienConLai ;
     private Double tongTien ;
   
  
   // </editor-fold>
   
   // <editor-fold defaultstate="" desc="Get propertise of HocVienDTO">
//   public String getNgayLapBienLai(){
//       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");     
//       return sdf.format(this.ngayLapBienLai);
//   }
     public java.sql.Date getNgayLapBienLai(){ 
       java.util.Date utilDate = new java.util.Date();
       java.sql.Date sqlDate = new java.sql.Date(this.ngayLapBienLai.getTime());
       return sqlDate;
   }
   
   public String getMaBienLai(){
       return this.maBienLai;
   }
    public String getMaHocVien(){
       return this.maHocVien;
   }
   
   public String getMaLop(){
       return this.maLop;
   }
   
   public String getMaNhanVien(){
       return this.maNhanVien;
   }
   
   public Double  getTienThu(){
       return this.tienThu;
   }
   
   public Double getTienConLai(){
       return this.tienConLai;
   }
   
     public Double getTongTien(){
       return this.tongTien;
   }
   
   // </editor-fold>
   
   // <editor-fold defaultstate="" desc="Set valuables">
   public void setNgayLapBienLai(Date ngaylap){
       this.ngayLapBienLai = ngaylap;
   }
   
   public void setMaBienLai(String mabl){
       this.maBienLai = mabl;
   }
    public void setMaHocVien(String mahv){
       this.maHocVien = mahv;
   }

   public void setMaLop(String malop){
       this.maLop = malop;
   }
   
   public void setMaNhanVien(String manv){
       this.maNhanVien = manv;
   }
   
   public void setTienThu(Double tienthu){
       this.tienThu = tienthu;
   }
   
   public void setTienConLai(Double conlai){
       this.tienConLai = conlai;
   }
   
    public void setTongTien(Double tong){
       this.tongTien = tong;
   }  
    
}
