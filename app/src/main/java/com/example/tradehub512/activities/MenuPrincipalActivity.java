package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.tradehub512.R;

public class MenuPrincipalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);
    }

    // Lanzar Vistas

    public void lanzarVistaMenuPublicaciones(View view) {
        Intent intent = new Intent(this, MenuPublicacionesActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaMenuEnciclopedia(View view) {
        Intent intent = new Intent(this, MenuEnciclopediaActivity.class);
        startActivity(intent);
    }

    public void lanzarVistaAcercaDe(View view) {
        Intent intent = new Intent(this, AcercaDeActivity.class);
        startActivity(intent);
    }
}
