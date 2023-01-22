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
public class P1_A_Menampilkan_Output {
    public void menout()
    {
        Scanner masuk = new Scanner(System.in);
        int jk;
        float berat, tinggi, bmi, meter;
        double broca;
     
        System.out.println("| ---------| Kalkulator BMI |----------- |");
        System.out.println("|                                        |");
        System.out.println("| Masukan Jenis Kelamin :");
        System.out.println("|            1. Laki-laki                |");
        System.out.println("|            2. Perempuan                |");
        System.out.println("|                                        |");
        System.out.println("|                              < Kembali |");
        System.out.println("|                           x Menu Utama |");
        System.out.print  ("| Pilih : ");
        jk = masuk.nextInt();
        System.out.println("|                                        |");
        System.out.println("| Masukan Berat Badan                    |");
        System.out.print  ("| Kg : ");
        berat = masuk.nextFloat();
        System.out.println("| Masukan Tinggi Badan                   |");
        System.out.print  ("| Cm : ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;
   
        bmi=(berat/(meter*meter));
  
        System.out.println("|........................................|");
        System.out.print("| BMI : "+bmi+" ");
        
        if (bmi<18.5){
            System.out.println("Berat Badan (Kurus)");
        }else if (bmi<=22.9){
            System.out.println("Berat Badan (Normal)");
        }else if (bmi<24.9){
            System.out.println("Berat Badan (Overweight)"); 
        }else {
            System.out.println("Berat Badan (Obesitas)"); 
        }
        
        switch(jk){
            case 1 : broca=((tinggi-100)-(0.10*(tinggi-100))); break;
            case 2 : broca=((tinggi-100)-(0.15*(tinggi-100))); break;
            default : broca=0;
        }
    
        int hasil = (int)broca;
        System.out.println("| Berat badan ideal : "+hasil+" Kg         |");
        System.out.println("|________________________________________|");
        
   }
}
