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
    private String password;
    private String passwordnew;
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getPasswordNew(){
    return this.passwordnew;    
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setPasswordNew(String passwordnew){
        this.passwordnew = passwordnew;
    }
    
    public UserAccountDTO(){
    }
    
}
