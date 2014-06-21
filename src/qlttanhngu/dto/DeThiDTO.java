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
 * @author EvilZ
 */
public class DeThiDTO {
    private String maDeThi;
    private String loaiDeThi;
    private String trinhDo;
    private Date ngayCap;

    /**
     * @return the maDeThi
     */
    public String getMaDeThi() {
        return maDeThi;
    }

    /**
     * @param maDeThi the maDeThi to set
     */
    public void setMaDeThi(String maDeThi) {
        this.maDeThi = maDeThi;
    }

    /**
     * @return the loaiDeThi
     */
    public String getLoaiDeThi() {
        return loaiDeThi;
    }

    /**
     * @param loaiDeThi the loaiDeThi to set
     */
    public void setLoaiDeThi(String loaiDeThi) {
        this.loaiDeThi = loaiDeThi;
    }

    /**
     * @return the ngayCap
     */
    public java.sql.Date getNgayCap() {
        java.sql.Date sqlDate = new java.sql.Date(this.ngayCap.getTime());
        return sqlDate;
    }
    
    public String getNgayCap1(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return sdf.format(this.ngayCap);
    }

    /**
     * @param ngayCap the ngayCap to set
     */
    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    /**
     * @return the trinhDo
     */
    public String getTrinhDo() {
        return trinhDo;
    }

    /**
     * @param trinhDo the trinhDo to set
     */
    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
}
