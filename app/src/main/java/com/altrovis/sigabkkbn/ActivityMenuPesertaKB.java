package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.altrovis.sigabkkbn.Bussines.GridViewAdapter;
import com.altrovis.sigabkkbn.Entities.ItemMenu;

import java.util.ArrayList;

public class ActivityMenuPesertaKB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_peserta_kb);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setTitle("Peserta KB");

        GridView gridView = (GridView) findViewById(R.id.GridViewMenu);
        final ArrayList<ItemMenu> listOfMenu = new ArrayList<ItemMenu>();
        listOfMenu.add(new ItemMenu(1, "Tambah Data", R.drawable.menu_tambah));
        listOfMenu.add(new ItemMenu(2, "Ubah Data", R.drawable.menu_edit));
        listOfMenu.add(new ItemMenu(3, "Cari Data", R.drawable.menu_cari));
        GridViewAdapter adapter = new GridViewAdapter(this, R.layout.item_gridview_menu, listOfMenu);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(ActivityMenuPesertaKB.this, ActivityFormPesertaKB1.class);
                        startActivity(intent1);
                        break;
                    default:
                        break;
                }
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
}
