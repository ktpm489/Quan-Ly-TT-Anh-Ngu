/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dto;

/**
 *
 * @author XUANVINHTD
 */
public class UserAccountDTO {
    
    private String username;
    private String passwork;
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPasswork(){
        return this.passwork;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPasswork(String passwork){
        this.passwork = passwork;
    }
    
    public UserAccountDTO(){
    }
    
}
