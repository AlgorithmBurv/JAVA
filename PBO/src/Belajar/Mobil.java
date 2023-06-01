/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar;

/**
 *
 * @author 62813
 */
public class Mobil {

    String namamobil;
    String warna;
    int tahunproduksi;

    void printmobil() {
        System.out.println("Warna : " + warna);
        System.out.println("Warna : " + tahunproduksi);
        System.out.println("Warna : " + namamobil);
    }
     public static void main(String[] args) {
        Mobil sedan = new Mobil();
        
        sedan.warna = "Hitam";
        sedan.tahunproduksi = 2006;
        sedan.namamobil = "xenia";
        sedan.printmobil();
    }

}
