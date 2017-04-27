/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.control;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 *
 * @author ASUS TP 450 LDV
 */
public class login_koneksi {
 private static com.mysql.jdbc.Connection koneksi;
    public static com.mysql.jdbc.Connection GetConnection() throws SQLException { 
        if (koneksi == null) {
            Driver driver = new Driver(); 
            koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/toko? zeroDateTimeBehavior=convertToNull", "root", ""); 
        } 
        return koneksi; 
    } 
}
