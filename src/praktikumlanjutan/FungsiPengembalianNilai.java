/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumlanjutan;
import java.util.Scanner;
/**
 *
 * @author M. RAFI PUTRA
 */
public class FungsiPengembalianNilai {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a,b,c;
        System.out.println("PROGRAM MENJUMLAHKAN 2 NILAI");
        System.out.println("Masukkan nilai a: ");
        a = masukan.nextInt();
        System.out.println("Masukkan nilai b: ");
        b = masukan.nextInt();
        System.out.println("Masukkan nilai c: ");
        c = masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b: "+jumlah1(a,b));
        System.out.println("Jumlah b + c: "+jumlah2(b,c));
        System.out.println("Jumlah a + c: "+jumlah3(a,c));
    }
    //konstraktor
    private static int jumlah1(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
     private static int jumlah2(int b, int c) {
        int hasil = b + c;
        return hasil;
    }
      private static int jumlah3(int a, int c) {
        int hasil = a + c;
        return hasil;
    }
}
