/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_4B;

import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Main {

    public static void main(String[] args) {
        int jml = 0;
        int jml_2 = 0;
        System.out.print("===Program Deretan Angka Ganjil & Genap===\n\t===Beserta Penjumlahannya===\n\n");
        String data_B = JOptionPane.showInputDialog("Masukkan Bilangan Ganjil =");
        int B = Integer.parseInt(data_B);
        for (int i = 1; i <= B; i++) {
            if (i % 2 == 1) {
                jml = jml + i;
                System.out.print(" " + i);
            }

        }
        System.out.print(" = " + jml);
        System.out.println("\n===================================");

        String data_D = JOptionPane.showInputDialog("Masukkan Bilangan Genap =");
        int D = Integer.parseInt(data_D);
        for (int i = 1; i <= D; i++) {
            if (i % 2 == 0) {
                jml_2 = jml_2 + i;
                System.out.print(" " + i);
            }

        }
        System.out.print(" = " + jml_2+" \n");
    }
}
