/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import qlttanhngu.bo.UserAccountBO;

/**
 *
 * @author XUANVINHTD
 */
public class UserAccountController {
    private UserAccountBO user;

    public UserAccountController() throws Exception {
        this.user = new UserAccountBO();
    }
    
    public boolean isUserExit(String username, String pass){      
        if(user.isUserExit(username, pass)) 
           return true;
        else
           return false;
    }
}
