package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class dashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
//    com.google.android.material.navigation.NavigationView NavigationView;
//    private DrawerLayout drawerLayout;
//    private ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView = findViewById(R.id.bottom_nav_of_dashboard);
//        NavigationView = (NavigationView) findViewById(R.id.nav_of_dashboard);
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.Open,R.string.Close);
//        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        actionBarDrawerToggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        shows home screen when opened first time
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_dashboard,new home()).commit();
        }

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
                    case R.id.nav_bmi:
                        fragment = new bmi_calculator();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_dashboard,fragment).commit();
                return true;
            }
        });
    }
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
//            switch (item.getItemId()){
//                case R.id.home:
//                    break;
//            }
//        }
//        return super.onOptionsItemSelected(item);
}
