package com.example.android.guwahatitourguide;

public class Location {
    private String mPlaceName;
    private String mPlaceAddress;
    private String mPlaceDetails;
    private int mImageResourceId;

    public Location(String placeName, String placeAddress, String placeDetails, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceDetails = placeDetails;
        mImageResourceId = imageResourceId;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    public String getPlaceDetails() {
        return mPlaceDetails;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
