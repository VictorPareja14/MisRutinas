package com.example.misrutinas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ActivityFragmentos extends AppCompatActivity {
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

   private BottomNavigationView navigation;
    FragmentContainerView fragmentContainerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos);

        navigation = findViewById(R.id.bottomNavigation);
        navigation.setOnItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new resumen()).commit();


    }

    private BottomNavigationView.OnItemSelectedListener bottomNavMethod=new NavigationBarView.OnItemSelectedListener(){


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment=null;

            switch (item.getItemId()){
                case R.id.android:
                    fragment=new anadir();
                    break;
                case R.id.home:
                    fragment=new resumen();
                    break;
                case R.id.search:
                    fragment=new SettingsFragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
            return true;
            }
    };

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_overflow,menu);
        return super.onCreateOptionsMenu(menu);

    }

  public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.Desconectarse){
            Intent intent = new Intent(ActivityFragmentos.this,logout.class);
            startActivity(intent);


        }
        return super.onOptionsItemSelected(item);
    }

}
