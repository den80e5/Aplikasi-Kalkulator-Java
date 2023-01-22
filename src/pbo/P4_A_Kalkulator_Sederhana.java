/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.util.Scanner;

/**
 *
 * @author Deni Anggara
 */
public class P4_A_Kalkulator_Sederhana {
static float total = 0, bilangan1 = 1, bilangan2 = 1;

    public void kalsed(){
        Scanner input = new Scanner(System.in);

        while(bilangan2 != 0 & bilangan1 != 0){
         System.out.println("| -------| Kalkulator Sederhana |------- |");
         System.out.println("|              1. Tambahkan              |");
         System.out.println("|              2. Kurangi                |");
         System.out.println("|              3. Perkalian              |");
         System.out.println("|              4. Pembagian              |");
         System.out.println("|                                        |");
         System.out.println("|                              < Kembali |");
         System.out.println("|                           x Menu Utama |");
         System.out.print  ("| Pilih : ");
         String pilihan = input.nextLine();
         System.out.println("|                                        |");

            System.out.println("| Masukan Bilangan Ke-1                  |");
            System.out.print("| : ");
            bilangan1 = input.nextFloat();
            System.out.println("| Masukan Bilangan Ke-2                  |");
            System.out.print("| : ");
            bilangan2 = input.nextFloat();

            switch(pilihan){
                case "1":
                System.out.println("|            [  " + bilangan1 + " + " + bilangan2 + " ]");
                System.out.println("| -------------------------------------- |");
                System.out.print("| Hasilnya = ");
                total = bilangan1 + bilangan2;
                break;
                case "2":
                System.out.println("|             [ " + bilangan1 + " - " + bilangan2 + " ]");
                System.out.println("| -------------------------------------- |");
                System.out.print("| Hasilnya = ");
                total = bilangan1 - bilangan2;
                break;
                case "3":
                System.out.println("|             [ " + bilangan1 + " x " + bilangan2 + " ]");
                System.out.println("| -------------------------------------- |");
                System.out.print("| Hasilnya = ");
                total = bilangan1 * bilangan2;
                break;
                case "4":
                System.out.println("|             [ " + bilangan1 + " : " + bilangan2 + " ]");
                System.out.println("| -------------------------------------- |");
                System.out.print("| Hasilnya = ");
                total = bilangan1 / bilangan2;
                break;
//                case "<":{
//                        
//                    break;
//                    }
//                case "x":{
//                        
//                    break;
//                    }
                default:
                System.out.println("Anda harus mengisi angka");
            }
            System.out.println(total);
            System.out.println("| -------------------------------------- |");
            System.out.println("|                                        |");
        }
    }
}
