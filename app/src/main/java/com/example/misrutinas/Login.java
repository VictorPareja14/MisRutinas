package com.example.misrutinas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Login extends Fragment {


    Button login;
    EditText usuario,pass;
    CallbackFragment callbackFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista= inflater.inflate(R.layout.fragment_login, container, false);
        usuario=vista.findViewById(R.id.usuario);
        pass=vista.findViewById(R.id.pass);
        login=vista.findViewById(R.id.boton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(callbackFragment!=null){
                    callbackFragment.cambiaFragmento();

                }

            }
        });



        return vista;

    }


    public void setCallbackFragment(CallbackFragment callbackFragment){
        this.callbackFragment=callbackFragment;

    }

}
