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
public class Karyawan {

    String ID, nama, divisi;
    Double gaji;

    void cetakdata() {
        System.out.println("Data Karyawan");
        System.out.println("ID : " + ID);
        System.out.println("Nama : " + nama);
        System.out.println("Divisi : " + divisi);
        System.out.println("Gaji : " + gaji);

        System.out.println("\nData Karyawan");
        System.out.println("ID : " + ID);
        System.out.println("Nama : " + nama);
        System.out.println("Divisi : " + divisi);
        System.out.println("Gaji : " + gaji);
    }
    double hitungsumbanganzakat(){
        double zakat = gaji * 0.025;
        return zakat;
    }
        
        
    


        

    
}
