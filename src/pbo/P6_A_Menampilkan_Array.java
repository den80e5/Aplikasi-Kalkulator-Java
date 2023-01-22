/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author Deni Anggara
 */
public class P6_A_Menampilkan_Array {
    public void ary(){
        System.out.println("| ---------| Menampilkan Array |-------- |");
        System.out.println("|                                        |");
        String[][] tmpl = {
            {"Asep", "Mangga"},
            {"Didin", "Semanga"},
            {"Badru", "Jeruk"},
            {"Dede", "Rambutan"},
            {"Meli", "Anggur"}
        };
        for(int x=0; x < tmpl.length; x++)
        {
            System.out.println("|             "+tmpl[x][0]+" | " + tmpl[x][1]);
        
        }
        System.out.println("|                                        |");
        System.out.println("| Output :                               |");
        System.out.println("|                                        |");
        System.out.println("| "+tmpl[0][0]+" menyukai buah "+tmpl[0][1]);
        System.out.println("|                                        |");
        System.out.println("| -------------------------------------- |");
        
    }
}
