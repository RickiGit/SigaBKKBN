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

public class ActivityListIndividu extends AppCompatActivity {

    private IndividuAdapter adapter;
    ListView listViewIndividu;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_individu);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setTitle("Individu");

        inisialisasiLayout();

        int jumlahList = GlobalVariable.listIndividu.size();
        if(jumlahList != 0)
        {
            RelativeLayout relativeLayoutKeterangan = (RelativeLayout)findViewById(R.id.RelativeLayoutKeteranganKosong);
            LinearLayout linearLayoutListIndividu = (LinearLayout)findViewById(R.id.LinearLayoutList);
            relativeLayoutKeterangan.setVisibility(View.GONE);
            linearLayoutListIndividu.setVisibility(View.VISIBLE);
            listViewIndividu = (ListView)findViewById(R.id.ListViewIndividu);

            adapter = new IndividuAdapter(this, R.layout.item_list_individu, GlobalVariable.listIndividu);
            adapter.notifyDataSetChanged();
            listViewIndividu.setAdapter(adapter);
        }

        goToPageKependudukan();

    }

    public void inisialisasiLayout()
    {
        buttonNext = (Button)findViewById(R.id.ButtonNext);
    }

    public void goToPageKependudukan()
    {
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityListIndividu.this, ActivityFormTambahDataPendudukDua.class);
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
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
