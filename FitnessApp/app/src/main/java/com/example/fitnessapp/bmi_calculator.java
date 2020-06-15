package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bmi_calculator extends Fragment {

    EditText h,w;
    TextView bmi_result;
    Button calculate;
    String result,calculation;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_bmi_calculator, container, false);
        h = (EditText) v.findViewById(R.id.height);
        w = (EditText) v.findViewById(R.id.weight);
        bmi_result = (TextView) v.findViewById(R.id.bmi_result);
        calculate = (Button) v.findViewById(R.id.calculate_btn);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = h.getText().toString();
                String s2 = w.getText().toString();

                float weightValue = Float.parseFloat(s2);
                float heightValue = Float.parseFloat(s1);

                float bmi = weightValue / (heightValue*heightValue);

                if(bmi < 16){
                   result = "Severely Under Weight";
                }else if(bmi <= 18.5){
                    result = "Under Weight";
                }else if(bmi > 18.5 && bmi <= 24.9){
                    result = "Normal Weight";
                }else if (bmi > 25 && bmi <=29.9){
                    result = "Overweight";
                }else {
                    result = "Obesity";
                }
               calculation = bmi + "\n" + result;
                bmi_result.setText(calculation);
            }
        });
        return v;
    }
}
