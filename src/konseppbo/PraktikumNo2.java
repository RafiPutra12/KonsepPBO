/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konseppbo;

/**
 *
 * @author M. RAFI PUTRA
 */
public class PraktikumNo2 {
    public static void main(String[] args) {
        System.out.println("Konversi Suhu");
        double C = 78,R,K,F;
        R = (4/5*C);
        System.out.println("Konversi suhu celsius ke reamur: "+R);
        K = C + 273;
        System.out.println("Konversi suhu celsius ke khelvin: "+K);
        F = (9/5*C)+32;
        System.out.println("Konversi suhu celsius ke fahrenheit: "+F);
    }
}
