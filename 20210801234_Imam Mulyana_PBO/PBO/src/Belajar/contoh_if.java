/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar;

/**
 *
 * @author 62813
 */
import javax.swing.JOptionPane;

public class contoh_if {
    
    public static void main (String []args){
        String data_ID = JOptionPane.showInputDialog("Masukkan tekanan darah"+" sistolik Anda (mmHg)");
        int TekananDarah = Integer.parseInt(data_ID);
        if (TekananDarah > 140){
        System.out.println("Anda Hipertensi");
        }
    }
           
    
}
