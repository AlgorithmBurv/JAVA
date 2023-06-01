package soal_1;

import java.util.Scanner;

class Calculator {

    double input1;
    double input2;
    double jumlah;

    void MenuOperasi() {
        System.out.println("\n=== Menu Calculator ===\n");
        System.out.println("1. Pertambahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian ");
        System.out.println("4. Modulus ");
        System.out.println("5. Exit ");
    }

    Calculator() {
        this.input1 = 0;
        this.input2 = 0;
    }

    double Pertambahan(double Angka1, double Angka2, double jumlah) {
        System.out.println("===Penjumlahan===\n");
        this.input1 = Angka1;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-1: ");
        Angka1 = input1.nextDouble();
        this.input2 = Angka2;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-2: ");
        Angka2 = input2.nextDouble();
        this.jumlah = Angka1 + Angka2;
        return this.jumlah;

    }

    double Pengurangan(double Angka1, double Angka2, double jumlah) {
        System.out.println("===Pengurangan===\n");
        this.input1 = Angka1;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-1: ");
        Angka1 = input1.nextDouble();
        this.input2 = Angka2;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-2: ");
        Angka2 = input2.nextDouble();
        this.jumlah = Angka1 - Angka2;
        return this.jumlah;
    }

    double Perkalian(double Angka1, double Angka2, double jumlah) {
        System.out.println("===Perkalian===\n");
        this.input1 = Angka1;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-1: ");
        Angka1 = input1.nextDouble();
        this.input2 = Angka2;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-2: ");
        Angka2 = input2.nextDouble();
        this.jumlah = Angka1 * Angka2;
        return this.jumlah;

    }

    double Modulus(double Angka1, double Angka2, double jumlah) {
        System.out.println("===Modulus===\n");
        this.input1 = Angka1;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-1: ");
        Angka1 = input1.nextDouble();
        this.input2 = Angka2;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-2: ");
        Angka2 = input2.nextDouble();
        this.jumlah = Angka1 % Angka2;
        return this.jumlah;

    }

    void Main(double jumlah) {
        this.jumlah = jumlah;

    }
}

public class soal_1 {

    public static void main(String[] args) {
        int pilihan;
        Calculator calculator1 = new Calculator();
        

        while (true) {
            calculator1.MenuOperasi();
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukkan Pilihan Operasi: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                calculator1.Pertambahan(0, 0, 0);
                System.out.println("Hasil Penjumlahan: " + calculator1.jumlah);
            } else if (pilihan == 2) {
                calculator1.Pengurangan(0, 0, 0);
                System.out.println("Hasil Pengurangan: " + calculator1.jumlah);
            } else if (pilihan == 3) {
                calculator1.Perkalian(0, 0, 0);
                System.out.println("Hasil Perkalian: " + calculator1.jumlah);
            } else if (pilihan == 4) {
                calculator1.Modulus(0, 0, 0);
                System.out.println("Hasil Modulus: " + calculator1.jumlah);
            } else {
                System.out.println("Program Selesai...");
                break;
            }
        }

    }
}
