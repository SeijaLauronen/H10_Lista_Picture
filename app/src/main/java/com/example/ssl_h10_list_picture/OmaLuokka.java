package com.example.ssl_h10_list_picture;

import android.graphics.Bitmap;
import android.view.GestureDetector;

import java.util.BitSet;

class OmaLuokka {
    String nimi;
    String osoite;
    //Bitmap bitmap;
    String urli;


    //public OmaLuokka(String nimi,String osoite, Bitmap bitmap){
    public OmaLuokka(String nimi,String osoite, String urli){
        this.nimi=nimi;
        //https://loremflickr.com/320/240
        // https://loremflickr.com/320/240/cat,dog

        this.osoite=osoite;
        //this.bitmap=bitmap;
        this.urli=urli;

    }
}

