package com.example.misrutinas;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class anadir extends Fragment {
    public anadir() {
        // Required empty public constructor
    }
    Button btn;
    List<ListResumen> elementos;
    RecyclerView resumen;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View vista= inflater.inflate(R.layout.anadir, container, false);
        btn = vista.findViewById(R.id.btnAñadir);
        resumen = (RecyclerView) vista.findViewById(R.id.RecyclerResumen);
        elementos = new ArrayList<>();
        EditText etDia = vista.findViewById(R.id.etdia);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putString("keydia", etDia.getText().toString());
            resumen fragment = new resumen();
            fragment.setArguments(bundle);
            getFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

            }
        });


        return vista;
        



    }
}