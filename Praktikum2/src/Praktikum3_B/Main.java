/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3_B;

import java.util.Scanner;

/**
 *
 * @author 62813
 */
public class Main {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */

    /**
     *
     * @author 62813
     */
    public static void main(String[] args) {
        int nilai;
        System.out.println("===Program Pengecekan Bilangan Positif Negatif===\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai anda = ");
        nilai = input.nextInt();

        if (nilai < 0) {
            System.out.println("Nilai yang Anda masukkan 'NEGATIF'");
        } else if (nilai == 0) {
            System.out.println("Nilai yang Anda masukkan 'NOL/NETRAL'");
        } else {
            System.out.println("Nilai yang Anda masukkan 'POSITIF'");

        }
    }

}
