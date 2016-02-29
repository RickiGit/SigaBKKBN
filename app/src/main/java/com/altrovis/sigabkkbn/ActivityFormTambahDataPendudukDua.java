package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ActivityFormTambahDataPendudukDua extends AppCompatActivity {

    Button buttonSave;
    Spinner spinnerHubunganKK, spinnerJK, spinnerAgama, spinnerPendidikan, spinnerPekerjaan, spinnerStatusKawin, spinnerJKN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_tambah_data_penduduk_dua);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setTitle("Kependudukan");

        inisialisasiLayout();
        goToListIndividu();
        setSpinnerLayout();
    }

    public void inisialisasiLayout()
    {
        buttonSave = (Button) findViewById(R.id.ButtonSave);
        spinnerHubunganKK = (Spinner) findViewById(R.id.SpinnerHubunganKK);
        spinnerJK = (Spinner) findViewById(R.id.SpinnerJenisKelamin);
        spinnerAgama = (Spinner) findViewById(R.id.SpinnerAgama);
        spinnerPendidikan = (Spinner) findViewById(R.id.SpinnerPendidikan);
        spinnerPekerjaan = (Spinner) findViewById(R.id.SpinnerPekerjaan);
        spinnerStatusKawin = (Spinner) findViewById(R.id.SpinnerStatusKawin);
        spinnerJKN = (Spinner) findViewById(R.id.SpinnerJKN);
    }

    public void setSpinnerLayout()
    {
        // Set List Hubungan KK
        String[] listHubunganKK = getResources().getStringArray(R.array.hubungan_kk);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listHubunganKK);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHubunganKK.setAdapter(dataAdapter);
        // Set List Jenis Kelamin
        String[] listHubunganJK = getResources().getStringArray(R.array.jenis_kelamin);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listHubunganJK);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJK.setAdapter(dataAdapter2);
        // Set List Agama
        String[] listAgama = getResources().getStringArray(R.array.agama);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listAgama);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAgama.setAdapter(dataAdapter3);
        // Set List Pendidikan
        String[] listPendidikan = getResources().getStringArray(R.array.pendidikan);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listPendidikan);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPendidikan.setAdapter(dataAdapter4);
        // Set List Pekerjaan
        String[] listPekerjaan = getResources().getStringArray(R.array.pekerjaan);
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listPekerjaan);
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPekerjaan.setAdapter(dataAdapter5);
        // Set List Status Kawin
        String[] listStatusKawin = getResources().getStringArray(R.array.status_kawin);
        ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listStatusKawin);
        dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStatusKawin.setAdapter(dataAdapter6);
        // Set List JKN
        String[] listJKN = getResources().getStringArray(R.array.jkn);
        ArrayAdapter<String> dataAdapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listJKN);
        dataAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJKN.setAdapter(dataAdapter7);
    }

    public void goToListIndividu()
    {
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFormTambahDataPendudukDua.this, ActivityListIndividu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
