package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;

public class ItemSimboloDetalleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_simbolo_detalle);

        Intent intent = getIntent();
        String simboloSimbolo = intent.getStringExtra("simboloSimbolo");
        String nombreSimbolo = intent.getStringExtra("nombreSimbolo");
        String descripcionSimbolo = intent.getStringExtra("descripcionSimbolo");


        TextView textViewSimbolo = findViewById(R.id.textview_simbolo_simbolo_detalle);
        TextView textViewNombre = findViewById(R.id.textview_nombre_simbolo_detalle);
        TextView textViewDescripcion = findViewById(R.id.textview_descripcion_simbolo_detalle);

        textViewSimbolo.setText(simboloSimbolo);
        textViewNombre.setText(nombreSimbolo);
        textViewDescripcion.setText(descripcionSimbolo);
    }
}

