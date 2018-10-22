package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program menghitung hukum ohm
 * */
public class Main {

    public static void main(String[] args) {

        Baterai ohm = new Baterai(3,12);

        System.out.println("=====Hukum Ohm======");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantan \n" +
                "akan berbanding luhur dengan beda potensial \n" +
                "pada ujung-ujung kawat penghantar tersebut \n" +
                "asalkan suhu kawat dijaga konstan.");

        System.out.println();
        System.out.println("Kuat Arus : "+ohm.getKuatArus()+ " ampere");
        System.out.println("Hambatan : "+ohm.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : "+ohm.hitunganTegangan()+" volt");
    }
}
