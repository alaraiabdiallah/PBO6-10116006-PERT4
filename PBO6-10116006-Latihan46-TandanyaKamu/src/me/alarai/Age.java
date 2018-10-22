package me.alarai;

public class Age {

    private int yearBirth, yearNow;

    private final static String red = "\033[0;31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur(){
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur){
        String ket = "";
        if (umur >= 0 && umur <= 5){
            ket = "LAGI LUCU-LUCU NYA";
        }else if(umur > 5 && umur <= 10){
            ket = "MASIH ANAK-ANAK";
        }else if(umur > 10 && umur <= 13){
            ket = "MASIH REMADJA";
        }else if(umur > 13 && umur <= 19){
            ket = "ALAY";
        }else if(umur > 19 && umur <= 29){
            ket = "LAGI GALAU NYARI JODOH";
        }else if(umur > 29 && umur <= 35){
            ket = "LAGI SIBUK NYARI UANG";
        }else if(umur > 35 && umur <= 150){
            ket = "SUDAH TUA";
        }else if(umur < 0 || umur > 150){
            ket = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }

        return red+ket;
    }
}
