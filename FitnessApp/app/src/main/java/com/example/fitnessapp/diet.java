package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class diet extends Fragment implements View.OnClickListener{
    Button profile;
    RelativeLayout first,low_carb,lunch,Breakfast,dinner,breakfast3,highprotein_chicken,low_carb2,breakfast2,breakfast4;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_diet,container,false);
        profile = (Button) v.findViewById(R.id.profile);
        profile.setOnClickListener(this);
        first = (RelativeLayout) v.findViewById(R.id.top_breakfast);
        first.setOnClickListener(this);
        low_carb= (RelativeLayout) v.findViewById(R.id.low_carb);
        low_carb.setOnClickListener(this);
        Breakfast= (RelativeLayout) v.findViewById(R.id.Breakfast);
        Breakfast.setOnClickListener(this);
        dinner= (RelativeLayout) v.findViewById(R.id.dinner);
        dinner.setOnClickListener(this);
        breakfast3= (RelativeLayout) v.findViewById(R.id.breakfast3);
        breakfast3.setOnClickListener(this);
        highprotein_chicken= (RelativeLayout) v.findViewById(R.id.highprotein_chicken);
        highprotein_chicken.setOnClickListener(this);
        low_carb2= (RelativeLayout) v.findViewById(R.id.low_carb2);
        low_carb2.setOnClickListener(this);
        breakfast2= (RelativeLayout) v.findViewById(R.id.breakfast2);
        breakfast2.setOnClickListener(this);
        lunch= (RelativeLayout) v.findViewById(R.id.lunch);
        lunch.setOnClickListener(this);
        breakfast4= (RelativeLayout) v.findViewById(R.id.breakfast4);
        breakfast4.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.profile:
                startActivity(new Intent(getActivity(),UserProfile.class));
                break;
            case R.id.top_breakfast:
                startActivity(new Intent(getActivity(),first_recipe.class));
                break;
            case R.id.low_carb:
                startActivity(new Intent(getActivity(),low_carb.class));
                break;
            case R.id.Breakfast:
                startActivity(new Intent(getActivity(),Breakfast.class));
                break;
            case R.id.dinner:
                startActivity(new Intent(getActivity(),dinner.class));
                break;
            case R.id.breakfast3:
                startActivity(new Intent(getActivity(),breakfast3.class));
                break;
            case R.id.highprotein_chicken:
                startActivity(new Intent(getActivity(),highprotein_chicken.class));
                break;
            case R.id.low_carb2:
                startActivity(new Intent(getActivity(),low_carb2.class));
                break;
            case R.id.breakfast2:
                startActivity(new Intent(getActivity(),breakfast2.class));
                break;
            case R.id.lunch:
                startActivity(new Intent(getActivity(),lunch.class));
                break;
            case R.id.breakfast4:
                startActivity(new Intent(getActivity(),breakfast4.class));
                break;
        }
    }
}
