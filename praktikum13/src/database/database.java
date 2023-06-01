/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
/**
 *
 * @author 62813
 */
public class database {
    
}
class connect {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/pegawai";
        String user ="root";
        String pass = "";
        try{
            Connection conn = DriverManager.getConnection(URL, user, pass);
            System.out.println("Sukses");
            conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}