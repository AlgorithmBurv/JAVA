/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3_A;

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

    public static void main(String[] args) {
        int nilai;
        System.out.println("===Program Konversi Nilai===\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai anda (0-100) = ");
        nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {

            System.out.println(" Nilai anda : A ");

        } else if (nilai >= 70 && nilai <= 84) {

            System.out.println(" Nilai anda : B ");

        } else if (nilai >= 60 && nilai < 70) {

            System.out.println(" Nilai anda : C ");

        } else if (nilai >= 50 && nilai < 60) {

            System.out.println(" Nilai anda : D ");

        }else if (nilai < 50) {

            System.out.println(" Nilai anda : E ");

        } else {
            System.out.println(" Pilihan Salah ");

        }
    }
}

    

