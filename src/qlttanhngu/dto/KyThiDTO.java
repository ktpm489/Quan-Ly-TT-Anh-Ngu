/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author XuanVinh
 */
public class KyThiDTO {

    private String makythi;
    private String maphong;
    private String tenphong;
    private String tenkythi;
    private Date ngaythi;

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }


    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getMakythi() {
        return makythi;
    }

    public void setMakythi(String makythi) {
        this.makythi = makythi;
    }

    public String getTenkythi() {
        return tenkythi;
    }

    public void setTenkythi(String tenkythi) {
        this.tenkythi = tenkythi;
    }

    public Date getNgaythi() {
        return ngaythi;
    }

    public void setNgaythi(Date ngaythi) {
        this.ngaythi = ngaythi;
    }
    
    public String getNgayThi(){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");     
       return sdf.format(this.ngaythi);
    }

    public java.sql.Date getNgayThiUpdate() {
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(this.ngaythi.getTime());
        return sqlDate;
        //return java.sql.Date(this.namSinh);
    }
}
