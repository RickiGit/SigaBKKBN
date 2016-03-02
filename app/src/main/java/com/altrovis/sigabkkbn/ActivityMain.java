package com.altrovis.sigabkkbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.altrovis.sigabkkbn.Bussines.GridViewAdapter;
import com.altrovis.sigabkkbn.Entities.ItemMenu;

import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("PK BKKBN");

        GridView gridView = (GridView) findViewById(R.id.GridViewMenu);
        final ArrayList<ItemMenu> listOfMenu = new ArrayList<ItemMenu>();
        listOfMenu.add(new ItemMenu(1, "Data Keluarga", R.drawable.menu_penduduk));
        listOfMenu.add(new ItemMenu(2, "Pencarian", R.drawable.menu_pencarian));
        listOfMenu.add(new ItemMenu(3, "Peralatan", R.drawable.menu_peralatan));
        listOfMenu.add(new ItemMenu(4, "Laporan", R.drawable.menu_laporan));
        listOfMenu.add(new ItemMenu(5, "Peserta KB", R.drawable.menu_kb));
        listOfMenu.add(new ItemMenu(6, "Tentang", R.drawable.icon));
        GridViewAdapter adapter = new GridViewAdapter(this, R.layout.item_gridview_menu, listOfMenu);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0: Intent intent1 = new Intent(ActivityMain.this, ActivityDataKeluarga.class);
                        startActivity(intent1);
                        break;
                    case 1: Intent intent2 = new Intent(ActivityMain.this, ActivityPencarian.class);
                        startActivity(intent2);
                        break;
                    case 4: Intent intent6 = new Intent(ActivityMain.this, ActivityMenuPesertaKB.class);
                        startActivity(intent6);
                        break;
                    default:break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getParent().getMenuInflater().inflate(R.menu.menu_main, menu);
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.menuKeluar) {
            Intent intent = new Intent(ActivityMain.this, ActivityLogin.class);
            startActivity(intent);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
