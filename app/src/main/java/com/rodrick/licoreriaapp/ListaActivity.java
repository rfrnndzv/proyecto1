package com.rodrick.licoreriaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    private RecyclerView productoRecyclerView;
    private Bundle b;
    Globales g = Globales.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        productoRecyclerView = (RecyclerView)findViewById(R.id.productoRecyclerView);
        productoRecyclerView.setHasFixedSize(true);
        productoRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        productoRecyclerView = (RecyclerView) findViewById(R.id.productoRecyclerView);

        ProductosAdapter adaptador = new ProductosAdapter();
        adaptador.colocarDatos(g.getDatos());
        productoRecyclerView.setAdapter(adaptador);
    }
}
