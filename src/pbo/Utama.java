/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.util.Scanner;
/**
 * @author Deni Anggara
 */
public class Utama {
     public static void main(String[] args) {
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println(".........................");
        System.out.println("| Nama  : Deni Aanggara |");
        System.out.println("| Nim   : A2.1900042    |");
        System.out.println("'''''''''''''''''''''''''");
        System.out.println(" ");
        System.out.println("***** Pemrograman Berorientasi Objek *****");
        System.out.println("|                                        |");
        System.out.println("|       +--------- MENU ---------+       |");
        System.out.println("|               Pertemuan 1              |");
        System.out.println("|               Pertemuan 2              |");
        System.out.println("|               Pertemuan 3              |");
        System.out.println("|               Pertemuan 4              |");
        System.out.println("|               Pertemuan 5              |");
        System.out.println("|               Pertemuan 6              |");
        System.out.println("|                                        |");
        System.out.print  ("| Pilih : ");
        String pilih = input.nextLine();
        System.out.println("|________________________________________|");
        System.out.println("                                          ");
        
        switch (pilih) {
            case "4":{
                System.out.println("*************** Pertemuan 4 **************");
                System.out.println("|                                        |");
                System.out.println("|         1. Kalkulator Sederhana        |");
                System.out.println("|         2. Kalkulator BMI              |");
                System.out.println("|                                        |");
                System.out.println("|                           x Menu Utama |");
                System.out.println("|                                        |");
                System.out.print  ("| Pilih : ");
                String pilpt4 = input.nextLine();
                System.out.println("|                                        |");
                switch (pilpt4) {
                    case "1":{
                        P4_A_Kalkulator_Sederhana ks=new P4_A_Kalkulator_Sederhana();
                        ks.kalsed();
                    break;
                    }
                    case "2":{
                        P4_B_Kalkulator_BMI kb=new P4_B_Kalkulator_BMI();
                        kb.kalbmi();
                    break;
                    }
//                    case "x":{
//                        
//                    break;
//                    }
                }
                
             }
            
            case "5":{
                System.out.println("*************** Pertemuan 5 **************");
                System.out.println("|                                        |");
                System.out.println("|         1. Aplikasi Laundry Soal 3     |");
                System.out.println("|         2. ----------------            |");
                System.out.println("|                                        |");
                System.out.println("|                           x Menu Utama |");
                System.out.println("|                                        |");
                System.out.print  ("| Pilih : ");
                String pilpt4 = input.nextLine();
                System.out.println("|                                        |");
                switch (pilpt4) {
                    case "1":{
                        P5_A_Aplikasi_Laundry_Soal3 al=new P5_A_Aplikasi_Laundry_Soal3();
                        al.laundry();
                    break;
                    }
                    case "2":{
                        
                    break;
                    }
//                    case "x":{
//                        
//                    break;
//                    }
                }
                
             }
            case "6":{
                System.out.println("*************** Pertemuan 5 **************");
                System.out.println("|                                        |");
                System.out.println("|         1. Menampilkan Array           |");
                System.out.println("|         2. ----------------            |");
                System.out.println("|                                        |");
                System.out.println("|                           x Menu Utama |");
                System.out.println("|                                        |");
                System.out.print  ("| Pilih : ");
                String pilpt4 = input.nextLine();
                System.out.println("|                                        |");
                switch (pilpt4) {
                    case "1":{
                        P6_A_Menampilkan_Array ar=new P6_A_Menampilkan_Array();
                        ar.ary();
                    break;
                    }
                    case "2":{
                        
                    break;
                    }
//                    case "x":{
//                        
//                    break;
//                    }
                }
                
             }
            

                break;
        }
        System.out.print  ("| Kembali ke Menu utama (y/t)? ");
        ulg = input.next();
        System.out.println("| -------------------------------------- |");
        }
    }
}
