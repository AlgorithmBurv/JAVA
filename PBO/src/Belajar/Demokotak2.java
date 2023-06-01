/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar;

class Kotak {

    double panjang;
    double lebar;
    double tinggi;
}

public class Demokotak2 {

    public static void main(String[] args) {
        double volume, volume2;

        Kotak k1 = new Kotak(); //Mendeklarasikan objek 1
        Kotak k2 = new Kotak(); //Mendeklarasikan objek 2
        //Mengisikan nilai kedalam objek k1
        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;
         //Mengisikan nilai kedalam objek k2
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;
        //Menghitung isi/volume dari objek k1
        volume = k1.panjang * k1.tinggi * k1.lebar;
         //Menghitung isi/volume dari objek k2
         volume2 = k2.panjang * k2.tinggi * k2.lebar;
         //Menampilkan nilai dari objek k1 dan k2
         System.out.println("Volume Kotak1 = "+volume);
         System.out.println("Volume Kotak2 = "+volume2);
    }
}
