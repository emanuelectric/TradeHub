package com.example.tradehub512.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;
import com.example.tradehub512.datos.Indicador;

import java.util.ArrayList;

public class EnciclopediaAgregarElementoIndicadorActivity extends AppCompatActivity {

    EditText campoNombreIndicador;
    EditText campoDescripcionIndicador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enciclopedia_agregar_elemento_indicador_layout);

        campoNombreIndicador = findViewById(R.id.edittext_nombreIndicador);
        campoDescripcionIndicador = findViewById(R.id.edittext_descripcionIndicador);
    }

    public void agregarIndicador(View view) {
        String nombreIndicador = campoNombreIndicador.getText().toString();
        String descripcionIndicador = campoDescripcionIndicador.getText().toString();

        if (!nombreIndicador.isEmpty() && !descripcionIndicador.isEmpty()) {
            if (!esIndicadorRegistrado(nombreIndicador)) {
                Indicador nuevoIndicador = new Indicador(nombreIndicador, descripcionIndicador);
                Indicador.agregarIndicador(nuevoIndicador);

                Toast.makeText(this, "Indicador agregado correctamente", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "El indicador ya está registrado", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean esIndicadorRegistrado(String nombreIndicador) {
        ArrayList<Indicador> listaIndicadores = Indicador.getListaIndicadores();
        for (Indicador indicador : listaIndicadores) {
            if (indicador.getNombreIndicador().equals(nombreIndicador)) {
                return true;
            }
        }
        return false;
    }
}
