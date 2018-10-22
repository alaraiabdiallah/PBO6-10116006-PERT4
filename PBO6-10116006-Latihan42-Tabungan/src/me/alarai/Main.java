package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program penarikan uang
 * */
public class Main {

    public static void main(String[] args) {
        System.out.println("====Program Penarikan Uang====");
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Saldo Awal : ");
        int saldo = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = scan.nextInt();

        Tabungan tab = new Tabungan(saldo);

        System.out.println("Saldo Anda Sekarang : "+tab.ambilUang(jumlah));
    }
}
