/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import qlttanhngu.bo.UserAccountBO;
import qlttanhngu.dto.UserAccountDTO;

/**
 *
 * @author XUANVINHTD
 */
public class UserAccountController {
    private UserAccountBO user;

    public UserAccountController()  {
        try {
            this.user = new UserAccountBO();
        } catch (Exception ex) {
            Logger.getLogger(UserAccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isUserExit(UserAccountDTO userDTO) throws Exception{      
        if(user.isUserExit(userDTO)) 
           return true;
        else
           return false;
    }
    
    public boolean isChangePassword(UserAccountDTO userDTO) throws Exception{
        if(user.isChangePassword(userDTO))
            return true;
        else
            return false;
    }
}
