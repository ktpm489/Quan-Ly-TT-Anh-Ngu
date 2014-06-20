/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

/**
 *
 * @author MinhVu020
 */
public class PhongHocDTO {
    
    private String maPhong;
    private String tenPhong; 
    private int  soLuong ;
    private String diaChi;
   
  
   // </editor-fold>
   
   public String getMaPhong(){
       return this.maPhong;
   }
    public String getTenPhong(){
       return this.tenPhong;
   }
   
   public int getSoLuong(){
       return this.soLuong;
   }
    public String getDiaChi(){
       return this.diaChi;
   }

   
   // </editor-fold>
   
   // <editor-fold defaultstate="" desc="Set valuables">
   
     public void setMaPhong(String ma){
       this.maPhong = ma;
   } 
    public void setTenPhong(String ten){
       this.tenPhong = ten;
   } 
     public void setDiaChi(String dc){
       this.diaChi = dc;
   }
     
        public void setSoLuong(int  sl){
       this.soLuong = sl;
   }
    
}
