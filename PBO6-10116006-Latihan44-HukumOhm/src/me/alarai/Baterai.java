package me.alarai;

public class Baterai {
    private float kuatArus,hambatan;

    public Baterai() {
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitunganTegangan(){
        return kuatArus * hambatan;
    }
}
