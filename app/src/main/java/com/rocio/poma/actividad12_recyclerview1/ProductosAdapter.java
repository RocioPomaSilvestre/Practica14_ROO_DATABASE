package com.rocio.poma.actividad12_recyclerview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.MyViewHolder> {

    List<Productos> productosModel;
    Context context;
    public ProductosAdapter(List<Productos> productosModel, Context ctx){
        this.productosModel=productosModel;
        this.context=ctx;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.productos_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Productos productosActual=productosModel.get(position);

        holder.getTxtNombre().setText(productosActual.getNombre());
        holder.getTxtPrecio().setText(productosActual.getPrecio());

        Glide
                .with(context)
                .load(productosActual.getImagenUrl())
                .centerCrop()
                //.placeholder(R.drawable.loading_spinner)
                .into(holder.getImageUrl());
        //return convertView;
    }

    @Override
    public int getItemCount() {

        return productosModel.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder  {
        ImageView imageUrl;
        TextView txtNombre;
        TextView txtPrecio;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageUrl=itemView.findViewById(R.id.imageUrl);
            this.txtNombre=itemView.findViewById(R.id.txtNombre);
            this.txtPrecio=itemView.findViewById(R.id.txtPrecio);

        }

        public ImageView getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(ImageView imageUrl) {
            this.imageUrl = imageUrl;
        }

        public TextView getTxtNombre() {
            return txtNombre;
        }

        public void setTxtNombre(TextView txtNombre) {
            this.txtNombre = txtNombre;
        }

        public TextView getTxtPrecio() {
            return txtPrecio;
        }

        public void setTxtPrecio(TextView txtPrecio) {
            this.txtPrecio = txtPrecio;
        }
    }
}
