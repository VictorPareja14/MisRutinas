package com.example.misrutinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
//SIMPLE SWITCH PARA DECONECTAR PARA UTILIZAR TRANSICIONES ENTRE ACTIVIDADES
public class logout extends AppCompatActivity {
    Switch logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        logout = (Switch) findViewById(R.id.switch1);

    }
    public void desconectar(View v){
        if (v.getId()==R.id.switch1){
            if(logout.isChecked()){
                Toast.makeText(getApplicationContext(), "Desconectado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(logout.this,MainActivity.class);
                startActivity(intent);
                finish();

            }

        }
    }


}