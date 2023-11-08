package com.example.tradehub512.activities;

import com.example.tradehub512.DataBaseHelper.DataBaseHelper;
import com.example.tradehub512.R;
import com.example.tradehub512.datos.SimboloModel;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CrearSimboloActivity extends AppCompatActivity {

    Button btn_agregar_simbolo;
    EditText et_nameSimbolo, et_name, et_descripcionSimbolo;

    ListView lv_simboloLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simbolos_crear_layout);

        btn_agregar_simbolo =findViewById(R.id.btn_agregar_simbolo);
        et_name = findViewById(R.id.et_nombre);
        et_nameSimbolo= findViewById(R.id.et_nameSimbolo);
        et_descripcionSimbolo = findViewById(R.id.et_descripcionSimbolo);
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

                boolean success = dataBaseHelper.addOne(simboloModel);

                Toast.makeText(CrearSimboloActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });
    }}