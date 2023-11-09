package com.example.tradehub512.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;
import com.example.tradehub512.datos.Simbolo;

import java.util.ArrayList;

public class EnciclopediaCrearElementoSimboloActivity extends AppCompatActivity {

    // Definiciones

    EditText campoSimbolo;
    EditText campoNombreSimbolo;
    EditText campoDescripcionSimbolo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simbolos_crear_layout);

        // Recoge los datos

        campoSimbolo = (EditText) findViewById(R.id.edittext_simboloSimbolo);
        campoNombreSimbolo = (EditText) findViewById(R.id.edittext_nombreSimbolo);
        campoDescripcionSimbolo = (EditText) findViewById(R.id.edittext_descripcionSimbolo);}

    public void agregarSimbolo(View view) {
        String simbolo = campoSimbolo.getText().toString();
        String nombreSimbolo = campoNombreSimbolo.getText().toString();
        String descripcionSimbolo = campoDescripcionSimbolo.getText().toString();

        if (!simbolo.isEmpty() && !nombreSimbolo.isEmpty() && !descripcionSimbolo.isEmpty()) {
            // Verificar si el símbolo ya está registrado (si es necesario)

            if (!esSimboloRegistrado(simbolo)) {
                Simbolo nuevoSimbolo = new Simbolo(simbolo, nombreSimbolo, descripcionSimbolo);

                Intent intent = new Intent();
                intent.putExtra("nuevoSimbolo", nuevoSimbolo);
                setResult(RESULT_OK, intent);
                finish();

                // Mostrar Toast de registro exitoso
                Toast.makeText(this, "Simbolo registrado exitosamente", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "El símbolo ya está registrado", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
        }
    }


    // Método para verificar si un símbolo ya está registrado
    private boolean esSimboloRegistrado(String simbolo) {
        ArrayList<Simbolo> listaSimbolos = Simbolo.getListaSimbolos();
        for (Simbolo s : listaSimbolos) {
            if (s.getSimboloSimbolo().equals(simbolo)) {
                return true;
            }
        }
        return false;
    }

}
