package com.example.misrutinas;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class anadir extends Fragment {
    public anadir() {
        // Required empty public constructor
    }
    EditText etdia;
    Button btn;
    ListResumen L;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View vista= inflater.inflate(R.layout.anadir, container, false);
        etdia = (EditText) vista.findViewById(R.id.etdia);
        btn = (Button) vista.findViewById(R.id.btnAñadir);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundleParametros = new Bundle();
                //bundleParametros.putString(,etdia.getText().toString());

            }
        });

        return vista;
        



    }
}