package com.rodrick.licoreriaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Globales g = Globales.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrar(View view) {
        Intent intent=new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    public void Listar(View view) {
        Intent intent2 = new Intent(this, ListaActivity.class);
        startActivity(intent2);
    }
}
