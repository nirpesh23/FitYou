package com.example.fitnessapp;

public class model_for_database {
    private int _id;
    private String username;
    private String password;

    public model_for_database(String username) {
        this.username = username;
    }


    public String getUsername() {
        return username;
    }


}
