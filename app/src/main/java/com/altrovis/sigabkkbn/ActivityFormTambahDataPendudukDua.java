package com.altrovis.sigabkkbn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFormTambahDataPendudukDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_tambah_data_penduduk_dua);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setTitle("Data Keluarga (2/6)");
    }
}
