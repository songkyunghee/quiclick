package com.example.quiclick;

/**
 * Created by 송경희 on 2018-11-16.
 */

public class Reservation {

    String storename;
   // String username;
    int count;


    public Reservation(String storename, int count) {

        this.storename = storename;
       // this.username = username;
        this.count=count;


    }



    public String toString() {
        return String.format(" %s ",count);
    }
}

