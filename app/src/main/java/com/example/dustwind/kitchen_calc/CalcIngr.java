package com.example.dustwind.kitchen_calc;

/**
 * Created by dustwind on 08.12.2014.
 */
public class CalcIngr {

    String name;
    double need;
    double available;

    public String getName () {return this.name;}
    public double getNeed () {return this.need;}
    public double getAvailable () {return this.available;}

    public void setName (String n) {this.name=n;}
    public void setNeed (double n) {this.need=n;}
    public void setAvailable (double a) {this.available=a;}
}
