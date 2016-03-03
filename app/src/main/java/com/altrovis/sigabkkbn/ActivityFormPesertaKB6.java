package com.altrovis.sigabkkbn;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ActivityFormPesertaKB6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_peserta_kb6);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setTitle("Form Peserta KB (6/6)");
    }

    public void goToMenuAwal(View ev) {
        final ProgressDialog progress = new ProgressDialog(ev.getContext());
        progress.setMessage("Mengirim data...");
        progress.setCancelable(false);
        progress.setIndeterminate(true);
        progress.show();

        Runnable progressRunnable = new Runnable() {

            @Override
            public void run() {

                progress.cancel();

                setResult(1);

                finish();
            }
        };

        Handler pdCanceller = new Handler();
        pdCanceller.postDelayed(progressRunnable, 2000);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
