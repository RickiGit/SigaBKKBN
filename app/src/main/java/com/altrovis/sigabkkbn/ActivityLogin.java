package com.altrovis.sigabkkbn;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityLogin extends AppCompatActivity {

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        inisialisasiLayout();
        goToPageMain();
    }

    public void inisialisasiLayout()
    {
        buttonLogin = (Button)findViewById(R.id.ButtonLogin);
    }

    public void goToPageMain()
    {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ProgressDialog progress = new ProgressDialog(v.getContext());
                progress.setMessage("Mengirim data...");
                progress.setCancelable(false);
                progress.setIndeterminate(true);
                progress.show();

                Runnable progressRunnable = new Runnable() {

                    @Override
                    public void run() {

                        progress.cancel();

                        Intent intent = new Intent(ActivityLogin.this, ActivityMain.class);
                        startActivity(intent);
                    }
                };

                Handler pdCanceller = new Handler();
                pdCanceller.postDelayed(progressRunnable, 2000);
            }
        });
    }
}
