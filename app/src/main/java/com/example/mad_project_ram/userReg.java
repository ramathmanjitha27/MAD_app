package com.example.mad_project_ram;

public class userReg {
    public String name, password, email, gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public userReg(){

    }

    public userReg(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;

    }
}
