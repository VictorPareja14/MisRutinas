package com.example.misrutinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText usuario,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario= findViewById(R.id.usuario);
        pass= findViewById(R.id.pass);
        login= findViewById(R.id.boton);

    }

    public void iniciaSesion(View v) {

        if (usuario.getText().toString().equals("") && pass.getText().toString().equals("")) {
            Intent intent = new Intent(LoginActivity.this,ActivityFragmentos.class);
            startActivity(intent);
            finish();



        } else {
            Toast.makeText(login.getContext(), "Vuelve a intentarlo", Toast.LENGTH_SHORT).show();

        }
    }

}


