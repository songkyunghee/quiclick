package com.example.quiclick;

/**
 * Created by 송경희 on 2018-11-16.
 */

public class Store {

    String name;
    String des;


    public Store( String name, String des) {

        this.name = name;
        this.des = des;

    }

//    public String toString() {
//        return String.format("  %s \n %s ",  name, des);
//    }

    public String getName() {return name;}
    public void setName(String name) {this.name=name;}
    public String getDes() {return des;}
    public void setDes(String des) {this.des=des;}

}

