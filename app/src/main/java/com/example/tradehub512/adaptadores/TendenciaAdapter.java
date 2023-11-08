package com.example.tradehub512.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureCondition;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tradehub512.R;
import com.example.tradehub512.activities.ItemTendenciaDetalleActivity;
import com.example.tradehub512.datos.Tendencia;
import java.util.List;

public class TendenciaAdapter extends RecyclerView.Adapter<TendenciaAdapter.ViewHolder> {

    private List<Tendencia> tendenciaList;
    private Context context;

    public TendenciaAdapter(List<Tendencia> tendenciaList, Context context) {
        this.tendenciaList = tendenciaList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tendencia, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tendencia tendencia = tendenciaList.get(position);
        holder.botonItemTendencia.setText(tendencia.getNombreTendencia());

        holder.botonItemTendencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ItemTendenciaDetalleActivity.class);
                intent.putExtra("nombreTendencia", tendencia.getNombreTendencia());
                intent.putExtra("descripcionTendencia", tendencia.getDescripcionTendencia());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tendenciaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Button botonItemTendencia;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            botonItemTendencia = itemView.findViewById(R.id.textview_nombreTendenciaItem);
        }
    }
}
