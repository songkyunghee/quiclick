package com.example.quiclick;

/**
 * Created by 송경희 on 2018-11-16.
 */

public class Review {

    String name;
    String des;


    public Review(String name, String des) {

        this.name = name;
        this.des = des;


    }



    public String toString() {
        return String.format(" %s ",des);
    }
}

