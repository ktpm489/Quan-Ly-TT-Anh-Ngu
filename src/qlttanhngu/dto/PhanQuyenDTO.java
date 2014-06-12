/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlttanhngu.dto;

import java.util.List;

/**
 *
 * @author XuanVinh
 */
public class PhanQuyenDTO {
        private String maquyen;
    private String tenQuyen;
    private List<String> lstquyen;
    
    public String getMaQuyen(){
        return this.maquyen;
    }
    
    public String getTenQuyen(){
        return this.tenQuyen;
    }
    
    public List<String> getQuyen(){
        return this.lstquyen;
    }
    
    public void setTenQuyen(String tenquyen){
        this.tenQuyen = tenquyen;
    }
    
    public void setMaQuyen(String maquyen){
        this.maquyen = maquyen;
    }
    
    public void setQuyen(List<String> lstquyen){
        this.lstquyen = lstquyen;
    }
}
