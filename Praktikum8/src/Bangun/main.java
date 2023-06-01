/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun;

/**
 *
 * @author 62813
 */
public class main {
    public static void main(String[] args) {
        segitiga SG = new segitiga (5,4,6);
        persegi_panjang PP = new  persegi_panjang(4,4,4);
        
        System.out.println("Operasi Segitiga");
        SG.view_segitiga();
        SG.luas_segitiga();
        System.out.println("Operasi Persegi Panjnag");
        PP.view_persegi_panjang();
        PP.luas_persegi_panjang();
        
    }
}
