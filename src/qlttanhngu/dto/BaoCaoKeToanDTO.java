/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.dto;

/**
 *
 * @author EvilZ
 */
public class BaoCaoKeToanDTO {
    private String tenLop;
    private String trinhDo;
    private int siSo;
    private float soTienThu;

    /**
     * @return the tenLop
     */
    public String getTenLop() {
        return tenLop;
    }

    /**
     * @param tenLop the tenLop to set
     */
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
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

    /**
     * @return the siSo
     */
    public int getSiSo() {
        return siSo;
    }

    /**
     * @param siSo the siSo to set
     */
    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    /**
     * @return the soTienThu
     */
    public float getSoTienThu() {
        return soTienThu;
    }

    /**
     * @param soTienThu the soTienThu to set
     */
    public void setSoTienThu(float soTienThu) {
        this.soTienThu = soTienThu;
    }
}
