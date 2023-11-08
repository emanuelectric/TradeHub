package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;

public class ItemPublicacionDetalleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_publicacion_detalle);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra("titulo");
        String simbolo = intent.getStringExtra("simbolo");
        String tendencia = intent.getStringExtra("tendencia");
        String descripcion = intent.getStringExtra("descripcion");

        ImageView imageView = findViewById(R.id.imageview_publicacionDetalle);
        TextView textViewTituloDetalle = findViewById(R.id.textview_tituloDetalle);
        TextView textViewTituloContenido = findViewById(R.id.textview_tituloContenido);
        TextView textViewSimboloDetalle = findViewById(R.id.textview_simboloDetalle);
        TextView textViewSimboloContenido = findViewById(R.id.textview_simboloContenido);
        TextView textViewTendenciaDetalle = findViewById(R.id.textview_tendenciaDetalle);
        TextView textViewTendenciaContenido = findViewById(R.id.textview_tendenciaContenido);
        TextView textViewDescripcionDetalle = findViewById(R.id.textview_descripcionDetalle);
        TextView textViewDescripcionContenido = findViewById(R.id.textview_descripcionContenido);

        // Aquí puedes establecer la imagen con algo como:
        // imageView.setImageResource(R.drawable.tu_imagen);

        textViewTituloContenido.setText(titulo);
        textViewSimboloContenido.setText(simbolo);
        textViewTendenciaContenido.setText(tendencia);
        textViewDescripcionContenido.setText(descripcion);
    }
}
