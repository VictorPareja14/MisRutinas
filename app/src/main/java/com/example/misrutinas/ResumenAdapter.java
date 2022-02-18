package com.example.misrutinas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ResumenAdapter extends RecyclerView.Adapter<ResumenAdapter.ViewHolder> {
    private Context contexto;
    private List<ListResumen> mData;

    public ResumenAdapter(Context contexto, List<ListResumen> mData) {
        this.contexto = contexto;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ResumenAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResumenAdapter.ViewHolder holder, int position) {
        holder.tvDia.setText(mData.get(position).getEtrutina());
        holder.tvGrupo.setText(mData.get(position).getEtGrupo());
        holder.tvDescripcion.setText(mData.get(position).getEtDescr());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView  tvDia,tvGrupo,tvDescripcion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDia=(TextView) itemView.findViewById(R.id.tvDia);
            tvGrupo=(TextView) itemView.findViewById(R.id.tvGrupo);
            tvDescripcion=(TextView) itemView.findViewById(R.id.tvDescripcion);

        }
    }
}
