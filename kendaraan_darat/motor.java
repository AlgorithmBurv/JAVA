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
public class motor extends kendaraan_darat {

    private String jenis_motor;
    private String jenis_stang;
    private String jenis_knalpot;

    motor(int noken, String pabrik, String nama, String tapro, String BBM, String warnax, int flash,int harga, String jenmot, String J_stang, String J_knalpot) {
        super(noken, pabrik, nama, tapro, BBM, warnax, flash,harga);

        jenis_motor = jenmot;
        jenis_stang = J_stang;
        jenis_knalpot = J_knalpot;
    }

    public void view_motor() {
        System.out.println("Jenis Motor\t: " + getJenis_motor());
        System.out.println("Jenis Stang\t: " + getJenis_stang());
        System.out.println("Jenis Knalpot\t: " + getJenis_knalpot());
    }
     public void transaksimotor(){
        System.out.println("Harga\t\t: $"+harga);
    }

    /**
     * @return the jenis_motor
     */
    public String getJenis_motor() {
        return jenis_motor;
    }

    /**
     * @param jenis_motor the jenis_motor to set
     */
    public void setJenis_motor(String jenis_motor) {
        this.jenis_motor = jenis_motor;
    }

    /**
     * @return the jenis_stang
     */
    public String getJenis_stang() {
        return jenis_stang;
    }

    /**
     * @param jenis_stang the jenis_stang to set
     */
    public void setJenis_stang(String jenis_stang) {
        this.jenis_stang = jenis_stang;
    }

    /**
     * @return the jenis_knalpot
     */
    public String getJenis_knalpot() {
        return jenis_knalpot;
    }

    /**
     * @param jenis_knalpot the jenis_knalpot to set
     */
    public void setJenis_knalpot(String jenis_knalpot) {
        this.jenis_knalpot = jenis_knalpot;
    }
}
