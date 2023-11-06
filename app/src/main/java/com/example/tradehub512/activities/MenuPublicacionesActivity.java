package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;

public class MenuPublicacionesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_publicaciones_layout);
    }

    // Lanzar Vistas

    public void lanzarVistaPublicacionesExplorar(View view) {
        Intent intent = new Intent(this, PublicacionesExplorarActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaPublicacionesFavoritos(View view) {
        Intent intent = new Intent(this, PublicacionesFavoritosActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaPublicacionesFiltrar(View view) {
        Intent intent = new Intent(this, PublicacionesFiltrarActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaPublicacionesPublicar(View view) {
        Intent intent = new Intent(this, PublicacionesPublicarActivity.class);
        startActivity(intent);
    }
}
