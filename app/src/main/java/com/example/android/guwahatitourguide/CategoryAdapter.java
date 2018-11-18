package com.example.android.guwahatitourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CategoryAdapter extends FragmentStatePagerAdapter {
    //Context of the app
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new PlacesToVisitFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    //Return the total number of pages.
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hotel);
        } else if (position == 1) {
            return mContext.getString(R.string.places_to_visit);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurants);
        } else {
            return mContext.getString(R.string.shopping);
        }
    }
}