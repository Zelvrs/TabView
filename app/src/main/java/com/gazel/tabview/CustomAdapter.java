package com.gazel.tabview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CustomAdapter extends FragmentPagerAdapter {
    public CustomAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new FragmentSatu();
                break;
            case 1:
                fragment = new FragmentDua();
                break;
            case 2:
                fragment = new FragmentTiga();
                break;
        }


        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab" + (position+1);
    }
}
