package com.example.misrutinas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login,registro;
    EditText usuario,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario= findViewById(R.id.usuario);
        pass= findViewById(R.id.pass);
        login= findViewById(R.id.boton);
        registro=findViewById(R.id.registrarse);

    }




    public void iniciaSesion(View v) {

            String user = usuario.getText().toString();
            String password = pass.getText().toString();


            if(TextUtils.isEmpty(user) || TextUtils.isEmpty(password)){
                Toast.makeText(login.getContext(), "No puede haber campos vacíos", Toast.LENGTH_SHORT).show();


            }
            if(user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
                    Toast.makeText(login.getContext(), "Inicio de sesión correcto", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, ActivityFragmentos.class);
                    startActivity(intent);
                    finish();

            }
        if(!user.equalsIgnoreCase("admin") && !password.equalsIgnoreCase("admin")){
            Toast.makeText(login.getContext(), "Revisa los datos", Toast.LENGTH_SHORT).show();


        }



    }
    public void registrarse(View v){
        Intent intent = new Intent(LoginActivity.this, registro.class);
        startActivity(intent);
    }



}


