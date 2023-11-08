package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;

public class ItemTendenciaDetalleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_tendencia_detalle);

        Intent intent = getIntent();
        String nombreTendencia = intent.getStringExtra("nombreTendencia");
        String descripcionTendencia = intent.getStringExtra("descripcionTendencia");


        TextView textViewNombre = findViewById(R.id.textview_nombre_tendencia_detalle);
        TextView textViewDescripcion = findViewById(R.id.textview_descripcion_tendencia_detalle);

        textViewNombre.setText(nombreTendencia);
        textViewDescripcion.setText(descripcionTendencia);
    }
}

