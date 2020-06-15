package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    Button login_btn, skip_btn, create_new_acc_btn;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_btn = (Button) findViewById(R.id.log_btn);
        skip_btn = (Button) findViewById(R.id.log_skip_btn);
        create_new_acc_btn = (Button) findViewById(R.id.log_new_acc_btn);
        username = (EditText) findViewById(R.id.login_uname);

        final Intent intent;
        intent = new Intent(this,dashboard.class);
        skip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                model_for_database uname = new model_for_database(name);
            }
        });
    }
}
