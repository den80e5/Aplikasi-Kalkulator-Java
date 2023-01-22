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
public class P5_A_Aplikasi_Laundry_Soal3 {
    
    public void laundry(){
        
        int kg, harga, jml, diskon10, diskon20, hdisk10, hdisk20, hadisk10, hadisk20;
        
        Scanner scan = new Scanner(System.in);


        System.out.println("| ------| Aplikasi Laundry Soal 3 |----- |");
        System.out.println("|                                        |");
        System.out.println("|         1 Kg Harganya Rp.10.000        |");
        System.out.println("|         2 Kg Harganya Rp.20.000        |");
        System.out.println("|         3-5 Kg Dapat Diskon 10%        |");
        System.out.println("|         6-10 Kg Dapat Diskon 10%       |");
        System.out.println("|                                        |");
        System.out.println("|                              < Kembali |");
        System.out.println("|                           x Menu Utama |");
        System.out.print  ("| Berapa kg : ");
        kg = scan.nextInt();
        harga = 10000;
        jml = kg * harga;
        diskon10 = 10;
        diskon20 = 20;
        hdisk10 = (jml * diskon10 / 100);
        hadisk10 = (jml - hdisk10);
        hdisk20 = (jml * diskon20 / 100);
        hadisk20 = (jml - hdisk20);
        
        if ( kg >= 6 ) {
            System.out.println("|                                        |");
            System.out.println("| "+ kg +" kg Harganya Rp."+ jml);
            System.out.println("|                                        |");
            System.out.println("| Anda mendapatkan Diskon -Rp."+ hdisk20);
            System.out.println("|                                        |");
            System.out.println("| Total Bayar Rp."+ hadisk20);
            System.out.println("| -------------------------------------- |");
        } else if ( kg >= 3 ){
            System.out.println("|                                        |");
            System.out.println("| " +kg +" kg Harganya Rp."+ jml);
            System.out.println("|                                        |");
            System.out.println("| Anda mendapatkan Diskon -Rp."+ hdisk10);
            System.out.println("|                                        |");
            System.out.println("| Total Bayar Rp."+ hadisk10);
            System.out.println("| -------------------------------------- |");
        } else {
            System.out.println("|                                        |");
            System.out.println("| "+ kg +" kg Harganya Rp."+ jml );
            System.out.println("| -------------------------------------- |");
        }

    }
}
