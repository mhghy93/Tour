package com.example.android.guwahatitourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> restaurants = new ArrayList<Location>();

        restaurants.add(new Location(getString(R.string.restr_khorika), getString(R.string.restr_khorika_address), getString(R.string.restr_khorika_description), R.drawable.khorika));
        restaurants.add(new Location(getString(R.string.restr_machaan), getString(R.string.restr_machaan_address), getString(R.string.restr_machaan_description), R.drawable.machaan));
        restaurants.add(new Location(getString(R.string.restr_parampara_paradise), getString(R.string.restr_parampara_paradise_address), getString(R.string.restr_parampara_paradise_description), R.drawable.parampara));
        restaurants.add(new Location(getString(R.string.restr_the_tandoor), getString(R.string.restr_the_tandoor_address), getString(R.string.restr_the_tandoor_description), R.drawable.tandoor));

        LocationAdapter adapter = new LocationAdapter(getActivity(), restaurants);


        ListView listView = rootView.findViewById(R.id.location_list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
