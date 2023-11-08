package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;

public class EnciclopediaAgregarElementoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enciclopedia_agregar_elemento_layout);
    }

    // Lanzar Vistas
    public void lanzarVistaEnciclopediaAgregarElementoSimbolo(View view) {
        Intent intent = new Intent(this, EnciclopediaAgregarElementoSimboloActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaEnciclopediaAgregarElementoIndicador(View view) {
        Intent intent = new Intent(this, EnciclopediaAgregarElementoIndicadorActivity.class);
        startActivity(intent);
    }

}
