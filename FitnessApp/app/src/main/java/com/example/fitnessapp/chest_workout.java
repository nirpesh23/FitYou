package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class chest_workout extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout);

        bottomNavigationView = findViewById(R.id.bottom_nav_of_yourgoal);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case R.id.nav_home:
                        fragment = new home();
                        break;
                    case R.id.nav_custom_workouts:
                        fragment = new activity_workouts();
                        break;
                    case R.id.nav_diet:
                        fragment = new diet();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_chest_workout,fragment).commit();
                return true;
            }
        });
    }
}
