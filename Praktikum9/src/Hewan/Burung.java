/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author 62813
 */
public class Burung extends Hewan {

    Burung(String jenisx, String cirix) {
        super(jenisx, cirix);
    }

    public void show() {
        System.out.println("\t====Burung====");
        System.out.println("Jenis \t\t: " + this.jenis);
        System.out.println("Ciri-ciri \t: " + this.ciri);
    }

    public void suara() {
        System.out.println("Suara\t\t: Cku kur, Cku kur,Cku kur");
    }

    public void berjalan() {
        System.out.println("Berjalan\t: Terbang");
    }
}
