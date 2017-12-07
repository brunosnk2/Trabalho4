package com.example.a0070149.trabalho4;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AbasFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmento_abas, container, false);
        AbasPageAdapter pagerAdapter = new AbasPageAdapter(getActivity(), super.getFragmentManager());
        ViewPager mViewPager = (ViewPager)rootView.findViewById(R.id.pagerAbas);
        mViewPager.setAdapter(pagerAdapter);
        TabLayout mTabLayout = (TabLayout)rootView.findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
        return rootView;
    }

}
