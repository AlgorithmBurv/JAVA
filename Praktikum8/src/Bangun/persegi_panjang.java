/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun;

/**
 *
 * @author 62813
 */
public class persegi_panjang extends bangun {

    int panjang, lebar;

    persegi_panjang(int panjangx, int lebarx, int jumlahx) {
        super(jumlahx);
        panjang = panjangx;
        lebar = lebarx;
     

    }

    public void view_persegi_panjang() {
        System.out.println("panjang : " + panjang);
        System.out.println("lebar : " + lebar);
       
    }
       public void luas_persegi_panjang() {
        jumlah = panjang*lebar;
          System.out.println("jumlah "+jumlah);
        
    }
}