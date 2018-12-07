package com.example.quiclick;

/**
 * Created by 송경희 on 2018-11-16.
 */

public class Store {

    String name;
    String des;
    String call;
    String add;


    public Store( String name, String des, String call, String add) {

        this.name = name;
        this.des = des;
        this.call=call;
        this.add=add;

    }

//    public String toString() {
//        return String.format("  %s \n %s ",  name, des);
//    }

    public String getName() {return name;}
    public void setName(String name) {this.name=name;}
    public String getDes() {return des;}
    public void setDes(String des) {this.des=des;}
    public String getCall() {return call;}
    public void setCall(String call) {this.call=call;}
    public String getAdd() {return add;}
    public void setAdd(String add) {this.add=add;}
}

