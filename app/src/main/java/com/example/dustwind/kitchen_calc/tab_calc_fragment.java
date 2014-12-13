package com.example.dustwind.kitchen_calc;

/**
 * Created by dustwind on 04.12.2014.
 */
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

public class tab_calc_fragment extends Fragment {
    ListView list_calc;
    ListViewCalcAdapter adapter;
    double k;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_calc, container, false);
        final ImageButton imbtn_add = (ImageButton) view.findViewById(R.id.btn_add);
        final Button btn_math=(Button) view.findViewById(R.id.btn_calc);

        list_calc = (ListView) view.findViewById(R.id.list_view_calc);

        adapter = new ListViewCalcAdapter(getActivity(),R.layout.item_list_calc,new ArrayList<CalcIngr>());
        list_calc.setAdapter(adapter);
        OnClickListener ocl = new OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcIngr ci =new CalcIngr();
                EditText et1 = (EditText) getActivity().findViewById(R.id.ename);
                EditText et2 = (EditText) getActivity().findViewById(R.id.eneed);
                EditText et3 = (EditText) getActivity().findViewById(R.id.eavail);

                if (et2.getText().toString().isEmpty()) {
                    et2.setText("0");
                }

                if (et3.getText().toString().isEmpty()) {
                    et3.setText("0");
                }

                if (checkString(et2.getText().toString())&checkString(et3.getText().toString())) {
                    ci.setName(et1.getText().toString());
                    et1.setText("");

                    ci.setNeed(Double.parseDouble(et2.getText().toString()));
                    et2.setText("");

                    ci.setAvailable(Double.parseDouble(et3.getText().toString()));
                    et3.setText("");

                    adapter.addItem(ci);
                    adapter.notifyDataSetChanged();
                }
            }
        };

        list_calc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View view, int i, long l) {
                adapter.notifyDataSetChanged();
            }
        });

        imbtn_add.setOnClickListener(ocl);

        btn_math.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                List<CalcIngr> mlist = adapter.getIlist();
                if (mlist.size()>0) {
                    adapter.setIlist(math(mlist));
                    adapter.notifyDataSetChanged();
                }
            }
        });

        return (RelativeLayout) view;
        //return (ScrollView) inflater.inflate(R.layout.activity_calc, container, false);
    }

    public List<CalcIngr> math (List<CalcIngr> lst){
        double min = 100000;

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getAvailable()!=0) {
                if (min > (lst.get(i).getAvailable()) / (lst.get(i).getNeed())) {
                    min = (lst.get(i).getAvailable()) / (lst.get(i).getNeed());
                }
            }
        }

        for (int i = 0; i<lst.size(); i++){
            lst.get(i).setAvailable(round(lst.get(i).getNeed()*min));
        }
        return lst;
    }

    private static double round(double value) {
        long factor = (long) Math.pow(10, 2);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

