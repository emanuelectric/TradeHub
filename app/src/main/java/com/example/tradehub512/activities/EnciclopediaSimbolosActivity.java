package com.example.tradehub512.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tradehub512.R;

import com.example.tradehub512.DataBaseHelper.DataBaseHelper;

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

// Initialize the database helper
        DataBaseHelper dbHelper = new DataBaseHelper(this);

// Retrieve symbols from the database
        List<Simbolo> simboloList = DataBaseHelper.getAllSymbols(); // You need to implement this method in your DatabaseHelper

        // RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerview_simbolos);
        SimboloAdapter adapter = new SimboloAdapter(simboloList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
