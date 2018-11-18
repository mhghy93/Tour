package com.example.android.guwahatitourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentPlace = getItem(position);

        TextView placeName = (TextView) convertView.findViewById(R.id.place_name);
        placeName.setText(currentPlace.getPlaceName());

        TextView placeAddress = (TextView) convertView.findViewById(R.id.place_address);
        placeAddress.setText(currentPlace.getPlaceAddress());

        TextView placeDetails = (TextView) convertView.findViewById(R.id.place_details);
        placeDetails.setText(currentPlace.getPlaceDetails());

        ImageView placeImage = (ImageView) convertView.findViewById(R.id.place_image);
        placeImage.setImageResource(currentPlace.getImageResourceId());

        return convertView;
    }
}
