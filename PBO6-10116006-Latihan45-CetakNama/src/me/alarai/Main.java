package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program cetak nama
 * */
public class Main {

    public static void main(String[] args) {
        System.out.println("=====Aplikasi Pencetak Nama=====");
        Printer p = new Printer();

        System.out.print("Masukkan nama anda : ");
        Scanner scan1 = new Scanner(System.in);
        String nama = scan1.nextLine();

        System.out.print("Mau cetak nama berapa kali ? ");
        Scanner scan2 = new Scanner(System.in);
        int jmlCetak = scan1.nextInt();

        p.setNama(nama);
        p.setJmlCetak(jmlCetak);

        p.cetak(p.getNama());
        p.cetak(p.getJmlCetak(),p.getNama());
    }
}
