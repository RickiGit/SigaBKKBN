package com.altrovis.sigabkkbn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFormPesertaKB5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_peserta_kb5);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setTitle("Form Peserta KB (5/6)");
    }
}
