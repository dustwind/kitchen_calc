package com.example.dustwind.kitchen_calc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dustwind on 07.12.2014.
 */
public class ListViewIngridientsAdapter extends ArrayAdapter{

    private Context context;
    private int resource;
    private List<Ingr> lingr;

    public ListViewIngridientsAdapter(Context context, int resource, List <Ingr> lingr) {
        super(context, resource, lingr);
        this.context=context;
        this.resource=resource;
        this.lingr=lingr;
    }

    @Override
    public int getCount() {
        return lingr.size();
    }

    @Override
    public Ingr getItem(int i) {
        return lingr.get(i);
    }

    @Override
    public long getItemId(int i) {
        return lingr.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.item_ingridients, null);
        TextView textView = (TextView)view.findViewById(R.id.item_text_view);
        textView.setText(getItem(i).getIngrName());
        return view;
    }
}
