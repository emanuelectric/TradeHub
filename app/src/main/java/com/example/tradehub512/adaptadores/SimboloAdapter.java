package com.example.tradehub512.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tradehub512.R;
import com.example.tradehub512.activities.EnciclopediaSimbolosActivity;
import com.example.tradehub512.activities.ItemSimboloDetalleActivity;
import com.example.tradehub512.datos.Simbolo;
import java.util.List;

public class SimboloAdapter extends RecyclerView.Adapter<SimboloAdapter.ViewHolder> {

    private List<Simbolo> simboloList;

    private Context context;

    public SimboloAdapter(List<Simbolo> simboloList, Context context) {
        this.simboloList = simboloList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_simbolo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Simbolo simbolo = simboloList.get(position);
        holder.botonItemSimbolo.setText(simbolo.getSimboloSimbolo());

        holder.botonItemSimbolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ItemSimboloDetalleActivity.class);
                intent.putExtra("simboloSimbolo", simbolo.getSimboloSimbolo());
                intent.putExtra("nombreSimbolo", simbolo.getNombreSimbolo());
                intent.putExtra("descripcionSimbolo", simbolo.getDescripcionSimbolo());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return simboloList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Button botonItemSimbolo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            botonItemSimbolo = itemView.findViewById(R.id.textview_simboloSimboloItem);
        }
    }
}
