package com.example.fan
        ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void taySwift(View view) {
Intent intent = new Intent(MainActivity2.this,taylor.class);
startActivity(intent);
    }

    public void bts(View view) {
        Intent intent = new Intent(MainActivity2.this,bts.class);
        startActivity(intent);
    }

    public void harry(View view) {
        Intent intent =new Intent( MainActivity2.this,harry.class);
        startActivity(intent);
    }

    public void conan(View view) {
        Intent intent =new Intent( MainActivity2.this,conan.class);
        startActivity(intent);
    }

    public void troy(View view) {
        Intent intent =new Intent( MainActivity2.this,troy.class);
        startActivity(intent);
    }

    public void txt(View view) {
        Intent intent =new Intent( MainActivity2.this,txt.class);
        startActivity(intent);
    }

    public void chainsmokers(View view) {
        Intent intent =new Intent( MainActivity2.this,chainsmokers.class);
        startActivity(intent);
    }

    public void weeknd(View view) {
        Intent intent =new Intent( MainActivity2.this,weeknd.class);
        startActivity(intent);

    }

    public void lukas(View view) {
        Intent intent =new Intent( MainActivity2.this,lukas.class);
        startActivity(intent);
    }

    public void shawn(View view) {
        Intent intent =new Intent( MainActivity2.this,shawn.class);
        startActivity(intent);
    }

    public void yelawolf(View view) {
        Intent intent =new Intent( MainActivity2.this,yelawolf.class);
        startActivity(intent);
    }public void eminem(View view) {
        Intent intent =new Intent( MainActivity2.this,eminem.class);
        startActivity(intent);
    }

    public void mgk(View view) {
        Intent intent =new Intent( MainActivity2.this,mgk.class);
        startActivity(intent);

    }

    public void lilnas(View view) {
        Intent intent =new Intent( MainActivity2.this,lilnas.class);
        startActivity(intent);
    }

    public void coldplay(View view) {
        Intent intent =new Intent( MainActivity2.this,coldplay.class);
        startActivity(intent);
    }

    public void timeflies(View view) {
        Intent intent =new Intent( MainActivity2.this,timeflies.class);
        startActivity(intent);
    }

    public void arctic(View view) {
        Intent intent =new Intent( MainActivity2.this,arctic.class);
        startActivity(intent);
    }

    public void maroon(View view) {
        Intent intent =new Intent( MainActivity2.this,maroon.class);
        startActivity(intent);
    }
}