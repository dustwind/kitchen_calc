package com.example.dustwind.kitchen_calc;

/**
 * Created by dustwind on 07.12.2014.
 */
public class Ingr {
    int id;
    String ingrName;
    double g_ml;
    double g_ss;
    double g_bs;
    double g_c;

    public int getId (){return this.id;}

    public String getIngrName () {return this.ingrName;}

    public double getG_ml () {return this.g_ml;}

    public double getG_ss () {return this.g_ss;}

    public double getG_bs () {return this.g_bs;}

    public double getG_c () {return this.g_c;}

    public void setId (int Iid) {this.id=Iid;}

    public void setIngrName (String iname) {this.ingrName = iname;}

    public void setG_ml (double ig_ml) {this.g_ml=ig_ml;}

    public void setG_ss (double ig_ss) {this.g_ss=ig_ss;}

    public void setG_bs (double ig_bs) {this.g_bs=ig_bs;}

    public void setG_c (double ig_c) {this.g_c = ig_c;}
}
