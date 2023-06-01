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
public class mobil extends kendaraan_darat {

    private String jenis_mobil;
    private int jumlah_stroke;
    private String jenis_atap;
    private String bumper;
    

    mobil(int noken, String pabrik, String nama, String tapro, String BBM, String warnax, int flash,int harga, String jenmob, int J_stroke, String J_atap, String BumpeR) {
        super(noken, pabrik, nama, tapro, BBM, warnax, flash,harga);

        jenis_mobil = jenmob;
        jumlah_stroke = J_stroke;
        jenis_atap = J_atap;
        bumper = BumpeR;
    }

    public void view_mobil() {
        System.out.println("Jenis Mobil\t: " + getJenis_mobil());
        System.out.println("Jumlah Stroke\t: " + getJumlah_stroke() + " Stroke");
        System.out.println("Jenis Atap\t: " + getJenis_atap());
        System.out.println("Jenis Bumper\t: " + getBumper());
    }
     public void transaksimobil(){
        System.out.println("Harga\t\t: $"+harga);
    }
    

    /**
     * @return the jenis_mobil
     */
    public String getJenis_mobil() {
        return jenis_mobil;
    }

    /**
     * @param jenis_mobil the jenis_mobil to set
     */
    public void setJenis_mobil(String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
    }

    /**
     * @return the jumlah_stroke
     */
    public int getJumlah_stroke() {
        return jumlah_stroke;
    }

    /**
     * @param jumlah_stroke the jumlah_stroke to set
     */
    public void setJumlah_stroke(int jumlah_stroke) {
        this.jumlah_stroke = jumlah_stroke;
    }

    /**
     * @return the jenis_atap
     */
    public String getJenis_atap() {
        return jenis_atap;
    }

    /**
     * @param jenis_atap the jenis_atap to set
     */
    public void setJenis_atap(String jenis_atap) {
        this.jenis_atap = jenis_atap;
    }

    /**
     * @return the bumper
     */
    public String getBumper() {
        return bumper;
    }

    /**
     * @param bumper the bumper to set
     */
    public void setBumper(String bumper) {
        this.bumper = bumper;
    }
}
