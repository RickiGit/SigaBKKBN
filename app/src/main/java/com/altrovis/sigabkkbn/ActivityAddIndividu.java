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

        inisialisasiLayout();
        addIndividu();
    }

    public void inisialisasiLayout()
    {
        editTextNIK = (EditText)findViewById(R.id.EditTextNIK);
        editTextNama = (EditText)findViewById(R.id.EditTextNama);
        editTextTanggal = (EditText)findViewById(R.id.EditTextTanggal);
        editTextBulan = (EditText)findViewById(R.id.EditTextNIK);
        editTextTahun = (EditText)findViewById(R.id.EditTextNama);
        editTextUmur = (EditText)findViewById(R.id.EditTextTanggal);
        buttonSave = (Button)findViewById(R.id.ButtonSave);
    }

    public void addIndividu()
    {
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editTextNama.getText().toString();
                individu = new IndividuKeluarga(nama);
                GlobalVariable.listIndividu.add(individu);

                Intent intent = new Intent(ActivityAddIndividu.this, ActivityFormTambahDataPendudukDua.class);
                startActivity(intent);
            }
        });
    }
}
