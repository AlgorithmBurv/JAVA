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
public class kalab extends dosen{

    /**
     * @return the laboratorium
     */
    public String getLaboratorium() {
        return laboratorium;
    }

    /**
     * @param laboratorium the laboratorium to set
     */
    public void setLaboratorium(String laboratorium) {
        this.laboratorium = laboratorium;
    }

    private String laboratorium;

    kalab(String namaX, String nikX, String jurX, String labX) {
        super(namaX, nikX, jurX);
        laboratorium = labX;
    }

    public void viewKalab() {
        System.out.println("Laboratorium    : " + getLaboratorium());
    }

}
