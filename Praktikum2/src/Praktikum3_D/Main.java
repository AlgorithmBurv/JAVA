/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3_D;

import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Main {
    
    public static void main(String[] args) {

        System.out.println("SELAMAT DATANG DI RESTAURANT 'MAMA AA' ");
        System.out.println("=======================================");
        System.out.println("Disini Menyediakan Aneka Menu :\n ");
        System.out.println("1. Ayam Bakar = Rp. 25.000");
        System.out.println("2. Pecel Lele = Rp. 20.000");
        System.out.println("3. Seafood (Kerang-kerangan, Kepiting, Udang) Saus Padang = Rp. 30.000");
        System.out.println("4. Nasi Goreng Ayam = Rp. 15.000");
        System.out.println("5. Nasi Goreng Seafood = Rp. 18.000");
        System.out.println("6. Mie Goreng Spesial = Rp. 13.000 ");
        System.out.println("=======================================");

        String data_pil;
        String bayar;
        int pilihan;
        float total_bayar;

        float ppn = 2500;
        float jml_harga1 = 25000;
        float jml_harga2 = 20000;
        float jml_harga3 = 30000;
        float jml_harga4 = 15000;
        float jml_harga5 = 18000;
        float jml_harga6 = 13000;

        float total_harga1 = jml_harga1 + ppn;
        float total_harga2 = jml_harga2 + ppn;
        float total_harga3 = jml_harga3 + ppn;
        float total_harga4 = jml_harga4 + ppn;
        float total_harga5 = jml_harga5 + ppn;
        float total_harga6 = jml_harga6 + ppn;

        do {
            data_pil = JOptionPane.showInputDialog("Pilih Menu (1-6): \n");
        } while (data_pil.isEmpty() || !(Integer.parseInt(data_pil) >= 1 && Integer.parseInt(data_pil) <= 6));
        pilihan = Integer.parseInt(data_pil);
        do {
            bayar = JOptionPane.showInputDialog("Jumlah Nominal : Rp. ");
        } while (bayar.isEmpty());

        total_bayar = Float.parseFloat(bayar);

        float kembalian1 = total_bayar - total_harga1;
        float kembalian2 = total_bayar - total_harga2;
        float kembalian3 = total_bayar - total_harga3;
        float kembalian4 = total_bayar - total_harga4;
        float kembalian5 = total_bayar - total_harga5;
        float kembalian6 = total_bayar - total_harga6;

        switch (pilihan) {
            case 1: {
                System.out.println("Jumlah Harga : Rp. " + jml_harga1);
                System.out.println("PPN          : Rp. " + ppn);
                System.out.println("Total Harga  : Rp. " + total_harga1);
                System.out.println("Total Bayar  : Rp. " + total_bayar);
                System.out.println("Kembalian    : Rp. " + kembalian1);
                break;
            }
            case 2: {
                System.out.println("Jumlah Harga : Rp. " + jml_harga2);
                System.out.println("PPN          : Rp. " + ppn);
                System.out.println("Total Harga  : Rp. " + total_harga2);
                System.out.println("Total Bayar  : Rp. " + total_bayar);
                System.out.println("Kembalian    : Rp. " + kembalian2);
                break;
            }
            case 3: {
                System.out.println("Jumlah Harga : Rp. " + jml_harga3);
                System.out.println("PPN          : Rp. " + ppn);
                System.out.println("Total Harga  : Rp. " + total_harga3);
                System.out.println("Total Bayar  : Rp. " + total_bayar);
                System.out.println("Kembalian    : Rp. " + kembalian3);
                break;
            }
            case 4: {
                System.out.println("Jumlah Harga : " + jml_harga4);
                System.out.println("PPN          : " + ppn);
                System.out.println("Total Harga  : " + total_harga4);
                System.out.println("Total Bayar  : " + total_bayar);
                System.out.println("Kembalian    : " + kembalian4);
                break;
            }
            case 5: {
                System.out.println("Jumlah Harga : Rp. " + jml_harga5);
                System.out.println("PPN          : Rp. " + ppn);
                System.out.println("Total Harga  : Rp. " + total_harga5);
                System.out.println("Total Bayar  : Rp. " + total_bayar);
                System.out.println("Kembalian    : Rp. " + kembalian5);
                break;
            }
            case 6: {
                System.out.println("Jumlah Harga : Rp. " + jml_harga6);
                System.out.println("PPN          : Rp. " + ppn);
                System.out.println("Total Harga  : Rp. " + total_harga6);
                System.out.println("Total Bayar  : Rp. " + total_bayar);
                System.out.println("Kembalian    : Rp. " + kembalian6);
                break;
            }
            default: {
                break;
            }

        }
        System.out.println("=======================================");
        System.out.println("Terimakasih Telah Datang, Sampai Jumpa Kembali.....");
    }
}

