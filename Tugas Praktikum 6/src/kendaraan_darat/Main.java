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
public class Main {

    public static void main(String[] args) {
        System.out.println("====================================\n20210801234 Imam Mulyana\n====================================\n");

        mobil mob = new mobil(12345, "Honda", "HR-V", "2022/10/2", "Bensin", "Putih", 220, 20000, "SUV", 4, "Terbuka", "Polyvinyl Chloride (PVC)");
        motor mot = new motor(54321, "Yamaha", "WR450F", "2020/3/4", "Bensin", "Biru", 120, 15000, "Trail", "Scramblerfg", "Knalpot Akrapovic");
        sepeda ped = new sepeda(67890, "Polygon", "Xtrada", "2021/12/23", "Energi Kinetik", "Abu-Abu", 35, 5000, "Downhill", "Pedal Toe Clif", "Chromoly");

        mob.view();
        mob.view_mobil();
        mob.transaksimobil();
        System.out.print("\n");
        mob.setJenis_mobil("MPV");
        mob.getJenis_mobil();
        mob.setJumlah_stroke(2);
        mob.getJumlah_stroke();
        mob.setJenis_atap("Tertutup");
        mob.getJenis_atap();
        mob.setBumper("Polypropylene");
        mob.getBumper();
        mob.view_mobil();
        mob.transaksimobil();
        System.out.println("====================================");

        mot.view();
        mot.view_motor();
        mot.transaksimotor();
        System.out.print("\n");
        mot.setJenis_motor("Skuter");
        mot.getJenis_motor();
        mot.setJenis_stang("Chumps");
        mot.getJenis_stang();
        mot.setJenis_knalpot("Knalpot DBS");
        mot.getJenis_knalpot();
        mot.view_motor();
        mot.transaksimotor();
        System.out.println("====================================");

        ped.view();
        ped.view_sepeda();
        ped.transaksispeda();
        System.out.print("\n");
        ped.setJenis_sepeda("BMX");
        ped.getJenis_sepeda();
        ped.setJenis_pedal("Pedal Flat");
        ped.getJenis_pedal();
        ped.setJenis_kerangka("Hi-Ten Steel");
        ped.getJenis_kerangka();
        ped.view_sepeda();
        ped.transaksispeda();
        System.out.println("====================================");
    }
}
