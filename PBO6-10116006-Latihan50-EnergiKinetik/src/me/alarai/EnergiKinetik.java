package me.alarai;

public class EnergiKinetik {

    private double massa, kecepatan;


    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getMassaInKilo(){
        return massa/1000;
    }

    public double hitungEnergiKinetik(double massa, double kecepatan){
        return (0.5) * (massa * (kecepatan * kecepatan));
    }

    public double hitungUsaha(double energiAwal, double energiAkhir){
        return energiAkhir - energiAwal;
    }
}
