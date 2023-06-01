/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar;

import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class For {
    public static void main(String[] args) {
        String data_N = JOptionPane.showInputDialog("Masukkan Bilangan =");
        int N = Integer.parseInt(data_N);
        int faktorial = 1;
        
        for (int i=1; i<N; i++){
            
            System.out.println(faktorial+" ");
            faktorial = faktorial*i;
        }
        System.out.println("Nilai "+N+"! = "+faktorial);
    }
    
}
