package com.oscar.career.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class myPagerAdapter extends FragmentStatePagerAdapter {

    public myPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public myPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    private String[] titles = {"Tab1","Tab2","Tab3"};

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new BlankFragment();
            case 1:return new BlankFragment2();
            case 2:return  new BlankFragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
