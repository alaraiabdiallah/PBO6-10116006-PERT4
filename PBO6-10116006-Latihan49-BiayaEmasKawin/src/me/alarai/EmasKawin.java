package me.alarai;

public class EmasKawin {

    private String namaPembeli;

    private double harga,berat;

    public EmasKawin(double harga) {
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public double getHarga() {
        return harga;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double hitungHarga(double berat){
        return harga * berat;
    }
}
