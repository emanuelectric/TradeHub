package com.example.tradehub512.activities;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;

// Importar clase Usuario
import com.example.tradehub512.datos.Usuario;

public class RegistrarseActivity extends AppCompatActivity {

    // Definiciones

    EditText campoNombreUsuario;
    EditText campoCorreoElectronico;
    EditText campoContrasena;
    EditText campoRepetirContrasena;

    // Lleva a la vista deseada

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrarse_layout);

        // Recoge los datos

        campoNombreUsuario = (EditText) findViewById(R.id.registrarse_nombreUsuario);
        campoCorreoElectronico = (EditText) findViewById(R.id.registrarse_correoElectronico);
        campoContrasena = (EditText) findViewById(R.id.registrarse_contrasena);
        campoRepetirContrasena = (EditText) findViewById(R.id.registrarse_repetirContrasena);
        }
    }

        /* Funcion para crear la cuenta
    public void crearCuenta(View view) {
        String nombreUsuario = campoNombreUsuario.getText().toString();
        String correoElectronico = campoCorreoElectronico.getText().toString();
        String contrasena = campoContrasenha.getText().toString();

        Usuario usuario = new Usuario( nombreUsuario, correoElectronico, contrasenna);
        Usuario.agregarUsuario(usuario);

        Intent intentLanzarLogin = new Intent( this, RegistrarseActivity.class ) ;
        startActivity( intentLanzarLogin );
         }
        */