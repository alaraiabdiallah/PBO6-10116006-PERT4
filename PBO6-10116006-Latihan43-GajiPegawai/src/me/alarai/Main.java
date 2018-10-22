package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program menghitung gaji pegawai
 * */
public class Main {

    public static void main(String[] args) {
        GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Ala Rai AbdiAllah");
        gaji.setAlamat("Jalan Tubagus Ismail Dalam");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        int uangTunjangan = gaji.getUangTunjangan();
        int uangTransport = gaji.getUangTransport();
        int gajiPokok = gaji.getGajiPokok();
        int totalGaji = gaji.totalGaji(uangTunjangan,uangTransport,gajiPokok);
        gaji.setTotalGaji(totalGaji);

        gaji.tampilData(gaji.getNama(),gaji.getAlamat(),uangTunjangan,uangTransport,gajiPokok,totalGaji);

    }
}
