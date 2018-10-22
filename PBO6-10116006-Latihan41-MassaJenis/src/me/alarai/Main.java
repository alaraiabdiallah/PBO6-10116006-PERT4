package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program menghitung massa jenis
 * */
public class Main {

    public static void main(String[] args) {
	    Kubus cube = new Kubus();
	    cube.setSisi(5);
	    cube.setMassa(250);
	    int volume = cube.hitungVolume(cube.getSisi());
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : "+cube.getSisi());
        System.out.println("Massa : "+cube.getMassa());

        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : "+volume);
        System.out.println("Massa Jenis : "+ cube.hitungMassaJenis(cube.getMassa(),volume));
    }
}
