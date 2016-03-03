package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.altrovis.sigabkkbn.Entities.GlobalVariable;
import com.altrovis.sigabkkbn.Entities.IndividuKeluarga;

public class ActivityAddIndividu extends AppCompatActivity {

    EditText editTextNIK, editTextNama, editTextTanggal, editTextBulan, editTextTahun, editTextUmur;
    Button buttonSave;
    IndividuKeluarga individu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_individu);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setTitle("Individu (1/2)");

        inisialisasiLayout();
        addIndividu();
    }

    public void inisialisasiLayout() {
        editTextNIK = (EditText) findViewById(R.id.EditTextNIK);
        editTextNama = (EditText) findViewById(R.id.EditTextNama);
        editTextTanggal = (EditText) findViewById(R.id.EditTextTanggal);
        editTextBulan = (EditText) findViewById(R.id.EditTextBulan);
        editTextTahun = (EditText) findViewById(R.id.EditTextTahun);
        editTextUmur = (EditText) findViewById(R.id.EditTextUmur);
        buttonSave = (Button) findViewById(R.id.ButtonSave);
    }

    public void addIndividu() {
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = editTextNama.getText().toString();
                String nik = editTextNIK.getText().toString();
                int tanggal = 0, bulan = 0, tahun = 0, umur = 0;
                String textTanggal = editTextTanggal.getText().toString();
                String textBulan = editTextBulan.getText().toString();
                String textTahun = editTextTahun.getText().toString();
                String textUmur = editTextUmur.getText().toString();

                if (textTanggal.length() > 0) {
                    tanggal = Integer.parseInt(editTextTanggal.getText().toString());
                }

                if (textBulan.length() > 0) {
                    bulan = Integer.parseInt(editTextBulan.getText().toString());
                }

                if (textTahun.length() > 0) {
                    tahun = Integer.parseInt(editTextTahun.getText().toString());
                }

                if (textUmur.length() > 0) {
                    umur = Integer.parseInt(editTextUmur.getText().toString());
                }

                GlobalVariable.NEW_INDIVIDU = new IndividuKeluarga();
                GlobalVariable.NEW_INDIVIDU.setNIK(nik);
                GlobalVariable.NEW_INDIVIDU.setNama(nama);
                GlobalVariable.NEW_INDIVIDU.setTanggal(tanggal);
                GlobalVariable.NEW_INDIVIDU.setBulan(bulan);
                GlobalVariable.NEW_INDIVIDU.setTahun(tahun);
                GlobalVariable.NEW_INDIVIDU.setUmur(umur);

                Intent intent = new Intent(ActivityAddIndividu.this, ActivityFormTambahDataPendudukDua.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        setResult(resultCode);

        if (resultCode == 1) {
            finish();
        }
    }
}
