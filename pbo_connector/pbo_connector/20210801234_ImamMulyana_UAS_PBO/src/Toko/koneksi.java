
package Toko;
//20210801234_Imam Mulyana_PBO_TI
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/toko";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Terhubung Ke Database");
            } catch (Exception e) {
                System.out.println("Gagal Terhubung Ke Database");
            }
        }
        return koneksi;
    }
    public static void main(String args[]){
        getKoneksi();
    }  
}
