package com.example.erp.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.erp.Fragment.Academics_fragment;
import com.example.erp.Fragment.Canteen_fragment;
import com.example.erp.Fragment.Library_fragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new Library_fragment();
            case 1: return new Academics_fragment();
            case 2: return new Canteen_fragment();
            default: return new Academics_fragment();
        }
    }
    @Override
    public int getCount() {
        return 3;
    }
}
