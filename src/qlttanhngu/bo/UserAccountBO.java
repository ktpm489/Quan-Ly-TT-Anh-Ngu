/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.bo;

import qlttanhngu.dao.UserAccountDAO;
import qlttanhngu.dto.UserAccountDTO;

/**
 *
 * @author XUANVINHTD
 */
public class UserAccountBO {
    
    private UserAccountDAO user;

    public UserAccountBO() throws Exception {
        this.user = new UserAccountDAO();
    }
    public boolean isUserExit(UserAccountDTO userDTO) throws Exception{
        try{
            return user.isUserExit(userDTO.getUsername(), userDTO.getPassword());
        }catch(Exception e){
           return false;
        }finally{
            user.closeConnection();
        }    
    }
    
    public boolean isChangePassword(UserAccountDTO userDTO) throws Exception{
        try{
        return user.isChangePassWord(userDTO.getUsername(), userDTO.getPassword(), userDTO.getPasswordNew());
        }catch(Exception e){
            return false;
        }finally{
            user.closeConnection();
        }    
    }
}
