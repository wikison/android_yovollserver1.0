package com.zemult.yovollserver.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.zemult.yovollserver.fragment.DiscoveryFragment;
import com.zemult.yovollserver.fragment.HomeFragment;
import com.zemult.yovollserver.fragment.MineFragment;

/**
 * Created by Wikison on 2017/6/26.
 */

public class HomePagerAdapter extends FragmentStatePagerAdapter {

    private Context context;
    private String[] titles = new String[]{"我的", "☻", "发现"};

    MineFragment mineFragment;
    HomeFragment homeFragment;
    DiscoveryFragment discoveryFragment;

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public HomePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                mineFragment = new MineFragment();
                return mineFragment;
            case 1:
                homeFragment = new HomeFragment();
                return homeFragment;
            case 2:
                discoveryFragment = new DiscoveryFragment();
                return discoveryFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
