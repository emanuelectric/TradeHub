package com.example.tradehub512.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.example.tradehub512.R;
import com.example.tradehub512.activities.ItemIndicadorDetalleActivity;
import com.example.tradehub512.datos.Indicador;
import java.util.ArrayList;

public class IndicadorAdapter extends ArrayAdapter<Indicador> {

    private ArrayList<Indicador> indicadores;
    private Context context;

    public IndicadorAdapter(Context context, ArrayList<Indicador> indicadores) {
        super(context, 0, indicadores);
        this.indicadores = indicadores;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_indicador, parent, false);
            holder = new ViewHolder();
            holder.botonItemIndicador = convertView.findViewById(R.id.textview_NombreIndicadorItem);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Indicador indicador = getItem(position);

        holder.botonItemIndicador.setText(indicador.getNombreIndicador());

        holder.botonItemIndicador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ItemIndicadorDetalleActivity.class);
                intent.putExtra("nombreIndicador", indicador.getNombreIndicador());
                intent.putExtra("descripcionIndicador", indicador.getDescripcionIndicador());
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    static class ViewHolder {
        Button botonItemIndicador;
    }
}
