package com.example.misrutinas;

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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View vista= inflater.inflate(R.layout.anadir, container, false);
        etdia = (EditText) vista.findViewById(R.id.etdia);


        return vista;
        



    }
}