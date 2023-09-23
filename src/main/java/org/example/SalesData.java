package org.example;

public class SalesData {
    private int year;
    private int numVehicles;
    private Powertrain powertrain;

    public SalesData(int year, int numVehicles, Powertrain powertrain) {
        setYear(year);
        setNumVehicles(numVehicles);
        setPowertrain(powertrain);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumVehicles() {
        return numVehicles;
    }

    public void setNumVehicles(int numVehicles) {
        this.numVehicles = numVehicles;
    }

    public Powertrain getPowertrain() {
        return powertrain;
    }

    public void setPowertrain(Powertrain powertrain) {
        this.powertrain = powertrain;
    }
}
