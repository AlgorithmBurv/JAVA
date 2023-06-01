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
public class segitiga extends bangun {

    int  tinggi, alas;

    segitiga( int tinggix, int alasx, int jumlahx) {
        super(jumlahx);
      
        tinggi = tinggix;
        alas = alasx;

    }

    public void view_segitiga() {
      
        System.out.println("tinggi : " + tinggi);
        System.out.println("alas : " + alas);
        
    }
      public void luas_segitiga() {
        int jumlah = 1/2 * alas * tinggi;
          System.out.println("jumlah "+jumlah);
        
    }
}
