/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gudang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author THINKPAD
 */
public class Koneksi {
     // Belum membuat close connection
    // Informasi koneksi database
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/limangatusDB";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "20040228";

    // Metode untuk membuat koneksi ke database
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}

//public class Koneksi {
//    private static Connection postgresConfig;
//    public static Connection connect()throws SQLException{
//        try {
//            String url="jdbc:postgresql://localhost:5432/DBL_A_M4_09010622015"; //url database
//            String user="postgres"; //user database
//            String pass="20040228"; //password database
//            postgresConfig = DriverManager.getConnection(url, user, pass);            
//        } catch (Exception e) {
//            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
//        }
//        return postgresConfig;
//    }    
//}