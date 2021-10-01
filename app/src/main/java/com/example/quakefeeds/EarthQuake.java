package com.example.quakefeeds;

public class EarthQuake {

    private final double mMagnitude;
    private final String mPlace;
    private final long mTimeInMilliseconds;
    private final String mUrl;

    // constructor
    public EarthQuake(double magnitude, String place, long date, String url) {
        mMagnitude = magnitude;
        mPlace = place;
        mTimeInMilliseconds = date;
        mUrl = url;

    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
