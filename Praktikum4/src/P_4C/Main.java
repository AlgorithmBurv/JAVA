/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_4C;

import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Main {

    public static void main(String[] args) {

        String data_i = JOptionPane.showInputDialog("Masukkan Bilangan (1) =");
        int i = Integer.parseInt(data_i);
        if (i == 1) {
            do {
                System.out.println(i);
                i++;

            } while (i < 9);
            if (i == 9) {
                for (int a = 10; a < 21; a++) {
                    System.out.print(a + " ");
                }
            }
        } else {
            System.out.println("Bilangan Yang Anda Masukkan Salah...");
        }
    }
}
