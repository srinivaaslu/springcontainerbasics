package com.nivas.springprofilesexample;

public class User {
    private String name;
    private int id;
    public User(int id,String name){
        this.id =  id;
        this.name= name;
    }

    public String getName() {
        return name;
    }
}
