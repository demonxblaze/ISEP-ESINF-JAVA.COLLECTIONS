package Lixo.example;

public class SalesData {
    private int year;
    private int numVehicles;
    private Powertrain powerTrain;

    public SalesData(int year, int numVehicles, String powertrain) {
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

    public void setPowerTrain(String powertrain) {
        if (powertrain.equalsIgnoreCase("PHEV")){
            this.powerTrain = Powertrain.PHEV;
        }else {
            this.powerTrain = Powertrain.BEV;
        }
    }
}
