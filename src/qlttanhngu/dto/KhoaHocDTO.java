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
public class KhoaHocDTO {
    private String maKhoaHoc;
    private String tenKhoaHoc;
    private Date ngayKhaiGiang;

    /**
     * @return the maKhoaHoc
     */
    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    /**
     * @param maKhoaHoc the maKhoaHoc to set
     */
    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    /**
     * @return the tenKhoaHoc
     */
    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    /**
     * @param tenKhoaHoc the tenKhoaHoc to set
     */
    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    /**
     * @return the ngayKhaiGiang
     */
    public String getNgayKhaiGiang1() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return sdf.format(this.ngayKhaiGiang);
    }
    
    public java.sql.Date getNgayKhaiGiang(){
        java.sql.Date sqlDate = new java.sql.Date(this.ngayKhaiGiang.getTime());
        return sqlDate;
    }

    /**
     * @param ngayKhaiGiang the ngayKhaiGiang to set
     */
    public void setNgayKhaiGiang(Date ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }
    
    
}
