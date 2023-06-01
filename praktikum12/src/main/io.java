/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class io {

    public static void main(String[] args){
        System.out.print("===Operasi IO===");
        System.out.println("1. Buat File  ");
        System.out.println("2. Mengecek File ");
        System.out.println("3. Mengisi File");
        System.out.println("4. Menampilkan isi File  ");
        System.out.println("5. Merename nama File");
        System.out.println("6. Menghapus File\n");
        String Pil = JOptionPane.showInputDialog("Masukkan Pilihan Operasi = ");
        int B = Integer.parseInt(Pil);
        
        switch(B){
            case 1: {
                     try {
                     File txtFile = new File("file1.txt");
                     txtFile.createNewFile();

                     File datFile = new File("file2.dat");
                     datFile.createNewFile();
                     } catch (IOException e) {
                     System.out.println("Gagal membuat file!");
                     e.printStackTrace();
                     }
                break;
            }
            case 2: {
                   
                     File txtFile = new File("file1.txt");
                     if(txtFile.exists())
                     System.out.println("file1.txt ada !");
                     else
                     System.out.println("file1.txt tidak ada !");

                     File datFile = new File("file2.dat");
                     if(datFile.exists())
                     System.out.println("file2.dat ada !");
                     else
                     System.out.println("file2.dat tidak ada !");
                     
                break;
            }
            case 3: {
                try {
                     FileWriter writer1 = new FileWriter("file1.txt");
                     writer1.write("Hallo Dunia");
                     writer1.close();
                     
                     FileWriter writer2 = new FileWriter("file2.dat");
                     writer2.write("Hello world");
                     writer2.close();
                     } catch (IOException e) {
                     System.out.println("Gagal mengisi file!");
                     e.printStackTrace();
                     }
                 break;
            }
            case 4: {
                      try {
                      Scanner scanner1 = new Scanner(new File("file1.txt"));
                      while (scanner1.hasNextLine()) {
                      System.out.println(scanner1.nextLine());
                      }
                      scanner1.close();
                      
                      Scanner scanner2 = new Scanner(new File("file2.dat"));
                      while (scanner2.hasNextLine()) {
                      System.out.println(scanner2.nextLine());
                      }
                      scanner2.close();
                      } catch (FileNotFoundException e) {
                      System.out.println("File tidak ditemukan!");
                      e.printStackTrace();
                      }
                 break;
            }
             case 5: {
                     File file1 = new File("file1.txt");
                     if (file1.renameTo(new File("file_baru1.txt"))) {
                     System.out.println("Berhasil mengganti nama file");
                     } else {
                     System.out.println("Gagal mengganti nama file");
                     }
                     
                     File file2 = new File("file2.dat");
                     if (file2.renameTo(new File("file_baru2.dat"))) {
                     System.out.println("Berhasil mengganti nama file");
                     } else {
                     System.out.println("Gagal mengganti nama file");
                     }
                 break;
            }
              case 6: {
                    File txtFile = new File("file_baru1.txt");
                     if(txtFile.delete())
                     System.out.println("File Berhasil Dihapus  !");
                     else
                     System.out.println("File tidak ada !");

                     File datFile = new File("file_baru2.dat");
                     if(datFile.delete())
                     System.out.println("File Berhasil Dihapus !");
                     else
                     System.out.println("File tidak ada !");
                   break;
            }
            default :{
                
                 break;
            }
       
        }
    }
}
