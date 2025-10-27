package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    private int id;
    private int price;
    private String ip = null;
    public Device(int id,int price, String ip){
        this.id=id;
        this.price=price;
        this.ip=ip;
    }
    public int getId(){
        return this.id;
    }
    public int getPrice(){
        return this.price;
    }
    public String getIp(){
        return this.ip;
    }
    public String print(){
        return "id:"+this.id+"\n price:"+this.price+"\n ip:"+this.ip;
    }
    public abstract String getDeviceType();
}