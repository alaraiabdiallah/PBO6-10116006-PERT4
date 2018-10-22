package me.alarai;

public class Kubus {

    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int parSisi){
        return parSisi * parSisi * parSisi;
    }

    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa / volume;
    }
}
