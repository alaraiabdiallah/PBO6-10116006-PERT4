package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program energi kinetik
 * */
public class Main {

    public static void main(String[] args) {
        System.out.println("=====Perhitungan Energi Kinetik=====");

        EnergiKinetik e = new EnergiKinetik();
        e.setMassa(145);
        e.setKecepatan(0);
        double kecepatanAwal = e.getKecepatan();
        e.setKecepatan(25);
        double kecepatanAkhir = e.getKecepatan();
        double massaKilo = e.getMassaInKilo();
        double energiAkhir = e.hitungEnergiKinetik(massaKilo,kecepatanAkhir);
        double energiAwal = e.hitungEnergiKinetik(massaKilo,kecepatanAwal);
        double usaha = e.hitungUsaha(energiAwal,energiAkhir);
        System.out.println("Massa : "+massaKilo+" kilo");
        System.out.println("Kecepatan Awal : "+kecepatanAwal +" m/s");
        System.out.println("Kecepatan Akhir : "+kecepatanAkhir+ " m/s");
        System.out.println("Hasil Energi Kinetik : "+energiAkhir+" joule");
        System.out.println("Hasil Usaha berawal ketika benda diam : "+usaha+" joule");
    }
}
