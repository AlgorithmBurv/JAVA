/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3_C;

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

    public static void main (String[]args){
        int  nilai;
         System.out.println("===Pengecekan Bilangan Ganjil Genap===\n ");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai anda = ");
        nilai = input.nextInt();
        
        if (nilai % 2 == 1){
            System.out.println ("Nilai Bilangan Ganjil");
        }else {System.out.println ("Nilai Bilangan Genap");
            
        }
    }
}

