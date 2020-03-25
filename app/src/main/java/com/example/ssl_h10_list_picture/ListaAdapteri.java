package com.example.ssl_h10_list_picture;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListaAdapteri extends ArrayAdapter<OmaLuokka> {
private Context context;
    private ArrayList<OmaLuokka> lista;

    public ListaAdapteri(@NonNull Context context, int resource, @NonNull List<OmaLuokka> objects) {
        super(context, resource, objects);
        this.context = context;
        lista = (ArrayList<OmaLuokka>) objects;
    }


    @Override
    public void add(@Nullable OmaLuokka object) {
        lista.add(object);
        super.add(object);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View rivi, @NonNull ViewGroup parent) {
        if (rivi ==null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            //rivi= layoutInflater.inflate(R.layout.listanrivi,parent);
            rivi= layoutInflater.inflate(R.layout.listanrivi,null);
        }
        //LayoutInflater f = LayoutInflater.from(getContext()).inflate(R.layout.listanrivi,parent);
        //return super.getView(position, rivi, parent);
        TextView textViewNimi = rivi.findViewById(R.id.nimi);
        TextView textViewOsoite = rivi.findViewById(R.id.osoite);
        //TODO No se kuva

        textViewNimi.setText(String.valueOf(lista.get(position).nimi)); //jos olis integeri tarviis tuon
        textViewOsoite.setText(lista.get(position).osoite);
        //TODO kuva

        return rivi;

    }
}
