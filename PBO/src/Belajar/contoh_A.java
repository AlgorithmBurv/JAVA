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
public class contoh_A {

    public static void main(String[] args) {

        int jumlah = 0;

        String data_B = JOptionPane.showInputDialog("Masukkan Bilangan =");
        int B = Integer.parseInt(data_B);
        for (int i = 1; i < B; i++) {
            if (i % 2 == 1) {
                jumlah = jumlah + i;
                System.out.print(" " + i);
            } else {
                jumlah = jumlah + i;
                System.out.print(" " + i);

            }

        }

    }
}
