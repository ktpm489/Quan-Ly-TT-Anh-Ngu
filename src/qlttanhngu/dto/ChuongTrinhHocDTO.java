/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

import java.util.Date;

/**
 *
 * @author MinhVu020
 */
public class ChuongTrinhHocDTO {
    
    
   private String maChuongTrinhHoc;
    private String maTrinhDo; 
     private Double hocPhi ;
   
  
   // </editor-fold>
   
   public String getMaChuongTrinhHoc(){
       return this.maChuongTrinhHoc;
   }
    public String getMaTrinhDo(){
       return this.maTrinhDo;
   }
   
   public Double getHocPhi(){
       return this.hocPhi;
   }

   
   // </editor-fold>
   
   // <editor-fold defaultstate="" desc="Set valuables">
   
   public void setMaChuongTrinhHoc(String  mact){
       this.maChuongTrinhHoc = mact;
   }  
   public void setMaTrinhDo(String  ma){
       this.maTrinhDo = ma;
   }
   
    public void setHocPhi(Double hp){
       this.hocPhi = hp;
   }  
    
}
