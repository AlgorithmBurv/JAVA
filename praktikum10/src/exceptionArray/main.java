/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionArray;

/**
 *
 * @author 62813
 */
public class main {
    public static void main(String[] args) {
        int bil = 10;
        String b []= {"a","b","c"};
        try{
            System.out.println(bil/0);
        }catch(ArithmeticException ai){
            System.out.println("Eror aritmatik");
            System.err.println(ai.getMessage());
        }
        
        try{
            System.out.println(b[77]);
        }catch(ArrayIndexOutOfBoundsException n){
            System.out.println("Eror karena melebihi kapasitas array");
            System.err.println(n.getMessage());
        }
    }
}
