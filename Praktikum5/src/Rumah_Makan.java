
import java.util.Scanner;

class RM {

    int pil;
    double harga = 0, PPN, totalharga, totalbayar, kembalian;
    String NamaProduk;

}

public class Rumah_Makan {
    public static void main(String[] args) {
        RM Pamflet = new RM();
        RM uang = new RM();
        RM pembeli = new RM();
        Scanner scan = new Scanner(System.in);

        System.out.print("\n SELAMAT DATANG DI RESTAURANT DAPUR LARISA");
        System.out.println("\n DISINI MENYEDIAKAN ANEKA MENU ");
        System.out.print("\n 1. AYAM BAKAR ");
        System.out.print("\n 2. PECEL LELE ");
        System.out.print("\n 3. SEAFOOD (KERANG-KERANGAN, KEPITING,UDANG) SAUS PADANG ");
        System.out.print("\n 4. NASI GORENG AYAM ");
        System.out.print("\n 5. NASI GORENG SEAFOOD ");
        System.out.print("\n 6. MIE GORENG SPESIAL ");
        System.out.print("\n Pilih menu : ");
        pembeli.pil = scan.nextInt();
        switch (pembeli.pil) {
            case 1:
                Pamflet.NamaProduk = "AYAM BAKAR ";
                uang.harga = 25000;
                break;

            case 2:
                Pamflet.NamaProduk = "PECEL LELE ";
                uang.harga = 18000;
                break;

            case 3:
                Pamflet.NamaProduk = "SEAFOOD (KERANG-KERANGAN, KEPITING, UDANG)SAUS PADANG ";
                uang.harga = 80000;
                break;

            case 4:
                Pamflet.NamaProduk = "NASI GORENG AYAM ";
                uang.harga = 20000;
                break;

            case 5:
                Pamflet.NamaProduk = "NASI GORENG SEAFOOD ";
                uang.harga = 28000;
                break;

            case 6:
                Pamflet.NamaProduk = "MIE GORENG SPESIAL ";
                uang.harga = 30000;
                break;
            default:
                System.out.println("Maaf, pilihan tidak tersedia");
        }
        uang.PPN = uang.harga * 0.10;
        uang.totalharga = uang.harga + uang.PPN;
        System.out.println("\nJumlah Harga : Rp " + uang.harga);
        System.out.println("\nPPN : Rp " + uang.PPN);
        System.out.println("\nTotal Harga : Rp " + uang.totalharga);
        System.out.print("\nTotal Bayar : Rp ");
        uang.totalbayar = scan.nextInt();
        uang.kembalian = uang.totalbayar - uang.totalharga;
        System.out.println("\nKembalian : Rp " + uang.kembalian);
    }
}
