package com.example.tradehub512.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.DataBaseHelper.DataBaseHelper;
import com.example.tradehub512.R;
import com.example.tradehub512.datos.SimboloModel;

import java.util.List;

public class CrearSimboloActivity extends AppCompatActivity {

    Button btn_agregar_simbolo, btn_viewAll;
    EditText et_nameSimbolo, et_name, et_descripcionSimbolo;

    ListView lv_simboloLista;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simbolos_crear_layout);

        btn_agregar_simbolo =findViewById(R.id.btn_agregar_simbolo);
        btn_viewAll = findViewById(R.id.btn_viewAll);
        et_name = findViewById(R.id.edittext_simboloSimbolo);
        et_nameSimbolo= findViewById(R.id.edittext_nombreSimbolo);
        et_descripcionSimbolo = findViewById(R.id.edittext_descripcionSimbolo);
        lv_simboloLista = findViewById(R.id.lv_simboloLista);


        btn_agregar_simbolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimboloModel simboloModel;
                try {
                    simboloModel = new SimboloModel(-1, et_nameSimbolo.getText().toString(), et_name.getText().toString(), et_descripcionSimbolo.getText().toString());
                    Toast.makeText(CrearSimboloActivity.this, simboloModel.toString(), Toast.LENGTH_SHORT).show();

                }
                catch (Exception e){
                    Toast.makeText(CrearSimboloActivity.this, "Error agregando Simbolo", Toast.LENGTH_SHORT).show();
                    simboloModel = new SimboloModel(-1,"error","no nombre","no descripcion");


                }
                DataBaseHelper dataBaseHelper = new DataBaseHelper(CrearSimboloActivity.this);

                boolean success = dataBaseHelper.addOneSimbolo(simboloModel);

                Toast.makeText(CrearSimboloActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });

        btn_viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DataBaseHelper dataBaseHelper = new DataBaseHelper(CrearSimboloActivity.this);
                List<SimboloModel> everyone = dataBaseHelper.getEveryone();

                ArrayAdapter simboloArrayAdapter = new ArrayAdapter<SimboloModel>(CrearSimboloActivity.this, android.R.layout.simple_list_item_1,everyone );
                lv_simboloLista.setAdapter(simboloArrayAdapter);


            }
        });
    }



}