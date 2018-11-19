package com.example.quiclick;

/**
 * Created by 송경희 on 2018-11-16.
 */

public class users {
    String id;
    String password;
    String name;

    public users(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String toString() {
        return String.format("id = %s \n password = %s \n name = %s", id, password, name);
    }
}
