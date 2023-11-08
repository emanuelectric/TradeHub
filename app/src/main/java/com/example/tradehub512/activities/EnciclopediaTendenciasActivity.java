package com.example.tradehub512.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tradehub512.R;

// Importar Clase Tendencia
import com.example.tradehub512.datos.Tendencia;
import com.example.tradehub512.adaptadores.TendenciaAdapter;

import java.util.ArrayList;
import java.util.List;

public class EnciclopediaTendenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enciclopedia_tendencias_layout); // Set the layout for this activity

        // RecyclerView
        List<Tendencia> tendenciaList = new ArrayList<>();
        tendenciaList.add(new Tendencia("Alcista", "Una tendencia alcista, también conocida como \"bullish\", se refiere a un mercado financiero en el que los precios de los activos están en alza sostenida. Durante una tendencia alcista, los inversores muestran confianza en el rendimiento futuro y tienden a comprar activos con la expectativa de que sus valores seguirán aumentando. Esto se manifiesta a través de una serie de máximos y mínimos más altos en los gráficos de precios, reflejando un sentimiento positivo en el mercado. Las noticias económicas favorables, el crecimiento de la empresa y otros factores optimistas suelen respaldar esta tendencia."));
        tendenciaList.add(new Tendencia("Bajista", "La tendencia bajista, conocida como \"bearish\", se produce cuando el mercado financiero experimenta una disminución sostenida en los precios de los activos. En un mercado bajista, los inversores son pesimistas sobre el rendimiento futuro y tienden a vender activos en la creencia de que sus valores continuarán disminuyendo. Esto se refleja en una serie de máximos y mínimos más bajos en los gráficos de precios. Las noticias económicas desfavorables, la incertidumbre o eventos negativos pueden desencadenar y perpetuar esta tendencia."));
        tendenciaList.add(new Tendencia("Consolidación", "La consolidación, también conocida como tendencia lateral, se refiere a una fase en el mercado financiero en la que los precios de los activos se mantienen dentro de un rango relativamente estrecho, sin mostrar una dirección clara hacia arriba o hacia abajo. Durante este período, los inversores experimentan una sensación de indecisión y falta de tendencia definida. Los precios oscilan entre niveles de soporte (el nivel de precio más bajo al que el activo tiende a caer) y resistencia (el nivel de precio más alto al que el activo tiende a subir). La consolidación puede ser el resultado de una variedad de factores, como la estabilidad económica, la falta de noticias impactantes o la necesidad del mercado de tomar un respiro después de movimientos significativos en una dirección específica. Durante la consolidación, los inversores deben estar atentos a las señales de un posible rompimiento del rango, ya que esto puede indicar el inicio de una nueva tendencia alcista o bajista."));


        RecyclerView recyclerView = findViewById(R.id.recyclerView_tendencias);
        TendenciaAdapter adapter = new TendenciaAdapter(tendenciaList, this); // Agregué 'this' como contexto
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
