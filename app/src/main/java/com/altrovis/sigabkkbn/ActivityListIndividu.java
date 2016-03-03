package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.altrovis.sigabkkbn.Bussines.DataKependudukan.IndividuAdapter;
import com.altrovis.sigabkkbn.Entities.GlobalVariable;
import com.altrovis.sigabkkbn.Entities.IndividuKeluarga;

import java.util.ArrayList;

public class ActivityListIndividu extends AppCompatActivity {

    ListView listViewIndividu;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_individu);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setTitle("Kependudukan");

        inisialisasiLayout();

        GlobalVariable.INDIVIDU_ADAPTER = new IndividuAdapter(this, R.layout.item_list_individu, new ArrayList<IndividuKeluarga>());
        listViewIndividu.setAdapter(GlobalVariable.INDIVIDU_ADAPTER);

        goToPageKeluargaBerencana();
    }

    public void inisialisasiLayout() {
        listViewIndividu = (ListView) findViewById(R.id.ListViewIndividu);
        buttonNext = (Button) findViewById(R.id.ButtonNext);
    }

    public void goToPageKeluargaBerencana() {
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityListIndividu.this, ActivityKeluargaBerencana.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getParent().getMenuInflater().inflate(R.menu.menu_main, menu);
        getMenuInflater().inflate(R.menu.menu_activity_list_individu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.menuTambah) {
            Intent intent = new Intent(ActivityListIndividu.this, ActivityAddIndividu.class);
            startActivityForResult(intent, 1);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == 1) {
            GlobalVariable.INDIVIDU_ADAPTER.notifyDataSetChanged();

            checkButtonLanjutVisibility();
        }
    }

    public void checkButtonLanjutVisibility() {
        RelativeLayout relativeLayoutKeterangan = (RelativeLayout) findViewById(R.id.RelativeLayoutKeteranganKosong);
        LinearLayout linearLayoutListIndividu = (LinearLayout) findViewById(R.id.LinearLayoutList);

        if (GlobalVariable.INDIVIDU_ADAPTER.getCount() > 0) {
            relativeLayoutKeterangan.setVisibility(View.GONE);
            linearLayoutListIndividu.setVisibility(View.VISIBLE);
        } else {
            relativeLayoutKeterangan.setVisibility(View.VISIBLE);
            linearLayoutListIndividu.setVisibility(View.GONE);
        }
    }
}
