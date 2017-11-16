package com.rodrick.licoreriaapp;

import java.util.ArrayList;

public class Globales {
    private static Globales instance;
    private static ArrayList<Producto> datos;

    private Globales(){
        datos = new ArrayList<Producto>();
    }

    public static ArrayList<Producto> getDatos() {
        return datos;
    }

    public static void setDatos(Producto p) {
        Globales.datos.add(p);
    }

    public static synchronized Globales getInstance(){
        if(instance == null)
            instance = new Globales();
        return instance;
    }
}
