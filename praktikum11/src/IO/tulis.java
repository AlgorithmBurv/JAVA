/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

/**
 *
 * @author 62813
 */
import java.io.*;

class DemoTulisFile {

    public static void main(String[] args) {
        FileOutputStream foutput = null;
        String data = "Hello Guys ! \n Semoga \nSukses selalu..3";
// membuka file
try {
            foutput = new FileOutputStream("d:/input.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File tidak dapat terbentuk.");
return; // keluar dari method
        }
// menulis data ke dalam file
        try {
            for (int i = 0; i < data.length(); i++) {
// data akan dikonversi per karakter
                foutput.write((int) data.charAt(i));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }
// menutup file
        try {
            foutput.close();
        } catch (IOException ioe) {
        }
    }
}
