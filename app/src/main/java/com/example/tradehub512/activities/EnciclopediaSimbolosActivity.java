package com.example.tradehub512.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tradehub512.R;

// Importar Clase Simbolo
import com.example.tradehub512.datos.Simbolo;
import com.example.tradehub512.adaptadores.SimboloAdapter;

import java.util.ArrayList;
import java.util.List;

public class EnciclopediaSimbolosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enciclopedia_simbolos_layout); // Set the layout for this activity

        // RecyclerView
        List<Simbolo> simboloList = new ArrayList<>();
        simboloList.add(new Simbolo("XAUUSD", "Oro / US Dolar", "Oro Spot, metal precioso"));


        RecyclerView recyclerView = findViewById(R.id.recyclerview_simbolos);
        SimboloAdapter adapter = new SimboloAdapter(simboloList, this); // Agregué 'this' como contexto
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
