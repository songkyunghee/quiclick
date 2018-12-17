package com.example.quiclick;

/**
 * Created by 송경희 on 2018-11-16.
 */

public class Store {

    String name;
    String des1;
    String des2;
    String des3;
    String call;
    String add;
    String pic;
    int count;


    public Store( String name, String des1,String des2,String des3, String call, String add,String pic,int count) {

        this.name = name;
        this.des1 = des1;
        this.des2 = des2;
        this.des3 = des3;
        this.call=call;
        this.add=add;
        this.pic=pic;
        this.count=count;

    }

//    public String toString() {
//        return String.format("  %s \n %s ",  name, des);
//    }

    public String getName() {return name;}
    public void setName(String name) {this.name=name;}
    public String getDes1() {return des1;}
    public void setDes1(String des1) {this.des1=des1;}
    public String getDes2() {return des2;}
    public void setDes2(String des2) {this.des2=des2;}
    public String getDes3() {return des3;}
    public void setDes3(String des3) {this.des3=des3;}
    public String getCall() {return call;}
    public void setCall(String call) {this.call=call;}
    public String getAdd() {return add;}
    public void setAdd(String add) {this.add=add;}
    public String getPic() {return pic;}
    public void setPic(String pic) {this.pic=pic;}
    public int getCount() {return count;}
    public void setCount(int count) {this.count=count;}
}

