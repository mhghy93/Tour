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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> shoppingPlaces = new ArrayList<Location>();

        shoppingPlaces.add(new Location(getString(R.string.shopping_sohum_shoppe), getString(R.string.shopping_sohum_shoppe_address), getString(R.string.shopping_sohum_shoppe_description), R.drawable.sohum));
        shoppingPlaces.add(new Location(getString(R.string.shopping_jayanagar_bazaar), getString(R.string.shopping_jayanagar_bazaar_address), getString(R.string.shopping_jayanagar_bazaar_description), R.drawable.jayanagar));
        shoppingPlaces.add(new Location(getString(R.string.shopping_big_bazaar), getString(R.string.shopping_big_bazaar_address), getString(R.string.shopping_big_bazaar_description), R.drawable.bigbazaar));
        shoppingPlaces.add(new Location(getString(R.string.shopping_bhrigu_market), getString(R.string.shopping_bhrigu_market_address), getString(R.string.shopping_bhrigu_market_description), R.drawable.bhrigumarket));

        LocationAdapter adapter = new LocationAdapter(getActivity(), shoppingPlaces);


        ListView listView = rootView.findViewById(R.id.location_list);

        listView.setAdapter(adapter);


        return rootView;

    }

}

