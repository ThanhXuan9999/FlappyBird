/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {
    
    public static Connection conn = null;
    public static String userID ="";
    public static String name ="";
    public static int role = 0;
    
    public static String getConnection(){
        String connString ="jdbc:sqlserver://ADMIN\\SQLEXPRESS;databaseName=Game1;user=sa;";
        String kq ="";
        try{
            conn = DriverManager.getConnection(connString);
        } catch (SQLException ex){
            kq = "Lỗi kết nối CSDL: " + ex;
        }
        return kq;
    }
    
      public static String MD5(String str){
        String kq;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            BigInteger bigInteger = new BigInteger(1, md.digest());
            kq = bigInteger.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            kq = "";
        }
        return kq;
    }

}
