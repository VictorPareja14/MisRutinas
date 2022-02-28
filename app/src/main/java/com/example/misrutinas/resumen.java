package com.example.misrutinas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//AQUI CARGA LAS RUTINAS, CON EL BOTÓN SI FUNCIONA AUNQUE NO PERSISTE. SI INTENTO UTILIZAR EL PUTEXTRA EXPLOTA.
public class resumen extends Fragment implements interfazRecycler {
    List<ListResumen> elementos;
    RecyclerView resumen;
    ResumenAdapter resumenAdapter;
    Button bt; TextView tv;
    View vista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista=inflater.inflate(R.layout.resumen, container, false);
        bt = vista.findViewById(R.id.button2);

        resumen = (RecyclerView) vista.findViewById(R.id.RecyclerResumen);
        elementos = new ArrayList<>();
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));
        elementos.add(new ListResumen("Martes", "Inferior","Sentadilla 4x10"));



        interfazRecycler recyclerViewInterface;
        resumenAdapter = new ResumenAdapter(getContext(),elementos, this);

        resumen.setLayoutManager(new LinearLayoutManager(getContext()));
        resumen.setAdapter(resumenAdapter);



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(resumen.getContext());
                mydialog.setTitle("¡Añade tu rutina!");
                View mView = getLayoutInflater().inflate(R.layout.alertdialog,null);
                EditText et1 = (EditText) mView.findViewById(R.id.et1);
                EditText et2 = (EditText) mView.findViewById(R.id.et2);
                EditText et3 = (EditText) mView.findViewById(R.id.et3);

                mydialog.setPositiveButton("Enviar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        elementos.add(new ListResumen(et1.getText().toString(),et2.getText().toString(),et3.getText().toString()));
                        resumenAdapter.notifyDataSetChanged();

                    }
                });
                mydialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                mydialog.setView(mView);
                AlertDialog dialog = mydialog.create();
                dialog.show();


            }
        });



        return vista;


    }

    @Override
    public void onItemLongClick(int position) {
        elementos.remove(position);
        resumenAdapter.notifyItemRemoved(position);
    }





}
