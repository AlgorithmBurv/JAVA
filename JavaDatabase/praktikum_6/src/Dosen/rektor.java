/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosen;

/**
 *
 * @author shahd
 */
public class rektor extends dosen {

    private int th_mulai;
    private int jabatan_ke;
    
    

    rektor(String namaX, String nikX, String jurX, int thX, int keX) {
        super(namaX, nikX, jurX);
        th_mulai = thX;
        jabatan_ke = keX;
    }

    public void viewRektor() {
        System.out.println("Th mulai jabatan    : " + getTh_mulai());
        System.out.println("Jabatan rektor ke-  : " + getJabatan_ke());
    }

    /**
     * @return the th_mulai
     */
    public int getTh_mulai() {
        return th_mulai;
    }

    /**
     * @param th_mulai the th_mulai to set
     */
    public void setTh_mulai(int th_mulai) {
        this.th_mulai = th_mulai;
    }

    /**
     * @return the jabatan_ke
     */
    public int getJabatan_ke() {
        return jabatan_ke;
    }

    /**
     * @param jabatan_ke the jabatan_ke to set
     */
    public void setJabatan_ke(int jabatan_ke) {
        this.jabatan_ke = jabatan_ke;
    }

}
