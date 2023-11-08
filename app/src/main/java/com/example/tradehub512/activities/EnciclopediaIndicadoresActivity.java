package com.example.tradehub512.activities;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;
import com.example.tradehub512.adaptadores.IndicadorAdapter;
import com.example.tradehub512.datos.Indicador;

import java.util.ArrayList;

public class EnciclopediaIndicadoresActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enciclopedia_indicadores_layout);

        // Crear una lista de indicadores (puedes agregar más indicadores según tus necesidades)
        ArrayList<Indicador> indicadores = new ArrayList<>();
        indicadores.add(new Indicador("Media Móvil Simple (SMA)", "La Media Móvil Simple (SMA) es un indicador técnico que calcula el precio promedio de un activo financiero durante un período específico. Ayuda a suavizar la volatilidad y a identificar tendencias en el mercado. La SMA se calcula sumando los precios de cierre de un activo durante un período determinado y dividiendo el resultado por el número de períodos."));
        indicadores.add(new Indicador("Índice de Fuerza Relativa (RSI)", "El Índice de Fuerza Relativa (RSI) es un indicador de momentum que evalúa la velocidad y el cambio de los movimientos de precios. Oscila entre 0 y 100 y se utiliza para identificar condiciones de sobrecompra o sobreventa en un mercado. Un RSI por encima de 70 indica sobrecompra, mientras que un RSI por debajo de 30 indica sobreventa."));
        indicadores.add(new Indicador("Bandas de Bollinger", "Las Bandas de Bollinger son un indicador de volatilidad que consiste en una línea central (SMA) y dos bandas que se sitúan por encima y por debajo de la SMA. Estas bandas se basan en la desviación estándar de los precios y se expanden o contraen según la volatilidad del mercado. Las Bandas de Bollinger son útiles para identificar posibles puntos de inflexión en una tendencia y para evaluar la volatilidad actual del mercado."));

        // Crear el adaptador y vincularlo al ListView
        IndicadorAdapter adapter = new IndicadorAdapter(this, indicadores);
        ListView listView = findViewById(R.id.listView_indicadores);
        listView.setAdapter(adapter);
    }
}
