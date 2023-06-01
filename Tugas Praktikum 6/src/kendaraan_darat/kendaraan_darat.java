/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan_darat;

/**
 *
 * @author 62813
 */
public class kendaraan_darat {

    protected int no_registrasi;
    protected String pabrikan;
    protected String NaKer;
    protected String tahun_produksi;
    protected String bahan_bakar;
    protected String warna;
    protected int kecepatan;
    protected int harga;

    kendaraan_darat(int noken, String pabrik, String nama, String tapro, String BBM, String warnax, int flash, int price) {
        no_registrasi = noken;
        pabrikan = pabrik;
        NaKer = nama;
        tahun_produksi = tapro;
        bahan_bakar = BBM;
        warna = warnax;
        kecepatan = flash;
        harga = price;
    }

    public void view() {

        System.out.println("No Registrasi\t: " + no_registrasi);
        System.out.println("Merk\t\t: " + pabrikan);
        System.out.println("Nama Kendaraan\t: " + NaKer);
        System.out.println("Tahun produksi\t: " + tahun_produksi);
        System.out.println("Bahan Bakar\t: " + bahan_bakar);
        System.out.println("Warna\t\t: " + warna);
        System.out.println("Kecepatan MAX\t: " + kecepatan + " KM");

    }
    
}
