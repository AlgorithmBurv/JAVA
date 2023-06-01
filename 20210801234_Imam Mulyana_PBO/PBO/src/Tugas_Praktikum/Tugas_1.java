/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Praktikum;

/**
 *
 * @author 62813
 */
import java.util.Scanner;
public class Tugas_1 {
    
    public static void main (String[]args){
        int a;
        int b;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Angka 1 = ");
        a = input.nextInt();
        System.out.println("Angka 2 = ");
        b = input.nextInt();

        int hasil    = a + b;
        int hasil1   = a - b;
        int hasil2   = a * b;
        float hasil3 = a / b;
        int hasil4   = a % b;

        
        
        
        
        System.out.println("Penjumlahan : "+a+" + "+b+" = "+hasil);
        System.out.println("Pengurangan : "+a+" - "+b+" = "+hasil1);
        System.out.println("Perkalian   : "+a+" x "+b+" = "+hasil2);
        System.out.println("Pembagian   : "+a+" / "+b+" = "+hasil3);
        System.out.println("Modulo      : "+a+" % "+b+" = "+hasil4+"\n");
        
        boolean statement1 = hasil % 2 >= hasil3 % 2 && hasil4 % 2 <= hasil2 % 2;
        boolean statement2 = hasil2 % 2 == hasil1 || hasil % 4 == hasil1;
        boolean statement3 = hasil <= hasil1 + hasil3 && hasil2 >= hasil4 + hasil1;
        boolean statement4 = !(hasil2 > hasil) && hasil1 < hasil3;
        boolean statement5 = hasil + hasil2 >= hasil1++ + hasil4--;
      

        System.out.println("Statement 1 : Penjumlahan % 2 >= Pembagian % 2 AND Modulo % 2 <= Perkalian % 2 -> "+statement1 );
        System.out.println("Statement 2 : Perkalian % 2 == Pengurangan  OR % 4 == Kurang ->"+statement2);
        System.out.println("Statement 3 : Penjumlahan <= Pengurangan + Pembagian AND Perkalian >= Modulo + Pengurangan -> "+statement3);
        System.out.println("Statement 4 : !(Perkalian) > Penjumlahan) AND Pengurangan  < Pembagian -> "+statement4);
        System.out.println("Statement 5 : Penjumlahan + Perkalian  >= Pengurangan++ + Modulo-- -> "+statement5);
    }
}
