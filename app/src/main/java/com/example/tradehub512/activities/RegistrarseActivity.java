package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

    // Funcion para crear la cuenta
    public void crearCuenta(View view) {
        String nombreUsuario = campoNombreUsuario.getText().toString();
        String correoElectronico = campoCorreoElectronico.getText().toString();
        String contrasena = campoContrasena.getText().toString();
        String repetirContrasena = campoRepetirContrasena.getText().toString();

        // Verificar si todos los campos están completos
        if (!nombreUsuario.isEmpty() && !correoElectronico.isEmpty() && !contrasena.isEmpty() && !repetirContrasena.isEmpty()) {
            // Verificar si contrasena y repetirContrasena son iguales
            if (contrasena.equals(repetirContrasena)) {
                // Verificar si el nombre de usuario y correo electrónico no están registrados
                if (!Usuario.esNombreUsuarioRegistrado(nombreUsuario) && !Usuario.esCorreoRegistrado(correoElectronico)) {
                    Usuario usuario = new Usuario(nombreUsuario, correoElectronico, contrasena);
                    Usuario.agregarUsuario(usuario);

                    // Mostrar Toast de registro exitoso
                    Toast.makeText(this, "Usuario creado correctamente", Toast.LENGTH_SHORT).show();

                    Intent intentLanzarLogin = new Intent(this, IniciarSesionActivity.class);
                    startActivity(intentLanzarLogin);
                } else {
                    Toast.makeText(this, "El nombre de usuario o el correo electrónico ya han sido registrados", Toast.LENGTH_SHORT).show();
                }
            } else {
                // Mostrar Toast si las contraseñas no coinciden
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            }
        } else {
            // Mostrar Toast si falta completar algún campo
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
        }
    }




    }