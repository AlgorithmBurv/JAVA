
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2;

import java.util.Scanner;

class BangunRuang {

    double jumlah;
    double jumlah2;

    void MenuOperasi() {
        System.out.println("=== Menu Operasi Bangun Ruang ===\n");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Prisma Segitiga");
        System.out.println("4. Exit");
    }

    void Main(double jumlah, double jumlah2) {
        this.jumlah = jumlah;
        this.jumlah2 = jumlah2;
    }

    class Kubus extends BangunRuang {

        double rusuk;
        double jumlah;
        double jumlah2;

        Kubus() {
            this.rusuk = 0;
            this.jumlah = 0;
            this.jumlah2=0;
        }

        double luaspermukaan(double rusuk, double jumlah) {
            System.out.println("Luas Permukaan Kubus\n");
            this.rusuk = rusuk;
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Rusuk: ");
            rusuk = input.nextInt();

            this.jumlah = rusuk * rusuk * 6;
            return this.jumlah;
        }

        double volume(double rusuk, double jumlah2) {
            System.out.println("Volume Kubus\n");
            this.rusuk = rusuk;
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Rusuk: ");
            rusuk = input.nextInt();
            this.jumlah2 = jumlah2;
            this.jumlah2 = rusuk * rusuk * rusuk;
            return this.jumlah2;
        }

    }

    class Balok extends BangunRuang {

        double panjang;
        double lebar;
        double tinggi;
        double jumlah;
        double jumlah2;
        Balok() {
            this.panjang = 0;
            this.lebar = 0;
            this.tinggi = 0;
            this.jumlah = 0;
            this.jumlah2 =0;
        }

        double luaspermukaan(double panjang, double lebar, double tinggi, double jumlah) {
            System.out.println("Luas Permukaan Balok\n");
            this.panjang = panjang;
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Panjang: ");
            panjang = input.nextInt();
            this.lebar = lebar;
            Scanner input1 = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Lebar: ");
            panjang = input1.nextInt();
            this.tinggi = tinggi;
            Scanner input2 = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Tinggi: ");
            tinggi = input2.nextInt();
            this.jumlah = 2 * panjang * lebar + 2 * lebar * tinggi + 2 * panjang * tinggi;
            return this.jumlah;
        }

        double volume(double panjang, double lebar, double tinggi, double jumlah2) {
            System.out.println("Volume Balok\n");
            this.panjang = panjang;
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Panjang: ");
            panjang = input.nextInt();
            this.lebar = lebar;
            Scanner input1 = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Lebar: ");
            lebar = input1.nextInt();
            this.tinggi = tinggi;
            Scanner input2 = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Tinggi: ");
            tinggi = input2.nextInt();
            this.jumlah2 = panjang * lebar * tinggi;
            return this.jumlah2;
        }
    }

    class PrismaSegitiga extends BangunRuang {

        double luasalas;
        double kelilingalas;
        double tinggi;
        double jumlah;
        double jumlah2;
                PrismaSegitiga() {
            this.luasalas = 0;
            this.kelilingalas = 0;
            this.tinggi = 0;
            this.jumlah = 0;
            this.jumlah2 = 0;
        }

        double luaspermukaan(double luasalas, double tinggi, double kelilingalas, double jumlah) {
            System.out.println("Luas Permukaan Perisma Segitiga\n");
            this.luasalas = luasalas;
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Luas Alas: ");
            luasalas = input.nextInt();

            this.kelilingalas = kelilingalas;
            Scanner input2 = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Keliling Alas:: ");
            kelilingalas = input2.nextInt();
            this.tinggi = tinggi;
            this.jumlah = jumlah;
            this.jumlah = (2 * luasalas) + (kelilingalas * tinggi);
            return this.jumlah;
        }

        double volume(double luasalas, double tinggi, double jumlah2) {
            System.out.println("Volume Perisma Segitiga\n");
            this.luasalas = luasalas;
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Luas Alas: ");
            luasalas = input.nextInt();

            this.tinggi = tinggi;
            Scanner input2 = new Scanner(System.in);
            System.out.println("\nMasukkan Nilai Tinggi: ");
            tinggi = input2.nextInt();
            this.jumlah2 = jumlah2;
            this.jumlah2 = luasalas * tinggi;
            return this.jumlah2;
        }
    }
}

public class soal2 {

    public static void main(String[] args) {
        int pil = 0;
        BangunRuang bangun1 = new BangunRuang();
        Kubus kubus1 = new Kubus();
        Balok balok1 = new Balok();
        PrismaSegitiga prisma1 = new PrismaSegitiga();
        while (true) {
            bangun1.MenuOperasi();
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukkan Pilihan Operasi: ");
            pil = input.nextInt();

            if (pil == 1) {
                kubus1.volume(0,0);
                System.out.println("Volume Kubus Adalah: " + kubus1.jumlah2);
                kubus1.luaspermukaan(0, 0);
                System.out.println("Luas Permukaan Kubus Adalah: " + kubus1.jumlah);
                
            } else if (pil == 2) {
                balok1.luaspermukaan(0,0,0,0);
                System.out.println("Luas Permukaan Balok Adalah: " + balok1.jumlah);
                balok1.volume(0,0,0,0);
                System.out.println("Volume Balok Adalah: " + balok1.jumlah2);

            } else if (pil == 3) {
                prisma1.luaspermukaan(0, 0, 0, 0);
                System.out.println("Luas Permukaan Perisma Segitiga Adalah: " + prisma1.jumlah);
                prisma1.volume(0, 0, 0, 0);
                System.out.println("Volume Perisma Segitiga Adalah: " + prisma1.jumlah2);
            } else {
                System.out.println("Program selesai...");
                break;
            }
        }
    }
}
