package org.example;

public class Gps {
    private double latitude;
    private double longitude;

    public Gps(String[] crd) {
        setLatitude(crd[0]);
        setLongitude(crd[1]);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = Double.parseDouble(latitude);
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = Double.parseDouble(longitude);
    }
}
