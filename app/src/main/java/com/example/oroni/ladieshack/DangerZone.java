package com.example.oroni.ladieshack;

import android.location.Location;

/**
 * Created by oroni on 11/26/16.
 */

public class DangerZone {

    private String mdangerzoneName;
    private String mdangerzoneAddress;
    private String mImageResourceUrl;
    private Location mdangerzoneLocation;

    public DangerZone(String string, String mdangerzoneName, String mdangerzoneAddress, String mImageResourceUrl, Location mdangerzoneLocation) {
        this.mdangerzoneName = mdangerzoneName;
        this.mdangerzoneAddress = mdangerzoneAddress;
        this.mImageResourceUrl = mImageResourceUrl;
        this.mdangerzoneLocation = mdangerzoneLocation;
    }

    public String getMdangerzoneName() {
        return mdangerzoneName;
    }

    public void setMdangerzoneName(String mdangerzoneName) {
        this.mdangerzoneName = mdangerzoneName;
    }

    public String getMdangerzoneAddress() {
        return mdangerzoneAddress;
    }

    public void setMdangerzoneAddress(String mdangerzoneAddress) {
        this.mdangerzoneAddress = mdangerzoneAddress;
    }

    public String getmImageResourceUrl() {
        return mImageResourceUrl;
    }

    public void setmImageResourceUrl(String mImageResourceUrl) {
        this.mImageResourceUrl = mImageResourceUrl;
    }

    public Location getMdangerzoneLocation() {
        return mdangerzoneLocation;
    }

    public void setMdangerzoneLocation(Location mdangerzoneLocation) {
        this.mdangerzoneLocation = mdangerzoneLocation;
    }
}
