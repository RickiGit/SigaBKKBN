package com.altrovis.sigabkkbn.Entities;

/**
 * Created by ricki on 2/29/2016.
 */
public class IndividuKeluarga {

    private int ID;
    private String Nama;
    private String NIK;
    private int Tanggal;
    private int Bulan;
    private int Tahun;
    private int Umur;
    private int HubunganDenganKK;
    private int JenisKelamin;
    private int Agama;
    private int Pendidikan;
    private int Pekerjaan;
    private int StatusKawin;
    private int JKN;


    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public int getTanggal() {
        return Tanggal;
    }

    public void setTanggal(int tanggal) {
        Tanggal = tanggal;
    }

    public int getBulan() {
        return Bulan;
    }

    public void setBulan(int bulan) {
        Bulan = bulan;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int tahun) {
        Tahun = tahun;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int umur) {
        Umur = umur;
    }

    public int getHubunganDenganKK() {
        return HubunganDenganKK;
    }

    public void setHubunganDenganKK(int hubunganDenganKK) {
        HubunganDenganKK = hubunganDenganKK;
    }

    public int getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(int jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public int getAgama() {
        return Agama;
    }

    public void setAgama(int agama) {
        Agama = agama;
    }

    public int getPendidikan() {
        return Pendidikan;
    }

    public void setPendidikan(int pendidikan) {
        Pendidikan = pendidikan;
    }

    public int getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(int pekerjaan) {
        Pekerjaan = pekerjaan;
    }

    public int getStatusKawin() {
        return StatusKawin;
    }

    public void setStatusKawin(int statusKawin) {
        StatusKawin = statusKawin;
    }

    public int getJKN() {
        return JKN;
    }

    public void setJKN(int JKN) {
        this.JKN = JKN;
    }
}
