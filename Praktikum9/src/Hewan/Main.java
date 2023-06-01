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
public class Main {

    public static void main(String[] args) {
       
        Singa singa1 = new Singa("Karnivora", "Bertaring");
        Burung burung1 = new Burung("Omnivora", "Bersayap");
        
        singa1.show();
        singa1.suara();
        singa1.berjalan();
        System.out.println("\n");
        burung1.show();
        burung1.suara();
        burung1.berjalan();
    }
}
