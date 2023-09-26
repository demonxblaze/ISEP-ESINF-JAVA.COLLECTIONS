package org.example;

public class SalesData {
    private int year;
    private int numVehicles;
    private Powertrain powerTrain;

    public SalesData(int year, int numVehicles, Powertrain powertrain) {
        setYear(year);
        setNumVehicles(numVehicles);
        setPowerTrain(powertrain);
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

    public Powertrain getPowerTrain() {
        return powerTrain;
    }

    public void setPowerTrain(Powertrain powertrain) {
        this.powerTrain = powertrain;
    }
}
