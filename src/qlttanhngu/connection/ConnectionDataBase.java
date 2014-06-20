/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttanhngu.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author XUANVINHTD
 */
public class ConnectionDataBase
{
     public static String dbURL;
     public static String dbUserName;
     public static String dbPassword; 
     
      protected static void loadJDBCDriver() throws Exception 
      {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            throw new Exception("SQL JDBC Driver not found ...");
        }
      }
      
       public static Connection getConnection() throws Exception {
        Connection connect = null;
        dbURL = ""
                + "jdbc:mysql://localhost:3306/"
                + "qlttanhngu?useUnicode=true&characterEncoding=UTF-8";
        dbUserName = "root";
        dbPassword = "123456";
        if (connect == null) 
        {
            loadJDBCDriver();
            try {
                connect = DriverManager.getConnection(
                        dbURL, dbUserName, dbPassword);
            } catch (java.sql.SQLException e) {
                throw new Exception("Can not access to Database Server ..." + dbURL + e.getMessage());
            }
        }
        return connect;
    }    
}
