/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konseppbo;
import java.util.Scanner;
/**
 *
 * @author M. RAFI PUTRA
 */
public class PraktikumNo1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Menghitung luas permukaan bola");
        double r,luas;
        System.out.println("Masukan jari jari bola: ");
        r = masukan.nextDouble();
        luas = 4*Math.PI*r*r;
        System.out.println("Luas permukaan bola: "+luas);
        
    }
}
