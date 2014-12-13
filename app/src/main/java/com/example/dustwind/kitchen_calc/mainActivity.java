package com.example.dustwind.kitchen_calc;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class mainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        String label_tab1 = getResources().getString(R.string.lab_tab1);
        Tab tab = actionBar.newTab();
        tab.setText(label_tab1);
        TabListener<tab_conv_fragment> t1 = new TabListener<tab_conv_fragment>(this,label_tab1, tab_conv_fragment.class);
        tab.setTabListener(t1);
        actionBar.addTab(tab);

        String label_tab2 = getResources().getString(R.string.lab_tab2);
        tab = actionBar.newTab();
        tab.setText(label_tab2);
        TabListener<tab_calc_fragment> t2 = new TabListener<tab_calc_fragment>(this,label_tab1, tab_calc_fragment.class);
        tab.setTabListener(t2);
        actionBar.addTab(tab);
    }

    private class TabListener<T extends Fragment> implements
            ActionBar.TabListener {
        private Fragment mFragment;
        private final Activity mActivity;
        private final String mTag;
        private final Class<T> mClass;

        public TabListener(Activity activity, String tag, Class<T> clz) {
            mActivity = activity;
            mTag = tag;
            mClass = clz;
        }

        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            if (mFragment == null) {
                mFragment = Fragment.instantiate(mActivity, mClass.getName());
                ft.add(android.R.id.content, mFragment, mTag);
            } else {
                ft.attach(mFragment);
            }
        }

        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
            if (mFragment != null) {

                ft.detach(mFragment);
            }
        }

        public void onTabReselected(Tab tab, FragmentTransaction ft) {
        }
    }

}