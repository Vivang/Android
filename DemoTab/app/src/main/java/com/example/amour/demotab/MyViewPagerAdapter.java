package com.example.amour.demotab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Amour on 2016/3/15.
 */
public class MyViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;

    public MyViewPagerAdapter(FragmentManager fm,List<Fragment> listFragment) {
        super(fm);
        fragmentList=listFragment;

    }


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
