package com.altrovis.sigabkkbn.Entities;

/**
 * Created by ricki on 2/29/2016.
 */
public class IndividuKeluarga {
    private int ID;
    private String Nama;

    public IndividuKeluarga(String nama) {
        Nama = nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}
