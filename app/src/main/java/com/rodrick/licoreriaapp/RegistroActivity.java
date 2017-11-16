package com.rodrick.licoreriaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {

    private EditText ET_codigo;
    private EditText ET_nombre;
    private EditText ET_tipo;
    private EditText ET_stock;
    private EditText ET_volumen;
    private EditText ET_precioVenta;
    private EditText ET_precioCompra;

    private String codigo;
    private String nombre;
    private String tipo;
    private String stock;
    private String volumen;
    private String precioVenta;
    private String precioCompra;

    Globales g = Globales.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void guardar(View view) {
        Intent intent = new Intent(this, ListaActivity.class);
        ET_codigo = (EditText)findViewById(R.id.ET_codigo);
        ET_nombre = (EditText)findViewById(R.id.Et_nombre);
        ET_tipo = (EditText)findViewById(R.id.ET_tipo);
        ET_stock = (EditText)findViewById(R.id.ET_stock);
        ET_volumen = (EditText)findViewById(R.id.ET_volumen);
        ET_precioCompra = (EditText)findViewById(R.id.ET_precioCompra);
        ET_precioVenta = (EditText)findViewById(R.id.ET_precioVenta);

        codigo = String.valueOf(ET_codigo.getText());
        nombre = String.valueOf(ET_nombre.getText());
        tipo = String.valueOf(ET_tipo.getText());
        stock = String.valueOf(ET_stock.getText());
        volumen = String.valueOf(ET_volumen.getText());
        precioCompra = String.valueOf(ET_precioCompra.getText());
        precioVenta = String.valueOf(ET_precioVenta.getText());


        Producto p = new Producto(codigo, nombre, tipo, Integer.valueOf(stock), Integer.valueOf(volumen), Double.valueOf(precioVenta), Double.valueOf(precioCompra));
        g.setDatos(p);
        /*intent.putExtra("codigo", ET_codigo.getText());
        intent.putExtra("nombre", ET_nombre.getText());
        intent.putExtra("tipo", ET_tipo.getText());
        intent.putExtra("stock", ET_stock.getText());
        intent.putExtra("volumen", ET_volumen.getText());
        intent.putExtra("precioCompra", ET_precioVenta.getText());
        intent.putExtra("precioVenta", ET_precioCompra.getText());*/

        startActivity(intent);
    }
}
