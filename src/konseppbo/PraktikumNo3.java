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
public class PraktikumNo3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama,tempatLahir,alamat,jenisKelamin,mottoHidup;
        int nis,tanggalLahir;
        System.out.println("Nama: ");
        nama = masukan.next();
        System.out.println("Nis: ");
        nis = masukan.nextInt();
        System.out.println("Tempat Lahir: ");
        tempatLahir = masukan.next();
        System.out.println("Tanggal Lahir: ");
        tanggalLahir = masukan.nextInt();
        System.out.println("Jenis Kelamin: ");
        jenisKelamin = masukan.next();
        System.out.println("Alamat di Malang: ");
        alamat = masukan.next();
        System.out.println("Motto Hidup: ");
        mottoHidup = masukan.next();

    }
}
