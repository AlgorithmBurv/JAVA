/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar;

import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class while_ {
    public static void main(String[] args) {
        int i=0, jumgenap=0, jumganjil =0;
        boolean ulang = true;
        while (ulang){
            String data_n = JOptionPane.showInputDialog("Masukkan Bilangan = ");
            int N = Integer.parseInt(data_n);
            if (N>0){
                if(N%2==0){
                    jumgenap=jumgenap+1;
                }else{
                    jumganjil=jumganjil+1;
                }
                i=i+1;
                System.out.println("Banyaknya bilangan genap sampai iterasi ke " + i + " = " + jumgenap);
                System.out.println("Banyaknya bilangan ganjil sampai iterasi ke " + i + " = " + jumganjil);
            }else{
                ulang = false;
            }
           
        }
         System.out.println("Perulanagn Selesai");
    }
    
}
