package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;

public class MenuEnciclopediaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_enciclopedia_layout);
    }

    public void lanzarVistaEnciclopediaSimbolos(View view) {
        Intent intent = new Intent(this, EnciclopediaSimbolosActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaEnciclopediaIndicadores(View view) {
        Intent intent = new Intent(this, EnciclopediaIndicadoresActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaEnciclopediaTendencias(View view) {
        Intent intent = new Intent(this, EnciclopediaTendenciasActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaEnciclopediaAgregarElemento(View view) {
        Intent intent = new Intent(this, EnciclopediaAgregarElementoActivity.class);
        startActivity(intent);
    }

}
