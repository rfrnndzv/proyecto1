package com.rodrick.licoreriaapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder> {

    private ArrayList<Producto> datos;

    public ProductosAdapter() {
        datos = new ArrayList<Producto>();
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Producto p = datos.get(position);

        holder.codigoTextView.setText(p.getCodigo());
        holder.nombreTextView.setText(p.getNombre());
        holder.tipoTextView.setText(p.getTipo());
        holder.precioCompraTextView.setText(String.valueOf(p.getPrecioCompra()));
        holder.precioVentaTextView.setText(String.valueOf(p.getPrecioVenta()));
        holder.volumenTextView.setText(String.valueOf(p.getVolumen()));
        holder.stockTextView.setText(String.valueOf(p.getStock()));
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void colocarDatos(ArrayList<Producto> datos) {
        this.datos = datos;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView  codigoTextView;
        TextView  nombreTextView;
        TextView  tipoTextView;
        TextView  precioCompraTextView;
        TextView  precioVentaTextView;
        TextView  volumenTextView;
        TextView  stockTextView;

        public ViewHolder(View itemView){
            super(itemView);

            codigoTextView = (TextView)itemView.findViewById(R.id.TV_codigo);
            nombreTextView = (TextView)itemView.findViewById(R.id.TV_nombre);
            tipoTextView = (TextView)itemView.findViewById(R.id.TV_tipo);
            precioCompraTextView = (TextView)itemView.findViewById(R.id.TV_precioCompra);
            precioVentaTextView = (TextView)itemView.findViewById(R.id.TV_precioVenta);
            volumenTextView = (TextView)itemView.findViewById(R.id.TV_volumen);
            stockTextView = (TextView)itemView.findViewById(R.id.TV_stock);
        }
    }
}
