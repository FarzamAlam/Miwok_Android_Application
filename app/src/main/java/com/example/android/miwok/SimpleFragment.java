package com.example.android.miwok;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL on 1/28/2017.
 */

public class SimpleFragment extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context context;
    private String tabTitles[] = new String[] { "Numbers", "Family", "Colors","Phrases" };
    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        if (position == 0) {
            return NumbersFragment.newInstance(position + 1);
        } else if (position == 1){
            return FamilyFragment.newInstance(position + 1);
        } else if(position==2){
            return ColorsFragment.newInstance(position + 1);
        }
        else if(position==3){
            return PhrasesFragment.newInstance(position + 1);
        }
        return null;


    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    public SimpleFragment(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

}
