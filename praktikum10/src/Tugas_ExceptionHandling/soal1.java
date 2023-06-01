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
public class soal1 {

    public static void main(String[] args) {
        System.out.println("Nama : Imam Mulyana \nNIM : 20210801234\n");
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Masukkan inputan fahrenheit: ");
        String input1 = UserInput.nextLine();

        try {
            double data1 = Double.parseDouble(input1);
            double fahrenheit = (9.0 * data1) / 5.0 + 32.0;
            System.out.println("Konversi Fahrenheit: " + fahrenheit + "F\n");

        } catch (Exception e) {

            System.err.println("Eror pada inputan: " + e.getMessage());
            e.printStackTrace();
            System.out.println("\nProgram Berakhir......");
        }
        
        
        System.out.print("Masukkan inputan celcius: ");
        String input2 = UserInput.nextLine();
        try {
            double data2 = Double.parseDouble(input2);
            double celcius = (data2 - 32.0) * 5.0 + 9.0;
            System.out.println("Konversi Celcius: " + celcius + "C");
        }catch(Exception e){
            System.err.println("Eror pada inputan: " + e.getMessage());
            e.printStackTrace();
            System.out.println("\nProgram Berakhir......");  
        }

    }

}
