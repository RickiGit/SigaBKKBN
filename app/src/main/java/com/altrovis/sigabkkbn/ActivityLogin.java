package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
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
                Intent intent = new Intent(ActivityLogin.this, ActivityMain.class);
                startActivity(intent);
            }
        });
    }
}
