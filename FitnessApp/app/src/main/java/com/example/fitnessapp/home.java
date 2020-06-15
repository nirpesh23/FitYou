package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends Fragment implements View.OnClickListener{

    Button chest_btn,profile,backbtn,legsbtn,shoulderbtn,tricepsbtn,bicepsbtn,absbtn;
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_home, container,false);

        profile = (Button) v.findViewById(R.id.profile);
        chest_btn = (Button) v.findViewById(R.id.chestbtn);
        backbtn = (Button) v.findViewById(R.id.backbtn);
        legsbtn = (Button) v.findViewById(R.id.legsbtn);
        shoulderbtn = (Button) v.findViewById(R.id.shoulderbtn);
        tricepsbtn = (Button) v.findViewById(R.id.tricepsrbtn);
        absbtn = (Button) v.findViewById(R.id.absbtn);
        bicepsbtn = (Button) v.findViewById(R.id.bicepsbtn);

        profile.setOnClickListener(this);
        chest_btn.setOnClickListener(this);
        backbtn.setOnClickListener(this);
        legsbtn.setOnClickListener(this);
        shoulderbtn.setOnClickListener(this);
        tricepsbtn.setOnClickListener(this);
        absbtn.setOnClickListener(this);
        bicepsbtn.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chestbtn:
                startActivity(new Intent(getActivity(),chest_workout.class));
                break;
            case R.id.profile:
                startActivity(new Intent(getActivity(),UserProfile.class));
                break;
            case R.id.backbtn:
                startActivity(new Intent(getActivity(),back_workout.class));
                break;
            case R.id.legsbtn:
                startActivity(new Intent(getActivity(),legs_workout.class));
                break;
            case R.id.shoulderbtn:
                startActivity(new Intent(getActivity(),shoulder_workout.class));
                break;
            case R.id.tricepsrbtn:
                startActivity(new Intent(getActivity(),triceps_workout.class));
                break;
            case R.id.absbtn:
                startActivity(new Intent(getActivity(),abs_workout.class));
                break;
            case R.id.bicepsbtn:
                startActivity(new Intent(getActivity(),biceps_workout.class));
                break;
        }
    }
}
