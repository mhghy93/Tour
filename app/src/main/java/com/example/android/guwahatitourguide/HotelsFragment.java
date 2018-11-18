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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> hotels = new ArrayList<Location>();

        hotels.add(new Location(getString(R.string.hotel_radisson_blue), getString(R.string.hotel_radisson_blue_address), getString(R.string.hotel_radisson_blue_description), R.drawable.reddisonblue));
        hotels.add(new Location(getString(R.string.hotel_brahmaputra_ashok), getString(R.string.hotel_brahmaputra_ashok_address), getString(R.string.hotel_brahmaputra_ashok_description), R.drawable.hotelbrahmaputra));
        hotels.add(new Location(getString(R.string.hotel_dynasty), getString(R.string.hotel_dynasty_address), getString(R.string.hotel_dynasty_description), R.drawable.hoteldynasty));
        hotels.add(new Location(getString(R.string.hotel_the_lily), getString(R.string.hotel_the_lily_address), getString(R.string.hotel_the_lily_description), R.drawable.hotellily));

        LocationAdapter adapter = new LocationAdapter(getActivity(), hotels);


        ListView listView = rootView.findViewById(R.id.location_list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
