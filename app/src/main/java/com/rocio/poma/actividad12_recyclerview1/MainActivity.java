package com.rocio.poma.actividad12_recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerView1);
        List<Productos> productosList=new ArrayList<Productos>();

        productosList.add(new Productos("Producto 1","40","https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2018/07/receta-borrachitos.jpg",5));
        productosList.add(new Productos("Producto 2","30","https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2017/08/macarronesfranceses.jpg",4));
        productosList.add(new Productos("Producto 3","60","https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-3.jpg",3));
        productosList.add(new Productos("Producto 4","28","https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-5.jpg",5));
        productosList.add(new Productos("Producto 5","10","https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-5.jpg",2));
        productosList.add(new Productos("Producto 1","40","https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2018/07/receta-borrachitos.jpg",5));
        productosList.add(new Productos("Producto 2","30","https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2017/08/macarronesfranceses.jpg",4));
        productosList.add(new Productos("Producto 3","60","https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-3.jpg",3));
        productosList.add(new Productos("Producto 4","28","https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-5.jpg",5));
        productosList.add(new Productos("Producto 5","10","https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-5.jpg",2));

        ProductosAdapter adapter=new ProductosAdapter(productosList,this);
        recyclerView.setAdapter(adapter);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

            //Para mostrar en una sola columna
        //LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        //linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        //recyclerView.setLayoutManager(linearLayoutManager);

    }
}