package com.example.android.quakereport;

public class Earthquake {
    private String mUrl;
    private double mMagnitude;
    private String mCity;
    private long mDate;

    /**
     * @param magnitude is the double variable for the magnitude of the quake
     * @param city is the name of the city that experienced the quake
     * @param date is the variable that takes the date of quake occurrence
     * */
    public Earthquake(double magnitude, String city, long date, String url){
        mMagnitude = magnitude;
        mCity = city;
        mDate = date;
        mUrl = url;
    }
    /**
     * Method returns the magnitude of the earthquake
     * */
    public double getMagnitude(){
        return mMagnitude;
    }
    /**
     * Method returns the name of the city where the quake occurred
     * */
    public  String getCity(){
        return mCity;
    }
    /**
     * Method returns the date in which the quake occurred
     * */
    public long getDate(){
        return mDate;
    }
    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
