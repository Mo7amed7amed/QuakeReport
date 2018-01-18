package com.example.android.quakereport;

/**
 * Created by Mohamed on 1/16/2018.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    //Create public constructor
    public Earthquake(double magnitude, String location,  long timeInMilliseconds , String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {return mMagnitude;}
    public  String getLocation(){return  mLocation; }
    public  Long getTimeInMilliseconds(){return mTimeInMilliseconds ;}
    public String getUrl() {return mUrl;}
}


