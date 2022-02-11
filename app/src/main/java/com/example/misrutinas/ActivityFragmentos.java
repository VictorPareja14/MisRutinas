package com.example.misrutinas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ActivityFragmentos extends AppCompatActivity implements CallbackFragment {
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos);
        añadirFragmento();

    }

    public void añadirFragmento(){
        Login fragment = new Login();
        fragment.setCallbackFragment(this);
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainerView3,fragment);
        fragmentTransaction.commit();
    }
    public void reemplazarFragmento(){
        fragment=new FragmentInicial();
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainerView3,fragment);
        fragmentTransaction.commit();

    }

    @Override
    public void cambiaFragmento() {
        reemplazarFragmento();
    }
}