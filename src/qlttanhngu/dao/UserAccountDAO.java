/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.dao;

import qlttanhngu.connection.DataBase;

/**
 *
 * @author XUANVINHTD
 */
public class UserAccountDAO extends DataBase{
    
    public UserAccountDAO() throws Exception{
        super();
    }
    
    public boolean isUserExit(String username, String passwork){
        return true;
    }
}
