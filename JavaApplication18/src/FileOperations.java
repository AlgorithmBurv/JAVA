/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62813
 */

import java.io.*;
import java.util.Scanner;

public class FileOperations {
  public static void main(String[] args) {
    // Buat File dengan dua ekstensi .txt dan .dat
    try {
      File txtFile = new File("nama_file.txt");
      txtFile.createNewFile();

      File datFile = new File("nama_file.dat");
      datFile.createNewFile();
    } catch (IOException e) {
      System.out.println("Gagal membuat file!");
      e.printStackTrace();
    }

    // Mengecek File dalam direktory tertentu
    File dir = new File("direktori_tujuan");
    File[] files = dir.listFiles();
    for (File file : files) {
      System.out.println(file.getName());
    }

    // Mengisi File
    try {
      FileWriter writer = new FileWriter("nama_file.txt");
      writer.write("Isi file");
      writer.close();
    } catch (IOException e) {
      System.out.println("Gagal mengisi file!");
      e.printStackTrace();
    }

    // Menampilkan isi File
    try {
      Scanner scanner = new Scanner(new File("nama_file.txt"));
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("File tidak ditemukan!");
      e.printStackTrace();
    }

    // Merename nama File
    File file = new File("nama_file.txt");
    if (file.renameTo(new File("nama_file_baru.txt"))) {
      System.out.println("Berhasil mengganti nama file");
    } else {
      System.out.println("Gagal mengganti nama file");
    }

    // Menghapus File
    if (file.delete()) {
      System.out.println("File berhasil dihapus");
    } else {
      System.out.println("Gagal menghapus file");
    }
  }
}