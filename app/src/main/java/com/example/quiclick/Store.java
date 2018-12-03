package com.example.quiclick;

/**
 * Created by 송경희 on 2018-11-16.
 */

public class Store {
    String id;
    String name;
    String des;

    public Store(String id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }

    public String toString() {
        return String.format("id = %s \n name = %s \n des = %s", id, name, des);
    }
}

