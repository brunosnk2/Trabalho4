package com.example.a0070149.trabalho4;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

public class AbasPageAdapter extends FragmentPagerAdapter {
    String[] titulosAbas;
    TypedArray bgColors;
    TypedArray textColors;
    public AbasPageAdapter(Context ctx, FragmentManager fm) {
        super(fm);
        titulosAbas = ctx.getResources().getStringArray(R.array.secoes);
        bgColors = ctx.getResources().obtainTypedArray(R.array.cores_bg);
        textColors = ctx.getResources().obtainTypedArray(R.array.cores_texto);
    }
    @Override
    public Fragment getItem(int position) {
        return FragmentoBase.configFragmentoBase(titulosAbas[position], bgColors.getColor(position, 0), textColors.getColor(position, 0));

    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        return titulosAbas[position].toUpperCase(l);
    }
}
