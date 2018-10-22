package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program penghitungan emas kawin
 * */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=====Program Pembelian Emas Kawin =====");

        EmasKawin masKawin = new EmasKawin(570000);


        System.out.print("Masukkan Nama Pembeli : ");
        Scanner scan = new Scanner(System.in);
        masKawin.setNamaPembeli(scan.nextLine());

        System.out.print("Berat emas yang akan dibeli (gram) : ");
        Scanner scan2 = new Scanner(System.in);
        masKawin.setBerat(scan2.nextDouble());

        double totalHarga = masKawin.hitungHarga(masKawin.getBerat());

        System.out.println();
        System.out.println("=====HASIL PEMBELIAN=====");

        System.out.println("Nama Pembeli : "+masKawin.getNamaPembeli());
        System.out.println("Harga emas saat ini : Rp. "+masKawin.getHarga());
        System.out.println("Berat emas yang dibeli : "+masKawin.getBerat()+" gram");
        System.out.println("Total harus bayar : Rp. "+ totalHarga);
    }
}
