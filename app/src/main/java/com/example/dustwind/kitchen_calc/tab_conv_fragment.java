package com.example.dustwind.kitchen_calc;

/**
 * Created by dustwind on 04.12.2014.
 */
import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.List;


public class tab_conv_fragment extends Fragment {

    DBHelper dbHelper;
    List <Ingr> IngrList;
    Ingr ingrItem;
    int metric;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.activity_main, container, false);

        dbHelper = new DBHelper(new db_ingredients(getActivity()));
        IngrList = dbHelper.getAllIngredients();
        metric = 1;

        final ImageButton imbtn_g = (ImageButton) view.findViewById(R.id.btn_g);
        final ImageButton imbtn_l = (ImageButton) view.findViewById(R.id.btn_l);
        final ImageButton imbtn_ml = (ImageButton) view.findViewById(R.id.btn_ml);
        final ImageButton imbtn_c = (ImageButton) view.findViewById(R.id.btn_cup);
        final ImageButton imbtn_s = (ImageButton) view.findViewById(R.id.btn_small);
        final ImageButton imbtn_b = (ImageButton) view.findViewById(R.id.btn_big);
        final LinearLayout llch = (LinearLayout) view.findViewById(R.id.change);
        final ImageButton btn_ingr = (ImageButton) view.findViewById(R.id.btn_ingr);
        final EditText count = (EditText) view.findViewById(R.id.cap);
        ingrItem=null;

        OnClickListener ocl = new OnClickListener() {
            @Override
            public void onClick(View v) {
                    imbtn_g.setBackgroundResource(0);
                    imbtn_l.setBackgroundResource(0);
                    imbtn_ml.setBackgroundResource(0);
                    imbtn_c.setBackgroundResource(0);
                    imbtn_s.setBackgroundResource(0);
                    imbtn_b.setBackgroundResource(0);

                    switch (v.getId()) {
                        case R.id.btn_g:
                            imbtn_g.setBackgroundResource(R.drawable.shap_oval);
                            metric=1;
                            go(view);
                            break;
                        case R.id.btn_l:
                            imbtn_l.setBackgroundResource(R.drawable.shap_oval);
                            metric=2;
                            go(view);
                            break;
                        case R.id.btn_ml:
                            imbtn_ml.setBackgroundResource(R.drawable.shap_oval);
                            metric=3;
                            go(view);
                            break;
                        case R.id.btn_cup:
                            imbtn_c.setBackgroundResource(R.drawable.shap_oval);
                            metric=4;
                            go(view);
                            break;
                        case R.id.btn_small:
                            imbtn_s.setBackgroundResource(R.drawable.shap_oval);
                            metric=5;
                            go(view);
                            break;
                        case R.id.btn_big:
                            imbtn_b.setBackgroundResource(R.drawable.shap_oval);
                            metric=6;
                            go(view);
                            break;
                    }
            }
        };

        OnClickListener ocllv = new OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog myDialog = new Dialog(getActivity());
                myDialog.setTitle("Выберите из списка");
                ListView listView = new ListView(getActivity());
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        ingrItem = IngrList.get(i);
                        TextView etIngr = (TextView) getActivity().findViewById(R.id.et_ingr);
                        etIngr.setText(ingrItem.getIngrName());
                        go(getView());
                        myDialog.dismiss();
                    }
                });
                ListAdapter adapter = new ListViewIngridientsAdapter(getActivity(), R.layout.item_ingridients, IngrList);
                listView.setAdapter(adapter);
                myDialog.setContentView(listView);
                myDialog.show();
            }
        };

        imbtn_g.setOnClickListener(ocl);
        imbtn_l.setOnClickListener(ocl);
        imbtn_ml.setOnClickListener(ocl);
        imbtn_c.setOnClickListener(ocl);
        imbtn_s.setOnClickListener(ocl);
        imbtn_b.setOnClickListener(ocl);
        llch.setOnClickListener(ocllv);
        btn_ingr.setOnClickListener(ocllv);

        count.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {go(view);}

            @Override
            public void afterTextChanged(Editable editable) {}
        });
        return (ScrollView) view;
    }


    public boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private void go (View view){
        final EditText count = (EditText) view.findViewById(R.id.cap);
        if (checkString(count.getText().toString()))
        {
            if (ingrItem!=null) {
                int cap = Integer.parseInt(count.getText().toString());
                math_convert mc = new math_convert();
                switch (metric) {
                    case 1:
                        mc.getFromG(cap, ingrItem, view);
                        break;
                    case 2:
                        mc.getFromLiter(cap, ingrItem, view);
                        break;
                    case 3:
                        mc.getFromMl(cap, ingrItem, view);
                        break;
                    case 4:
                        mc.getFromCup(cap, ingrItem, view);
                        break;
                    case 5:
                        mc.getFromSSpone(cap, ingrItem, view);
                        break;
                    case 6:
                        mc.getFromBSpone(cap, ingrItem, view);
                }
            }
        }
    }
}
