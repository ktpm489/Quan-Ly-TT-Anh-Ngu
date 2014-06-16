/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.dto;

import java.util.Date;

/**
 *
 * @author XuanVinh
 */
public class KyThiDTO {
    private String makythi;
    private String tenkythi;
    private Date ngaythi;

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
}
