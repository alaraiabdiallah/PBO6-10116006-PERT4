package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program Nilai Mahasiswa
 * */
public class Main {

    public static void main(String[] args) {
	    Nilai nilai1 = new Nilai();

	    nilai1.setQuiz(60);
        nilai1.setUts(80);
        nilai1.setUas(75);

        double nilaiAkhir = nilai1.hitungNilaiAkhir();
        String indeks = nilai1.checkIndeksNilai(nilaiAkhir);
        String keterangan = nilai1.checkKeterangan(indeks);

        System.out.println("QUIZ \t\t\t = "+nilai1.getQuiz());
        System.out.println("UTS \t\t\t = "+nilai1.getUts());
        System.out.println("UAS \t\t\t = "+nilai1.getUas());
        System.out.println();
        System.out.println("Nilai Akhir \t = "+nilaiAkhir);
        System.out.println();
        System.out.println("Index = "+indeks);
        System.out.println("Keterangan = "+keterangan);

    }
}
