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

//EL NUCLEO DE LA APP...
public class anadir extends Fragment  implements View.OnClickListener{
    public anadir() {
        // Required empty public constructor
    }
    Button btn;
    Button btn1;
    List<ListResumen> elementos;
    RecyclerView resumen;
    EditText etDia1;
    View vista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        vista= inflater.inflate(R.layout.anadir, container, false);
        initView();
        btn = vista.findViewById(R.id.btnAñadir);
        resumen = (RecyclerView) vista.findViewById(R.id.RecyclerResumen);
        elementos = new ArrayList<>();
        EditText etDia = vista.findViewById(R.id.etdia);





        return vista;




    }
    //EN PRINCIPIO AQUÍ DEBERÏA PASARSE TODA LA INFO DE LOS EDITTEXT AL FRAGMENTO DE RESUMEN. ESTA PARTE NO FALLA, PERO OBVIAMENTE CUANDO RECOJO EL DATO EN EL RESUMEN EXPLOTA...
    private void initView(){

         etDia1 = vista.findViewById(R.id.etdia);
         btn1 = vista.findViewById(R.id.btnAñadir);
         btn1.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnAñadir){
        Bundle bundle = new Bundle();
        String dia = etDia1.getText().toString();
        bundle.putString("dia",dia);
        resumen fragment = new resumen();
        fragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
        }
    }
}