package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program tanda umur
 * */
public class Main {

    public static void main(String[] args) {
	    Age usia = new Age(2018);

	    Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        int thnLahir  = scan.nextInt();
        usia.setYearBirth(thnLahir);

        int umur = usia.hitungUmur();

        System.out.println();
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : "+usia.getYearBirth());
        System.out.println("Hari ini tahun : "+ usia.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+umur+" tahun");
        System.out.println("Tandanya Kamu "+usia.tandanyaKamu(umur));

    }
}
