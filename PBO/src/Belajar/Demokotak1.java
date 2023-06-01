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

class Demokotak1 {
        public static void main(String[] args) {
            double volume;
            Kotak k = new Kotak();
            
            //Mengisikan nilai kedalam data2 kelas .kotak            
            k.panjang = 4;
            k.lebar = 3;
            k.tinggi = 2;
            //Menghitung isi/volume kotak
            volume = k.panjang * k.lebar * k.tinggi;
            //Menampilkan  nilai volume ke layar monitor
            System.out.println("Volume Kotak = " + volume);
        }

    }

