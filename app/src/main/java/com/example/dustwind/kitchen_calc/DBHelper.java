package com.example.dustwind.kitchen_calc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dustwind on 05.12.2014.
 */
public class DBHelper {
    private db_ingredients dbcon;

    public DBHelper(db_ingredients dbConnection) {
        dbcon = dbConnection;
    }

    private Ingr getIngr(Cursor cur, int iId, int iInrg, int iG_ml, int iG_ss, int iG_bs,
                         int iG_c) {
        Ingr result = new Ingr();
        result.setId(cur.getInt(iId));
        result.setIngrName(cur.getString(iInrg));
        result.setG_ml(cur.getDouble(iG_ml));
        result.setG_ss(cur.getDouble(iG_ss));
        result.setG_bs(cur.getDouble(iG_bs));
        result.setG_c(cur.getDouble(iG_c));
        return result;
    }

    public List <Ingr> getAllIngredients(){
        SQLiteDatabase db = dbcon.getWritableDatabase();
        Cursor c = db.query("table_ingredients", null, null, null, null, null, null);
        List<Ingr> result = getIngr(c);
        dbcon.close();
        return result;
    }

    private List<Ingr> getIngr(Cursor c) {
        List<Ingr> result = new ArrayList<Ingr>();
        if (c.moveToFirst()) {
            int iId = c.getColumnIndex("id");
            int iInrg = c.getColumnIndex("ingredient");
            int iG_ml = c.getColumnIndex("g_ml");
            int iG_ss = c.getColumnIndex("g_ss");
            int iG_bs = c.getColumnIndex("g_bs");
            int iG_c = c.getColumnIndex("g_c");

            do {
                result.add(getIngr(c, iId, iInrg, iG_ml, iG_ss, iG_bs, iG_c));
            } while (c.moveToNext());
        }
        c.close();
        return result;
    }
}
