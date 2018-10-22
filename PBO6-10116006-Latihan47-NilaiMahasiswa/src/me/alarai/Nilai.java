package me.alarai;

public class Nilai {

    private double uts,uas,quiz;

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double hitungNilaiAkhir(){
        return (quiz * 0.2) + (uts * 0.3) + (uas * 0.5);
    }

    public String checkIndeksNilai(double nilaiAkhir){
        String indeks = "";

        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            indeks = "A";
        }else if(nilaiAkhir > 68 && nilaiAkhir <= 80){
            indeks = "B";
        }else if(nilaiAkhir > 56 && nilaiAkhir <= 68){
            indeks = "C";
        }else if(nilaiAkhir > 45 && nilaiAkhir <= 56){
            indeks = "D";
        }else if(nilaiAkhir > 0 && nilaiAkhir <= 45){
            indeks = "E";
        }

        return indeks;
    }

    public String checkKeterangan(String indeks){
        String ket = "";
        if(indeks.equals("A")){
            ket = "Sangat Baik";
        }else if(indeks.equals("B")){
            ket = "Baik";
        }else if(indeks.equals("C")){
            ket = "Cukup";
        }else if(indeks.equals("D")){
            ket = "Kurang";
        }else if(indeks.equals("E")){
            ket = "Sangat Kurang";
        }
        return ket;
    }
}
