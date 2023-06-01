/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62813
 */
public class dosen {

    protected String nama;
    protected String nik;
    protected String jurusan;
    String umur;

    dosen(String namax, String nikx, String jurx, String umur) {
        nama = namax;
        nik = nikx;
        jurusan = jurx;
        umur = this.umur;
    }

    public void view() {
        System.out.println("Nama : " + nama);
        System.out.println("NIK : " + nik);
        System.out.println("Jurusan : " + jurusan);
    }
}
