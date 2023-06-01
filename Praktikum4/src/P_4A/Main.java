/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_4A;

import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Main {

    public static void main(String[] args) {

        String data_A = JOptionPane.showInputDialog("Masukkan Bilangan (30)=");
        int A = Integer.parseInt(data_A);

        if (A == 30) {
            for (int i = A; i > 15; i--) {
                System.out.print(" " + i);
            }
            for (int b = 1; b < 16; b++) {
                System.out.print(" " + b);
            }
        } else {
            System.out.print("Bilangan Yang Anda Masukkan Salah...");
        }
    }
}
