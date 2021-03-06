package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.altrovis.sigabkkbn.Entities.GlobalVariable;

public class ActivityFormTambahDataPendudukSatu extends AppCompatActivity {

    Button buttonNext;
    Spinner spinnerProvinsi, spinnerKabupaten, spinnerKecamatan, spinnerDesa, spinnerRW, spinnerRT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_data_penduduk_satu);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setTitle("Wilayah");

        inisialisasiLayout();
        goToPageListIndividu();
        setSpinnerLayout();
    }

    public void inisialisasiLayout()
    {
        buttonNext = (Button)findViewById(R.id.ButtonNext);
        spinnerProvinsi = (Spinner)findViewById(R.id.SpinnerProvinsi);
        spinnerKabupaten = (Spinner)findViewById(R.id.SpinnerKabupaten);
        spinnerKecamatan = (Spinner)findViewById(R.id.SpinnerKecamatan);
        spinnerDesa = (Spinner)findViewById(R.id.SpinnerDesa);
        spinnerRW = (Spinner)findViewById(R.id.SpinnerRW);
        spinnerRT = (Spinner)findViewById(R.id.SpinnerRT);
    }

    public void setSpinnerLayout()
    {
        // Set List Provinsi
        String[] listProvinsi = getResources().getStringArray(R.array.provinsi);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listProvinsi);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProvinsi.setAdapter(dataAdapter);
        // Set List Kabupaten
        String[] listKabupaten = getResources().getStringArray(R.array.kota);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listKabupaten);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKabupaten.setAdapter(dataAdapter2);
        // Set List Kecamatan
        String[] listKecamatan = getResources().getStringArray(R.array.kecamatan);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listKecamatan);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKecamatan.setAdapter(dataAdapter3);
        // Set List Desa
        String[] listDesa = getResources().getStringArray(R.array.desa);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listDesa);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDesa.setAdapter(dataAdapter4);
        // Set List Dusun/RW
        String[] listDusun = getResources().getStringArray(R.array.rw);
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listDusun);
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRW.setAdapter(dataAdapter5);
        // Set List RT
        String[] listRT = getResources().getStringArray(R.array.rt);
        ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listRT);
        dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRT.setAdapter(dataAdapter6);
    }

    public void setSpinnerKabupaten()
    {

    }

    public void goToPageListIndividu()
    {
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFormTambahDataPendudukSatu.this, ActivityListIndividu.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == 1) {
            finish();
        }
    }
}
