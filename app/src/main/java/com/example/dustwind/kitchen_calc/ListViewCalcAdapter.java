package com.example.dustwind.kitchen_calc;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dustwind on 09.12.2014.
 */
public class ListViewCalcAdapter extends ArrayAdapter{
    private Context context;
    private int resource;
    private int count;
    private List<CalcIngr> ilist;

    public ListViewCalcAdapter(Context context, int resource, List<CalcIngr> list) {
        super(context, resource, list);
        this.context=context;
        this.resource=resource;
        this.ilist= new ArrayList<CalcIngr>(list);
    }

    @Override
    public int getCount() {
        return ilist.size();
    }

    @Override
    public CalcIngr getItem(int i) {
        return ilist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.item_list_calc,null);
        view.setPadding(0,5,0,5);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView need = (TextView) view.findViewById(R.id.need);
        TextView av = (TextView) view.findViewById(R.id.avail);
        name.setText(getItem(i).getName());
        need.setText(Double.toString(getItem(i).getNeed()));
        av.setText(Double.toString(getItem(i).getAvailable()));
        ImageButton imb_remove = (ImageButton) view.findViewById(R.id.btnremove);
        final ListViewCalcAdapter adapt = this;
        imb_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ilist.remove(i);
                adapt.notifyDataSetChanged();

            }
        });
        return view;
    }

    public void addItem(CalcIngr newitem){

        this.ilist.add(newitem);
        this.count++;
        Log.e("ADAPTER", Integer.toString(this.ilist.size()));
    }

    public List<CalcIngr> getIlist (){
        return ilist;
    }

    public void setIlist (List<CalcIngr> l){
        this.ilist = l;
    }
}
