package com.example.misrutinas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class resumen extends Fragment implements interfazRecycler {
    List<ListResumen> elementos;
    RecyclerView resumen;
    ResumenAdapter resumenAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.resumen, container, false);

        resumen = (RecyclerView) vista.findViewById(R.id.RecyclerResumen);
        elementos = new ArrayList<>();
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));


        interfazRecycler recyclerViewInterface;
        resumenAdapter = new ResumenAdapter(getContext(),elementos, this);

        resumen.setLayoutManager(new LinearLayoutManager(getContext()));

        resumen.setAdapter(resumenAdapter);

        return vista;
    }

    @Override
    public void onItemLongClick(int position) {
        elementos.remove(position);
        resumenAdapter.notifyItemRemoved(position);
    }
}