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
public class Kondisi {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai PBO: ");
        nilai = masukan.nextInt();
        if(nilai < 70) {
            System.out.println("Siswa tidak lulus");
        }
        if(nilai > 70) {
                System.out.println("Siswa lulus");
        }
    }
}
