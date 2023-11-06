package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;

public class MenuInicialActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_inicial_layout);
    }

        public void lanzarVistaIniciarSesion(View view) {
            Intent intent = new Intent(this, IniciarSesionActivity.class);
            startActivity(intent);
        }

        public void lanzarVistaRegistrarse(View view) {
            Intent intent = new Intent(this, RegistrarseActivity.class);
            startActivity(intent);
        }

        public void lanzarVistaMenuPrincipal(View view) {
            Intent intent = new Intent(this, MenuPrincipalActivity.class);
            startActivity(intent);
        }

}
