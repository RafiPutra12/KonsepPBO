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

public class SoalC {
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++) {
            for(int k = 1;k <= 5;k++) {
                if(i == 1 || i == 5 || k == 6-i) {
                    System.out.print("@");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
