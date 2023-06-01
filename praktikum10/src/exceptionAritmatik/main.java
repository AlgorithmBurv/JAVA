/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionAritmatik;

/**
 *
 * @author 62813
 */
public class main {

    public static void main(String[] args) {
        int x = 6, y = 2;

//        System.out.println(x + "/" + y + " = " + (x/y));
//        
//        y = 0;
//        
//        System.out.println(x + "/" + y + " = " + (x/y));
//        System.out.println("Selesai");


//        try {
//            System.out.println(x + "/" + y + " = " + (x / y));
//            y = 0;
//            System.out.println(x + "/" + y + " = " + (x / y));
//        }catch(Exception e){
//            System.err.println("Terjadi pembagian dengan nol");
//        }
//        System.out.println("Selesai");


       try {
           System.out.println(x + "/" + y + " = " + (x / y));
           y = 0;
           System.out.println(x + "/" + y + " = " + (x / y));
       }catch(Exception e){
            System.err.println("Pesan: " + e.getMessage());
            e.printStackTrace();
       }
      System.out.println("Selesai");
   }



}
