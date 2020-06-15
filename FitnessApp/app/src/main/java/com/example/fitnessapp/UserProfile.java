package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    DBhelper username_object;
//    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        username_object = new DBhelper(this,null,null,1);
//        username = (TextView) findViewById(R.id.show_username);

//        printDatabase();


    }
//    public void printDatabase(){
//        String dbString = username_object.display_username();
//        username.setText(dbString);
//    }
}
