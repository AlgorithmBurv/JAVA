/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun;

/**
 *
 * @author 62813
 */
public class Main {

    int input1, input2;

    Main(int input1x, int input2x) {
        input1 = input1x;
        input2 = input2x;
    }

    public void operasi_SG() {
        System.out.println("Operasi Luas Segitiga \n=================");
    }

    public void operasi_PP() {
        System.out.println("Operasi Persegi Panjang \n=================");
    }

}

class segitiga extends Main {

    int jml_SG;

    segitiga(int input1x, int input2x, int jml_SGx) {
        super(input1x, input2x);

        jml_SG = jml_SGx;

    }

    public void hasil_SG() {
        jml_SG = input1 * input2 / 2;
        System.out.println("Nilai alas : " + input1);
        System.out.println("Nilai tinggi : " + input2);
        System.out.println("Hasil luas segitiga : " + jml_SG + "\n");
    }

}

class persegi_panjang extends Main {

    int jml_PP;

    persegi_panjang(int input1x, int input2x, int jml_PPx) {
        super(input1x, input2x);

        jml_PP = jml_PPx;

    }

    public void hasil_PP() {
        jml_PP = input1 * input2;
        System.out.println("Nilai luas : " + input1);
        System.out.println("Nilai panjang : " + input2);
        System.out.println("Hasil luas persegi panjang : " + jml_PP);
    }

}

class run_main {

    public static void main(String[] args) {
        Main M = new Main(0, 0);
        segitiga SG = new segitiga(5, 4, 0);
        persegi_panjang PP = new persegi_panjang(5, 5, 0);

        System.out.println("Nama : Imam Mulyana");
        System.out.println("NIM : 20210801234");
        System.out.println("MK : PBO \n");
        
        M.operasi_SG();
        SG.hasil_SG();

        M.operasi_PP();
        PP.hasil_PP();
    }
}
