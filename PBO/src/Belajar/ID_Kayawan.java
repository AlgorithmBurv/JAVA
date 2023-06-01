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
public class ID_Kayawan {

    public static void main(String[] args) {
        Karyawan Aurel = new Karyawan();
        Karyawan Panjul = new Karyawan();
        Aurel.ID = "K001";
        Aurel.divisi = "Marketing";
        Aurel.nama = "Aurel";
        Aurel.gaji = (double) 25000000;
        Panjul.ID = "K031";
        Panjul.divisi = "Manager";
        Panjul.nama = "Panjul";
        Panjul.gaji = (double) 850000000;
        Aurel.cetakdata();
        Panjul.cetakdata();
        System.out.println("Sumbangan : " + Aurel.hitungsumbanganzakat());
        System.out.println("Sumbangan : " + Panjul.hitungsumbanganzakat());
        /*System.out.println("Data Karyawan");
        System.out.println("ID : " + Aurel.ID);
        System.out.println("Nama : " + Aurel.nama);
        System.out.println("Divisi : " + Aurel.divisi);
        System.out.println("Gaji : " + Aurel.gaji);

        System.out.println("\nData Karyawan");
        System.out.println("ID : " + Panjul.ID);
        System.out.println("Nama : " + Panjul.nama);
        System.out.println("Divisi : " + Panjul.divisi);
        System.out.println("Gaji : " + Panjul.gaji);
         */
    }
}
