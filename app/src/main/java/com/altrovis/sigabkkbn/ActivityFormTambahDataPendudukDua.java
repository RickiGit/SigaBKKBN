package com.altrovis.sigabkkbn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.altrovis.sigabkkbn.Entities.GlobalVariable;

public class ActivityFormTambahDataPendudukDua extends AppCompatActivity {

    Button buttonSave;
    Spinner spinnerHubunganKK, spinnerJK, spinnerAgama, spinnerPendidikan, spinnerPekerjaan, spinnerStatusKawin, spinnerJKN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_tambah_data_penduduk_dua);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setTitle("Individu (2/2)");

        inisialisasiLayout();
        goToListIndividu();
        setSpinnerLayout();
    }

    public void inisialisasiLayout() {
        buttonSave = (Button) findViewById(R.id.ButtonSave);
        spinnerHubunganKK = (Spinner) findViewById(R.id.SpinnerHubunganKK);
        spinnerJK = (Spinner) findViewById(R.id.SpinnerJenisKelamin);
        spinnerAgama = (Spinner) findViewById(R.id.SpinnerAgama);
        spinnerPendidikan = (Spinner) findViewById(R.id.SpinnerPendidikan);
        spinnerPekerjaan = (Spinner) findViewById(R.id.SpinnerPekerjaan);
        spinnerStatusKawin = (Spinner) findViewById(R.id.SpinnerStatusKawin);
        spinnerJKN = (Spinner) findViewById(R.id.SpinnerJKN);
    }

    public void setSpinnerLayout() {
        // Set List Hubungan KK
        String[] listHubunganKK = getResources().getStringArray(R.array.hubungan_kk);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listHubunganKK);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHubunganKK.setAdapter(dataAdapter);

        spinnerHubunganKK.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                GlobalVariable.NEW_INDIVIDU.setHubunganDenganKK(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Set List Jenis Kelamin
        String[] listHubunganJK = getResources().getStringArray(R.array.jenis_kelamin);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listHubunganJK);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJK.setAdapter(dataAdapter2);

        spinnerJK.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                GlobalVariable.NEW_INDIVIDU.setJenisKelamin(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Set List Agama
        String[] listAgama = getResources().getStringArray(R.array.agama);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listAgama);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAgama.setAdapter(dataAdapter3);

        spinnerAgama.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                GlobalVariable.NEW_INDIVIDU.setAgama(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Set List Pendidikan
        String[] listPendidikan = getResources().getStringArray(R.array.pendidikan);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listPendidikan);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPendidikan.setAdapter(dataAdapter4);

        spinnerPendidikan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                GlobalVariable.NEW_INDIVIDU.setPendidikan(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Set List Pekerjaan
        String[] listPekerjaan = getResources().getStringArray(R.array.pekerjaan);
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listPekerjaan);
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPekerjaan.setAdapter(dataAdapter5);

        spinnerPekerjaan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                GlobalVariable.NEW_INDIVIDU.setPekerjaan(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Set List Status Kawin
        String[] listStatusKawin = getResources().getStringArray(R.array.status_kawin);
        ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listStatusKawin);
        dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStatusKawin.setAdapter(dataAdapter6);

        spinnerStatusKawin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                GlobalVariable.NEW_INDIVIDU.setStatusKawin(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Set List JKN
        String[] listJKN = getResources().getStringArray(R.array.jkn);
        ArrayAdapter<String> dataAdapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listJKN);
        dataAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJKN.setAdapter(dataAdapter7);

        spinnerJKN.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                GlobalVariable.NEW_INDIVIDU.setJKN(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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

    public void goToListIndividu() {
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariable.INDIVIDU_ADAPTER.add(GlobalVariable.NEW_INDIVIDU);

                GlobalVariable.NEW_INDIVIDU = null;

                setResult(1);

                finish();
            }
        });
    }
}
