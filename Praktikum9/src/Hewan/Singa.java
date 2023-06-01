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
public class Singa extends Hewan {
     
    Singa (String jenisx,  String cirix){
        super(jenisx, cirix);
    }
     public void show(){
         System.out.println("\t====Singa====");
        System.out.println("Jenis \t\t: "+this.jenis);
         System.out.println("Ciri-ciri \t: "+this.ciri);
    }
    
    public void suara(){
        System.out.println("Suara\t\t: Auuu,Auuu, Auuu");
    }
     public void berjalan(){
         System.out.println("Berjalan\t: Berlari");
    }
}
