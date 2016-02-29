package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityFormTambahDataPendudukSatu extends AppCompatActivity {

    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_data_penduduk_satu);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setTitle("Data Keluarga (1/6)");

        inisialisasiLayout();
        goToPageFormTambahDataKeluargaDua();
    }

    public void inisialisasiLayout()
    {
        buttonNext = (Button)findViewById(R.id.ButtonNext);
    }

    public void goToPageFormTambahDataKeluargaDua()
    {
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFormTambahDataPendudukSatu.this, ActivityFormTambahDataPendudukDua.class);
                startActivity(intent);
            }
        });
    }
}
