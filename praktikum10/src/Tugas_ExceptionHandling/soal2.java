/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author 62813
 */
public class soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : Imam Mulyana \nNIM : 20210801234\n");
        System.out.println("====Area L====");
        System.out.print("Masukkan panjang: ");
        String panjang = input.nextLine();
        System.out.print("Masukkan lebar: ");
        String lebar = input.nextLine();

        try {
            double a = Double.parseDouble(panjang);
            double b = Double.parseDouble(lebar);
            double jumlah1 = a * b;
            System.out.println("Area L: " + jumlah1);

        } catch (Exception e) {

            System.err.println("Eror pada inputan: : " + e.getMessage());
            e.printStackTrace();
            System.out.println("\nProgram Berakhir......");
        }

        System.out.println("====Area B====");
        System.out.print("Masukkan panjang: ");
        String panjang1 = input.nextLine();
        System.out.print("Masukkan lebar: ");
        String lebar1 = input.nextLine();
        try {
            double c = Double.parseDouble(panjang1);
            double d = Double.parseDouble(lebar1);
            double jumlah2 = c * d;
            System.out.println("Area B: " + jumlah2);
        } catch (Exception e) {

            System.err.println("Ada kesalahan penulisan tipe data : " + e.getMessage());
            e.printStackTrace();
            System.out.println("\nProgram Berakhir......");
        }
    }
}
