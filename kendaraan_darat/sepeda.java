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
public class sepeda extends kendaraan_darat {

    private String jenis_sepeda;
    private String jenis_pedal;
    private String jenis_kerangka;

    sepeda(int noken, String pabrik, String nama, String tapro, String BBM, String warnax, int flash,int harga, String jeped, String J_pedal, String J_kerangka) {
        super(noken, pabrik, nama, tapro, BBM, warnax, flash,harga);

        jenis_sepeda = jeped;
        jenis_pedal = J_pedal;
        jenis_kerangka = J_kerangka;
    }

    public void view_sepeda() {
        System.out.println("Jenis Sepeda\t: " + getJenis_sepeda());
        System.out.println("Jenis Pedal\t: " + getJenis_pedal());
        System.out.println("Jenis Kerangka\t: " + getJenis_kerangka());
    }
     public void transaksispeda(){
        System.out.println("Harga\t\t: $"+harga);
    }

    /**
     * @return the jenis_sepeda
     */
    public String getJenis_sepeda() {
        return jenis_sepeda;
    }

    /**
     * @param jenis_sepeda the jenis_sepeda to set
     */
    public void setJenis_sepeda(String jenis_sepeda) {
        this.jenis_sepeda = jenis_sepeda;
    }

    /**
     * @return the jenis_pedal
     */
    public String getJenis_pedal() {
        return jenis_pedal;
    }

    /**
     * @param jenis_pedal the jenis_pedal to set
     */
    public void setJenis_pedal(String jenis_pedal) {
        this.jenis_pedal = jenis_pedal;
    }

    public String getJenis_kerangka() {
        return jenis_kerangka;
    }

    /**
     * @param jenis_kerangka the jenis_kerangka to set
     */
    public void setJenis_kerangka(String jenis_kerangka) {
        this.jenis_kerangka = jenis_kerangka;
    }
}
