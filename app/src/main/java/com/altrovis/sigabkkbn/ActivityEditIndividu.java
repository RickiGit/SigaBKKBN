package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.altrovis.sigabkkbn.Entities.GlobalVariable;
import com.altrovis.sigabkkbn.Entities.IndividuKeluarga;

public class ActivityEditIndividu extends AppCompatActivity {

    EditText editTextNIK, editTextNama, editTextTanggal, editTextBulan, editTextTahun, editTextUmur;
    Button buttonSave;
    IndividuKeluarga individu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_individu);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setTitle("Ubah Individu");

        inisialisasiLayout();
        setValueForm();
        goToPageEditDataPenduduk();
    }

    public void inisialisasiLayout()
    {
        editTextNIK = (EditText)findViewById(R.id.EditTextNIK);
        editTextNama = (EditText)findViewById(R.id.EditTextNama);
        editTextTanggal = (EditText)findViewById(R.id.EditTextTanggal);
        editTextBulan = (EditText)findViewById(R.id.EditTextBulan);
        editTextTahun = (EditText)findViewById(R.id.EditTextTahun);
        editTextUmur = (EditText)findViewById(R.id.EditTextUmur);
        buttonSave = (Button)findViewById(R.id.ButtonSave);
    }

    public void setValueForm()
    {
        individu = GlobalVariable.SELECTED_INDIVIDU;
        editTextNIK.setText(individu.getNIK());
        editTextNama.setText(individu.getNama());
        editTextTanggal.setText(individu.getTanggal() + "");
        editTextBulan.setText(individu.getBulan() + "");
        editTextTahun.setText(individu.getTahun() + "");
        editTextUmur.setText(individu.getUmur() + "");
    }

    public void goToPageEditDataPenduduk()
    {
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

                individu.setTanggal(tanggal);
                individu.setBulan(bulan);
                individu.setTahun(tahun);
                individu.setUmur(umur);
                individu.setNama(nama);
                individu.setNIK(nik);

                Intent intent = new Intent(ActivityEditIndividu.this, ActivityEditDataPenduduk.class);
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
}
