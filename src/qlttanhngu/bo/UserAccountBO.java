/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import qlttanhngu.dao.UserAccountDAO;

/**
 *
 * @author XUANVINHTD
 */
public class UserAccountBO {
    
    private UserAccountDAO user;

    public UserAccountBO() throws Exception {
        this.user = new UserAccountDAO();
    }
    public boolean isUserExit(String username, String passwork){
        if(user.isUserExit(username, passwork))
            return true;
       return false;
    }
}
