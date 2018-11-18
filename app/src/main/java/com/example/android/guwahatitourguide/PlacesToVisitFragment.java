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
public class PlacesToVisitFragment extends Fragment {


    public PlacesToVisitFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> placesToVisit = new ArrayList<Location>();

        placesToVisit.add(new Location(getString(R.string.place_assam_state_museum), getString(R.string.place_assam_state_museum_address), getString(R.string.place_assam_state_museum_description), R.drawable.assamstatemuseum));
        placesToVisit.add(new Location(getString(R.string.place_guwahati_planetarium), getString(R.string.place_guwahati_planetarium_address), getString(R.string.place_guwahati_planetarium_description), R.drawable.guwahatiplanetarium));
        placesToVisit.add(new Location(getString(R.string.place_kamakhya_temple), getString(R.string.place_kamakhya_temple_address), getString(R.string.place_kamakhya_temple_description), R.drawable.kamakhyatemple));
        placesToVisit.add(new Location(getString(R.string.place_umananda_temple), getString(R.string.place_umananda_temple_address), getString(R.string.place_umananda_temple_description), R.drawable.umanandatemple));

        LocationAdapter adapter = new LocationAdapter(getActivity(), placesToVisit);


        ListView listView = rootView.findViewById(R.id.location_list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
