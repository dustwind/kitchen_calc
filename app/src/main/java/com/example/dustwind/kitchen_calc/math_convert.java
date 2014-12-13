package com.example.dustwind.kitchen_calc;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dustwind on 07.12.2014.
 */
public class math_convert {
    double gramm;
    double liter;
    double mliter;
    double cup;
    double s_spone;
    double b_spone;

    public void getFromG (int gr, Ingr ingr, View v){
        gramm=gr;
        mliter=gramm/ingr.g_ml;
        liter=mliter/1000;
        cup=gramm/ingr.g_c;
        s_spone=gramm/ingr.g_ss;
        b_spone=gramm/ingr.g_bs;

        setResult(v);
    }

    public void getFromLiter (int lit, Ingr ingr, View v){
        liter=lit;
        mliter=liter*1000;
        gramm=mliter*ingr.g_ml;
        cup=gramm/ingr.g_c;
        s_spone=gramm/ingr.g_ss;
        b_spone=gramm/ingr.g_bs;

        setResult(v);
    }

    public void getFromMl(int ml, Ingr ingr, View v){
        mliter=ml;
        liter=mliter/1000;
        gramm=mliter*ingr.g_ml;
        cup=gramm/ingr.g_c;
        s_spone=gramm/ingr.g_ss;
        b_spone=gramm/ingr.g_bs;

        setResult(v);
    }

    public void getFromCup(int c, Ingr ingr, View v){
        cup = c;
        gramm = cup*ingr.g_c;
        mliter=gramm/ingr.g_ml;
        liter=mliter/1000;
        s_spone=gramm/ingr.g_ss;
        b_spone=gramm/ingr.g_bs;

        setResult(v);
    }

    public void getFromSSpone (int ssp, Ingr ingr, View v) {
        s_spone=ssp;
        gramm=s_spone*ingr.g_ss;
        mliter=gramm/ingr.g_ml;
        liter=mliter/1000;
        cup=gramm/ingr.g_c;
        b_spone=gramm/ingr.g_bs;

        setResult(v);
    }

    public void getFromBSpone (int bsp, Ingr ingr, View v){
        b_spone=bsp;
        gramm=b_spone*ingr.g_bs;
        mliter=gramm/ingr.g_ml;
        liter=mliter/1000;
        cup=gramm/ingr.g_c;
        s_spone=gramm/ingr.g_ss;

        setResult(v);
    }

    private void setResult (View v){
        TextView gr = (TextView) v.findViewById(R.id.gramm);
        TextView l = (TextView) v.findViewById(R.id.liters);
        TextView ml = (TextView) v.findViewById(R.id.mliters);
        TextView c = (TextView) v.findViewById(R.id.cup);
        TextView ss = (TextView) v.findViewById(R.id.s_spone);
        TextView bs = (TextView) v.findViewById(R.id.b_spone);

        gr.setText(Double.toString(round(gramm)));
        l.setText(Double.toString(round(liter)));
        ml.setText(Double.toString(round(mliter)));
        c.setText(Double.toString(round(cup)));
        ss.setText(Double.toString(round(s_spone)));
        bs.setText(Double.toString(round(b_spone)));
    }

    private static double round(double value) {
        long factor = (long) Math.pow(10, 4);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
