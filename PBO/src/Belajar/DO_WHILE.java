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
public class DO_WHILE {

    public static void main(String[] args) {

        // deklarasi variabel
        int i = 1;
        int bil[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        do {
            System.out.println("" + i);
            i++;
        } while (i <= 8);
        for (int x : bil) {
            System.out.print(x + " ");

        }

    }
}