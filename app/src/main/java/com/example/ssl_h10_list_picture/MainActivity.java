package com.example.ssl_h10_list_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ListaAdapteri listaAdapteri;
ArrayList<OmaLuokka> omaLuokkaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView1);
        omaLuokkaArrayList = new ArrayList<>();
        listaAdapteri = new ListaAdapteri(this,R.layout.listanrivi, omaLuokkaArrayList);

        listView.setAdapter(listaAdapteri);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Joo, tiiä että ei näin, mutta ku en ehtiny kurkkia, että miten :D
        String bm = "https://loremflickr.com/320/240/cat,dog";
        //omaLuokkaArrayList.add("TestiNimi","testiosoite",bm);
        omaLuokkaArrayList.add(new OmaLuokka("TestiNimi","TestiOsoite",bm));
        omaLuokkaArrayList.add(new OmaLuokka("TestiNimi2","TestiOsoite2",bm));
    }
}
