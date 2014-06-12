/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.dto;

import java.util.Date;
import qlttanhngu.connection.DataBase;

/**
 *
 * @author XuanVinh
 */
public class KhoaHocDTO {
    private String makhoahoc;
    private String tenkhoahoc;
    private Date ngaykhaigiang;
    
    public String getMaKhoaHoc(){
        return this.makhoahoc;
    }
    
    public String getTenLop(){
        return this.tenkhoahoc;
    }
    
    public Date getNgayKhaiGiang(){
        return this.ngaykhaigiang;
    }
    
    public void setMaKhoaHoc(String makhoahoc){
        this.makhoahoc = makhoahoc;
    }
    
    public void setTenKhoaHoc(String tenKhoaHoc){
        this.tenkhoahoc = tenKhoaHoc;
    }
    
    public void setNgayKhaiGian(Date ngay){
        this.ngaykhaigiang = ngay;
    }
    
}
