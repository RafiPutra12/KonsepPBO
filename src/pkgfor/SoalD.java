/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor;

/**
 *
 * @author M. RAFI PUTRA
 */
public class SoalD {
    public static void main(String[] args) {
        for(int baris = 1;baris <= 5;baris++) {
            for(int kolom = 1;kolom <= 5;kolom++) {
                if(kolom == 1 || kolom == 5 || kolom == baris) {
                    System.out.print("@");
                }
                else
                    System.out.print(" ");
            }
            System.out.println(""); 
        }
    }
}
