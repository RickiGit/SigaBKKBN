package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setTitle("Edit Individu");

        inisialisasiLayout();
        setValueForm();
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
        editTextTanggal.setText(individu.getTahun() + "");
        editTextUmur.setText(individu.getUmur() + "");
    }

    public void goToPageEditDataPenduduk()
    {
        Intent intent = new Intent(this, ActivityEditDataPenduduk.class);
        startActivity(intent);
    }
}
